package com.example.tmbank.presentation.auth;

import lombok.AllArgsConstructor;
import com.example.tmbank.dtos.user.*;
import com.example.tmbank.jwt.JwtUtils;
import com.example.tmbank.service.IUserService;
import com.example.tmbank.service.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
@Repository
public class AuthenticationController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;
    private IUserService userService;

    @PostMapping("/signin")
    public ResponseEntity<TokenVo> authenticateUser(@RequestBody UserRequest userRequest) {
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(userRequest.username(), userRequest.password()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwtToken(authentication);
            TokenVo tokenVo = TokenVo.builder().
                    jwtToken(jwt).
                    username(userRequest.username()).
                    roles(authentication.getAuthorities().stream().
                            map(GrantedAuthority::getAuthority).
                            collect(Collectors.toList())).build();
            return ResponseEntity.ok(tokenVo);
        } catch (Exception e) {
            throw new BusinessException("Login ou mot de passe incorrect");
        }
    }


    @PostMapping("/signup")
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest createUserRequest) {
        userService.save(UserVo.builder().
                username(createUserRequest.username()).
                password(createUserRequest.password()).
                email(createUserRequest.email()).
                enabled(true).
                accountNonExpired(true).
                accountNonLocked(true).
                credentialsNonExpired(true).
                authorities(List.of(RoleVo.builder().authority("ROLE_CLIENT").build())).
                build());

        return new ResponseEntity<>(String.format("User [%s] created with success",
                createUserRequest.username()), HttpStatus.CREATED);
    }
}
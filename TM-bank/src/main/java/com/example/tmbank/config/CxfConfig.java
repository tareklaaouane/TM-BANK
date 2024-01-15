package com.example.tmbank.config;

import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CxfConfig {
    private Bus bus;
    private BankSoapController bankSoapController;

    @Bean
    public EndpointImpl bankWSEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, bankSoapController);
        endpoint.publish("/BankService");
        return endpoint;
    }
}

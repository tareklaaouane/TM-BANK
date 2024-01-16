package com.example.tmbank.grpc.stub;

public final class Bank {
    private Bank() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface CustomersRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CustomersRequest)
            com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code CustomersRequest}
     */
    public  static final class CustomersRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CustomersRequest)
            CustomersRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CustomersRequest.newBuilder() to construct.
        private CustomersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CustomersRequest() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CustomersRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CustomersRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.CustomersRequest.class, com.example.tmbank.grpc.stub.Bank.CustomersRequest.Builder.class);
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.CustomersRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.CustomersRequest other = (com.example.tmbank.grpc.stub.Bank.CustomersRequest) obj;

            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.CustomersRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CustomersRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CustomersRequest)
                com.example.tmbank.grpc.stub.Bank.CustomersRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.CustomersRequest.class, com.example.tmbank.grpc.stub.Bank.CustomersRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.CustomersRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomersRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.CustomersRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomersRequest build() {
                com.example.tmbank.grpc.stub.Bank.CustomersRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomersRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.CustomersRequest result = new com.example.tmbank.grpc.stub.Bank.CustomersRequest(this);
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.CustomersRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.CustomersRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.CustomersRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.CustomersRequest.getDefaultInstance()) return this;
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.CustomersRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.CustomersRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:CustomersRequest)
        }

        // @@protoc_insertion_point(class_scope:CustomersRequest)
        private static final com.example.tmbank.grpc.stub.Bank.CustomersRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.CustomersRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomersRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CustomersRequest>
                PARSER = new com.google.protobuf.AbstractParser<CustomersRequest>() {
            @java.lang.Override
            public CustomersRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CustomersRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CustomersRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CustomersRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.CustomersRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CustomersResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CustomersResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        java.util.List<com.example.tmbank.grpc.stub.Bank.CustomerDTO>
        getCustomersList();
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomers(int index);
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        int getCustomersCount();
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        java.util.List<? extends com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>
        getCustomersOrBuilderList();
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomersOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code CustomersResponse}
     */
    public  static final class CustomersResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CustomersResponse)
            CustomersResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CustomersResponse.newBuilder() to construct.
        private CustomersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CustomersResponse() {
            customers_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CustomersResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CustomersResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                customers_ = new java.util.ArrayList<com.example.tmbank.grpc.stub.Bank.CustomerDTO>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            customers_.add(
                                    input.readMessage(com.example.tmbank.grpc.stub.Bank.CustomerDTO.parser(), extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    customers_ = java.util.Collections.unmodifiableList(customers_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.CustomersResponse.class, com.example.tmbank.grpc.stub.Bank.CustomersResponse.Builder.class);
        }

        public static final int CUSTOMERS_FIELD_NUMBER = 1;
        private java.util.List<com.example.tmbank.grpc.stub.Bank.CustomerDTO> customers_;
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        public java.util.List<com.example.tmbank.grpc.stub.Bank.CustomerDTO> getCustomersList() {
            return customers_;
        }
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        public java.util.List<? extends com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>
        getCustomersOrBuilderList() {
            return customers_;
        }
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        public int getCustomersCount() {
            return customers_.size();
        }
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomers(int index) {
            return customers_.get(index);
        }
        /**
         * <code>repeated .CustomerDTO customers = 1;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomersOrBuilder(
                int index) {
            return customers_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < customers_.size(); i++) {
                output.writeMessage(1, customers_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < customers_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, customers_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.CustomersResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.CustomersResponse other = (com.example.tmbank.grpc.stub.Bank.CustomersResponse) obj;

            if (!getCustomersList()
                    .equals(other.getCustomersList())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getCustomersCount() > 0) {
                hash = (37 * hash) + CUSTOMERS_FIELD_NUMBER;
                hash = (53 * hash) + getCustomersList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.CustomersResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CustomersResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CustomersResponse)
                com.example.tmbank.grpc.stub.Bank.CustomersResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.CustomersResponse.class, com.example.tmbank.grpc.stub.Bank.CustomersResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.CustomersResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getCustomersFieldBuilder();
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (customersBuilder_ == null) {
                    customers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    customersBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomersResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomersResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.CustomersResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomersResponse build() {
                com.example.tmbank.grpc.stub.Bank.CustomersResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomersResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.CustomersResponse result = new com.example.tmbank.grpc.stub.Bank.CustomersResponse(this);
                int from_bitField0_ = bitField0_;
                if (customersBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        customers_ = java.util.Collections.unmodifiableList(customers_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.customers_ = customers_;
                } else {
                    result.customers_ = customersBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.CustomersResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.CustomersResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.CustomersResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.CustomersResponse.getDefaultInstance()) return this;
                if (customersBuilder_ == null) {
                    if (!other.customers_.isEmpty()) {
                        if (customers_.isEmpty()) {
                            customers_ = other.customers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureCustomersIsMutable();
                            customers_.addAll(other.customers_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.customers_.isEmpty()) {
                        if (customersBuilder_.isEmpty()) {
                            customersBuilder_.dispose();
                            customersBuilder_ = null;
                            customers_ = other.customers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            customersBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getCustomersFieldBuilder() : null;
                        } else {
                            customersBuilder_.addAllMessages(other.customers_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.CustomersResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.CustomersResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.util.List<com.example.tmbank.grpc.stub.Bank.CustomerDTO> customers_ =
                    java.util.Collections.emptyList();
            private void ensureCustomersIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    customers_ = new java.util.ArrayList<com.example.tmbank.grpc.stub.Bank.CustomerDTO>(customers_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder> customersBuilder_;

            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public java.util.List<com.example.tmbank.grpc.stub.Bank.CustomerDTO> getCustomersList() {
                if (customersBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(customers_);
                } else {
                    return customersBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public int getCustomersCount() {
                if (customersBuilder_ == null) {
                    return customers_.size();
                } else {
                    return customersBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomers(int index) {
                if (customersBuilder_ == null) {
                    return customers_.get(index);
                } else {
                    return customersBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder setCustomers(
                    int index, com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCustomersIsMutable();
                    customers_.set(index, value);
                    onChanged();
                } else {
                    customersBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder setCustomers(
                    int index, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder builderForValue) {
                if (customersBuilder_ == null) {
                    ensureCustomersIsMutable();
                    customers_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    customersBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder addCustomers(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCustomersIsMutable();
                    customers_.add(value);
                    onChanged();
                } else {
                    customersBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder addCustomers(
                    int index, com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCustomersIsMutable();
                    customers_.add(index, value);
                    onChanged();
                } else {
                    customersBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder addCustomers(
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder builderForValue) {
                if (customersBuilder_ == null) {
                    ensureCustomersIsMutable();
                    customers_.add(builderForValue.build());
                    onChanged();
                } else {
                    customersBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder addCustomers(
                    int index, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder builderForValue) {
                if (customersBuilder_ == null) {
                    ensureCustomersIsMutable();
                    customers_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    customersBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder addAllCustomers(
                    java.lang.Iterable<? extends com.example.tmbank.grpc.stub.Bank.CustomerDTO> values) {
                if (customersBuilder_ == null) {
                    ensureCustomersIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, customers_);
                    onChanged();
                } else {
                    customersBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder clearCustomers() {
                if (customersBuilder_ == null) {
                    customers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    customersBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public Builder removeCustomers(int index) {
                if (customersBuilder_ == null) {
                    ensureCustomersIsMutable();
                    customers_.remove(index);
                    onChanged();
                } else {
                    customersBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder getCustomersBuilder(
                    int index) {
                return getCustomersFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomersOrBuilder(
                    int index) {
                if (customersBuilder_ == null) {
                    return customers_.get(index);  } else {
                    return customersBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public java.util.List<? extends com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>
            getCustomersOrBuilderList() {
                if (customersBuilder_ != null) {
                    return customersBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(customers_);
                }
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder addCustomersBuilder() {
                return getCustomersFieldBuilder().addBuilder(
                        com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance());
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder addCustomersBuilder(
                    int index) {
                return getCustomersFieldBuilder().addBuilder(
                        index, com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance());
            }
            /**
             * <code>repeated .CustomerDTO customers = 1;</code>
             */
            public java.util.List<com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder>
            getCustomersBuilderList() {
                return getCustomersFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>
            getCustomersFieldBuilder() {
                if (customersBuilder_ == null) {
                    customersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>(
                            customers_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    customers_ = null;
                }
                return customersBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:CustomersResponse)
        }

        // @@protoc_insertion_point(class_scope:CustomersResponse)
        private static final com.example.tmbank.grpc.stub.Bank.CustomersResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.CustomersResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomersResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CustomersResponse>
                PARSER = new com.google.protobuf.AbstractParser<CustomersResponse>() {
            @java.lang.Override
            public CustomersResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CustomersResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CustomersResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CustomersResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.CustomersResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CustomerDTOOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CustomerDTO)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 id = 1;</code>
         * @return The id.
         */
        long getId();

        /**
         * <code>string username = 2;</code>
         * @return The username.
         */
        java.lang.String getUsername();
        /**
         * <code>string username = 2;</code>
         * @return The bytes for username.
         */
        com.google.protobuf.ByteString
        getUsernameBytes();

        /**
         * <code>string identityRef = 3;</code>
         * @return The identityRef.
         */
        java.lang.String getIdentityRef();
        /**
         * <code>string identityRef = 3;</code>
         * @return The bytes for identityRef.
         */
        com.google.protobuf.ByteString
        getIdentityRefBytes();

        /**
         * <code>string firstname = 4;</code>
         * @return The firstname.
         */
        java.lang.String getFirstname();
        /**
         * <code>string firstname = 4;</code>
         * @return The bytes for firstname.
         */
        com.google.protobuf.ByteString
        getFirstnameBytes();

        /**
         * <code>string lastname = 5;</code>
         * @return The lastname.
         */
        java.lang.String getLastname();
        /**
         * <code>string lastname = 5;</code>
         * @return The bytes for lastname.
         */
        com.google.protobuf.ByteString
        getLastnameBytes();
    }
    /**
     * Protobuf type {@code CustomerDTO}
     */
    public  static final class CustomerDTO extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CustomerDTO)
            CustomerDTOOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CustomerDTO.newBuilder() to construct.
        private CustomerDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CustomerDTO() {
            username_ = "";
            identityRef_ = "";
            firstname_ = "";
            lastname_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CustomerDTO();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CustomerDTO(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            username_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            identityRef_ = s;
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            firstname_ = s;
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();

                            lastname_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerDTO_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerDTO_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.class, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>int64 id = 1;</code>
         * @return The id.
         */
        public long getId() {
            return id_;
        }

        public static final int USERNAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object username_;
        /**
         * <code>string username = 2;</code>
         * @return The username.
         */
        public java.lang.String getUsername() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                username_ = s;
                return s;
            }
        }
        /**
         * <code>string username = 2;</code>
         * @return The bytes for username.
         */
        public com.google.protobuf.ByteString
        getUsernameBytes() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                username_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int IDENTITYREF_FIELD_NUMBER = 3;
        private volatile java.lang.Object identityRef_;
        /**
         * <code>string identityRef = 3;</code>
         * @return The identityRef.
         */
        public java.lang.String getIdentityRef() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                identityRef_ = s;
                return s;
            }
        }
        /**
         * <code>string identityRef = 3;</code>
         * @return The bytes for identityRef.
         */
        public com.google.protobuf.ByteString
        getIdentityRefBytes() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                identityRef_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int FIRSTNAME_FIELD_NUMBER = 4;
        private volatile java.lang.Object firstname_;
        /**
         * <code>string firstname = 4;</code>
         * @return The firstname.
         */
        public java.lang.String getFirstname() {
            java.lang.Object ref = firstname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                firstname_ = s;
                return s;
            }
        }
        /**
         * <code>string firstname = 4;</code>
         * @return The bytes for firstname.
         */
        public com.google.protobuf.ByteString
        getFirstnameBytes() {
            java.lang.Object ref = firstname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                firstname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LASTNAME_FIELD_NUMBER = 5;
        private volatile java.lang.Object lastname_;
        /**
         * <code>string lastname = 5;</code>
         * @return The lastname.
         */
        public java.lang.String getLastname() {
            java.lang.Object ref = lastname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                lastname_ = s;
                return s;
            }
        }
        /**
         * <code>string lastname = 5;</code>
         * @return The bytes for lastname.
         */
        public com.google.protobuf.ByteString
        getLastnameBytes() {
            java.lang.Object ref = lastname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                lastname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0L) {
                output.writeInt64(1, id_);
            }
            if (!getUsernameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
            }
            if (!getIdentityRefBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, identityRef_);
            }
            if (!getFirstnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, firstname_);
            }
            if (!getLastnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, lastname_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (!getUsernameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
            }
            if (!getIdentityRefBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, identityRef_);
            }
            if (!getFirstnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, firstname_);
            }
            if (!getLastnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, lastname_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.CustomerDTO)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.CustomerDTO other = (com.example.tmbank.grpc.stub.Bank.CustomerDTO) obj;

            if (getId()
                    != other.getId()) return false;
            if (!getUsername()
                    .equals(other.getUsername())) return false;
            if (!getIdentityRef()
                    .equals(other.getIdentityRef())) return false;
            if (!getFirstname()
                    .equals(other.getFirstname())) return false;
            if (!getLastname()
                    .equals(other.getLastname())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + USERNAME_FIELD_NUMBER;
            hash = (53 * hash) + getUsername().hashCode();
            hash = (37 * hash) + IDENTITYREF_FIELD_NUMBER;
            hash = (53 * hash) + getIdentityRef().hashCode();
            hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getFirstname().hashCode();
            hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getLastname().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.CustomerDTO prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CustomerDTO}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CustomerDTO)
                com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerDTO_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerDTO_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.CustomerDTO.class, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.CustomerDTO.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;

                username_ = "";

                identityRef_ = "";

                firstname_ = "";

                lastname_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerDTO_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO build() {
                com.example.tmbank.grpc.stub.Bank.CustomerDTO result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO buildPartial() {
                com.example.tmbank.grpc.stub.Bank.CustomerDTO result = new com.example.tmbank.grpc.stub.Bank.CustomerDTO(this);
                result.id_ = id_;
                result.username_ = username_;
                result.identityRef_ = identityRef_;
                result.firstname_ = firstname_;
                result.lastname_ = lastname_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.CustomerDTO) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.CustomerDTO)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.CustomerDTO other) {
                if (other == com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getUsername().isEmpty()) {
                    username_ = other.username_;
                    onChanged();
                }
                if (!other.getIdentityRef().isEmpty()) {
                    identityRef_ = other.identityRef_;
                    onChanged();
                }
                if (!other.getFirstname().isEmpty()) {
                    firstname_ = other.firstname_;
                    onChanged();
                }
                if (!other.getLastname().isEmpty()) {
                    lastname_ = other.lastname_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.CustomerDTO parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.CustomerDTO) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long id_ ;
            /**
             * <code>int64 id = 1;</code>
             * @return The id.
             */
            public long getId() {
                return id_;
            }
            /**
             * <code>int64 id = 1;</code>
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 id = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object username_ = "";
            /**
             * <code>string username = 2;</code>
             * @return The username.
             */
            public java.lang.String getUsername() {
                java.lang.Object ref = username_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    username_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string username = 2;</code>
             * @return The bytes for username.
             */
            public com.google.protobuf.ByteString
            getUsernameBytes() {
                java.lang.Object ref = username_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    username_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string username = 2;</code>
             * @param value The username to set.
             * @return This builder for chaining.
             */
            public Builder setUsername(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                username_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string username = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearUsername() {

                username_ = getDefaultInstance().getUsername();
                onChanged();
                return this;
            }
            /**
             * <code>string username = 2;</code>
             * @param value The bytes for username to set.
             * @return This builder for chaining.
             */
            public Builder setUsernameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                username_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object identityRef_ = "";
            /**
             * <code>string identityRef = 3;</code>
             * @return The identityRef.
             */
            public java.lang.String getIdentityRef() {
                java.lang.Object ref = identityRef_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    identityRef_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string identityRef = 3;</code>
             * @return The bytes for identityRef.
             */
            public com.google.protobuf.ByteString
            getIdentityRefBytes() {
                java.lang.Object ref = identityRef_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    identityRef_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string identityRef = 3;</code>
             * @param value The identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRef(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                identityRef_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearIdentityRef() {

                identityRef_ = getDefaultInstance().getIdentityRef();
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 3;</code>
             * @param value The bytes for identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRefBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                identityRef_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object firstname_ = "";
            /**
             * <code>string firstname = 4;</code>
             * @return The firstname.
             */
            public java.lang.String getFirstname() {
                java.lang.Object ref = firstname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    firstname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string firstname = 4;</code>
             * @return The bytes for firstname.
             */
            public com.google.protobuf.ByteString
            getFirstnameBytes() {
                java.lang.Object ref = firstname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    firstname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string firstname = 4;</code>
             * @param value The firstname to set.
             * @return This builder for chaining.
             */
            public Builder setFirstname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                firstname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string firstname = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearFirstname() {

                firstname_ = getDefaultInstance().getFirstname();
                onChanged();
                return this;
            }
            /**
             * <code>string firstname = 4;</code>
             * @param value The bytes for firstname to set.
             * @return This builder for chaining.
             */
            public Builder setFirstnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                firstname_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object lastname_ = "";
            /**
             * <code>string lastname = 5;</code>
             * @return The lastname.
             */
            public java.lang.String getLastname() {
                java.lang.Object ref = lastname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    lastname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string lastname = 5;</code>
             * @return The bytes for lastname.
             */
            public com.google.protobuf.ByteString
            getLastnameBytes() {
                java.lang.Object ref = lastname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    lastname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string lastname = 5;</code>
             * @param value The lastname to set.
             * @return This builder for chaining.
             */
            public Builder setLastname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                lastname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string lastname = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearLastname() {

                lastname_ = getDefaultInstance().getLastname();
                onChanged();
                return this;
            }
            /**
             * <code>string lastname = 5;</code>
             * @param value The bytes for lastname to set.
             * @return This builder for chaining.
             */
            public Builder setLastnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                lastname_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:CustomerDTO)
        }

        // @@protoc_insertion_point(class_scope:CustomerDTO)
        private static final com.example.tmbank.grpc.stub.Bank.CustomerDTO DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.CustomerDTO();
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomerDTO getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CustomerDTO>
                PARSER = new com.google.protobuf.AbstractParser<CustomerDTO>() {
            @java.lang.Override
            public CustomerDTO parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CustomerDTO(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CustomerDTO> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CustomerDTO> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.CustomerDTO getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CustomerByIdentityRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CustomerByIdentityRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string identityRef = 1;</code>
         * @return The identityRef.
         */
        java.lang.String getIdentityRef();
        /**
         * <code>string identityRef = 1;</code>
         * @return The bytes for identityRef.
         */
        com.google.protobuf.ByteString
        getIdentityRefBytes();
    }
    /**
     * Protobuf type {@code CustomerByIdentityRequest}
     */
    public  static final class CustomerByIdentityRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CustomerByIdentityRequest)
            CustomerByIdentityRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CustomerByIdentityRequest.newBuilder() to construct.
        private CustomerByIdentityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CustomerByIdentityRequest() {
            identityRef_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CustomerByIdentityRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CustomerByIdentityRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            identityRef_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest.class, com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest.Builder.class);
        }

        public static final int IDENTITYREF_FIELD_NUMBER = 1;
        private volatile java.lang.Object identityRef_;
        /**
         * <code>string identityRef = 1;</code>
         * @return The identityRef.
         */
        public java.lang.String getIdentityRef() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                identityRef_ = s;
                return s;
            }
        }
        /**
         * <code>string identityRef = 1;</code>
         * @return The bytes for identityRef.
         */
        public com.google.protobuf.ByteString
        getIdentityRefBytes() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                identityRef_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getIdentityRefBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identityRef_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getIdentityRefBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identityRef_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest other = (com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest) obj;

            if (!getIdentityRef()
                    .equals(other.getIdentityRef())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + IDENTITYREF_FIELD_NUMBER;
            hash = (53 * hash) + getIdentityRef().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CustomerByIdentityRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CustomerByIdentityRequest)
                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest.class, com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                identityRef_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest build() {
                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest result = new com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest(this);
                result.identityRef_ = identityRef_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest.getDefaultInstance()) return this;
                if (!other.getIdentityRef().isEmpty()) {
                    identityRef_ = other.identityRef_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object identityRef_ = "";
            /**
             * <code>string identityRef = 1;</code>
             * @return The identityRef.
             */
            public java.lang.String getIdentityRef() {
                java.lang.Object ref = identityRef_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    identityRef_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string identityRef = 1;</code>
             * @return The bytes for identityRef.
             */
            public com.google.protobuf.ByteString
            getIdentityRefBytes() {
                java.lang.Object ref = identityRef_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    identityRef_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string identityRef = 1;</code>
             * @param value The identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRef(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                identityRef_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearIdentityRef() {

                identityRef_ = getDefaultInstance().getIdentityRef();
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 1;</code>
             * @param value The bytes for identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRefBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                identityRef_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:CustomerByIdentityRequest)
        }

        // @@protoc_insertion_point(class_scope:CustomerByIdentityRequest)
        private static final com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CustomerByIdentityRequest>
                PARSER = new com.google.protobuf.AbstractParser<CustomerByIdentityRequest>() {
            @java.lang.Override
            public CustomerByIdentityRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CustomerByIdentityRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CustomerByIdentityRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CustomerByIdentityRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.CustomerByIdentityRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CustomerByIdentityResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CustomerByIdentityResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.CustomerDTO customer = 1;</code>
         * @return Whether the customer field is set.
         */
        boolean hasCustomer();
        /**
         * <code>.CustomerDTO customer = 1;</code>
         * @return The customer.
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer();
        /**
         * <code>.CustomerDTO customer = 1;</code>
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder();
    }
    /**
     * Protobuf type {@code CustomerByIdentityResponse}
     */
    public  static final class CustomerByIdentityResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CustomerByIdentityResponse)
            CustomerByIdentityResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CustomerByIdentityResponse.newBuilder() to construct.
        private CustomerByIdentityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CustomerByIdentityResponse() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CustomerByIdentityResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CustomerByIdentityResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder subBuilder = null;
                            if (customer_ != null) {
                                subBuilder = customer_.toBuilder();
                            }
                            customer_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.CustomerDTO.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(customer_);
                                customer_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse.class, com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse.Builder.class);
        }

        public static final int CUSTOMER_FIELD_NUMBER = 1;
        private com.example.tmbank.grpc.stub.Bank.CustomerDTO customer_;
        /**
         * <code>.CustomerDTO customer = 1;</code>
         * @return Whether the customer field is set.
         */
        public boolean hasCustomer() {
            return customer_ != null;
        }
        /**
         * <code>.CustomerDTO customer = 1;</code>
         * @return The customer.
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer() {
            return customer_ == null ? com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
        }
        /**
         * <code>.CustomerDTO customer = 1;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder() {
            return getCustomer();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (customer_ != null) {
                output.writeMessage(1, getCustomer());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (customer_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getCustomer());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse other = (com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse) obj;

            if (hasCustomer() != other.hasCustomer()) return false;
            if (hasCustomer()) {
                if (!getCustomer()
                        .equals(other.getCustomer())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasCustomer()) {
                hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
                hash = (53 * hash) + getCustomer().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CustomerByIdentityResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CustomerByIdentityResponse)
                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse.class, com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (customerBuilder_ == null) {
                    customer_ = null;
                } else {
                    customer_ = null;
                    customerBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CustomerByIdentityResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse build() {
                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse result = new com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse(this);
                if (customerBuilder_ == null) {
                    result.customer_ = customer_;
                } else {
                    result.customer_ = customerBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse.getDefaultInstance()) return this;
                if (other.hasCustomer()) {
                    mergeCustomer(other.getCustomer());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.CustomerDTO customer_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder> customerBuilder_;
            /**
             * <code>.CustomerDTO customer = 1;</code>
             * @return Whether the customer field is set.
             */
            public boolean hasCustomer() {
                return customerBuilder_ != null || customer_ != null;
            }
            /**
             * <code>.CustomerDTO customer = 1;</code>
             * @return The customer.
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer() {
                if (customerBuilder_ == null) {
                    return customer_ == null ? com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
                } else {
                    return customerBuilder_.getMessage();
                }
            }
            /**
             * <code>.CustomerDTO customer = 1;</code>
             */
            public Builder setCustomer(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    customer_ = value;
                    onChanged();
                } else {
                    customerBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 1;</code>
             */
            public Builder setCustomer(
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder builderForValue) {
                if (customerBuilder_ == null) {
                    customer_ = builderForValue.build();
                    onChanged();
                } else {
                    customerBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 1;</code>
             */
            public Builder mergeCustomer(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customerBuilder_ == null) {
                    if (customer_ != null) {
                        customer_ =
                                com.example.tmbank.grpc.stub.Bank.CustomerDTO.newBuilder(customer_).mergeFrom(value).buildPartial();
                    } else {
                        customer_ = value;
                    }
                    onChanged();
                } else {
                    customerBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 1;</code>
             */
            public Builder clearCustomer() {
                if (customerBuilder_ == null) {
                    customer_ = null;
                    onChanged();
                } else {
                    customer_ = null;
                    customerBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder getCustomerBuilder() {

                onChanged();
                return getCustomerFieldBuilder().getBuilder();
            }
            /**
             * <code>.CustomerDTO customer = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder() {
                if (customerBuilder_ != null) {
                    return customerBuilder_.getMessageOrBuilder();
                } else {
                    return customer_ == null ?
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
                }
            }
            /**
             * <code>.CustomerDTO customer = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>
            getCustomerFieldBuilder() {
                if (customerBuilder_ == null) {
                    customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>(
                            getCustomer(),
                            getParentForChildren(),
                            isClean());
                    customer_ = null;
                }
                return customerBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:CustomerByIdentityResponse)
        }

        // @@protoc_insertion_point(class_scope:CustomerByIdentityResponse)
        private static final com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CustomerByIdentityResponse>
                PARSER = new com.google.protobuf.AbstractParser<CustomerByIdentityResponse>() {
            @java.lang.Override
            public CustomerByIdentityResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CustomerByIdentityResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CustomerByIdentityResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CustomerByIdentityResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.CustomerByIdentityResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CreateCustomerRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CreateCustomerRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string username = 1;</code>
         * @return The username.
         */
        java.lang.String getUsername();
        /**
         * <code>string username = 1;</code>
         * @return The bytes for username.
         */
        com.google.protobuf.ByteString
        getUsernameBytes();

        /**
         * <code>string identityRef = 2;</code>
         * @return The identityRef.
         */
        java.lang.String getIdentityRef();
        /**
         * <code>string identityRef = 2;</code>
         * @return The bytes for identityRef.
         */
        com.google.protobuf.ByteString
        getIdentityRefBytes();

        /**
         * <code>string firstname = 3;</code>
         * @return The firstname.
         */
        java.lang.String getFirstname();
        /**
         * <code>string firstname = 3;</code>
         * @return The bytes for firstname.
         */
        com.google.protobuf.ByteString
        getFirstnameBytes();

        /**
         * <code>string lastname = 4;</code>
         * @return The lastname.
         */
        java.lang.String getLastname();
        /**
         * <code>string lastname = 4;</code>
         * @return The bytes for lastname.
         */
        com.google.protobuf.ByteString
        getLastnameBytes();
    }
    /**
     * Protobuf type {@code CreateCustomerRequest}
     */
    public  static final class CreateCustomerRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CreateCustomerRequest)
            CreateCustomerRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CreateCustomerRequest.newBuilder() to construct.
        private CreateCustomerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CreateCustomerRequest() {
            username_ = "";
            identityRef_ = "";
            firstname_ = "";
            lastname_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CreateCustomerRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CreateCustomerRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            username_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            identityRef_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            firstname_ = s;
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            lastname_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest.class, com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest.Builder.class);
        }

        public static final int USERNAME_FIELD_NUMBER = 1;
        private volatile java.lang.Object username_;
        /**
         * <code>string username = 1;</code>
         * @return The username.
         */
        public java.lang.String getUsername() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                username_ = s;
                return s;
            }
        }
        /**
         * <code>string username = 1;</code>
         * @return The bytes for username.
         */
        public com.google.protobuf.ByteString
        getUsernameBytes() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                username_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int IDENTITYREF_FIELD_NUMBER = 2;
        private volatile java.lang.Object identityRef_;
        /**
         * <code>string identityRef = 2;</code>
         * @return The identityRef.
         */
        public java.lang.String getIdentityRef() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                identityRef_ = s;
                return s;
            }
        }
        /**
         * <code>string identityRef = 2;</code>
         * @return The bytes for identityRef.
         */
        public com.google.protobuf.ByteString
        getIdentityRefBytes() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                identityRef_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int FIRSTNAME_FIELD_NUMBER = 3;
        private volatile java.lang.Object firstname_;
        /**
         * <code>string firstname = 3;</code>
         * @return The firstname.
         */
        public java.lang.String getFirstname() {
            java.lang.Object ref = firstname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                firstname_ = s;
                return s;
            }
        }
        /**
         * <code>string firstname = 3;</code>
         * @return The bytes for firstname.
         */
        public com.google.protobuf.ByteString
        getFirstnameBytes() {
            java.lang.Object ref = firstname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                firstname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LASTNAME_FIELD_NUMBER = 4;
        private volatile java.lang.Object lastname_;
        /**
         * <code>string lastname = 4;</code>
         * @return The lastname.
         */
        public java.lang.String getLastname() {
            java.lang.Object ref = lastname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                lastname_ = s;
                return s;
            }
        }
        /**
         * <code>string lastname = 4;</code>
         * @return The bytes for lastname.
         */
        public com.google.protobuf.ByteString
        getLastnameBytes() {
            java.lang.Object ref = lastname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                lastname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getUsernameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
            }
            if (!getIdentityRefBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identityRef_);
            }
            if (!getFirstnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, firstname_);
            }
            if (!getLastnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, lastname_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getUsernameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
            }
            if (!getIdentityRefBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identityRef_);
            }
            if (!getFirstnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, firstname_);
            }
            if (!getLastnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, lastname_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest other = (com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest) obj;

            if (!getUsername()
                    .equals(other.getUsername())) return false;
            if (!getIdentityRef()
                    .equals(other.getIdentityRef())) return false;
            if (!getFirstname()
                    .equals(other.getFirstname())) return false;
            if (!getLastname()
                    .equals(other.getLastname())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + USERNAME_FIELD_NUMBER;
            hash = (53 * hash) + getUsername().hashCode();
            hash = (37 * hash) + IDENTITYREF_FIELD_NUMBER;
            hash = (53 * hash) + getIdentityRef().hashCode();
            hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getFirstname().hashCode();
            hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getLastname().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CreateCustomerRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CreateCustomerRequest)
                com.example.tmbank.grpc.stub.Bank.CreateCustomerRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest.class, com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                username_ = "";

                identityRef_ = "";

                firstname_ = "";

                lastname_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest build() {
                com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest result = new com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest(this);
                result.username_ = username_;
                result.identityRef_ = identityRef_;
                result.firstname_ = firstname_;
                result.lastname_ = lastname_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest.getDefaultInstance()) return this;
                if (!other.getUsername().isEmpty()) {
                    username_ = other.username_;
                    onChanged();
                }
                if (!other.getIdentityRef().isEmpty()) {
                    identityRef_ = other.identityRef_;
                    onChanged();
                }
                if (!other.getFirstname().isEmpty()) {
                    firstname_ = other.firstname_;
                    onChanged();
                }
                if (!other.getLastname().isEmpty()) {
                    lastname_ = other.lastname_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object username_ = "";
            /**
             * <code>string username = 1;</code>
             * @return The username.
             */
            public java.lang.String getUsername() {
                java.lang.Object ref = username_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    username_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string username = 1;</code>
             * @return The bytes for username.
             */
            public com.google.protobuf.ByteString
            getUsernameBytes() {
                java.lang.Object ref = username_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    username_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string username = 1;</code>
             * @param value The username to set.
             * @return This builder for chaining.
             */
            public Builder setUsername(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                username_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string username = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearUsername() {

                username_ = getDefaultInstance().getUsername();
                onChanged();
                return this;
            }
            /**
             * <code>string username = 1;</code>
             * @param value The bytes for username to set.
             * @return This builder for chaining.
             */
            public Builder setUsernameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                username_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object identityRef_ = "";
            /**
             * <code>string identityRef = 2;</code>
             * @return The identityRef.
             */
            public java.lang.String getIdentityRef() {
                java.lang.Object ref = identityRef_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    identityRef_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string identityRef = 2;</code>
             * @return The bytes for identityRef.
             */
            public com.google.protobuf.ByteString
            getIdentityRefBytes() {
                java.lang.Object ref = identityRef_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    identityRef_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string identityRef = 2;</code>
             * @param value The identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRef(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                identityRef_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearIdentityRef() {

                identityRef_ = getDefaultInstance().getIdentityRef();
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 2;</code>
             * @param value The bytes for identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRefBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                identityRef_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object firstname_ = "";
            /**
             * <code>string firstname = 3;</code>
             * @return The firstname.
             */
            public java.lang.String getFirstname() {
                java.lang.Object ref = firstname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    firstname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string firstname = 3;</code>
             * @return The bytes for firstname.
             */
            public com.google.protobuf.ByteString
            getFirstnameBytes() {
                java.lang.Object ref = firstname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    firstname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string firstname = 3;</code>
             * @param value The firstname to set.
             * @return This builder for chaining.
             */
            public Builder setFirstname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                firstname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string firstname = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearFirstname() {

                firstname_ = getDefaultInstance().getFirstname();
                onChanged();
                return this;
            }
            /**
             * <code>string firstname = 3;</code>
             * @param value The bytes for firstname to set.
             * @return This builder for chaining.
             */
            public Builder setFirstnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                firstname_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object lastname_ = "";
            /**
             * <code>string lastname = 4;</code>
             * @return The lastname.
             */
            public java.lang.String getLastname() {
                java.lang.Object ref = lastname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    lastname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string lastname = 4;</code>
             * @return The bytes for lastname.
             */
            public com.google.protobuf.ByteString
            getLastnameBytes() {
                java.lang.Object ref = lastname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    lastname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string lastname = 4;</code>
             * @param value The lastname to set.
             * @return This builder for chaining.
             */
            public Builder setLastname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                lastname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string lastname = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearLastname() {

                lastname_ = getDefaultInstance().getLastname();
                onChanged();
                return this;
            }
            /**
             * <code>string lastname = 4;</code>
             * @param value The bytes for lastname to set.
             * @return This builder for chaining.
             */
            public Builder setLastnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                lastname_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:CreateCustomerRequest)
        }

        // @@protoc_insertion_point(class_scope:CreateCustomerRequest)
        private static final com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CreateCustomerRequest>
                PARSER = new com.google.protobuf.AbstractParser<CreateCustomerRequest>() {
            @java.lang.Override
            public CreateCustomerRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CreateCustomerRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CreateCustomerRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CreateCustomerRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.CreateCustomerRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CreateCustomerResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CreateCustomerResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        java.lang.String getMessage();
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        com.google.protobuf.ByteString
        getMessageBytes();

        /**
         * <code>.CustomerDTO customer = 2;</code>
         * @return Whether the customer field is set.
         */
        boolean hasCustomer();
        /**
         * <code>.CustomerDTO customer = 2;</code>
         * @return The customer.
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer();
        /**
         * <code>.CustomerDTO customer = 2;</code>
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder();
    }
    /**
     * Protobuf type {@code CreateCustomerResponse}
     */
    public  static final class CreateCustomerResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CreateCustomerResponse)
            CreateCustomerResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CreateCustomerResponse.newBuilder() to construct.
        private CreateCustomerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CreateCustomerResponse() {
            message_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CreateCustomerResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CreateCustomerResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            message_ = s;
                            break;
                        }
                        case 18: {
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder subBuilder = null;
                            if (customer_ != null) {
                                subBuilder = customer_.toBuilder();
                            }
                            customer_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.CustomerDTO.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(customer_);
                                customer_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse.class, com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse.Builder.class);
        }

        public static final int MESSAGE_FIELD_NUMBER = 1;
        private volatile java.lang.Object message_;
        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        public java.lang.String getMessage() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                message_ = s;
                return s;
            }
        }
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        public com.google.protobuf.ByteString
        getMessageBytes() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int CUSTOMER_FIELD_NUMBER = 2;
        private com.example.tmbank.grpc.stub.Bank.CustomerDTO customer_;
        /**
         * <code>.CustomerDTO customer = 2;</code>
         * @return Whether the customer field is set.
         */
        public boolean hasCustomer() {
            return customer_ != null;
        }
        /**
         * <code>.CustomerDTO customer = 2;</code>
         * @return The customer.
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer() {
            return customer_ == null ? com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
        }
        /**
         * <code>.CustomerDTO customer = 2;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder() {
            return getCustomer();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getMessageBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
            }
            if (customer_ != null) {
                output.writeMessage(2, getCustomer());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getMessageBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
            }
            if (customer_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getCustomer());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse other = (com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse) obj;

            if (!getMessage()
                    .equals(other.getMessage())) return false;
            if (hasCustomer() != other.hasCustomer()) return false;
            if (hasCustomer()) {
                if (!getCustomer()
                        .equals(other.getCustomer())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getMessage().hashCode();
            if (hasCustomer()) {
                hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
                hash = (53 * hash) + getCustomer().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CreateCustomerResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CreateCustomerResponse)
                com.example.tmbank.grpc.stub.Bank.CreateCustomerResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse.class, com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                message_ = "";

                if (customerBuilder_ == null) {
                    customer_ = null;
                } else {
                    customer_ = null;
                    customerBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_CreateCustomerResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse build() {
                com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse result = new com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse(this);
                result.message_ = message_;
                if (customerBuilder_ == null) {
                    result.customer_ = customer_;
                } else {
                    result.customer_ = customerBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse.getDefaultInstance()) return this;
                if (!other.getMessage().isEmpty()) {
                    message_ = other.message_;
                    onChanged();
                }
                if (other.hasCustomer()) {
                    mergeCustomer(other.getCustomer());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object message_ = "";
            /**
             * <code>string message = 1;</code>
             * @return The message.
             */
            public java.lang.String getMessage() {
                java.lang.Object ref = message_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    message_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @return The bytes for message.
             */
            public com.google.protobuf.ByteString
            getMessageBytes() {
                java.lang.Object ref = message_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @param value The message to set.
             * @return This builder for chaining.
             */
            public Builder setMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                message_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearMessage() {

                message_ = getDefaultInstance().getMessage();
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @param value The bytes for message to set.
             * @return This builder for chaining.
             */
            public Builder setMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                message_ = value;
                onChanged();
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.CustomerDTO customer_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder> customerBuilder_;
            /**
             * <code>.CustomerDTO customer = 2;</code>
             * @return Whether the customer field is set.
             */
            public boolean hasCustomer() {
                return customerBuilder_ != null || customer_ != null;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             * @return The customer.
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer() {
                if (customerBuilder_ == null) {
                    return customer_ == null ? com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
                } else {
                    return customerBuilder_.getMessage();
                }
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public Builder setCustomer(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    customer_ = value;
                    onChanged();
                } else {
                    customerBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public Builder setCustomer(
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder builderForValue) {
                if (customerBuilder_ == null) {
                    customer_ = builderForValue.build();
                    onChanged();
                } else {
                    customerBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public Builder mergeCustomer(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customerBuilder_ == null) {
                    if (customer_ != null) {
                        customer_ =
                                com.example.tmbank.grpc.stub.Bank.CustomerDTO.newBuilder(customer_).mergeFrom(value).buildPartial();
                    } else {
                        customer_ = value;
                    }
                    onChanged();
                } else {
                    customerBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public Builder clearCustomer() {
                if (customerBuilder_ == null) {
                    customer_ = null;
                    onChanged();
                } else {
                    customer_ = null;
                    customerBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder getCustomerBuilder() {

                onChanged();
                return getCustomerFieldBuilder().getBuilder();
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder() {
                if (customerBuilder_ != null) {
                    return customerBuilder_.getMessageOrBuilder();
                } else {
                    return customer_ == null ?
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
                }
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>
            getCustomerFieldBuilder() {
                if (customerBuilder_ == null) {
                    customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>(
                            getCustomer(),
                            getParentForChildren(),
                            isClean());
                    customer_ = null;
                }
                return customerBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:CreateCustomerResponse)
        }

        // @@protoc_insertion_point(class_scope:CreateCustomerResponse)
        private static final com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CreateCustomerResponse>
                PARSER = new com.google.protobuf.AbstractParser<CreateCustomerResponse>() {
            @java.lang.Override
            public CreateCustomerResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CreateCustomerResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CreateCustomerResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CreateCustomerResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.CreateCustomerResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface UpdateCustomerRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:UpdateCustomerRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string identityRef = 1;</code>
         * @return The identityRef.
         */
        java.lang.String getIdentityRef();
        /**
         * <code>string identityRef = 1;</code>
         * @return The bytes for identityRef.
         */
        com.google.protobuf.ByteString
        getIdentityRefBytes();

        /**
         * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
         * @return Whether the updatedCustomer field is set.
         */
        boolean hasUpdatedCustomer();
        /**
         * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
         * @return The updatedCustomer.
         */
        com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO getUpdatedCustomer();
        /**
         * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
         */
        com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTOOrBuilder getUpdatedCustomerOrBuilder();
    }
    /**
     * Protobuf type {@code UpdateCustomerRequest}
     */
    public  static final class UpdateCustomerRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:UpdateCustomerRequest)
            UpdateCustomerRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use UpdateCustomerRequest.newBuilder() to construct.
        private UpdateCustomerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private UpdateCustomerRequest() {
            identityRef_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new UpdateCustomerRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private UpdateCustomerRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            identityRef_ = s;
                            break;
                        }
                        case 18: {
                            com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.Builder subBuilder = null;
                            if (updatedCustomer_ != null) {
                                subBuilder = updatedCustomer_.toBuilder();
                            }
                            updatedCustomer_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(updatedCustomer_);
                                updatedCustomer_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest.class, com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest.Builder.class);
        }

        public static final int IDENTITYREF_FIELD_NUMBER = 1;
        private volatile java.lang.Object identityRef_;
        /**
         * <code>string identityRef = 1;</code>
         * @return The identityRef.
         */
        public java.lang.String getIdentityRef() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                identityRef_ = s;
                return s;
            }
        }
        /**
         * <code>string identityRef = 1;</code>
         * @return The bytes for identityRef.
         */
        public com.google.protobuf.ByteString
        getIdentityRefBytes() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                identityRef_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int UPDATEDCUSTOMER_FIELD_NUMBER = 2;
        private com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO updatedCustomer_;
        /**
         * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
         * @return Whether the updatedCustomer field is set.
         */
        public boolean hasUpdatedCustomer() {
            return updatedCustomer_ != null;
        }
        /**
         * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
         * @return The updatedCustomer.
         */
        public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO getUpdatedCustomer() {
            return updatedCustomer_ == null ? com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.getDefaultInstance() : updatedCustomer_;
        }
        /**
         * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTOOrBuilder getUpdatedCustomerOrBuilder() {
            return getUpdatedCustomer();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getIdentityRefBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identityRef_);
            }
            if (updatedCustomer_ != null) {
                output.writeMessage(2, getUpdatedCustomer());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getIdentityRefBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identityRef_);
            }
            if (updatedCustomer_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getUpdatedCustomer());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest other = (com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest) obj;

            if (!getIdentityRef()
                    .equals(other.getIdentityRef())) return false;
            if (hasUpdatedCustomer() != other.hasUpdatedCustomer()) return false;
            if (hasUpdatedCustomer()) {
                if (!getUpdatedCustomer()
                        .equals(other.getUpdatedCustomer())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + IDENTITYREF_FIELD_NUMBER;
            hash = (53 * hash) + getIdentityRef().hashCode();
            if (hasUpdatedCustomer()) {
                hash = (37 * hash) + UPDATEDCUSTOMER_FIELD_NUMBER;
                hash = (53 * hash) + getUpdatedCustomer().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code UpdateCustomerRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:UpdateCustomerRequest)
                com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest.class, com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                identityRef_ = "";

                if (updatedCustomerBuilder_ == null) {
                    updatedCustomer_ = null;
                } else {
                    updatedCustomer_ = null;
                    updatedCustomerBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest build() {
                com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest result = new com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest(this);
                result.identityRef_ = identityRef_;
                if (updatedCustomerBuilder_ == null) {
                    result.updatedCustomer_ = updatedCustomer_;
                } else {
                    result.updatedCustomer_ = updatedCustomerBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest.getDefaultInstance()) return this;
                if (!other.getIdentityRef().isEmpty()) {
                    identityRef_ = other.identityRef_;
                    onChanged();
                }
                if (other.hasUpdatedCustomer()) {
                    mergeUpdatedCustomer(other.getUpdatedCustomer());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object identityRef_ = "";
            /**
             * <code>string identityRef = 1;</code>
             * @return The identityRef.
             */
            public java.lang.String getIdentityRef() {
                java.lang.Object ref = identityRef_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    identityRef_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string identityRef = 1;</code>
             * @return The bytes for identityRef.
             */
            public com.google.protobuf.ByteString
            getIdentityRefBytes() {
                java.lang.Object ref = identityRef_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    identityRef_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string identityRef = 1;</code>
             * @param value The identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRef(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                identityRef_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearIdentityRef() {

                identityRef_ = getDefaultInstance().getIdentityRef();
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 1;</code>
             * @param value The bytes for identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRefBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                identityRef_ = value;
                onChanged();
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO updatedCustomer_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO, com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTOOrBuilder> updatedCustomerBuilder_;
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             * @return Whether the updatedCustomer field is set.
             */
            public boolean hasUpdatedCustomer() {
                return updatedCustomerBuilder_ != null || updatedCustomer_ != null;
            }
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             * @return The updatedCustomer.
             */
            public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO getUpdatedCustomer() {
                if (updatedCustomerBuilder_ == null) {
                    return updatedCustomer_ == null ? com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.getDefaultInstance() : updatedCustomer_;
                } else {
                    return updatedCustomerBuilder_.getMessage();
                }
            }
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             */
            public Builder setUpdatedCustomer(com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO value) {
                if (updatedCustomerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    updatedCustomer_ = value;
                    onChanged();
                } else {
                    updatedCustomerBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             */
            public Builder setUpdatedCustomer(
                    com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.Builder builderForValue) {
                if (updatedCustomerBuilder_ == null) {
                    updatedCustomer_ = builderForValue.build();
                    onChanged();
                } else {
                    updatedCustomerBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             */
            public Builder mergeUpdatedCustomer(com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO value) {
                if (updatedCustomerBuilder_ == null) {
                    if (updatedCustomer_ != null) {
                        updatedCustomer_ =
                                com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.newBuilder(updatedCustomer_).mergeFrom(value).buildPartial();
                    } else {
                        updatedCustomer_ = value;
                    }
                    onChanged();
                } else {
                    updatedCustomerBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             */
            public Builder clearUpdatedCustomer() {
                if (updatedCustomerBuilder_ == null) {
                    updatedCustomer_ = null;
                    onChanged();
                } else {
                    updatedCustomer_ = null;
                    updatedCustomerBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.Builder getUpdatedCustomerBuilder() {

                onChanged();
                return getUpdatedCustomerFieldBuilder().getBuilder();
            }
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTOOrBuilder getUpdatedCustomerOrBuilder() {
                if (updatedCustomerBuilder_ != null) {
                    return updatedCustomerBuilder_.getMessageOrBuilder();
                } else {
                    return updatedCustomer_ == null ?
                            com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.getDefaultInstance() : updatedCustomer_;
                }
            }
            /**
             * <code>.UpdatedCustomerDTO updatedCustomer = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO, com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTOOrBuilder>
            getUpdatedCustomerFieldBuilder() {
                if (updatedCustomerBuilder_ == null) {
                    updatedCustomerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO, com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTOOrBuilder>(
                            getUpdatedCustomer(),
                            getParentForChildren(),
                            isClean());
                    updatedCustomer_ = null;
                }
                return updatedCustomerBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:UpdateCustomerRequest)
        }

        // @@protoc_insertion_point(class_scope:UpdateCustomerRequest)
        private static final com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<UpdateCustomerRequest>
                PARSER = new com.google.protobuf.AbstractParser<UpdateCustomerRequest>() {
            @java.lang.Override
            public UpdateCustomerRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new UpdateCustomerRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<UpdateCustomerRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<UpdateCustomerRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.UpdateCustomerRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface UpdatedCustomerDTOOrBuilder extends
            // @@protoc_insertion_point(interface_extends:UpdatedCustomerDTO)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string username = 2;</code>
         * @return The username.
         */
        java.lang.String getUsername();
        /**
         * <code>string username = 2;</code>
         * @return The bytes for username.
         */
        com.google.protobuf.ByteString
        getUsernameBytes();

        /**
         * <code>string firstname = 4;</code>
         * @return The firstname.
         */
        java.lang.String getFirstname();
        /**
         * <code>string firstname = 4;</code>
         * @return The bytes for firstname.
         */
        com.google.protobuf.ByteString
        getFirstnameBytes();

        /**
         * <code>string lastname = 5;</code>
         * @return The lastname.
         */
        java.lang.String getLastname();
        /**
         * <code>string lastname = 5;</code>
         * @return The bytes for lastname.
         */
        com.google.protobuf.ByteString
        getLastnameBytes();
    }
    /**
     * Protobuf type {@code UpdatedCustomerDTO}
     */
    public  static final class UpdatedCustomerDTO extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:UpdatedCustomerDTO)
            UpdatedCustomerDTOOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use UpdatedCustomerDTO.newBuilder() to construct.
        private UpdatedCustomerDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private UpdatedCustomerDTO() {
            username_ = "";
            firstname_ = "";
            lastname_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new UpdatedCustomerDTO();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private UpdatedCustomerDTO(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            username_ = s;
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            firstname_ = s;
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();

                            lastname_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_UpdatedCustomerDTO_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_UpdatedCustomerDTO_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.class, com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.Builder.class);
        }

        public static final int USERNAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object username_;
        /**
         * <code>string username = 2;</code>
         * @return The username.
         */
        public java.lang.String getUsername() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                username_ = s;
                return s;
            }
        }
        /**
         * <code>string username = 2;</code>
         * @return The bytes for username.
         */
        public com.google.protobuf.ByteString
        getUsernameBytes() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                username_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int FIRSTNAME_FIELD_NUMBER = 4;
        private volatile java.lang.Object firstname_;
        /**
         * <code>string firstname = 4;</code>
         * @return The firstname.
         */
        public java.lang.String getFirstname() {
            java.lang.Object ref = firstname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                firstname_ = s;
                return s;
            }
        }
        /**
         * <code>string firstname = 4;</code>
         * @return The bytes for firstname.
         */
        public com.google.protobuf.ByteString
        getFirstnameBytes() {
            java.lang.Object ref = firstname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                firstname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LASTNAME_FIELD_NUMBER = 5;
        private volatile java.lang.Object lastname_;
        /**
         * <code>string lastname = 5;</code>
         * @return The lastname.
         */
        public java.lang.String getLastname() {
            java.lang.Object ref = lastname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                lastname_ = s;
                return s;
            }
        }
        /**
         * <code>string lastname = 5;</code>
         * @return The bytes for lastname.
         */
        public com.google.protobuf.ByteString
        getLastnameBytes() {
            java.lang.Object ref = lastname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                lastname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getUsernameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
            }
            if (!getFirstnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, firstname_);
            }
            if (!getLastnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, lastname_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getUsernameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
            }
            if (!getFirstnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, firstname_);
            }
            if (!getLastnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, lastname_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO other = (com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO) obj;

            if (!getUsername()
                    .equals(other.getUsername())) return false;
            if (!getFirstname()
                    .equals(other.getFirstname())) return false;
            if (!getLastname()
                    .equals(other.getLastname())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + USERNAME_FIELD_NUMBER;
            hash = (53 * hash) + getUsername().hashCode();
            hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getFirstname().hashCode();
            hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getLastname().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code UpdatedCustomerDTO}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:UpdatedCustomerDTO)
                com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTOOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdatedCustomerDTO_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdatedCustomerDTO_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.class, com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                username_ = "";

                firstname_ = "";

                lastname_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdatedCustomerDTO_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO build() {
                com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO buildPartial() {
                com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO result = new com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO(this);
                result.username_ = username_;
                result.firstname_ = firstname_;
                result.lastname_ = lastname_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO other) {
                if (other == com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO.getDefaultInstance()) return this;
                if (!other.getUsername().isEmpty()) {
                    username_ = other.username_;
                    onChanged();
                }
                if (!other.getFirstname().isEmpty()) {
                    firstname_ = other.firstname_;
                    onChanged();
                }
                if (!other.getLastname().isEmpty()) {
                    lastname_ = other.lastname_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object username_ = "";
            /**
             * <code>string username = 2;</code>
             * @return The username.
             */
            public java.lang.String getUsername() {
                java.lang.Object ref = username_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    username_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string username = 2;</code>
             * @return The bytes for username.
             */
            public com.google.protobuf.ByteString
            getUsernameBytes() {
                java.lang.Object ref = username_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    username_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string username = 2;</code>
             * @param value The username to set.
             * @return This builder for chaining.
             */
            public Builder setUsername(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                username_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string username = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearUsername() {

                username_ = getDefaultInstance().getUsername();
                onChanged();
                return this;
            }
            /**
             * <code>string username = 2;</code>
             * @param value The bytes for username to set.
             * @return This builder for chaining.
             */
            public Builder setUsernameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                username_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object firstname_ = "";
            /**
             * <code>string firstname = 4;</code>
             * @return The firstname.
             */
            public java.lang.String getFirstname() {
                java.lang.Object ref = firstname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    firstname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string firstname = 4;</code>
             * @return The bytes for firstname.
             */
            public com.google.protobuf.ByteString
            getFirstnameBytes() {
                java.lang.Object ref = firstname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    firstname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string firstname = 4;</code>
             * @param value The firstname to set.
             * @return This builder for chaining.
             */
            public Builder setFirstname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                firstname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string firstname = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearFirstname() {

                firstname_ = getDefaultInstance().getFirstname();
                onChanged();
                return this;
            }
            /**
             * <code>string firstname = 4;</code>
             * @param value The bytes for firstname to set.
             * @return This builder for chaining.
             */
            public Builder setFirstnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                firstname_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object lastname_ = "";
            /**
             * <code>string lastname = 5;</code>
             * @return The lastname.
             */
            public java.lang.String getLastname() {
                java.lang.Object ref = lastname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    lastname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string lastname = 5;</code>
             * @return The bytes for lastname.
             */
            public com.google.protobuf.ByteString
            getLastnameBytes() {
                java.lang.Object ref = lastname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    lastname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string lastname = 5;</code>
             * @param value The lastname to set.
             * @return This builder for chaining.
             */
            public Builder setLastname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                lastname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string lastname = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearLastname() {

                lastname_ = getDefaultInstance().getLastname();
                onChanged();
                return this;
            }
            /**
             * <code>string lastname = 5;</code>
             * @param value The bytes for lastname to set.
             * @return This builder for chaining.
             */
            public Builder setLastnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                lastname_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:UpdatedCustomerDTO)
        }

        // @@protoc_insertion_point(class_scope:UpdatedCustomerDTO)
        private static final com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO();
        }

        public static com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<UpdatedCustomerDTO>
                PARSER = new com.google.protobuf.AbstractParser<UpdatedCustomerDTO>() {
            @java.lang.Override
            public UpdatedCustomerDTO parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new UpdatedCustomerDTO(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<UpdatedCustomerDTO> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<UpdatedCustomerDTO> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.UpdatedCustomerDTO getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface UpdateCustomerResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:UpdateCustomerResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        java.lang.String getMessage();
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        com.google.protobuf.ByteString
        getMessageBytes();

        /**
         * <code>.CustomerDTO customer = 2;</code>
         * @return Whether the customer field is set.
         */
        boolean hasCustomer();
        /**
         * <code>.CustomerDTO customer = 2;</code>
         * @return The customer.
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer();
        /**
         * <code>.CustomerDTO customer = 2;</code>
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder();
    }
    /**
     * Protobuf type {@code UpdateCustomerResponse}
     */
    public  static final class UpdateCustomerResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:UpdateCustomerResponse)
            UpdateCustomerResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use UpdateCustomerResponse.newBuilder() to construct.
        private UpdateCustomerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private UpdateCustomerResponse() {
            message_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new UpdateCustomerResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private UpdateCustomerResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            message_ = s;
                            break;
                        }
                        case 18: {
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder subBuilder = null;
                            if (customer_ != null) {
                                subBuilder = customer_.toBuilder();
                            }
                            customer_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.CustomerDTO.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(customer_);
                                customer_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse.class, com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse.Builder.class);
        }

        public static final int MESSAGE_FIELD_NUMBER = 1;
        private volatile java.lang.Object message_;
        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        public java.lang.String getMessage() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                message_ = s;
                return s;
            }
        }
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        public com.google.protobuf.ByteString
        getMessageBytes() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int CUSTOMER_FIELD_NUMBER = 2;
        private com.example.tmbank.grpc.stub.Bank.CustomerDTO customer_;
        /**
         * <code>.CustomerDTO customer = 2;</code>
         * @return Whether the customer field is set.
         */
        public boolean hasCustomer() {
            return customer_ != null;
        }
        /**
         * <code>.CustomerDTO customer = 2;</code>
         * @return The customer.
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer() {
            return customer_ == null ? com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
        }
        /**
         * <code>.CustomerDTO customer = 2;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder() {
            return getCustomer();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getMessageBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
            }
            if (customer_ != null) {
                output.writeMessage(2, getCustomer());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getMessageBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
            }
            if (customer_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getCustomer());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse other = (com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse) obj;

            if (!getMessage()
                    .equals(other.getMessage())) return false;
            if (hasCustomer() != other.hasCustomer()) return false;
            if (hasCustomer()) {
                if (!getCustomer()
                        .equals(other.getCustomer())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getMessage().hashCode();
            if (hasCustomer()) {
                hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
                hash = (53 * hash) + getCustomer().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code UpdateCustomerResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:UpdateCustomerResponse)
                com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse.class, com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                message_ = "";

                if (customerBuilder_ == null) {
                    customer_ = null;
                } else {
                    customer_ = null;
                    customerBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UpdateCustomerResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse build() {
                com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse result = new com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse(this);
                result.message_ = message_;
                if (customerBuilder_ == null) {
                    result.customer_ = customer_;
                } else {
                    result.customer_ = customerBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse.getDefaultInstance()) return this;
                if (!other.getMessage().isEmpty()) {
                    message_ = other.message_;
                    onChanged();
                }
                if (other.hasCustomer()) {
                    mergeCustomer(other.getCustomer());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object message_ = "";
            /**
             * <code>string message = 1;</code>
             * @return The message.
             */
            public java.lang.String getMessage() {
                java.lang.Object ref = message_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    message_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @return The bytes for message.
             */
            public com.google.protobuf.ByteString
            getMessageBytes() {
                java.lang.Object ref = message_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @param value The message to set.
             * @return This builder for chaining.
             */
            public Builder setMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                message_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearMessage() {

                message_ = getDefaultInstance().getMessage();
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @param value The bytes for message to set.
             * @return This builder for chaining.
             */
            public Builder setMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                message_ = value;
                onChanged();
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.CustomerDTO customer_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder> customerBuilder_;
            /**
             * <code>.CustomerDTO customer = 2;</code>
             * @return Whether the customer field is set.
             */
            public boolean hasCustomer() {
                return customerBuilder_ != null || customer_ != null;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             * @return The customer.
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer() {
                if (customerBuilder_ == null) {
                    return customer_ == null ? com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
                } else {
                    return customerBuilder_.getMessage();
                }
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public Builder setCustomer(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    customer_ = value;
                    onChanged();
                } else {
                    customerBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public Builder setCustomer(
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder builderForValue) {
                if (customerBuilder_ == null) {
                    customer_ = builderForValue.build();
                    onChanged();
                } else {
                    customerBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public Builder mergeCustomer(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customerBuilder_ == null) {
                    if (customer_ != null) {
                        customer_ =
                                com.example.tmbank.grpc.stub.Bank.CustomerDTO.newBuilder(customer_).mergeFrom(value).buildPartial();
                    } else {
                        customer_ = value;
                    }
                    onChanged();
                } else {
                    customerBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public Builder clearCustomer() {
                if (customerBuilder_ == null) {
                    customer_ = null;
                    onChanged();
                } else {
                    customer_ = null;
                    customerBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder getCustomerBuilder() {

                onChanged();
                return getCustomerFieldBuilder().getBuilder();
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder() {
                if (customerBuilder_ != null) {
                    return customerBuilder_.getMessageOrBuilder();
                } else {
                    return customer_ == null ?
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
                }
            }
            /**
             * <code>.CustomerDTO customer = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>
            getCustomerFieldBuilder() {
                if (customerBuilder_ == null) {
                    customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>(
                            getCustomer(),
                            getParentForChildren(),
                            isClean());
                    customer_ = null;
                }
                return customerBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:UpdateCustomerResponse)
        }

        // @@protoc_insertion_point(class_scope:UpdateCustomerResponse)
        private static final com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<UpdateCustomerResponse>
                PARSER = new com.google.protobuf.AbstractParser<UpdateCustomerResponse>() {
            @java.lang.Override
            public UpdateCustomerResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new UpdateCustomerResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<UpdateCustomerResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<UpdateCustomerResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.UpdateCustomerResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DeleteCustomerRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:DeleteCustomerRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string identityRef = 1;</code>
         * @return The identityRef.
         */
        java.lang.String getIdentityRef();
        /**
         * <code>string identityRef = 1;</code>
         * @return The bytes for identityRef.
         */
        com.google.protobuf.ByteString
        getIdentityRefBytes();
    }
    /**
     * Protobuf type {@code DeleteCustomerRequest}
     */
    public  static final class DeleteCustomerRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:DeleteCustomerRequest)
            DeleteCustomerRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DeleteCustomerRequest.newBuilder() to construct.
        private DeleteCustomerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private DeleteCustomerRequest() {
            identityRef_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new DeleteCustomerRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private DeleteCustomerRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            identityRef_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest.class, com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest.Builder.class);
        }

        public static final int IDENTITYREF_FIELD_NUMBER = 1;
        private volatile java.lang.Object identityRef_;
        /**
         * <code>string identityRef = 1;</code>
         * @return The identityRef.
         */
        public java.lang.String getIdentityRef() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                identityRef_ = s;
                return s;
            }
        }
        /**
         * <code>string identityRef = 1;</code>
         * @return The bytes for identityRef.
         */
        public com.google.protobuf.ByteString
        getIdentityRefBytes() {
            java.lang.Object ref = identityRef_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                identityRef_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getIdentityRefBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identityRef_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getIdentityRefBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identityRef_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest other = (com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest) obj;

            if (!getIdentityRef()
                    .equals(other.getIdentityRef())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + IDENTITYREF_FIELD_NUMBER;
            hash = (53 * hash) + getIdentityRef().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code DeleteCustomerRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:DeleteCustomerRequest)
                com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest.class, com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                identityRef_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest build() {
                com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest result = new com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest(this);
                result.identityRef_ = identityRef_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest.getDefaultInstance()) return this;
                if (!other.getIdentityRef().isEmpty()) {
                    identityRef_ = other.identityRef_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object identityRef_ = "";
            /**
             * <code>string identityRef = 1;</code>
             * @return The identityRef.
             */
            public java.lang.String getIdentityRef() {
                java.lang.Object ref = identityRef_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    identityRef_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string identityRef = 1;</code>
             * @return The bytes for identityRef.
             */
            public com.google.protobuf.ByteString
            getIdentityRefBytes() {
                java.lang.Object ref = identityRef_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    identityRef_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string identityRef = 1;</code>
             * @param value The identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRef(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                identityRef_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearIdentityRef() {

                identityRef_ = getDefaultInstance().getIdentityRef();
                onChanged();
                return this;
            }
            /**
             * <code>string identityRef = 1;</code>
             * @param value The bytes for identityRef to set.
             * @return This builder for chaining.
             */
            public Builder setIdentityRefBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                identityRef_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:DeleteCustomerRequest)
        }

        // @@protoc_insertion_point(class_scope:DeleteCustomerRequest)
        private static final com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DeleteCustomerRequest>
                PARSER = new com.google.protobuf.AbstractParser<DeleteCustomerRequest>() {
            @java.lang.Override
            public DeleteCustomerRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new DeleteCustomerRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<DeleteCustomerRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DeleteCustomerRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.DeleteCustomerRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DeleteCustomerResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:DeleteCustomerResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        java.lang.String getMessage();
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        com.google.protobuf.ByteString
        getMessageBytes();
    }
    /**
     * Protobuf type {@code DeleteCustomerResponse}
     */
    public  static final class DeleteCustomerResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:DeleteCustomerResponse)
            DeleteCustomerResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DeleteCustomerResponse.newBuilder() to construct.
        private DeleteCustomerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private DeleteCustomerResponse() {
            message_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new DeleteCustomerResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private DeleteCustomerResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            message_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse.class, com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse.Builder.class);
        }

        public static final int MESSAGE_FIELD_NUMBER = 1;
        private volatile java.lang.Object message_;
        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        public java.lang.String getMessage() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                message_ = s;
                return s;
            }
        }
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        public com.google.protobuf.ByteString
        getMessageBytes() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getMessageBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getMessageBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse other = (com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse) obj;

            if (!getMessage()
                    .equals(other.getMessage())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getMessage().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code DeleteCustomerResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:DeleteCustomerResponse)
                com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse.class, com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                message_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_DeleteCustomerResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse build() {
                com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse result = new com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse(this);
                result.message_ = message_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse.getDefaultInstance()) return this;
                if (!other.getMessage().isEmpty()) {
                    message_ = other.message_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object message_ = "";
            /**
             * <code>string message = 1;</code>
             * @return The message.
             */
            public java.lang.String getMessage() {
                java.lang.Object ref = message_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    message_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @return The bytes for message.
             */
            public com.google.protobuf.ByteString
            getMessageBytes() {
                java.lang.Object ref = message_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @param value The message to set.
             * @return This builder for chaining.
             */
            public Builder setMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                message_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearMessage() {

                message_ = getDefaultInstance().getMessage();
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @param value The bytes for message to set.
             * @return This builder for chaining.
             */
            public Builder setMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                message_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:DeleteCustomerResponse)
        }

        // @@protoc_insertion_point(class_scope:DeleteCustomerResponse)
        private static final com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DeleteCustomerResponse>
                PARSER = new com.google.protobuf.AbstractParser<DeleteCustomerResponse>() {
            @java.lang.Override
            public DeleteCustomerResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new DeleteCustomerResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<DeleteCustomerResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DeleteCustomerResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.DeleteCustomerResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface BankAccountDtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:BankAccountDto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 id = 1;</code>
         * @return The id.
         */
        long getId();

        /**
         * <code>string rib = 2;</code>
         * @return The rib.
         */
        java.lang.String getRib();
        /**
         * <code>string rib = 2;</code>
         * @return The bytes for rib.
         */
        com.google.protobuf.ByteString
        getRibBytes();

        /**
         * <code>double amount = 3;</code>
         * @return The amount.
         */
        double getAmount();

        /**
         * <code>string createdAt = 4;</code>
         * @return The createdAt.
         */
        java.lang.String getCreatedAt();
        /**
         * <code>string createdAt = 4;</code>
         * @return The bytes for createdAt.
         */
        com.google.protobuf.ByteString
        getCreatedAtBytes();

        /**
         * <code>string accountStatus = 5;</code>
         * @return The accountStatus.
         */
        java.lang.String getAccountStatus();
        /**
         * <code>string accountStatus = 5;</code>
         * @return The bytes for accountStatus.
         */
        com.google.protobuf.ByteString
        getAccountStatusBytes();

        /**
         * <code>.CustomerDTO customer = 6;</code>
         * @return Whether the customer field is set.
         */
        boolean hasCustomer();
        /**
         * <code>.CustomerDTO customer = 6;</code>
         * @return The customer.
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer();
        /**
         * <code>.CustomerDTO customer = 6;</code>
         */
        com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder();
    }
    /**
     * Protobuf type {@code BankAccountDto}
     */
    public  static final class BankAccountDto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:BankAccountDto)
            BankAccountDtoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BankAccountDto.newBuilder() to construct.
        private BankAccountDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BankAccountDto() {
            rib_ = "";
            createdAt_ = "";
            accountStatus_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new BankAccountDto();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private BankAccountDto(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            rib_ = s;
                            break;
                        }
                        case 25: {

                            amount_ = input.readDouble();
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            createdAt_ = s;
                            break;
                        }
                        case 42: {
                            java.lang.String s = input.readStringRequireUtf8();

                            accountStatus_ = s;
                            break;
                        }
                        case 50: {
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder subBuilder = null;
                            if (customer_ != null) {
                                subBuilder = customer_.toBuilder();
                            }
                            customer_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.CustomerDTO.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(customer_);
                                customer_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountDto_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountDto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto.class, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>int64 id = 1;</code>
         * @return The id.
         */
        public long getId() {
            return id_;
        }

        public static final int RIB_FIELD_NUMBER = 2;
        private volatile java.lang.Object rib_;
        /**
         * <code>string rib = 2;</code>
         * @return The rib.
         */
        public java.lang.String getRib() {
            java.lang.Object ref = rib_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                rib_ = s;
                return s;
            }
        }
        /**
         * <code>string rib = 2;</code>
         * @return The bytes for rib.
         */
        public com.google.protobuf.ByteString
        getRibBytes() {
            java.lang.Object ref = rib_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                rib_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int AMOUNT_FIELD_NUMBER = 3;
        private double amount_;
        /**
         * <code>double amount = 3;</code>
         * @return The amount.
         */
        public double getAmount() {
            return amount_;
        }

        public static final int CREATEDAT_FIELD_NUMBER = 4;
        private volatile java.lang.Object createdAt_;
        /**
         * <code>string createdAt = 4;</code>
         * @return The createdAt.
         */
        public java.lang.String getCreatedAt() {
            java.lang.Object ref = createdAt_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                createdAt_ = s;
                return s;
            }
        }
        /**
         * <code>string createdAt = 4;</code>
         * @return The bytes for createdAt.
         */
        public com.google.protobuf.ByteString
        getCreatedAtBytes() {
            java.lang.Object ref = createdAt_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                createdAt_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ACCOUNTSTATUS_FIELD_NUMBER = 5;
        private volatile java.lang.Object accountStatus_;
        /**
         * <code>string accountStatus = 5;</code>
         * @return The accountStatus.
         */
        public java.lang.String getAccountStatus() {
            java.lang.Object ref = accountStatus_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                accountStatus_ = s;
                return s;
            }
        }
        /**
         * <code>string accountStatus = 5;</code>
         * @return The bytes for accountStatus.
         */
        public com.google.protobuf.ByteString
        getAccountStatusBytes() {
            java.lang.Object ref = accountStatus_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                accountStatus_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int CUSTOMER_FIELD_NUMBER = 6;
        private com.example.tmbank.grpc.stub.Bank.CustomerDTO customer_;
        /**
         * <code>.CustomerDTO customer = 6;</code>
         * @return Whether the customer field is set.
         */
        public boolean hasCustomer() {
            return customer_ != null;
        }
        /**
         * <code>.CustomerDTO customer = 6;</code>
         * @return The customer.
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer() {
            return customer_ == null ? com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
        }
        /**
         * <code>.CustomerDTO customer = 6;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder() {
            return getCustomer();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0L) {
                output.writeInt64(1, id_);
            }
            if (!getRibBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, rib_);
            }
            if (amount_ != 0D) {
                output.writeDouble(3, amount_);
            }
            if (!getCreatedAtBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, createdAt_);
            }
            if (!getAccountStatusBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, accountStatus_);
            }
            if (customer_ != null) {
                output.writeMessage(6, getCustomer());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (!getRibBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, rib_);
            }
            if (amount_ != 0D) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(3, amount_);
            }
            if (!getCreatedAtBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, createdAt_);
            }
            if (!getAccountStatusBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, accountStatus_);
            }
            if (customer_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, getCustomer());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.BankAccountDto)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.BankAccountDto other = (com.example.tmbank.grpc.stub.Bank.BankAccountDto) obj;

            if (getId()
                    != other.getId()) return false;
            if (!getRib()
                    .equals(other.getRib())) return false;
            if (java.lang.Double.doubleToLongBits(getAmount())
                    != java.lang.Double.doubleToLongBits(
                    other.getAmount())) return false;
            if (!getCreatedAt()
                    .equals(other.getCreatedAt())) return false;
            if (!getAccountStatus()
                    .equals(other.getAccountStatus())) return false;
            if (hasCustomer() != other.hasCustomer()) return false;
            if (hasCustomer()) {
                if (!getCustomer()
                        .equals(other.getCustomer())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + RIB_FIELD_NUMBER;
            hash = (53 * hash) + getRib().hashCode();
            hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getAmount()));
            hash = (37 * hash) + CREATEDAT_FIELD_NUMBER;
            hash = (53 * hash) + getCreatedAt().hashCode();
            hash = (37 * hash) + ACCOUNTSTATUS_FIELD_NUMBER;
            hash = (53 * hash) + getAccountStatus().hashCode();
            if (hasCustomer()) {
                hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
                hash = (53 * hash) + getCustomer().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.BankAccountDto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code BankAccountDto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:BankAccountDto)
                com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountDto_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountDto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.BankAccountDto.class, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.BankAccountDto.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0L;

                rib_ = "";

                amount_ = 0D;

                createdAt_ = "";

                accountStatus_ = "";

                if (customerBuilder_ == null) {
                    customer_ = null;
                } else {
                    customer_ = null;
                    customerBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountDto_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto build() {
                com.example.tmbank.grpc.stub.Bank.BankAccountDto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto buildPartial() {
                com.example.tmbank.grpc.stub.Bank.BankAccountDto result = new com.example.tmbank.grpc.stub.Bank.BankAccountDto(this);
                result.id_ = id_;
                result.rib_ = rib_;
                result.amount_ = amount_;
                result.createdAt_ = createdAt_;
                result.accountStatus_ = accountStatus_;
                if (customerBuilder_ == null) {
                    result.customer_ = customer_;
                } else {
                    result.customer_ = customerBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.BankAccountDto) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.BankAccountDto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.BankAccountDto other) {
                if (other == com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getRib().isEmpty()) {
                    rib_ = other.rib_;
                    onChanged();
                }
                if (other.getAmount() != 0D) {
                    setAmount(other.getAmount());
                }
                if (!other.getCreatedAt().isEmpty()) {
                    createdAt_ = other.createdAt_;
                    onChanged();
                }
                if (!other.getAccountStatus().isEmpty()) {
                    accountStatus_ = other.accountStatus_;
                    onChanged();
                }
                if (other.hasCustomer()) {
                    mergeCustomer(other.getCustomer());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.BankAccountDto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.BankAccountDto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long id_ ;
            /**
             * <code>int64 id = 1;</code>
             * @return The id.
             */
            public long getId() {
                return id_;
            }
            /**
             * <code>int64 id = 1;</code>
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 id = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object rib_ = "";
            /**
             * <code>string rib = 2;</code>
             * @return The rib.
             */
            public java.lang.String getRib() {
                java.lang.Object ref = rib_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    rib_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string rib = 2;</code>
             * @return The bytes for rib.
             */
            public com.google.protobuf.ByteString
            getRibBytes() {
                java.lang.Object ref = rib_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    rib_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string rib = 2;</code>
             * @param value The rib to set.
             * @return This builder for chaining.
             */
            public Builder setRib(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                rib_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string rib = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearRib() {

                rib_ = getDefaultInstance().getRib();
                onChanged();
                return this;
            }
            /**
             * <code>string rib = 2;</code>
             * @param value The bytes for rib to set.
             * @return This builder for chaining.
             */
            public Builder setRibBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                rib_ = value;
                onChanged();
                return this;
            }

            private double amount_ ;
            /**
             * <code>double amount = 3;</code>
             * @return The amount.
             */
            public double getAmount() {
                return amount_;
            }
            /**
             * <code>double amount = 3;</code>
             * @param value The amount to set.
             * @return This builder for chaining.
             */
            public Builder setAmount(double value) {

                amount_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>double amount = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearAmount() {

                amount_ = 0D;
                onChanged();
                return this;
            }

            private java.lang.Object createdAt_ = "";
            /**
             * <code>string createdAt = 4;</code>
             * @return The createdAt.
             */
            public java.lang.String getCreatedAt() {
                java.lang.Object ref = createdAt_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    createdAt_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string createdAt = 4;</code>
             * @return The bytes for createdAt.
             */
            public com.google.protobuf.ByteString
            getCreatedAtBytes() {
                java.lang.Object ref = createdAt_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    createdAt_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string createdAt = 4;</code>
             * @param value The createdAt to set.
             * @return This builder for chaining.
             */
            public Builder setCreatedAt(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                createdAt_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string createdAt = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearCreatedAt() {

                createdAt_ = getDefaultInstance().getCreatedAt();
                onChanged();
                return this;
            }
            /**
             * <code>string createdAt = 4;</code>
             * @param value The bytes for createdAt to set.
             * @return This builder for chaining.
             */
            public Builder setCreatedAtBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                createdAt_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object accountStatus_ = "";
            /**
             * <code>string accountStatus = 5;</code>
             * @return The accountStatus.
             */
            public java.lang.String getAccountStatus() {
                java.lang.Object ref = accountStatus_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    accountStatus_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string accountStatus = 5;</code>
             * @return The bytes for accountStatus.
             */
            public com.google.protobuf.ByteString
            getAccountStatusBytes() {
                java.lang.Object ref = accountStatus_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    accountStatus_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string accountStatus = 5;</code>
             * @param value The accountStatus to set.
             * @return This builder for chaining.
             */
            public Builder setAccountStatus(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                accountStatus_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string accountStatus = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearAccountStatus() {

                accountStatus_ = getDefaultInstance().getAccountStatus();
                onChanged();
                return this;
            }
            /**
             * <code>string accountStatus = 5;</code>
             * @param value The bytes for accountStatus to set.
             * @return This builder for chaining.
             */
            public Builder setAccountStatusBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                accountStatus_ = value;
                onChanged();
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.CustomerDTO customer_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder> customerBuilder_;
            /**
             * <code>.CustomerDTO customer = 6;</code>
             * @return Whether the customer field is set.
             */
            public boolean hasCustomer() {
                return customerBuilder_ != null || customer_ != null;
            }
            /**
             * <code>.CustomerDTO customer = 6;</code>
             * @return The customer.
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO getCustomer() {
                if (customerBuilder_ == null) {
                    return customer_ == null ? com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
                } else {
                    return customerBuilder_.getMessage();
                }
            }
            /**
             * <code>.CustomerDTO customer = 6;</code>
             */
            public Builder setCustomer(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    customer_ = value;
                    onChanged();
                } else {
                    customerBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 6;</code>
             */
            public Builder setCustomer(
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder builderForValue) {
                if (customerBuilder_ == null) {
                    customer_ = builderForValue.build();
                    onChanged();
                } else {
                    customerBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 6;</code>
             */
            public Builder mergeCustomer(com.example.tmbank.grpc.stub.Bank.CustomerDTO value) {
                if (customerBuilder_ == null) {
                    if (customer_ != null) {
                        customer_ =
                                com.example.tmbank.grpc.stub.Bank.CustomerDTO.newBuilder(customer_).mergeFrom(value).buildPartial();
                    } else {
                        customer_ = value;
                    }
                    onChanged();
                } else {
                    customerBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 6;</code>
             */
            public Builder clearCustomer() {
                if (customerBuilder_ == null) {
                    customer_ = null;
                    onChanged();
                } else {
                    customer_ = null;
                    customerBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.CustomerDTO customer = 6;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder getCustomerBuilder() {

                onChanged();
                return getCustomerFieldBuilder().getBuilder();
            }
            /**
             * <code>.CustomerDTO customer = 6;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder getCustomerOrBuilder() {
                if (customerBuilder_ != null) {
                    return customerBuilder_.getMessageOrBuilder();
                } else {
                    return customer_ == null ?
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO.getDefaultInstance() : customer_;
                }
            }
            /**
             * <code>.CustomerDTO customer = 6;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>
            getCustomerFieldBuilder() {
                if (customerBuilder_ == null) {
                    customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.CustomerDTO, com.example.tmbank.grpc.stub.Bank.CustomerDTO.Builder, com.example.tmbank.grpc.stub.Bank.CustomerDTOOrBuilder>(
                            getCustomer(),
                            getParentForChildren(),
                            isClean());
                    customer_ = null;
                }
                return customerBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:BankAccountDto)
        }

        // @@protoc_insertion_point(class_scope:BankAccountDto)
        private static final com.example.tmbank.grpc.stub.Bank.BankAccountDto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.BankAccountDto();
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountDto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BankAccountDto>
                PARSER = new com.google.protobuf.AbstractParser<BankAccountDto>() {
            @java.lang.Override
            public BankAccountDto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BankAccountDto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BankAccountDto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BankAccountDto> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.BankAccountDto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface BankAccountsRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:BankAccountsRequest)
            com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code BankAccountsRequest}
     */
    public  static final class BankAccountsRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:BankAccountsRequest)
            BankAccountsRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BankAccountsRequest.newBuilder() to construct.
        private BankAccountsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BankAccountsRequest() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new BankAccountsRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private BankAccountsRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.BankAccountsRequest.class, com.example.tmbank.grpc.stub.Bank.BankAccountsRequest.Builder.class);
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.BankAccountsRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.BankAccountsRequest other = (com.example.tmbank.grpc.stub.Bank.BankAccountsRequest) obj;

            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.BankAccountsRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code BankAccountsRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:BankAccountsRequest)
                com.example.tmbank.grpc.stub.Bank.BankAccountsRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.BankAccountsRequest.class, com.example.tmbank.grpc.stub.Bank.BankAccountsRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.BankAccountsRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountsRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.BankAccountsRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountsRequest build() {
                com.example.tmbank.grpc.stub.Bank.BankAccountsRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountsRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.BankAccountsRequest result = new com.example.tmbank.grpc.stub.Bank.BankAccountsRequest(this);
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.BankAccountsRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.BankAccountsRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.BankAccountsRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.BankAccountsRequest.getDefaultInstance()) return this;
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.BankAccountsRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.BankAccountsRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:BankAccountsRequest)
        }

        // @@protoc_insertion_point(class_scope:BankAccountsRequest)
        private static final com.example.tmbank.grpc.stub.Bank.BankAccountsRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.BankAccountsRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BankAccountsRequest>
                PARSER = new com.google.protobuf.AbstractParser<BankAccountsRequest>() {
            @java.lang.Override
            public BankAccountsRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BankAccountsRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BankAccountsRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BankAccountsRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.BankAccountsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface BankAccountsResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:BankAccountsResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        java.util.List<com.example.tmbank.grpc.stub.Bank.BankAccountDto>
        getBankAccountList();
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount(int index);
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        int getBankAccountCount();
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        java.util.List<? extends com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>
        getBankAccountOrBuilderList();
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code BankAccountsResponse}
     */
    public  static final class BankAccountsResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:BankAccountsResponse)
            BankAccountsResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BankAccountsResponse.newBuilder() to construct.
        private BankAccountsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BankAccountsResponse() {
            bankAccount_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new BankAccountsResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private BankAccountsResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                bankAccount_ = new java.util.ArrayList<com.example.tmbank.grpc.stub.Bank.BankAccountDto>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            bankAccount_.add(
                                    input.readMessage(com.example.tmbank.grpc.stub.Bank.BankAccountDto.parser(), extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    bankAccount_ = java.util.Collections.unmodifiableList(bankAccount_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.BankAccountsResponse.class, com.example.tmbank.grpc.stub.Bank.BankAccountsResponse.Builder.class);
        }

        public static final int BANKACCOUNT_FIELD_NUMBER = 1;
        private java.util.List<com.example.tmbank.grpc.stub.Bank.BankAccountDto> bankAccount_;
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        public java.util.List<com.example.tmbank.grpc.stub.Bank.BankAccountDto> getBankAccountList() {
            return bankAccount_;
        }
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        public java.util.List<? extends com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>
        getBankAccountOrBuilderList() {
            return bankAccount_;
        }
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        public int getBankAccountCount() {
            return bankAccount_.size();
        }
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount(int index) {
            return bankAccount_.get(index);
        }
        /**
         * <code>repeated .BankAccountDto bankAccount = 1;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder(
                int index) {
            return bankAccount_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < bankAccount_.size(); i++) {
                output.writeMessage(1, bankAccount_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < bankAccount_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, bankAccount_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.BankAccountsResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.BankAccountsResponse other = (com.example.tmbank.grpc.stub.Bank.BankAccountsResponse) obj;

            if (!getBankAccountList()
                    .equals(other.getBankAccountList())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getBankAccountCount() > 0) {
                hash = (37 * hash) + BANKACCOUNT_FIELD_NUMBER;
                hash = (53 * hash) + getBankAccountList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.BankAccountsResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code BankAccountsResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:BankAccountsResponse)
                com.example.tmbank.grpc.stub.Bank.BankAccountsResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.BankAccountsResponse.class, com.example.tmbank.grpc.stub.Bank.BankAccountsResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.BankAccountsResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getBankAccountFieldBuilder();
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    bankAccountBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountsResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountsResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.BankAccountsResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountsResponse build() {
                com.example.tmbank.grpc.stub.Bank.BankAccountsResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountsResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.BankAccountsResponse result = new com.example.tmbank.grpc.stub.Bank.BankAccountsResponse(this);
                int from_bitField0_ = bitField0_;
                if (bankAccountBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        bankAccount_ = java.util.Collections.unmodifiableList(bankAccount_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.bankAccount_ = bankAccount_;
                } else {
                    result.bankAccount_ = bankAccountBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.BankAccountsResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.BankAccountsResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.BankAccountsResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.BankAccountsResponse.getDefaultInstance()) return this;
                if (bankAccountBuilder_ == null) {
                    if (!other.bankAccount_.isEmpty()) {
                        if (bankAccount_.isEmpty()) {
                            bankAccount_ = other.bankAccount_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureBankAccountIsMutable();
                            bankAccount_.addAll(other.bankAccount_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.bankAccount_.isEmpty()) {
                        if (bankAccountBuilder_.isEmpty()) {
                            bankAccountBuilder_.dispose();
                            bankAccountBuilder_ = null;
                            bankAccount_ = other.bankAccount_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            bankAccountBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getBankAccountFieldBuilder() : null;
                        } else {
                            bankAccountBuilder_.addAllMessages(other.bankAccount_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.BankAccountsResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.BankAccountsResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.util.List<com.example.tmbank.grpc.stub.Bank.BankAccountDto> bankAccount_ =
                    java.util.Collections.emptyList();
            private void ensureBankAccountIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    bankAccount_ = new java.util.ArrayList<com.example.tmbank.grpc.stub.Bank.BankAccountDto>(bankAccount_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder> bankAccountBuilder_;

            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public java.util.List<com.example.tmbank.grpc.stub.Bank.BankAccountDto> getBankAccountList() {
                if (bankAccountBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(bankAccount_);
                } else {
                    return bankAccountBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public int getBankAccountCount() {
                if (bankAccountBuilder_ == null) {
                    return bankAccount_.size();
                } else {
                    return bankAccountBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount(int index) {
                if (bankAccountBuilder_ == null) {
                    return bankAccount_.get(index);
                } else {
                    return bankAccountBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder setBankAccount(
                    int index, com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBankAccountIsMutable();
                    bankAccount_.set(index, value);
                    onChanged();
                } else {
                    bankAccountBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder setBankAccount(
                    int index, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder builderForValue) {
                if (bankAccountBuilder_ == null) {
                    ensureBankAccountIsMutable();
                    bankAccount_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    bankAccountBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder addBankAccount(com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBankAccountIsMutable();
                    bankAccount_.add(value);
                    onChanged();
                } else {
                    bankAccountBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder addBankAccount(
                    int index, com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBankAccountIsMutable();
                    bankAccount_.add(index, value);
                    onChanged();
                } else {
                    bankAccountBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder addBankAccount(
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder builderForValue) {
                if (bankAccountBuilder_ == null) {
                    ensureBankAccountIsMutable();
                    bankAccount_.add(builderForValue.build());
                    onChanged();
                } else {
                    bankAccountBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder addBankAccount(
                    int index, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder builderForValue) {
                if (bankAccountBuilder_ == null) {
                    ensureBankAccountIsMutable();
                    bankAccount_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    bankAccountBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder addAllBankAccount(
                    java.lang.Iterable<? extends com.example.tmbank.grpc.stub.Bank.BankAccountDto> values) {
                if (bankAccountBuilder_ == null) {
                    ensureBankAccountIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, bankAccount_);
                    onChanged();
                } else {
                    bankAccountBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder clearBankAccount() {
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    bankAccountBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public Builder removeBankAccount(int index) {
                if (bankAccountBuilder_ == null) {
                    ensureBankAccountIsMutable();
                    bankAccount_.remove(index);
                    onChanged();
                } else {
                    bankAccountBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder getBankAccountBuilder(
                    int index) {
                return getBankAccountFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder(
                    int index) {
                if (bankAccountBuilder_ == null) {
                    return bankAccount_.get(index);  } else {
                    return bankAccountBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public java.util.List<? extends com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>
            getBankAccountOrBuilderList() {
                if (bankAccountBuilder_ != null) {
                    return bankAccountBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(bankAccount_);
                }
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder addBankAccountBuilder() {
                return getBankAccountFieldBuilder().addBuilder(
                        com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance());
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder addBankAccountBuilder(
                    int index) {
                return getBankAccountFieldBuilder().addBuilder(
                        index, com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance());
            }
            /**
             * <code>repeated .BankAccountDto bankAccount = 1;</code>
             */
            public java.util.List<com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder>
            getBankAccountBuilderList() {
                return getBankAccountFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>
            getBankAccountFieldBuilder() {
                if (bankAccountBuilder_ == null) {
                    bankAccountBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>(
                            bankAccount_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    bankAccount_ = null;
                }
                return bankAccountBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:BankAccountsResponse)
        }

        // @@protoc_insertion_point(class_scope:BankAccountsResponse)
        private static final com.example.tmbank.grpc.stub.Bank.BankAccountsResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.BankAccountsResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BankAccountsResponse>
                PARSER = new com.google.protobuf.AbstractParser<BankAccountsResponse>() {
            @java.lang.Override
            public BankAccountsResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BankAccountsResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BankAccountsResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BankAccountsResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.BankAccountsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface BankAccountByRibRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:BankAccountByRibRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string rib = 1;</code>
         * @return The rib.
         */
        java.lang.String getRib();
        /**
         * <code>string rib = 1;</code>
         * @return The bytes for rib.
         */
        com.google.protobuf.ByteString
        getRibBytes();
    }
    /**
     * Protobuf type {@code BankAccountByRibRequest}
     */
    public  static final class BankAccountByRibRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:BankAccountByRibRequest)
            BankAccountByRibRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BankAccountByRibRequest.newBuilder() to construct.
        private BankAccountByRibRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BankAccountByRibRequest() {
            rib_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new BankAccountByRibRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private BankAccountByRibRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            rib_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest.class, com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest.Builder.class);
        }

        public static final int RIB_FIELD_NUMBER = 1;
        private volatile java.lang.Object rib_;
        /**
         * <code>string rib = 1;</code>
         * @return The rib.
         */
        public java.lang.String getRib() {
            java.lang.Object ref = rib_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                rib_ = s;
                return s;
            }
        }
        /**
         * <code>string rib = 1;</code>
         * @return The bytes for rib.
         */
        public com.google.protobuf.ByteString
        getRibBytes() {
            java.lang.Object ref = rib_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                rib_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getRibBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rib_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getRibBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rib_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest other = (com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest) obj;

            if (!getRib()
                    .equals(other.getRib())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RIB_FIELD_NUMBER;
            hash = (53 * hash) + getRib().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code BankAccountByRibRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:BankAccountByRibRequest)
                com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest.class, com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                rib_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest build() {
                com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest result = new com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest(this);
                result.rib_ = rib_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest.getDefaultInstance()) return this;
                if (!other.getRib().isEmpty()) {
                    rib_ = other.rib_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object rib_ = "";
            /**
             * <code>string rib = 1;</code>
             * @return The rib.
             */
            public java.lang.String getRib() {
                java.lang.Object ref = rib_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    rib_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string rib = 1;</code>
             * @return The bytes for rib.
             */
            public com.google.protobuf.ByteString
            getRibBytes() {
                java.lang.Object ref = rib_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    rib_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string rib = 1;</code>
             * @param value The rib to set.
             * @return This builder for chaining.
             */
            public Builder setRib(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                rib_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string rib = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearRib() {

                rib_ = getDefaultInstance().getRib();
                onChanged();
                return this;
            }
            /**
             * <code>string rib = 1;</code>
             * @param value The bytes for rib to set.
             * @return This builder for chaining.
             */
            public Builder setRibBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                rib_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:BankAccountByRibRequest)
        }

        // @@protoc_insertion_point(class_scope:BankAccountByRibRequest)
        private static final com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BankAccountByRibRequest>
                PARSER = new com.google.protobuf.AbstractParser<BankAccountByRibRequest>() {
            @java.lang.Override
            public BankAccountByRibRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BankAccountByRibRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BankAccountByRibRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BankAccountByRibRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.BankAccountByRibRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface BankAccountByRibResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:BankAccountByRibResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.BankAccountDto bankAccount = 1;</code>
         * @return Whether the bankAccount field is set.
         */
        boolean hasBankAccount();
        /**
         * <code>.BankAccountDto bankAccount = 1;</code>
         * @return The bankAccount.
         */
        com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount();
        /**
         * <code>.BankAccountDto bankAccount = 1;</code>
         */
        com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder();
    }
    /**
     * Protobuf type {@code BankAccountByRibResponse}
     */
    public  static final class BankAccountByRibResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:BankAccountByRibResponse)
            BankAccountByRibResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BankAccountByRibResponse.newBuilder() to construct.
        private BankAccountByRibResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private BankAccountByRibResponse() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new BankAccountByRibResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private BankAccountByRibResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder subBuilder = null;
                            if (bankAccount_ != null) {
                                subBuilder = bankAccount_.toBuilder();
                            }
                            bankAccount_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.BankAccountDto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(bankAccount_);
                                bankAccount_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse.class, com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse.Builder.class);
        }

        public static final int BANKACCOUNT_FIELD_NUMBER = 1;
        private com.example.tmbank.grpc.stub.Bank.BankAccountDto bankAccount_;
        /**
         * <code>.BankAccountDto bankAccount = 1;</code>
         * @return Whether the bankAccount field is set.
         */
        public boolean hasBankAccount() {
            return bankAccount_ != null;
        }
        /**
         * <code>.BankAccountDto bankAccount = 1;</code>
         * @return The bankAccount.
         */
        public com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount() {
            return bankAccount_ == null ? com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
        }
        /**
         * <code>.BankAccountDto bankAccount = 1;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder() {
            return getBankAccount();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (bankAccount_ != null) {
                output.writeMessage(1, getBankAccount());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (bankAccount_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getBankAccount());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse other = (com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse) obj;

            if (hasBankAccount() != other.hasBankAccount()) return false;
            if (hasBankAccount()) {
                if (!getBankAccount()
                        .equals(other.getBankAccount())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasBankAccount()) {
                hash = (37 * hash) + BANKACCOUNT_FIELD_NUMBER;
                hash = (53 * hash) + getBankAccount().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code BankAccountByRibResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:BankAccountByRibResponse)
                com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse.class, com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = null;
                } else {
                    bankAccount_ = null;
                    bankAccountBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_BankAccountByRibResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse build() {
                com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse result = new com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse(this);
                if (bankAccountBuilder_ == null) {
                    result.bankAccount_ = bankAccount_;
                } else {
                    result.bankAccount_ = bankAccountBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse.getDefaultInstance()) return this;
                if (other.hasBankAccount()) {
                    mergeBankAccount(other.getBankAccount());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.BankAccountDto bankAccount_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder> bankAccountBuilder_;
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             * @return Whether the bankAccount field is set.
             */
            public boolean hasBankAccount() {
                return bankAccountBuilder_ != null || bankAccount_ != null;
            }
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             * @return The bankAccount.
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount() {
                if (bankAccountBuilder_ == null) {
                    return bankAccount_ == null ? com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
                } else {
                    return bankAccountBuilder_.getMessage();
                }
            }
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             */
            public Builder setBankAccount(com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bankAccount_ = value;
                    onChanged();
                } else {
                    bankAccountBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             */
            public Builder setBankAccount(
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder builderForValue) {
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = builderForValue.build();
                    onChanged();
                } else {
                    bankAccountBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             */
            public Builder mergeBankAccount(com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (bankAccount_ != null) {
                        bankAccount_ =
                                com.example.tmbank.grpc.stub.Bank.BankAccountDto.newBuilder(bankAccount_).mergeFrom(value).buildPartial();
                    } else {
                        bankAccount_ = value;
                    }
                    onChanged();
                } else {
                    bankAccountBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             */
            public Builder clearBankAccount() {
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = null;
                    onChanged();
                } else {
                    bankAccount_ = null;
                    bankAccountBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder getBankAccountBuilder() {

                onChanged();
                return getBankAccountFieldBuilder().getBuilder();
            }
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder() {
                if (bankAccountBuilder_ != null) {
                    return bankAccountBuilder_.getMessageOrBuilder();
                } else {
                    return bankAccount_ == null ?
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
                }
            }
            /**
             * <code>.BankAccountDto bankAccount = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>
            getBankAccountFieldBuilder() {
                if (bankAccountBuilder_ == null) {
                    bankAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>(
                            getBankAccount(),
                            getParentForChildren(),
                            isClean());
                    bankAccount_ = null;
                }
                return bankAccountBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:BankAccountByRibResponse)
        }

        // @@protoc_insertion_point(class_scope:BankAccountByRibResponse)
        private static final com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BankAccountByRibResponse>
                PARSER = new com.google.protobuf.AbstractParser<BankAccountByRibResponse>() {
            @java.lang.Override
            public BankAccountByRibResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BankAccountByRibResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BankAccountByRibResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BankAccountByRibResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.BankAccountByRibResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface AddBankAccountRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:AddBankAccountRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string rib = 1;</code>
         * @return The rib.
         */
        java.lang.String getRib();
        /**
         * <code>string rib = 1;</code>
         * @return The bytes for rib.
         */
        com.google.protobuf.ByteString
        getRibBytes();

        /**
         * <code>double amount = 2;</code>
         * @return The amount.
         */
        double getAmount();

        /**
         * <code>string customerIdentityRef = 3;</code>
         * @return The customerIdentityRef.
         */
        java.lang.String getCustomerIdentityRef();
        /**
         * <code>string customerIdentityRef = 3;</code>
         * @return The bytes for customerIdentityRef.
         */
        com.google.protobuf.ByteString
        getCustomerIdentityRefBytes();
    }
    /**
     * Protobuf type {@code AddBankAccountRequest}
     */
    public  static final class AddBankAccountRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:AddBankAccountRequest)
            AddBankAccountRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use AddBankAccountRequest.newBuilder() to construct.
        private AddBankAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private AddBankAccountRequest() {
            rib_ = "";
            customerIdentityRef_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new AddBankAccountRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private AddBankAccountRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            rib_ = s;
                            break;
                        }
                        case 17: {

                            amount_ = input.readDouble();
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            customerIdentityRef_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest.class, com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest.Builder.class);
        }

        public static final int RIB_FIELD_NUMBER = 1;
        private volatile java.lang.Object rib_;
        /**
         * <code>string rib = 1;</code>
         * @return The rib.
         */
        public java.lang.String getRib() {
            java.lang.Object ref = rib_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                rib_ = s;
                return s;
            }
        }
        /**
         * <code>string rib = 1;</code>
         * @return The bytes for rib.
         */
        public com.google.protobuf.ByteString
        getRibBytes() {
            java.lang.Object ref = rib_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                rib_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int AMOUNT_FIELD_NUMBER = 2;
        private double amount_;
        /**
         * <code>double amount = 2;</code>
         * @return The amount.
         */
        public double getAmount() {
            return amount_;
        }

        public static final int CUSTOMERIDENTITYREF_FIELD_NUMBER = 3;
        private volatile java.lang.Object customerIdentityRef_;
        /**
         * <code>string customerIdentityRef = 3;</code>
         * @return The customerIdentityRef.
         */
        public java.lang.String getCustomerIdentityRef() {
            java.lang.Object ref = customerIdentityRef_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                customerIdentityRef_ = s;
                return s;
            }
        }
        /**
         * <code>string customerIdentityRef = 3;</code>
         * @return The bytes for customerIdentityRef.
         */
        public com.google.protobuf.ByteString
        getCustomerIdentityRefBytes() {
            java.lang.Object ref = customerIdentityRef_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                customerIdentityRef_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getRibBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rib_);
            }
            if (amount_ != 0D) {
                output.writeDouble(2, amount_);
            }
            if (!getCustomerIdentityRefBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customerIdentityRef_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getRibBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rib_);
            }
            if (amount_ != 0D) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(2, amount_);
            }
            if (!getCustomerIdentityRefBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customerIdentityRef_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest other = (com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest) obj;

            if (!getRib()
                    .equals(other.getRib())) return false;
            if (java.lang.Double.doubleToLongBits(getAmount())
                    != java.lang.Double.doubleToLongBits(
                    other.getAmount())) return false;
            if (!getCustomerIdentityRef()
                    .equals(other.getCustomerIdentityRef())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RIB_FIELD_NUMBER;
            hash = (53 * hash) + getRib().hashCode();
            hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getAmount()));
            hash = (37 * hash) + CUSTOMERIDENTITYREF_FIELD_NUMBER;
            hash = (53 * hash) + getCustomerIdentityRef().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code AddBankAccountRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:AddBankAccountRequest)
                com.example.tmbank.grpc.stub.Bank.AddBankAccountRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest.class, com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                rib_ = "";

                amount_ = 0D;

                customerIdentityRef_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest build() {
                com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest result = new com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest(this);
                result.rib_ = rib_;
                result.amount_ = amount_;
                result.customerIdentityRef_ = customerIdentityRef_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest.getDefaultInstance()) return this;
                if (!other.getRib().isEmpty()) {
                    rib_ = other.rib_;
                    onChanged();
                }
                if (other.getAmount() != 0D) {
                    setAmount(other.getAmount());
                }
                if (!other.getCustomerIdentityRef().isEmpty()) {
                    customerIdentityRef_ = other.customerIdentityRef_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object rib_ = "";
            /**
             * <code>string rib = 1;</code>
             * @return The rib.
             */
            public java.lang.String getRib() {
                java.lang.Object ref = rib_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    rib_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string rib = 1;</code>
             * @return The bytes for rib.
             */
            public com.google.protobuf.ByteString
            getRibBytes() {
                java.lang.Object ref = rib_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    rib_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string rib = 1;</code>
             * @param value The rib to set.
             * @return This builder for chaining.
             */
            public Builder setRib(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                rib_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string rib = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearRib() {

                rib_ = getDefaultInstance().getRib();
                onChanged();
                return this;
            }
            /**
             * <code>string rib = 1;</code>
             * @param value The bytes for rib to set.
             * @return This builder for chaining.
             */
            public Builder setRibBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                rib_ = value;
                onChanged();
                return this;
            }

            private double amount_ ;
            /**
             * <code>double amount = 2;</code>
             * @return The amount.
             */
            public double getAmount() {
                return amount_;
            }
            /**
             * <code>double amount = 2;</code>
             * @param value The amount to set.
             * @return This builder for chaining.
             */
            public Builder setAmount(double value) {

                amount_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>double amount = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearAmount() {

                amount_ = 0D;
                onChanged();
                return this;
            }

            private java.lang.Object customerIdentityRef_ = "";
            /**
             * <code>string customerIdentityRef = 3;</code>
             * @return The customerIdentityRef.
             */
            public java.lang.String getCustomerIdentityRef() {
                java.lang.Object ref = customerIdentityRef_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    customerIdentityRef_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string customerIdentityRef = 3;</code>
             * @return The bytes for customerIdentityRef.
             */
            public com.google.protobuf.ByteString
            getCustomerIdentityRefBytes() {
                java.lang.Object ref = customerIdentityRef_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    customerIdentityRef_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string customerIdentityRef = 3;</code>
             * @param value The customerIdentityRef to set.
             * @return This builder for chaining.
             */
            public Builder setCustomerIdentityRef(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                customerIdentityRef_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string customerIdentityRef = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearCustomerIdentityRef() {

                customerIdentityRef_ = getDefaultInstance().getCustomerIdentityRef();
                onChanged();
                return this;
            }
            /**
             * <code>string customerIdentityRef = 3;</code>
             * @param value The bytes for customerIdentityRef to set.
             * @return This builder for chaining.
             */
            public Builder setCustomerIdentityRefBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                customerIdentityRef_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:AddBankAccountRequest)
        }

        // @@protoc_insertion_point(class_scope:AddBankAccountRequest)
        private static final com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<AddBankAccountRequest>
                PARSER = new com.google.protobuf.AbstractParser<AddBankAccountRequest>() {
            @java.lang.Override
            public AddBankAccountRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new AddBankAccountRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<AddBankAccountRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<AddBankAccountRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.AddBankAccountRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface AddBankAccountResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:AddBankAccountResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        java.lang.String getMessage();
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        com.google.protobuf.ByteString
        getMessageBytes();

        /**
         * <code>.BankAccountDto bankAccount = 2;</code>
         * @return Whether the bankAccount field is set.
         */
        boolean hasBankAccount();
        /**
         * <code>.BankAccountDto bankAccount = 2;</code>
         * @return The bankAccount.
         */
        com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount();
        /**
         * <code>.BankAccountDto bankAccount = 2;</code>
         */
        com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder();
    }
    /**
     * Protobuf type {@code AddBankAccountResponse}
     */
    public  static final class AddBankAccountResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:AddBankAccountResponse)
            AddBankAccountResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use AddBankAccountResponse.newBuilder() to construct.
        private AddBankAccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private AddBankAccountResponse() {
            message_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new AddBankAccountResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private AddBankAccountResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            message_ = s;
                            break;
                        }
                        case 18: {
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder subBuilder = null;
                            if (bankAccount_ != null) {
                                subBuilder = bankAccount_.toBuilder();
                            }
                            bankAccount_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.BankAccountDto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(bankAccount_);
                                bankAccount_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse.class, com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse.Builder.class);
        }

        public static final int MESSAGE_FIELD_NUMBER = 1;
        private volatile java.lang.Object message_;
        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        public java.lang.String getMessage() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                message_ = s;
                return s;
            }
        }
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        public com.google.protobuf.ByteString
        getMessageBytes() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int BANKACCOUNT_FIELD_NUMBER = 2;
        private com.example.tmbank.grpc.stub.Bank.BankAccountDto bankAccount_;
        /**
         * <code>.BankAccountDto bankAccount = 2;</code>
         * @return Whether the bankAccount field is set.
         */
        public boolean hasBankAccount() {
            return bankAccount_ != null;
        }
        /**
         * <code>.BankAccountDto bankAccount = 2;</code>
         * @return The bankAccount.
         */
        public com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount() {
            return bankAccount_ == null ? com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
        }
        /**
         * <code>.BankAccountDto bankAccount = 2;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder() {
            return getBankAccount();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getMessageBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
            }
            if (bankAccount_ != null) {
                output.writeMessage(2, getBankAccount());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getMessageBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
            }
            if (bankAccount_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getBankAccount());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse other = (com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse) obj;

            if (!getMessage()
                    .equals(other.getMessage())) return false;
            if (hasBankAccount() != other.hasBankAccount()) return false;
            if (hasBankAccount()) {
                if (!getBankAccount()
                        .equals(other.getBankAccount())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getMessage().hashCode();
            if (hasBankAccount()) {
                hash = (37 * hash) + BANKACCOUNT_FIELD_NUMBER;
                hash = (53 * hash) + getBankAccount().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code AddBankAccountResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:AddBankAccountResponse)
                com.example.tmbank.grpc.stub.Bank.AddBankAccountResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse.class, com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                message_ = "";

                if (bankAccountBuilder_ == null) {
                    bankAccount_ = null;
                } else {
                    bankAccount_ = null;
                    bankAccountBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddBankAccountResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse build() {
                com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse result = new com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse(this);
                result.message_ = message_;
                if (bankAccountBuilder_ == null) {
                    result.bankAccount_ = bankAccount_;
                } else {
                    result.bankAccount_ = bankAccountBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse.getDefaultInstance()) return this;
                if (!other.getMessage().isEmpty()) {
                    message_ = other.message_;
                    onChanged();
                }
                if (other.hasBankAccount()) {
                    mergeBankAccount(other.getBankAccount());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object message_ = "";
            /**
             * <code>string message = 1;</code>
             * @return The message.
             */
            public java.lang.String getMessage() {
                java.lang.Object ref = message_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    message_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @return The bytes for message.
             */
            public com.google.protobuf.ByteString
            getMessageBytes() {
                java.lang.Object ref = message_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @param value The message to set.
             * @return This builder for chaining.
             */
            public Builder setMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                message_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearMessage() {

                message_ = getDefaultInstance().getMessage();
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @param value The bytes for message to set.
             * @return This builder for chaining.
             */
            public Builder setMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                message_ = value;
                onChanged();
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.BankAccountDto bankAccount_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder> bankAccountBuilder_;
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             * @return Whether the bankAccount field is set.
             */
            public boolean hasBankAccount() {
                return bankAccountBuilder_ != null || bankAccount_ != null;
            }
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             * @return The bankAccount.
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount() {
                if (bankAccountBuilder_ == null) {
                    return bankAccount_ == null ? com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
                } else {
                    return bankAccountBuilder_.getMessage();
                }
            }
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             */
            public Builder setBankAccount(com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bankAccount_ = value;
                    onChanged();
                } else {
                    bankAccountBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             */
            public Builder setBankAccount(
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder builderForValue) {
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = builderForValue.build();
                    onChanged();
                } else {
                    bankAccountBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             */
            public Builder mergeBankAccount(com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (bankAccount_ != null) {
                        bankAccount_ =
                                com.example.tmbank.grpc.stub.Bank.BankAccountDto.newBuilder(bankAccount_).mergeFrom(value).buildPartial();
                    } else {
                        bankAccount_ = value;
                    }
                    onChanged();
                } else {
                    bankAccountBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             */
            public Builder clearBankAccount() {
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = null;
                    onChanged();
                } else {
                    bankAccount_ = null;
                    bankAccountBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder getBankAccountBuilder() {

                onChanged();
                return getBankAccountFieldBuilder().getBuilder();
            }
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder() {
                if (bankAccountBuilder_ != null) {
                    return bankAccountBuilder_.getMessageOrBuilder();
                } else {
                    return bankAccount_ == null ?
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
                }
            }
            /**
             * <code>.BankAccountDto bankAccount = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>
            getBankAccountFieldBuilder() {
                if (bankAccountBuilder_ == null) {
                    bankAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>(
                            getBankAccount(),
                            getParentForChildren(),
                            isClean());
                    bankAccount_ = null;
                }
                return bankAccountBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:AddBankAccountResponse)
        }

        // @@protoc_insertion_point(class_scope:AddBankAccountResponse)
        private static final com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<AddBankAccountResponse>
                PARSER = new com.google.protobuf.AbstractParser<AddBankAccountResponse>() {
            @java.lang.Override
            public AddBankAccountResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new AddBankAccountResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<AddBankAccountResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<AddBankAccountResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.AddBankAccountResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface AddWirerTransferRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:AddWirerTransferRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string ribFrom = 1;</code>
         * @return The ribFrom.
         */
        java.lang.String getRibFrom();
        /**
         * <code>string ribFrom = 1;</code>
         * @return The bytes for ribFrom.
         */
        com.google.protobuf.ByteString
        getRibFromBytes();

        /**
         * <code>string ribTo = 2;</code>
         * @return The ribTo.
         */
        java.lang.String getRibTo();
        /**
         * <code>string ribTo = 2;</code>
         * @return The bytes for ribTo.
         */
        com.google.protobuf.ByteString
        getRibToBytes();

        /**
         * <code>double amount = 3;</code>
         * @return The amount.
         */
        double getAmount();

        /**
         * <code>string username = 4;</code>
         * @return The username.
         */
        java.lang.String getUsername();
        /**
         * <code>string username = 4;</code>
         * @return The bytes for username.
         */
        com.google.protobuf.ByteString
        getUsernameBytes();
    }
    /**
     * Protobuf type {@code AddWirerTransferRequest}
     */
    public  static final class AddWirerTransferRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:AddWirerTransferRequest)
            AddWirerTransferRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use AddWirerTransferRequest.newBuilder() to construct.
        private AddWirerTransferRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private AddWirerTransferRequest() {
            ribFrom_ = "";
            ribTo_ = "";
            username_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new AddWirerTransferRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private AddWirerTransferRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ribFrom_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            ribTo_ = s;
                            break;
                        }
                        case 25: {

                            amount_ = input.readDouble();
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            username_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest.class, com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest.Builder.class);
        }

        public static final int RIBFROM_FIELD_NUMBER = 1;
        private volatile java.lang.Object ribFrom_;
        /**
         * <code>string ribFrom = 1;</code>
         * @return The ribFrom.
         */
        public java.lang.String getRibFrom() {
            java.lang.Object ref = ribFrom_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ribFrom_ = s;
                return s;
            }
        }
        /**
         * <code>string ribFrom = 1;</code>
         * @return The bytes for ribFrom.
         */
        public com.google.protobuf.ByteString
        getRibFromBytes() {
            java.lang.Object ref = ribFrom_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ribFrom_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int RIBTO_FIELD_NUMBER = 2;
        private volatile java.lang.Object ribTo_;
        /**
         * <code>string ribTo = 2;</code>
         * @return The ribTo.
         */
        public java.lang.String getRibTo() {
            java.lang.Object ref = ribTo_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                ribTo_ = s;
                return s;
            }
        }
        /**
         * <code>string ribTo = 2;</code>
         * @return The bytes for ribTo.
         */
        public com.google.protobuf.ByteString
        getRibToBytes() {
            java.lang.Object ref = ribTo_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                ribTo_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int AMOUNT_FIELD_NUMBER = 3;
        private double amount_;
        /**
         * <code>double amount = 3;</code>
         * @return The amount.
         */
        public double getAmount() {
            return amount_;
        }

        public static final int USERNAME_FIELD_NUMBER = 4;
        private volatile java.lang.Object username_;
        /**
         * <code>string username = 4;</code>
         * @return The username.
         */
        public java.lang.String getUsername() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                username_ = s;
                return s;
            }
        }
        /**
         * <code>string username = 4;</code>
         * @return The bytes for username.
         */
        public com.google.protobuf.ByteString
        getUsernameBytes() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                username_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getRibFromBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ribFrom_);
            }
            if (!getRibToBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ribTo_);
            }
            if (amount_ != 0D) {
                output.writeDouble(3, amount_);
            }
            if (!getUsernameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, username_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getRibFromBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ribFrom_);
            }
            if (!getRibToBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ribTo_);
            }
            if (amount_ != 0D) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(3, amount_);
            }
            if (!getUsernameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, username_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest other = (com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest) obj;

            if (!getRibFrom()
                    .equals(other.getRibFrom())) return false;
            if (!getRibTo()
                    .equals(other.getRibTo())) return false;
            if (java.lang.Double.doubleToLongBits(getAmount())
                    != java.lang.Double.doubleToLongBits(
                    other.getAmount())) return false;
            if (!getUsername()
                    .equals(other.getUsername())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RIBFROM_FIELD_NUMBER;
            hash = (53 * hash) + getRibFrom().hashCode();
            hash = (37 * hash) + RIBTO_FIELD_NUMBER;
            hash = (53 * hash) + getRibTo().hashCode();
            hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getAmount()));
            hash = (37 * hash) + USERNAME_FIELD_NUMBER;
            hash = (53 * hash) + getUsername().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code AddWirerTransferRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:AddWirerTransferRequest)
                com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest.class, com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                ribFrom_ = "";

                ribTo_ = "";

                amount_ = 0D;

                username_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest build() {
                com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest result = new com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest(this);
                result.ribFrom_ = ribFrom_;
                result.ribTo_ = ribTo_;
                result.amount_ = amount_;
                result.username_ = username_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest.getDefaultInstance()) return this;
                if (!other.getRibFrom().isEmpty()) {
                    ribFrom_ = other.ribFrom_;
                    onChanged();
                }
                if (!other.getRibTo().isEmpty()) {
                    ribTo_ = other.ribTo_;
                    onChanged();
                }
                if (other.getAmount() != 0D) {
                    setAmount(other.getAmount());
                }
                if (!other.getUsername().isEmpty()) {
                    username_ = other.username_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object ribFrom_ = "";
            /**
             * <code>string ribFrom = 1;</code>
             * @return The ribFrom.
             */
            public java.lang.String getRibFrom() {
                java.lang.Object ref = ribFrom_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ribFrom_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string ribFrom = 1;</code>
             * @return The bytes for ribFrom.
             */
            public com.google.protobuf.ByteString
            getRibFromBytes() {
                java.lang.Object ref = ribFrom_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ribFrom_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string ribFrom = 1;</code>
             * @param value The ribFrom to set.
             * @return This builder for chaining.
             */
            public Builder setRibFrom(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ribFrom_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string ribFrom = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearRibFrom() {

                ribFrom_ = getDefaultInstance().getRibFrom();
                onChanged();
                return this;
            }
            /**
             * <code>string ribFrom = 1;</code>
             * @param value The bytes for ribFrom to set.
             * @return This builder for chaining.
             */
            public Builder setRibFromBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ribFrom_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object ribTo_ = "";
            /**
             * <code>string ribTo = 2;</code>
             * @return The ribTo.
             */
            public java.lang.String getRibTo() {
                java.lang.Object ref = ribTo_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    ribTo_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string ribTo = 2;</code>
             * @return The bytes for ribTo.
             */
            public com.google.protobuf.ByteString
            getRibToBytes() {
                java.lang.Object ref = ribTo_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    ribTo_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string ribTo = 2;</code>
             * @param value The ribTo to set.
             * @return This builder for chaining.
             */
            public Builder setRibTo(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ribTo_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string ribTo = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearRibTo() {

                ribTo_ = getDefaultInstance().getRibTo();
                onChanged();
                return this;
            }
            /**
             * <code>string ribTo = 2;</code>
             * @param value The bytes for ribTo to set.
             * @return This builder for chaining.
             */
            public Builder setRibToBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                ribTo_ = value;
                onChanged();
                return this;
            }

            private double amount_ ;
            /**
             * <code>double amount = 3;</code>
             * @return The amount.
             */
            public double getAmount() {
                return amount_;
            }
            /**
             * <code>double amount = 3;</code>
             * @param value The amount to set.
             * @return This builder for chaining.
             */
            public Builder setAmount(double value) {

                amount_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>double amount = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearAmount() {

                amount_ = 0D;
                onChanged();
                return this;
            }

            private java.lang.Object username_ = "";
            /**
             * <code>string username = 4;</code>
             * @return The username.
             */
            public java.lang.String getUsername() {
                java.lang.Object ref = username_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    username_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string username = 4;</code>
             * @return The bytes for username.
             */
            public com.google.protobuf.ByteString
            getUsernameBytes() {
                java.lang.Object ref = username_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    username_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string username = 4;</code>
             * @param value The username to set.
             * @return This builder for chaining.
             */
            public Builder setUsername(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                username_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string username = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearUsername() {

                username_ = getDefaultInstance().getUsername();
                onChanged();
                return this;
            }
            /**
             * <code>string username = 4;</code>
             * @param value The bytes for username to set.
             * @return This builder for chaining.
             */
            public Builder setUsernameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                username_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:AddWirerTransferRequest)
        }

        // @@protoc_insertion_point(class_scope:AddWirerTransferRequest)
        private static final com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<AddWirerTransferRequest>
                PARSER = new com.google.protobuf.AbstractParser<AddWirerTransferRequest>() {
            @java.lang.Override
            public AddWirerTransferRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new AddWirerTransferRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<AddWirerTransferRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<AddWirerTransferRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.AddWirerTransferRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface AddWirerTransferResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:AddWirerTransferResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        java.lang.String getMessage();
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        com.google.protobuf.ByteString
        getMessageBytes();

        /**
         * <code>.TransactionDto transactionFrom = 2;</code>
         * @return Whether the transactionFrom field is set.
         */
        boolean hasTransactionFrom();
        /**
         * <code>.TransactionDto transactionFrom = 2;</code>
         * @return The transactionFrom.
         */
        com.example.tmbank.grpc.stub.Bank.TransactionDto getTransactionFrom();
        /**
         * <code>.TransactionDto transactionFrom = 2;</code>
         */
        com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionFromOrBuilder();

        /**
         * <code>.TransactionDto transactionTo = 3;</code>
         * @return Whether the transactionTo field is set.
         */
        boolean hasTransactionTo();
        /**
         * <code>.TransactionDto transactionTo = 3;</code>
         * @return The transactionTo.
         */
        com.example.tmbank.grpc.stub.Bank.TransactionDto getTransactionTo();
        /**
         * <code>.TransactionDto transactionTo = 3;</code>
         */
        com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionToOrBuilder();
    }
    /**
     * Protobuf type {@code AddWirerTransferResponse}
     */
    public  static final class AddWirerTransferResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:AddWirerTransferResponse)
            AddWirerTransferResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use AddWirerTransferResponse.newBuilder() to construct.
        private AddWirerTransferResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private AddWirerTransferResponse() {
            message_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new AddWirerTransferResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private AddWirerTransferResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            message_ = s;
                            break;
                        }
                        case 18: {
                            com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder subBuilder = null;
                            if (transactionFrom_ != null) {
                                subBuilder = transactionFrom_.toBuilder();
                            }
                            transactionFrom_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.TransactionDto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(transactionFrom_);
                                transactionFrom_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 26: {
                            com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder subBuilder = null;
                            if (transactionTo_ != null) {
                                subBuilder = transactionTo_.toBuilder();
                            }
                            transactionTo_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.TransactionDto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(transactionTo_);
                                transactionTo_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse.class, com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse.Builder.class);
        }

        public static final int MESSAGE_FIELD_NUMBER = 1;
        private volatile java.lang.Object message_;
        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        public java.lang.String getMessage() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                message_ = s;
                return s;
            }
        }
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        public com.google.protobuf.ByteString
        getMessageBytes() {
            java.lang.Object ref = message_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TRANSACTIONFROM_FIELD_NUMBER = 2;
        private com.example.tmbank.grpc.stub.Bank.TransactionDto transactionFrom_;
        /**
         * <code>.TransactionDto transactionFrom = 2;</code>
         * @return Whether the transactionFrom field is set.
         */
        public boolean hasTransactionFrom() {
            return transactionFrom_ != null;
        }
        /**
         * <code>.TransactionDto transactionFrom = 2;</code>
         * @return The transactionFrom.
         */
        public com.example.tmbank.grpc.stub.Bank.TransactionDto getTransactionFrom() {
            return transactionFrom_ == null ? com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance() : transactionFrom_;
        }
        /**
         * <code>.TransactionDto transactionFrom = 2;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionFromOrBuilder() {
            return getTransactionFrom();
        }

        public static final int TRANSACTIONTO_FIELD_NUMBER = 3;
        private com.example.tmbank.grpc.stub.Bank.TransactionDto transactionTo_;
        /**
         * <code>.TransactionDto transactionTo = 3;</code>
         * @return Whether the transactionTo field is set.
         */
        public boolean hasTransactionTo() {
            return transactionTo_ != null;
        }
        /**
         * <code>.TransactionDto transactionTo = 3;</code>
         * @return The transactionTo.
         */
        public com.example.tmbank.grpc.stub.Bank.TransactionDto getTransactionTo() {
            return transactionTo_ == null ? com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance() : transactionTo_;
        }
        /**
         * <code>.TransactionDto transactionTo = 3;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionToOrBuilder() {
            return getTransactionTo();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getMessageBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
            }
            if (transactionFrom_ != null) {
                output.writeMessage(2, getTransactionFrom());
            }
            if (transactionTo_ != null) {
                output.writeMessage(3, getTransactionTo());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getMessageBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
            }
            if (transactionFrom_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getTransactionFrom());
            }
            if (transactionTo_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getTransactionTo());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse other = (com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse) obj;

            if (!getMessage()
                    .equals(other.getMessage())) return false;
            if (hasTransactionFrom() != other.hasTransactionFrom()) return false;
            if (hasTransactionFrom()) {
                if (!getTransactionFrom()
                        .equals(other.getTransactionFrom())) return false;
            }
            if (hasTransactionTo() != other.hasTransactionTo()) return false;
            if (hasTransactionTo()) {
                if (!getTransactionTo()
                        .equals(other.getTransactionTo())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getMessage().hashCode();
            if (hasTransactionFrom()) {
                hash = (37 * hash) + TRANSACTIONFROM_FIELD_NUMBER;
                hash = (53 * hash) + getTransactionFrom().hashCode();
            }
            if (hasTransactionTo()) {
                hash = (37 * hash) + TRANSACTIONTO_FIELD_NUMBER;
                hash = (53 * hash) + getTransactionTo().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code AddWirerTransferResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:AddWirerTransferResponse)
                com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse.class, com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                message_ = "";

                if (transactionFromBuilder_ == null) {
                    transactionFrom_ = null;
                } else {
                    transactionFrom_ = null;
                    transactionFromBuilder_ = null;
                }
                if (transactionToBuilder_ == null) {
                    transactionTo_ = null;
                } else {
                    transactionTo_ = null;
                    transactionToBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_AddWirerTransferResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse build() {
                com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse result = new com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse(this);
                result.message_ = message_;
                if (transactionFromBuilder_ == null) {
                    result.transactionFrom_ = transactionFrom_;
                } else {
                    result.transactionFrom_ = transactionFromBuilder_.build();
                }
                if (transactionToBuilder_ == null) {
                    result.transactionTo_ = transactionTo_;
                } else {
                    result.transactionTo_ = transactionToBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse.getDefaultInstance()) return this;
                if (!other.getMessage().isEmpty()) {
                    message_ = other.message_;
                    onChanged();
                }
                if (other.hasTransactionFrom()) {
                    mergeTransactionFrom(other.getTransactionFrom());
                }
                if (other.hasTransactionTo()) {
                    mergeTransactionTo(other.getTransactionTo());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object message_ = "";
            /**
             * <code>string message = 1;</code>
             * @return The message.
             */
            public java.lang.String getMessage() {
                java.lang.Object ref = message_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    message_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @return The bytes for message.
             */
            public com.google.protobuf.ByteString
            getMessageBytes() {
                java.lang.Object ref = message_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string message = 1;</code>
             * @param value The message to set.
             * @return This builder for chaining.
             */
            public Builder setMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                message_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearMessage() {

                message_ = getDefaultInstance().getMessage();
                onChanged();
                return this;
            }
            /**
             * <code>string message = 1;</code>
             * @param value The bytes for message to set.
             * @return This builder for chaining.
             */
            public Builder setMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                message_ = value;
                onChanged();
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.TransactionDto transactionFrom_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder> transactionFromBuilder_;
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             * @return Whether the transactionFrom field is set.
             */
            public boolean hasTransactionFrom() {
                return transactionFromBuilder_ != null || transactionFrom_ != null;
            }
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             * @return The transactionFrom.
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDto getTransactionFrom() {
                if (transactionFromBuilder_ == null) {
                    return transactionFrom_ == null ? com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance() : transactionFrom_;
                } else {
                    return transactionFromBuilder_.getMessage();
                }
            }
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             */
            public Builder setTransactionFrom(com.example.tmbank.grpc.stub.Bank.TransactionDto value) {
                if (transactionFromBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    transactionFrom_ = value;
                    onChanged();
                } else {
                    transactionFromBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             */
            public Builder setTransactionFrom(
                    com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder builderForValue) {
                if (transactionFromBuilder_ == null) {
                    transactionFrom_ = builderForValue.build();
                    onChanged();
                } else {
                    transactionFromBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             */
            public Builder mergeTransactionFrom(com.example.tmbank.grpc.stub.Bank.TransactionDto value) {
                if (transactionFromBuilder_ == null) {
                    if (transactionFrom_ != null) {
                        transactionFrom_ =
                                com.example.tmbank.grpc.stub.Bank.TransactionDto.newBuilder(transactionFrom_).mergeFrom(value).buildPartial();
                    } else {
                        transactionFrom_ = value;
                    }
                    onChanged();
                } else {
                    transactionFromBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             */
            public Builder clearTransactionFrom() {
                if (transactionFromBuilder_ == null) {
                    transactionFrom_ = null;
                    onChanged();
                } else {
                    transactionFrom_ = null;
                    transactionFromBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder getTransactionFromBuilder() {

                onChanged();
                return getTransactionFromFieldBuilder().getBuilder();
            }
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionFromOrBuilder() {
                if (transactionFromBuilder_ != null) {
                    return transactionFromBuilder_.getMessageOrBuilder();
                } else {
                    return transactionFrom_ == null ?
                            com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance() : transactionFrom_;
                }
            }
            /**
             * <code>.TransactionDto transactionFrom = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>
            getTransactionFromFieldBuilder() {
                if (transactionFromBuilder_ == null) {
                    transactionFromBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>(
                            getTransactionFrom(),
                            getParentForChildren(),
                            isClean());
                    transactionFrom_ = null;
                }
                return transactionFromBuilder_;
            }

            private com.example.tmbank.grpc.stub.Bank.TransactionDto transactionTo_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder> transactionToBuilder_;
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             * @return Whether the transactionTo field is set.
             */
            public boolean hasTransactionTo() {
                return transactionToBuilder_ != null || transactionTo_ != null;
            }
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             * @return The transactionTo.
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDto getTransactionTo() {
                if (transactionToBuilder_ == null) {
                    return transactionTo_ == null ? com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance() : transactionTo_;
                } else {
                    return transactionToBuilder_.getMessage();
                }
            }
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             */
            public Builder setTransactionTo(com.example.tmbank.grpc.stub.Bank.TransactionDto value) {
                if (transactionToBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    transactionTo_ = value;
                    onChanged();
                } else {
                    transactionToBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             */
            public Builder setTransactionTo(
                    com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder builderForValue) {
                if (transactionToBuilder_ == null) {
                    transactionTo_ = builderForValue.build();
                    onChanged();
                } else {
                    transactionToBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             */
            public Builder mergeTransactionTo(com.example.tmbank.grpc.stub.Bank.TransactionDto value) {
                if (transactionToBuilder_ == null) {
                    if (transactionTo_ != null) {
                        transactionTo_ =
                                com.example.tmbank.grpc.stub.Bank.TransactionDto.newBuilder(transactionTo_).mergeFrom(value).buildPartial();
                    } else {
                        transactionTo_ = value;
                    }
                    onChanged();
                } else {
                    transactionToBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             */
            public Builder clearTransactionTo() {
                if (transactionToBuilder_ == null) {
                    transactionTo_ = null;
                    onChanged();
                } else {
                    transactionTo_ = null;
                    transactionToBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder getTransactionToBuilder() {

                onChanged();
                return getTransactionToFieldBuilder().getBuilder();
            }
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionToOrBuilder() {
                if (transactionToBuilder_ != null) {
                    return transactionToBuilder_.getMessageOrBuilder();
                } else {
                    return transactionTo_ == null ?
                            com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance() : transactionTo_;
                }
            }
            /**
             * <code>.TransactionDto transactionTo = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>
            getTransactionToFieldBuilder() {
                if (transactionToBuilder_ == null) {
                    transactionToBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>(
                            getTransactionTo(),
                            getParentForChildren(),
                            isClean());
                    transactionTo_ = null;
                }
                return transactionToBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:AddWirerTransferResponse)
        }

        // @@protoc_insertion_point(class_scope:AddWirerTransferResponse)
        private static final com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<AddWirerTransferResponse>
                PARSER = new com.google.protobuf.AbstractParser<AddWirerTransferResponse>() {
            @java.lang.Override
            public AddWirerTransferResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new AddWirerTransferResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<AddWirerTransferResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<AddWirerTransferResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.AddWirerTransferResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface GetTransactionsRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:GetTransactionsRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string rib = 1;</code>
         * @return The rib.
         */
        java.lang.String getRib();
        /**
         * <code>string rib = 1;</code>
         * @return The bytes for rib.
         */
        com.google.protobuf.ByteString
        getRibBytes();

        /**
         * <code>string dateTo = 2;</code>
         * @return The dateTo.
         */
        java.lang.String getDateTo();
        /**
         * <code>string dateTo = 2;</code>
         * @return The bytes for dateTo.
         */
        com.google.protobuf.ByteString
        getDateToBytes();

        /**
         * <code>string dateFrom = 3;</code>
         * @return The dateFrom.
         */
        java.lang.String getDateFrom();
        /**
         * <code>string dateFrom = 3;</code>
         * @return The bytes for dateFrom.
         */
        com.google.protobuf.ByteString
        getDateFromBytes();
    }
    /**
     * Protobuf type {@code GetTransactionsRequest}
     */
    public  static final class GetTransactionsRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:GetTransactionsRequest)
            GetTransactionsRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GetTransactionsRequest.newBuilder() to construct.
        private GetTransactionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private GetTransactionsRequest() {
            rib_ = "";
            dateTo_ = "";
            dateFrom_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new GetTransactionsRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private GetTransactionsRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            rib_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            dateTo_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            dateFrom_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest.class, com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest.Builder.class);
        }

        public static final int RIB_FIELD_NUMBER = 1;
        private volatile java.lang.Object rib_;
        /**
         * <code>string rib = 1;</code>
         * @return The rib.
         */
        public java.lang.String getRib() {
            java.lang.Object ref = rib_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                rib_ = s;
                return s;
            }
        }
        /**
         * <code>string rib = 1;</code>
         * @return The bytes for rib.
         */
        public com.google.protobuf.ByteString
        getRibBytes() {
            java.lang.Object ref = rib_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                rib_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DATETO_FIELD_NUMBER = 2;
        private volatile java.lang.Object dateTo_;
        /**
         * <code>string dateTo = 2;</code>
         * @return The dateTo.
         */
        public java.lang.String getDateTo() {
            java.lang.Object ref = dateTo_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                dateTo_ = s;
                return s;
            }
        }
        /**
         * <code>string dateTo = 2;</code>
         * @return The bytes for dateTo.
         */
        public com.google.protobuf.ByteString
        getDateToBytes() {
            java.lang.Object ref = dateTo_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                dateTo_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DATEFROM_FIELD_NUMBER = 3;
        private volatile java.lang.Object dateFrom_;
        /**
         * <code>string dateFrom = 3;</code>
         * @return The dateFrom.
         */
        public java.lang.String getDateFrom() {
            java.lang.Object ref = dateFrom_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                dateFrom_ = s;
                return s;
            }
        }
        /**
         * <code>string dateFrom = 3;</code>
         * @return The bytes for dateFrom.
         */
        public com.google.protobuf.ByteString
        getDateFromBytes() {
            java.lang.Object ref = dateFrom_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                dateFrom_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getRibBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rib_);
            }
            if (!getDateToBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dateTo_);
            }
            if (!getDateFromBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dateFrom_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getRibBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rib_);
            }
            if (!getDateToBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dateTo_);
            }
            if (!getDateFromBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dateFrom_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest other = (com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest) obj;

            if (!getRib()
                    .equals(other.getRib())) return false;
            if (!getDateTo()
                    .equals(other.getDateTo())) return false;
            if (!getDateFrom()
                    .equals(other.getDateFrom())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RIB_FIELD_NUMBER;
            hash = (53 * hash) + getRib().hashCode();
            hash = (37 * hash) + DATETO_FIELD_NUMBER;
            hash = (53 * hash) + getDateTo().hashCode();
            hash = (37 * hash) + DATEFROM_FIELD_NUMBER;
            hash = (53 * hash) + getDateFrom().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code GetTransactionsRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:GetTransactionsRequest)
                com.example.tmbank.grpc.stub.Bank.GetTransactionsRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest.class, com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                rib_ = "";

                dateTo_ = "";

                dateFrom_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsRequest_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest build() {
                com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest buildPartial() {
                com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest result = new com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest(this);
                result.rib_ = rib_;
                result.dateTo_ = dateTo_;
                result.dateFrom_ = dateFrom_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest other) {
                if (other == com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest.getDefaultInstance()) return this;
                if (!other.getRib().isEmpty()) {
                    rib_ = other.rib_;
                    onChanged();
                }
                if (!other.getDateTo().isEmpty()) {
                    dateTo_ = other.dateTo_;
                    onChanged();
                }
                if (!other.getDateFrom().isEmpty()) {
                    dateFrom_ = other.dateFrom_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object rib_ = "";
            /**
             * <code>string rib = 1;</code>
             * @return The rib.
             */
            public java.lang.String getRib() {
                java.lang.Object ref = rib_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    rib_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string rib = 1;</code>
             * @return The bytes for rib.
             */
            public com.google.protobuf.ByteString
            getRibBytes() {
                java.lang.Object ref = rib_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    rib_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string rib = 1;</code>
             * @param value The rib to set.
             * @return This builder for chaining.
             */
            public Builder setRib(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                rib_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string rib = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearRib() {

                rib_ = getDefaultInstance().getRib();
                onChanged();
                return this;
            }
            /**
             * <code>string rib = 1;</code>
             * @param value The bytes for rib to set.
             * @return This builder for chaining.
             */
            public Builder setRibBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                rib_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object dateTo_ = "";
            /**
             * <code>string dateTo = 2;</code>
             * @return The dateTo.
             */
            public java.lang.String getDateTo() {
                java.lang.Object ref = dateTo_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    dateTo_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string dateTo = 2;</code>
             * @return The bytes for dateTo.
             */
            public com.google.protobuf.ByteString
            getDateToBytes() {
                java.lang.Object ref = dateTo_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    dateTo_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string dateTo = 2;</code>
             * @param value The dateTo to set.
             * @return This builder for chaining.
             */
            public Builder setDateTo(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                dateTo_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string dateTo = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearDateTo() {

                dateTo_ = getDefaultInstance().getDateTo();
                onChanged();
                return this;
            }
            /**
             * <code>string dateTo = 2;</code>
             * @param value The bytes for dateTo to set.
             * @return This builder for chaining.
             */
            public Builder setDateToBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                dateTo_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object dateFrom_ = "";
            /**
             * <code>string dateFrom = 3;</code>
             * @return The dateFrom.
             */
            public java.lang.String getDateFrom() {
                java.lang.Object ref = dateFrom_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    dateFrom_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string dateFrom = 3;</code>
             * @return The bytes for dateFrom.
             */
            public com.google.protobuf.ByteString
            getDateFromBytes() {
                java.lang.Object ref = dateFrom_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    dateFrom_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string dateFrom = 3;</code>
             * @param value The dateFrom to set.
             * @return This builder for chaining.
             */
            public Builder setDateFrom(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                dateFrom_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string dateFrom = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearDateFrom() {

                dateFrom_ = getDefaultInstance().getDateFrom();
                onChanged();
                return this;
            }
            /**
             * <code>string dateFrom = 3;</code>
             * @param value The bytes for dateFrom to set.
             * @return This builder for chaining.
             */
            public Builder setDateFromBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                dateFrom_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:GetTransactionsRequest)
        }

        // @@protoc_insertion_point(class_scope:GetTransactionsRequest)
        private static final com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest();
        }

        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GetTransactionsRequest>
                PARSER = new com.google.protobuf.AbstractParser<GetTransactionsRequest>() {
            @java.lang.Override
            public GetTransactionsRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new GetTransactionsRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<GetTransactionsRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GetTransactionsRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.GetTransactionsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface GetTransactionsResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:GetTransactionsResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        java.util.List<com.example.tmbank.grpc.stub.Bank.TransactionDto>
        getTransactionList();
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        com.example.tmbank.grpc.stub.Bank.TransactionDto getTransaction(int index);
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        int getTransactionCount();
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        java.util.List<? extends com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>
        getTransactionOrBuilderList();
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code GetTransactionsResponse}
     */
    public  static final class GetTransactionsResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:GetTransactionsResponse)
            GetTransactionsResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GetTransactionsResponse.newBuilder() to construct.
        private GetTransactionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private GetTransactionsResponse() {
            transaction_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new GetTransactionsResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private GetTransactionsResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                transaction_ = new java.util.ArrayList<com.example.tmbank.grpc.stub.Bank.TransactionDto>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            transaction_.add(
                                    input.readMessage(com.example.tmbank.grpc.stub.Bank.TransactionDto.parser(), extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    transaction_ = java.util.Collections.unmodifiableList(transaction_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse.class, com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse.Builder.class);
        }

        public static final int TRANSACTION_FIELD_NUMBER = 1;
        private java.util.List<com.example.tmbank.grpc.stub.Bank.TransactionDto> transaction_;
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        public java.util.List<com.example.tmbank.grpc.stub.Bank.TransactionDto> getTransactionList() {
            return transaction_;
        }
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        public java.util.List<? extends com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>
        getTransactionOrBuilderList() {
            return transaction_;
        }
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        public int getTransactionCount() {
            return transaction_.size();
        }
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.TransactionDto getTransaction(int index) {
            return transaction_.get(index);
        }
        /**
         * <code>repeated .TransactionDto transaction = 1;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionOrBuilder(
                int index) {
            return transaction_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < transaction_.size(); i++) {
                output.writeMessage(1, transaction_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < transaction_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, transaction_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse other = (com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse) obj;

            if (!getTransactionList()
                    .equals(other.getTransactionList())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getTransactionCount() > 0) {
                hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
                hash = (53 * hash) + getTransactionList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code GetTransactionsResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:GetTransactionsResponse)
                com.example.tmbank.grpc.stub.Bank.GetTransactionsResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse.class, com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getTransactionFieldBuilder();
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (transactionBuilder_ == null) {
                    transaction_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    transactionBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_GetTransactionsResponse_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse build() {
                com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse buildPartial() {
                com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse result = new com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse(this);
                int from_bitField0_ = bitField0_;
                if (transactionBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        transaction_ = java.util.Collections.unmodifiableList(transaction_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.transaction_ = transaction_;
                } else {
                    result.transaction_ = transactionBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse other) {
                if (other == com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse.getDefaultInstance()) return this;
                if (transactionBuilder_ == null) {
                    if (!other.transaction_.isEmpty()) {
                        if (transaction_.isEmpty()) {
                            transaction_ = other.transaction_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureTransactionIsMutable();
                            transaction_.addAll(other.transaction_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.transaction_.isEmpty()) {
                        if (transactionBuilder_.isEmpty()) {
                            transactionBuilder_.dispose();
                            transactionBuilder_ = null;
                            transaction_ = other.transaction_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            transactionBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getTransactionFieldBuilder() : null;
                        } else {
                            transactionBuilder_.addAllMessages(other.transaction_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.util.List<com.example.tmbank.grpc.stub.Bank.TransactionDto> transaction_ =
                    java.util.Collections.emptyList();
            private void ensureTransactionIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    transaction_ = new java.util.ArrayList<com.example.tmbank.grpc.stub.Bank.TransactionDto>(transaction_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder> transactionBuilder_;

            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public java.util.List<com.example.tmbank.grpc.stub.Bank.TransactionDto> getTransactionList() {
                if (transactionBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(transaction_);
                } else {
                    return transactionBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public int getTransactionCount() {
                if (transactionBuilder_ == null) {
                    return transaction_.size();
                } else {
                    return transactionBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDto getTransaction(int index) {
                if (transactionBuilder_ == null) {
                    return transaction_.get(index);
                } else {
                    return transactionBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder setTransaction(
                    int index, com.example.tmbank.grpc.stub.Bank.TransactionDto value) {
                if (transactionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionIsMutable();
                    transaction_.set(index, value);
                    onChanged();
                } else {
                    transactionBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder setTransaction(
                    int index, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder builderForValue) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    transaction_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    transactionBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder addTransaction(com.example.tmbank.grpc.stub.Bank.TransactionDto value) {
                if (transactionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionIsMutable();
                    transaction_.add(value);
                    onChanged();
                } else {
                    transactionBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder addTransaction(
                    int index, com.example.tmbank.grpc.stub.Bank.TransactionDto value) {
                if (transactionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionIsMutable();
                    transaction_.add(index, value);
                    onChanged();
                } else {
                    transactionBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder addTransaction(
                    com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder builderForValue) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    transaction_.add(builderForValue.build());
                    onChanged();
                } else {
                    transactionBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder addTransaction(
                    int index, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder builderForValue) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    transaction_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    transactionBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder addAllTransaction(
                    java.lang.Iterable<? extends com.example.tmbank.grpc.stub.Bank.TransactionDto> values) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, transaction_);
                    onChanged();
                } else {
                    transactionBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder clearTransaction() {
                if (transactionBuilder_ == null) {
                    transaction_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    transactionBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public Builder removeTransaction(int index) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    transaction_.remove(index);
                    onChanged();
                } else {
                    transactionBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder getTransactionBuilder(
                    int index) {
                return getTransactionFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder getTransactionOrBuilder(
                    int index) {
                if (transactionBuilder_ == null) {
                    return transaction_.get(index);  } else {
                    return transactionBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public java.util.List<? extends com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>
            getTransactionOrBuilderList() {
                if (transactionBuilder_ != null) {
                    return transactionBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(transaction_);
                }
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder addTransactionBuilder() {
                return getTransactionFieldBuilder().addBuilder(
                        com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance());
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder addTransactionBuilder(
                    int index) {
                return getTransactionFieldBuilder().addBuilder(
                        index, com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance());
            }
            /**
             * <code>repeated .TransactionDto transaction = 1;</code>
             */
            public java.util.List<com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder>
            getTransactionBuilderList() {
                return getTransactionFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>
            getTransactionFieldBuilder() {
                if (transactionBuilder_ == null) {
                    transactionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.TransactionDto, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder, com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder>(
                            transaction_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    transaction_ = null;
                }
                return transactionBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:GetTransactionsResponse)
        }

        // @@protoc_insertion_point(class_scope:GetTransactionsResponse)
        private static final com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse();
        }

        public static com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GetTransactionsResponse>
                PARSER = new com.google.protobuf.AbstractParser<GetTransactionsResponse>() {
            @java.lang.Override
            public GetTransactionsResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new GetTransactionsResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<GetTransactionsResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GetTransactionsResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.GetTransactionsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface UserDtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:UserDto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string username = 1;</code>
         * @return The username.
         */
        java.lang.String getUsername();
        /**
         * <code>string username = 1;</code>
         * @return The bytes for username.
         */
        com.google.protobuf.ByteString
        getUsernameBytes();

        /**
         * <code>string firstname = 2;</code>
         * @return The firstname.
         */
        java.lang.String getFirstname();
        /**
         * <code>string firstname = 2;</code>
         * @return The bytes for firstname.
         */
        com.google.protobuf.ByteString
        getFirstnameBytes();

        /**
         * <code>string lastname = 3;</code>
         * @return The lastname.
         */
        java.lang.String getLastname();
        /**
         * <code>string lastname = 3;</code>
         * @return The bytes for lastname.
         */
        com.google.protobuf.ByteString
        getLastnameBytes();
    }
    /**
     * Protobuf type {@code UserDto}
     */
    public  static final class UserDto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:UserDto)
            UserDtoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use UserDto.newBuilder() to construct.
        private UserDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private UserDto() {
            username_ = "";
            firstname_ = "";
            lastname_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new UserDto();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private UserDto(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            username_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            firstname_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            lastname_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_UserDto_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_UserDto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.UserDto.class, com.example.tmbank.grpc.stub.Bank.UserDto.Builder.class);
        }

        public static final int USERNAME_FIELD_NUMBER = 1;
        private volatile java.lang.Object username_;
        /**
         * <code>string username = 1;</code>
         * @return The username.
         */
        public java.lang.String getUsername() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                username_ = s;
                return s;
            }
        }
        /**
         * <code>string username = 1;</code>
         * @return The bytes for username.
         */
        public com.google.protobuf.ByteString
        getUsernameBytes() {
            java.lang.Object ref = username_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                username_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int FIRSTNAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object firstname_;
        /**
         * <code>string firstname = 2;</code>
         * @return The firstname.
         */
        public java.lang.String getFirstname() {
            java.lang.Object ref = firstname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                firstname_ = s;
                return s;
            }
        }
        /**
         * <code>string firstname = 2;</code>
         * @return The bytes for firstname.
         */
        public com.google.protobuf.ByteString
        getFirstnameBytes() {
            java.lang.Object ref = firstname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                firstname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LASTNAME_FIELD_NUMBER = 3;
        private volatile java.lang.Object lastname_;
        /**
         * <code>string lastname = 3;</code>
         * @return The lastname.
         */
        public java.lang.String getLastname() {
            java.lang.Object ref = lastname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                lastname_ = s;
                return s;
            }
        }
        /**
         * <code>string lastname = 3;</code>
         * @return The bytes for lastname.
         */
        public com.google.protobuf.ByteString
        getLastnameBytes() {
            java.lang.Object ref = lastname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                lastname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getUsernameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
            }
            if (!getFirstnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstname_);
            }
            if (!getLastnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastname_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getUsernameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
            }
            if (!getFirstnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstname_);
            }
            if (!getLastnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastname_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.UserDto)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.UserDto other = (com.example.tmbank.grpc.stub.Bank.UserDto) obj;

            if (!getUsername()
                    .equals(other.getUsername())) return false;
            if (!getFirstname()
                    .equals(other.getFirstname())) return false;
            if (!getLastname()
                    .equals(other.getLastname())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + USERNAME_FIELD_NUMBER;
            hash = (53 * hash) + getUsername().hashCode();
            hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getFirstname().hashCode();
            hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getLastname().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.UserDto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.UserDto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code UserDto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:UserDto)
                com.example.tmbank.grpc.stub.Bank.UserDtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UserDto_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UserDto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.UserDto.class, com.example.tmbank.grpc.stub.Bank.UserDto.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.UserDto.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                username_ = "";

                firstname_ = "";

                lastname_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_UserDto_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UserDto getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.UserDto.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UserDto build() {
                com.example.tmbank.grpc.stub.Bank.UserDto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.UserDto buildPartial() {
                com.example.tmbank.grpc.stub.Bank.UserDto result = new com.example.tmbank.grpc.stub.Bank.UserDto(this);
                result.username_ = username_;
                result.firstname_ = firstname_;
                result.lastname_ = lastname_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.UserDto) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.UserDto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.UserDto other) {
                if (other == com.example.tmbank.grpc.stub.Bank.UserDto.getDefaultInstance()) return this;
                if (!other.getUsername().isEmpty()) {
                    username_ = other.username_;
                    onChanged();
                }
                if (!other.getFirstname().isEmpty()) {
                    firstname_ = other.firstname_;
                    onChanged();
                }
                if (!other.getLastname().isEmpty()) {
                    lastname_ = other.lastname_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.UserDto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.UserDto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object username_ = "";
            /**
             * <code>string username = 1;</code>
             * @return The username.
             */
            public java.lang.String getUsername() {
                java.lang.Object ref = username_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    username_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string username = 1;</code>
             * @return The bytes for username.
             */
            public com.google.protobuf.ByteString
            getUsernameBytes() {
                java.lang.Object ref = username_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    username_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string username = 1;</code>
             * @param value The username to set.
             * @return This builder for chaining.
             */
            public Builder setUsername(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                username_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string username = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearUsername() {

                username_ = getDefaultInstance().getUsername();
                onChanged();
                return this;
            }
            /**
             * <code>string username = 1;</code>
             * @param value The bytes for username to set.
             * @return This builder for chaining.
             */
            public Builder setUsernameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                username_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object firstname_ = "";
            /**
             * <code>string firstname = 2;</code>
             * @return The firstname.
             */
            public java.lang.String getFirstname() {
                java.lang.Object ref = firstname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    firstname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string firstname = 2;</code>
             * @return The bytes for firstname.
             */
            public com.google.protobuf.ByteString
            getFirstnameBytes() {
                java.lang.Object ref = firstname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    firstname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string firstname = 2;</code>
             * @param value The firstname to set.
             * @return This builder for chaining.
             */
            public Builder setFirstname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                firstname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string firstname = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearFirstname() {

                firstname_ = getDefaultInstance().getFirstname();
                onChanged();
                return this;
            }
            /**
             * <code>string firstname = 2;</code>
             * @param value The bytes for firstname to set.
             * @return This builder for chaining.
             */
            public Builder setFirstnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                firstname_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object lastname_ = "";
            /**
             * <code>string lastname = 3;</code>
             * @return The lastname.
             */
            public java.lang.String getLastname() {
                java.lang.Object ref = lastname_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    lastname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string lastname = 3;</code>
             * @return The bytes for lastname.
             */
            public com.google.protobuf.ByteString
            getLastnameBytes() {
                java.lang.Object ref = lastname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    lastname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string lastname = 3;</code>
             * @param value The lastname to set.
             * @return This builder for chaining.
             */
            public Builder setLastname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                lastname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string lastname = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearLastname() {

                lastname_ = getDefaultInstance().getLastname();
                onChanged();
                return this;
            }
            /**
             * <code>string lastname = 3;</code>
             * @param value The bytes for lastname to set.
             * @return This builder for chaining.
             */
            public Builder setLastnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                lastname_ = value;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:UserDto)
        }

        // @@protoc_insertion_point(class_scope:UserDto)
        private static final com.example.tmbank.grpc.stub.Bank.UserDto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.UserDto();
        }

        public static com.example.tmbank.grpc.stub.Bank.UserDto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<UserDto>
                PARSER = new com.google.protobuf.AbstractParser<UserDto>() {
            @java.lang.Override
            public UserDto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new UserDto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<UserDto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<UserDto> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.UserDto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TransactionDtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:TransactionDto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string createdAt = 1;</code>
         * @return The createdAt.
         */
        java.lang.String getCreatedAt();
        /**
         * <code>string createdAt = 1;</code>
         * @return The bytes for createdAt.
         */
        com.google.protobuf.ByteString
        getCreatedAtBytes();

        /**
         * <code>string transactionType = 2;</code>
         * @return The transactionType.
         */
        java.lang.String getTransactionType();
        /**
         * <code>string transactionType = 2;</code>
         * @return The bytes for transactionType.
         */
        com.google.protobuf.ByteString
        getTransactionTypeBytes();

        /**
         * <code>double amount = 3;</code>
         * @return The amount.
         */
        double getAmount();

        /**
         * <code>.BankAccountDto bankAccount = 4;</code>
         * @return Whether the bankAccount field is set.
         */
        boolean hasBankAccount();
        /**
         * <code>.BankAccountDto bankAccount = 4;</code>
         * @return The bankAccount.
         */
        com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount();
        /**
         * <code>.BankAccountDto bankAccount = 4;</code>
         */
        com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder();

        /**
         * <code>.UserDto user = 5;</code>
         * @return Whether the user field is set.
         */
        boolean hasUser();
        /**
         * <code>.UserDto user = 5;</code>
         * @return The user.
         */
        com.example.tmbank.grpc.stub.Bank.UserDto getUser();
        /**
         * <code>.UserDto user = 5;</code>
         */
        com.example.tmbank.grpc.stub.Bank.UserDtoOrBuilder getUserOrBuilder();
    }
    /**
     * Protobuf type {@code TransactionDto}
     */
    public  static final class TransactionDto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:TransactionDto)
            TransactionDtoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use TransactionDto.newBuilder() to construct.
        private TransactionDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TransactionDto() {
            createdAt_ = "";
            transactionType_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new TransactionDto();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private TransactionDto(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            createdAt_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            transactionType_ = s;
                            break;
                        }
                        case 25: {

                            amount_ = input.readDouble();
                            break;
                        }
                        case 34: {
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder subBuilder = null;
                            if (bankAccount_ != null) {
                                subBuilder = bankAccount_.toBuilder();
                            }
                            bankAccount_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.BankAccountDto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(bankAccount_);
                                bankAccount_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 42: {
                            com.example.tmbank.grpc.stub.Bank.UserDto.Builder subBuilder = null;
                            if (user_ != null) {
                                subBuilder = user_.toBuilder();
                            }
                            user_ = input.readMessage(com.example.tmbank.grpc.stub.Bank.UserDto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(user_);
                                user_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_TransactionDto_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.tmbank.grpc.stub.Bank.internal_static_TransactionDto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.tmbank.grpc.stub.Bank.TransactionDto.class, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder.class);
        }

        public static final int CREATEDAT_FIELD_NUMBER = 1;
        private volatile java.lang.Object createdAt_;
        /**
         * <code>string createdAt = 1;</code>
         * @return The createdAt.
         */
        public java.lang.String getCreatedAt() {
            java.lang.Object ref = createdAt_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                createdAt_ = s;
                return s;
            }
        }
        /**
         * <code>string createdAt = 1;</code>
         * @return The bytes for createdAt.
         */
        public com.google.protobuf.ByteString
        getCreatedAtBytes() {
            java.lang.Object ref = createdAt_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                createdAt_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TRANSACTIONTYPE_FIELD_NUMBER = 2;
        private volatile java.lang.Object transactionType_;
        /**
         * <code>string transactionType = 2;</code>
         * @return The transactionType.
         */
        public java.lang.String getTransactionType() {
            java.lang.Object ref = transactionType_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                transactionType_ = s;
                return s;
            }
        }
        /**
         * <code>string transactionType = 2;</code>
         * @return The bytes for transactionType.
         */
        public com.google.protobuf.ByteString
        getTransactionTypeBytes() {
            java.lang.Object ref = transactionType_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                transactionType_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int AMOUNT_FIELD_NUMBER = 3;
        private double amount_;
        /**
         * <code>double amount = 3;</code>
         * @return The amount.
         */
        public double getAmount() {
            return amount_;
        }

        public static final int BANKACCOUNT_FIELD_NUMBER = 4;
        private com.example.tmbank.grpc.stub.Bank.BankAccountDto bankAccount_;
        /**
         * <code>.BankAccountDto bankAccount = 4;</code>
         * @return Whether the bankAccount field is set.
         */
        public boolean hasBankAccount() {
            return bankAccount_ != null;
        }
        /**
         * <code>.BankAccountDto bankAccount = 4;</code>
         * @return The bankAccount.
         */
        public com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount() {
            return bankAccount_ == null ? com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
        }
        /**
         * <code>.BankAccountDto bankAccount = 4;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder() {
            return getBankAccount();
        }

        public static final int USER_FIELD_NUMBER = 5;
        private com.example.tmbank.grpc.stub.Bank.UserDto user_;
        /**
         * <code>.UserDto user = 5;</code>
         * @return Whether the user field is set.
         */
        public boolean hasUser() {
            return user_ != null;
        }
        /**
         * <code>.UserDto user = 5;</code>
         * @return The user.
         */
        public com.example.tmbank.grpc.stub.Bank.UserDto getUser() {
            return user_ == null ? com.example.tmbank.grpc.stub.Bank.UserDto.getDefaultInstance() : user_;
        }
        /**
         * <code>.UserDto user = 5;</code>
         */
        public com.example.tmbank.grpc.stub.Bank.UserDtoOrBuilder getUserOrBuilder() {
            return getUser();
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getCreatedAtBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, createdAt_);
            }
            if (!getTransactionTypeBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, transactionType_);
            }
            if (amount_ != 0D) {
                output.writeDouble(3, amount_);
            }
            if (bankAccount_ != null) {
                output.writeMessage(4, getBankAccount());
            }
            if (user_ != null) {
                output.writeMessage(5, getUser());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getCreatedAtBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, createdAt_);
            }
            if (!getTransactionTypeBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, transactionType_);
            }
            if (amount_ != 0D) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(3, amount_);
            }
            if (bankAccount_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, getBankAccount());
            }
            if (user_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, getUser());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.example.tmbank.grpc.stub.Bank.TransactionDto)) {
                return super.equals(obj);
            }
            com.example.tmbank.grpc.stub.Bank.TransactionDto other = (com.example.tmbank.grpc.stub.Bank.TransactionDto) obj;

            if (!getCreatedAt()
                    .equals(other.getCreatedAt())) return false;
            if (!getTransactionType()
                    .equals(other.getTransactionType())) return false;
            if (java.lang.Double.doubleToLongBits(getAmount())
                    != java.lang.Double.doubleToLongBits(
                    other.getAmount())) return false;
            if (hasBankAccount() != other.hasBankAccount()) return false;
            if (hasBankAccount()) {
                if (!getBankAccount()
                        .equals(other.getBankAccount())) return false;
            }
            if (hasUser() != other.hasUser()) return false;
            if (hasUser()) {
                if (!getUser()
                        .equals(other.getUser())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + CREATEDAT_FIELD_NUMBER;
            hash = (53 * hash) + getCreatedAt().hashCode();
            hash = (37 * hash) + TRANSACTIONTYPE_FIELD_NUMBER;
            hash = (53 * hash) + getTransactionType().hashCode();
            hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getAmount()));
            if (hasBankAccount()) {
                hash = (37 * hash) + BANKACCOUNT_FIELD_NUMBER;
                hash = (53 * hash) + getBankAccount().hashCode();
            }
            if (hasUser()) {
                hash = (37 * hash) + USER_FIELD_NUMBER;
                hash = (53 * hash) + getUser().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.example.tmbank.grpc.stub.Bank.TransactionDto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(com.example.tmbank.grpc.stub.Bank.TransactionDto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code TransactionDto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:TransactionDto)
                com.example.tmbank.grpc.stub.Bank.TransactionDtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_TransactionDto_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_TransactionDto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.example.tmbank.grpc.stub.Bank.TransactionDto.class, com.example.tmbank.grpc.stub.Bank.TransactionDto.Builder.class);
            }

            // Construct using com.example.tmbank.grpc.stub.Bank.TransactionDto.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                createdAt_ = "";

                transactionType_ = "";

                amount_ = 0D;

                if (bankAccountBuilder_ == null) {
                    bankAccount_ = null;
                } else {
                    bankAccount_ = null;
                    bankAccountBuilder_ = null;
                }
                if (userBuilder_ == null) {
                    user_ = null;
                } else {
                    user_ = null;
                    userBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.example.tmbank.grpc.stub.Bank.internal_static_TransactionDto_descriptor;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.TransactionDto getDefaultInstanceForType() {
                return com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance();
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.TransactionDto build() {
                com.example.tmbank.grpc.stub.Bank.TransactionDto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.example.tmbank.grpc.stub.Bank.TransactionDto buildPartial() {
                com.example.tmbank.grpc.stub.Bank.TransactionDto result = new com.example.tmbank.grpc.stub.Bank.TransactionDto(this);
                result.createdAt_ = createdAt_;
                result.transactionType_ = transactionType_;
                result.amount_ = amount_;
                if (bankAccountBuilder_ == null) {
                    result.bankAccount_ = bankAccount_;
                } else {
                    result.bankAccount_ = bankAccountBuilder_.build();
                }
                if (userBuilder_ == null) {
                    result.user_ = user_;
                } else {
                    result.user_ = userBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.example.tmbank.grpc.stub.Bank.TransactionDto) {
                    return mergeFrom((com.example.tmbank.grpc.stub.Bank.TransactionDto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.example.tmbank.grpc.stub.Bank.TransactionDto other) {
                if (other == com.example.tmbank.grpc.stub.Bank.TransactionDto.getDefaultInstance()) return this;
                if (!other.getCreatedAt().isEmpty()) {
                    createdAt_ = other.createdAt_;
                    onChanged();
                }
                if (!other.getTransactionType().isEmpty()) {
                    transactionType_ = other.transactionType_;
                    onChanged();
                }
                if (other.getAmount() != 0D) {
                    setAmount(other.getAmount());
                }
                if (other.hasBankAccount()) {
                    mergeBankAccount(other.getBankAccount());
                }
                if (other.hasUser()) {
                    mergeUser(other.getUser());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.example.tmbank.grpc.stub.Bank.TransactionDto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.example.tmbank.grpc.stub.Bank.TransactionDto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object createdAt_ = "";
            /**
             * <code>string createdAt = 1;</code>
             * @return The createdAt.
             */
            public java.lang.String getCreatedAt() {
                java.lang.Object ref = createdAt_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    createdAt_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string createdAt = 1;</code>
             * @return The bytes for createdAt.
             */
            public com.google.protobuf.ByteString
            getCreatedAtBytes() {
                java.lang.Object ref = createdAt_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    createdAt_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string createdAt = 1;</code>
             * @param value The createdAt to set.
             * @return This builder for chaining.
             */
            public Builder setCreatedAt(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                createdAt_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string createdAt = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearCreatedAt() {

                createdAt_ = getDefaultInstance().getCreatedAt();
                onChanged();
                return this;
            }
            /**
             * <code>string createdAt = 1;</code>
             * @param value The bytes for createdAt to set.
             * @return This builder for chaining.
             */
            public Builder setCreatedAtBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                createdAt_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object transactionType_ = "";
            /**
             * <code>string transactionType = 2;</code>
             * @return The transactionType.
             */
            public java.lang.String getTransactionType() {
                java.lang.Object ref = transactionType_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    transactionType_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string transactionType = 2;</code>
             * @return The bytes for transactionType.
             */
            public com.google.protobuf.ByteString
            getTransactionTypeBytes() {
                java.lang.Object ref = transactionType_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    transactionType_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string transactionType = 2;</code>
             * @param value The transactionType to set.
             * @return This builder for chaining.
             */
            public Builder setTransactionType(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                transactionType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string transactionType = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearTransactionType() {

                transactionType_ = getDefaultInstance().getTransactionType();
                onChanged();
                return this;
            }
            /**
             * <code>string transactionType = 2;</code>
             * @param value The bytes for transactionType to set.
             * @return This builder for chaining.
             */
            public Builder setTransactionTypeBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                transactionType_ = value;
                onChanged();
                return this;
            }

            private double amount_ ;
            /**
             * <code>double amount = 3;</code>
             * @return The amount.
             */
            public double getAmount() {
                return amount_;
            }
            /**
             * <code>double amount = 3;</code>
             * @param value The amount to set.
             * @return This builder for chaining.
             */
            public Builder setAmount(double value) {

                amount_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>double amount = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearAmount() {

                amount_ = 0D;
                onChanged();
                return this;
            }

            private com.example.tmbank.grpc.stub.Bank.BankAccountDto bankAccount_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder> bankAccountBuilder_;
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             * @return Whether the bankAccount field is set.
             */
            public boolean hasBankAccount() {
                return bankAccountBuilder_ != null || bankAccount_ != null;
            }
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             * @return The bankAccount.
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto getBankAccount() {
                if (bankAccountBuilder_ == null) {
                    return bankAccount_ == null ? com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
                } else {
                    return bankAccountBuilder_.getMessage();
                }
            }
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             */
            public Builder setBankAccount(com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bankAccount_ = value;
                    onChanged();
                } else {
                    bankAccountBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             */
            public Builder setBankAccount(
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder builderForValue) {
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = builderForValue.build();
                    onChanged();
                } else {
                    bankAccountBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             */
            public Builder mergeBankAccount(com.example.tmbank.grpc.stub.Bank.BankAccountDto value) {
                if (bankAccountBuilder_ == null) {
                    if (bankAccount_ != null) {
                        bankAccount_ =
                                com.example.tmbank.grpc.stub.Bank.BankAccountDto.newBuilder(bankAccount_).mergeFrom(value).buildPartial();
                    } else {
                        bankAccount_ = value;
                    }
                    onChanged();
                } else {
                    bankAccountBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             */
            public Builder clearBankAccount() {
                if (bankAccountBuilder_ == null) {
                    bankAccount_ = null;
                    onChanged();
                } else {
                    bankAccount_ = null;
                    bankAccountBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder getBankAccountBuilder() {

                onChanged();
                return getBankAccountFieldBuilder().getBuilder();
            }
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder getBankAccountOrBuilder() {
                if (bankAccountBuilder_ != null) {
                    return bankAccountBuilder_.getMessageOrBuilder();
                } else {
                    return bankAccount_ == null ?
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto.getDefaultInstance() : bankAccount_;
                }
            }
            /**
             * <code>.BankAccountDto bankAccount = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>
            getBankAccountFieldBuilder() {
                if (bankAccountBuilder_ == null) {
                    bankAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.BankAccountDto, com.example.tmbank.grpc.stub.Bank.BankAccountDto.Builder, com.example.tmbank.grpc.stub.Bank.BankAccountDtoOrBuilder>(
                            getBankAccount(),
                            getParentForChildren(),
                            isClean());
                    bankAccount_ = null;
                }
                return bankAccountBuilder_;
            }

            private com.example.tmbank.grpc.stub.Bank.UserDto user_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.UserDto, com.example.tmbank.grpc.stub.Bank.UserDto.Builder, com.example.tmbank.grpc.stub.Bank.UserDtoOrBuilder> userBuilder_;
            /**
             * <code>.UserDto user = 5;</code>
             * @return Whether the user field is set.
             */
            public boolean hasUser() {
                return userBuilder_ != null || user_ != null;
            }
            /**
             * <code>.UserDto user = 5;</code>
             * @return The user.
             */
            public com.example.tmbank.grpc.stub.Bank.UserDto getUser() {
                if (userBuilder_ == null) {
                    return user_ == null ? com.example.tmbank.grpc.stub.Bank.UserDto.getDefaultInstance() : user_;
                } else {
                    return userBuilder_.getMessage();
                }
            }
            /**
             * <code>.UserDto user = 5;</code>
             */
            public Builder setUser(com.example.tmbank.grpc.stub.Bank.UserDto value) {
                if (userBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    user_ = value;
                    onChanged();
                } else {
                    userBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.UserDto user = 5;</code>
             */
            public Builder setUser(
                    com.example.tmbank.grpc.stub.Bank.UserDto.Builder builderForValue) {
                if (userBuilder_ == null) {
                    user_ = builderForValue.build();
                    onChanged();
                } else {
                    userBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.UserDto user = 5;</code>
             */
            public Builder mergeUser(com.example.tmbank.grpc.stub.Bank.UserDto value) {
                if (userBuilder_ == null) {
                    if (user_ != null) {
                        user_ =
                                com.example.tmbank.grpc.stub.Bank.UserDto.newBuilder(user_).mergeFrom(value).buildPartial();
                    } else {
                        user_ = value;
                    }
                    onChanged();
                } else {
                    userBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.UserDto user = 5;</code>
             */
            public Builder clearUser() {
                if (userBuilder_ == null) {
                    user_ = null;
                    onChanged();
                } else {
                    user_ = null;
                    userBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.UserDto user = 5;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.UserDto.Builder getUserBuilder() {

                onChanged();
                return getUserFieldBuilder().getBuilder();
            }
            /**
             * <code>.UserDto user = 5;</code>
             */
            public com.example.tmbank.grpc.stub.Bank.UserDtoOrBuilder getUserOrBuilder() {
                if (userBuilder_ != null) {
                    return userBuilder_.getMessageOrBuilder();
                } else {
                    return user_ == null ?
                            com.example.tmbank.grpc.stub.Bank.UserDto.getDefaultInstance() : user_;
                }
            }
            /**
             * <code>.UserDto user = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.example.tmbank.grpc.stub.Bank.UserDto, com.example.tmbank.grpc.stub.Bank.UserDto.Builder, com.example.tmbank.grpc.stub.Bank.UserDtoOrBuilder>
            getUserFieldBuilder() {
                if (userBuilder_ == null) {
                    userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.example.tmbank.grpc.stub.Bank.UserDto, com.example.tmbank.grpc.stub.Bank.UserDto.Builder, com.example.tmbank.grpc.stub.Bank.UserDtoOrBuilder>(
                            getUser(),
                            getParentForChildren(),
                            isClean());
                    user_ = null;
                }
                return userBuilder_;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:TransactionDto)
        }

        // @@protoc_insertion_point(class_scope:TransactionDto)
        private static final com.example.tmbank.grpc.stub.Bank.TransactionDto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.example.tmbank.grpc.stub.Bank.TransactionDto();
        }

        public static com.example.tmbank.grpc.stub.Bank.TransactionDto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TransactionDto>
                PARSER = new com.google.protobuf.AbstractParser<TransactionDto>() {
            @java.lang.Override
            public TransactionDto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TransactionDto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TransactionDto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TransactionDto> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.example.tmbank.grpc.stub.Bank.TransactionDto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CustomersRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CustomersRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CustomersResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CustomersResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CustomerDTO_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CustomerDTO_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CustomerByIdentityRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CustomerByIdentityRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CustomerByIdentityResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CustomerByIdentityResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CreateCustomerRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CreateCustomerRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CreateCustomerResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CreateCustomerResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_UpdateCustomerRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_UpdateCustomerRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_UpdatedCustomerDTO_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_UpdatedCustomerDTO_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_UpdateCustomerResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_UpdateCustomerResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DeleteCustomerRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DeleteCustomerRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DeleteCustomerResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DeleteCustomerResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BankAccountDto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BankAccountDto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BankAccountsRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BankAccountsRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BankAccountsResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BankAccountsResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BankAccountByRibRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BankAccountByRibRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BankAccountByRibResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BankAccountByRibResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AddBankAccountRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AddBankAccountRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AddBankAccountResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AddBankAccountResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AddWirerTransferRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AddWirerTransferRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AddWirerTransferResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AddWirerTransferResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GetTransactionsRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GetTransactionsRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GetTransactionsResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GetTransactionsResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_UserDto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_UserDto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TransactionDto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TransactionDto_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\nbank.proto\"\022\n\020CustomersRequest\"4\n\021Cust" +
                        "omersResponse\022\037\n\tcustomers\030\001 \003(\0132\014.Custo" +
                        "merDTO\"e\n\013CustomerDTO\022\n\n\002id\030\001 \001(\003\022\020\n\010use" +
                        "rname\030\002 \001(\t\022\023\n\013identityRef\030\003 \001(\t\022\021\n\tfirs" +
                        "tname\030\004 \001(\t\022\020\n\010lastname\030\005 \001(\t\"0\n\031Custome" +
                        "rByIdentityRequest\022\023\n\013identityRef\030\001 \001(\t\"" +
                        "<\n\032CustomerByIdentityResponse\022\036\n\010custome" +
                        "r\030\001 \001(\0132\014.CustomerDTO\"c\n\025CreateCustomerR" +
                        "equest\022\020\n\010username\030\001 \001(\t\022\023\n\013identityRef\030" +
                        "\002 \001(\t\022\021\n\tfirstname\030\003 \001(\t\022\020\n\010lastname\030\004 \001" +
                        "(\t\"I\n\026CreateCustomerResponse\022\017\n\007message\030" +
                        "\001 \001(\t\022\036\n\010customer\030\002 \001(\0132\014.CustomerDTO\"Z\n" +
                        "\025UpdateCustomerRequest\022\023\n\013identityRef\030\001 " +
                        "\001(\t\022,\n\017updatedCustomer\030\002 \001(\0132\023.UpdatedCu" +
                        "stomerDTO\"K\n\022UpdatedCustomerDTO\022\020\n\010usern" +
                        "ame\030\002 \001(\t\022\021\n\tfirstname\030\004 \001(\t\022\020\n\010lastname" +
                        "\030\005 \001(\t\"I\n\026UpdateCustomerResponse\022\017\n\007mess" +
                        "age\030\001 \001(\t\022\036\n\010customer\030\002 \001(\0132\014.CustomerDT" +
                        "O\",\n\025DeleteCustomerRequest\022\023\n\013identityRe" +
                        "f\030\001 \001(\t\")\n\026DeleteCustomerResponse\022\017\n\007mes" +
                        "sage\030\001 \001(\t\"\203\001\n\016BankAccountDto\022\n\n\002id\030\001 \001(" +
                        "\003\022\013\n\003rib\030\002 \001(\t\022\016\n\006amount\030\003 \001(\001\022\021\n\tcreate" +
                        "dAt\030\004 \001(\t\022\025\n\raccountStatus\030\005 \001(\t\022\036\n\010cust" +
                        "omer\030\006 \001(\0132\014.CustomerDTO\"\025\n\023BankAccounts" +
                        "Request\"<\n\024BankAccountsResponse\022$\n\013bankA" +
                        "ccount\030\001 \003(\0132\017.BankAccountDto\"&\n\027BankAcc" +
                        "ountByRibRequest\022\013\n\003rib\030\001 \001(\t\"@\n\030BankAcc" +
                        "ountByRibResponse\022$\n\013bankAccount\030\001 \001(\0132\017" +
                        ".BankAccountDto\"Q\n\025AddBankAccountRequest" +
                        "\022\013\n\003rib\030\001 \001(\t\022\016\n\006amount\030\002 \001(\001\022\033\n\023custome" +
                        "rIdentityRef\030\003 \001(\t\"O\n\026AddBankAccountResp" +
                        "onse\022\017\n\007message\030\001 \001(\t\022$\n\013bankAccount\030\002 \001" +
                        "(\0132\017.BankAccountDto\"[\n\027AddWirerTransferR" +
                        "equest\022\017\n\007ribFrom\030\001 \001(\t\022\r\n\005ribTo\030\002 \001(\t\022\016" +
                        "\n\006amount\030\003 \001(\001\022\020\n\010username\030\004 \001(\t\"}\n\030AddW" +
                        "irerTransferResponse\022\017\n\007message\030\001 \001(\t\022(\n" +
                        "\017transactionFrom\030\002 \001(\0132\017.TransactionDto\022" +
                        "&\n\rtransactionTo\030\003 \001(\0132\017.TransactionDto\"" +
                        "G\n\026GetTransactionsRequest\022\013\n\003rib\030\001 \001(\t\022\016" +
                        "\n\006dateTo\030\002 \001(\t\022\020\n\010dateFrom\030\003 \001(\t\"?\n\027GetT" +
                        "ransactionsResponse\022$\n\013transaction\030\001 \003(\013" +
                        "2\017.TransactionDto\"@\n\007UserDto\022\020\n\010username" +
                        "\030\001 \001(\t\022\021\n\tfirstname\030\002 \001(\t\022\020\n\010lastname\030\003 " +
                        "\001(\t\"\212\001\n\016TransactionDto\022\021\n\tcreatedAt\030\001 \001(" +
                        "\t\022\027\n\017transactionType\030\002 \001(\t\022\016\n\006amount\030\003 \001" +
                        "(\001\022$\n\013bankAccount\030\004 \001(\0132\017.BankAccountDto" +
                        "\022\026\n\004user\030\005 \001(\0132\010.UserDto2\261\005\n\013BankService" +
                        "\0222\n\tcustomers\022\021.CustomersRequest\032\022.Custo" +
                        "mersResponse\022M\n\022customerByIdentity\022\032.Cus" +
                        "tomerByIdentityRequest\032\033.CustomerByIdent" +
                        "ityResponse\022A\n\016createCustomer\022\026.CreateCu" +
                        "stomerRequest\032\027.CreateCustomerResponse\022A" +
                        "\n\016updateCustomer\022\026.UpdateCustomerRequest" +
                        "\032\027.UpdateCustomerResponse\022A\n\016deleteCusto" +
                        "mer\022\026.DeleteCustomerRequest\032\027.DeleteCust" +
                        "omerResponse\022;\n\014bankAccounts\022\024.BankAccou" +
                        "ntsRequest\032\025.BankAccountsResponse\022G\n\020ban" +
                        "kAccountByRib\022\030.BankAccountByRibRequest\032" +
                        "\031.BankAccountByRibResponse\022A\n\016addBankAcc" +
                        "ount\022\026.AddBankAccountRequest\032\027.AddBankAc" +
                        "countResponse\022G\n\020addWirerTransfer\022\030.AddW" +
                        "irerTransferRequest\032\031.AddWirerTransferRe" +
                        "sponse\022D\n\017getTransactions\022\027.GetTransacti" +
                        "onsRequest\032\030.GetTransactionsResponseB\031\n\027" +
                        "com.example.tmbank.grpc.stubb\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        });
        internal_static_CustomersRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_CustomersRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CustomersRequest_descriptor,
                new java.lang.String[] { });
        internal_static_CustomersResponse_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_CustomersResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CustomersResponse_descriptor,
                new java.lang.String[] { "Customers", });
        internal_static_CustomerDTO_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_CustomerDTO_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CustomerDTO_descriptor,
                new java.lang.String[] { "Id", "Username", "IdentityRef", "Firstname", "Lastname", });
        internal_static_CustomerByIdentityRequest_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_CustomerByIdentityRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CustomerByIdentityRequest_descriptor,
                new java.lang.String[] { "IdentityRef", });
        internal_static_CustomerByIdentityResponse_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_CustomerByIdentityResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CustomerByIdentityResponse_descriptor,
                new java.lang.String[] { "Customer", });
        internal_static_CreateCustomerRequest_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_CreateCustomerRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CreateCustomerRequest_descriptor,
                new java.lang.String[] { "Username", "IdentityRef", "Firstname", "Lastname", });
        internal_static_CreateCustomerResponse_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_CreateCustomerResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CreateCustomerResponse_descriptor,
                new java.lang.String[] { "Message", "Customer", });
        internal_static_UpdateCustomerRequest_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_UpdateCustomerRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_UpdateCustomerRequest_descriptor,
                new java.lang.String[] { "IdentityRef", "UpdatedCustomer", });
        internal_static_UpdatedCustomerDTO_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_UpdatedCustomerDTO_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_UpdatedCustomerDTO_descriptor,
                new java.lang.String[] { "Username", "Firstname", "Lastname", });
        internal_static_UpdateCustomerResponse_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_UpdateCustomerResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_UpdateCustomerResponse_descriptor,
                new java.lang.String[] { "Message", "Customer", });
        internal_static_DeleteCustomerRequest_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_DeleteCustomerRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_DeleteCustomerRequest_descriptor,
                new java.lang.String[] { "IdentityRef", });
        internal_static_DeleteCustomerResponse_descriptor =
                getDescriptor().getMessageTypes().get(11);
        internal_static_DeleteCustomerResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_DeleteCustomerResponse_descriptor,
                new java.lang.String[] { "Message", });
        internal_static_BankAccountDto_descriptor =
                getDescriptor().getMessageTypes().get(12);
        internal_static_BankAccountDto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BankAccountDto_descriptor,
                new java.lang.String[] { "Id", "Rib", "Amount", "CreatedAt", "AccountStatus", "Customer", });
        internal_static_BankAccountsRequest_descriptor =
                getDescriptor().getMessageTypes().get(13);
        internal_static_BankAccountsRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BankAccountsRequest_descriptor,
                new java.lang.String[] { });
        internal_static_BankAccountsResponse_descriptor =
                getDescriptor().getMessageTypes().get(14);
        internal_static_BankAccountsResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BankAccountsResponse_descriptor,
                new java.lang.String[] { "BankAccount", });
        internal_static_BankAccountByRibRequest_descriptor =
                getDescriptor().getMessageTypes().get(15);
        internal_static_BankAccountByRibRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BankAccountByRibRequest_descriptor,
                new java.lang.String[] { "Rib", });
        internal_static_BankAccountByRibResponse_descriptor =
                getDescriptor().getMessageTypes().get(16);
        internal_static_BankAccountByRibResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BankAccountByRibResponse_descriptor,
                new java.lang.String[] { "BankAccount", });
        internal_static_AddBankAccountRequest_descriptor =
                getDescriptor().getMessageTypes().get(17);
        internal_static_AddBankAccountRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_AddBankAccountRequest_descriptor,
                new java.lang.String[] { "Rib", "Amount", "CustomerIdentityRef", });
        internal_static_AddBankAccountResponse_descriptor =
                getDescriptor().getMessageTypes().get(18);
        internal_static_AddBankAccountResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_AddBankAccountResponse_descriptor,
                new java.lang.String[] { "Message", "BankAccount", });
        internal_static_AddWirerTransferRequest_descriptor =
                getDescriptor().getMessageTypes().get(19);
        internal_static_AddWirerTransferRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_AddWirerTransferRequest_descriptor,
                new java.lang.String[] { "RibFrom", "RibTo", "Amount", "Username", });
        internal_static_AddWirerTransferResponse_descriptor =
                getDescriptor().getMessageTypes().get(20);
        internal_static_AddWirerTransferResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_AddWirerTransferResponse_descriptor,
                new java.lang.String[] { "Message", "TransactionFrom", "TransactionTo", });
        internal_static_GetTransactionsRequest_descriptor =
                getDescriptor().getMessageTypes().get(21);
        internal_static_GetTransactionsRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_GetTransactionsRequest_descriptor,
                new java.lang.String[] { "Rib", "DateTo", "DateFrom", });
        internal_static_GetTransactionsResponse_descriptor =
                getDescriptor().getMessageTypes().get(22);
        internal_static_GetTransactionsResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_GetTransactionsResponse_descriptor,
                new java.lang.String[] { "Transaction", });
        internal_static_UserDto_descriptor =
                getDescriptor().getMessageTypes().get(23);
        internal_static_UserDto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_UserDto_descriptor,
                new java.lang.String[] { "Username", "Firstname", "Lastname", });
        internal_static_TransactionDto_descriptor =
                getDescriptor().getMessageTypes().get(24);
        internal_static_TransactionDto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_TransactionDto_descriptor,
                new java.lang.String[] { "CreatedAt", "TransactionType", "Amount", "BankAccount", "User", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
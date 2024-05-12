// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/fissy/dialer/rtt/rtt_transcript.proto

package com.fissy.dialer.rtt;

/**
 * <pre>
 * Single chat message inside a RTT call.
 * </pre>
 * <p>
 * Protobuf type {@code com.fissy.dialer.rtt.RttTranscriptMessage}
 */
public final class RttTranscriptMessage extends
        com.google.protobuf.GeneratedMessageLite<
                RttTranscriptMessage, RttTranscriptMessage.Builder> implements
        // @@protoc_insertion_point(message_implements:com.fissy.dialer.rtt.RttTranscriptMessage)
        RttTranscriptMessageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int IS_REMOTE_FIELD_NUMBER = 3;
    public static final int IS_FINISHED_FIELD_NUMBER = 4;
    // @@protoc_insertion_point(class_scope:com.fissy.dialer.rtt.RttTranscriptMessage)
    private static final com.fissy.dialer.rtt.RttTranscriptMessage DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<RttTranscriptMessage> PARSER;

    static {
        DEFAULT_INSTANCE = new RttTranscriptMessage();
        DEFAULT_INSTANCE.makeImmutable();
    }

    private int bitField0_;
    private java.lang.String content_;
    private long timestamp_;
    private boolean isRemote_;
    private boolean isFinished_;

    private RttTranscriptMessage() {
        content_ = "";
        timestamp_ = 0L;
        isRemote_ = false;
        isFinished_ = false;
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.fissy.dialer.rtt.RttTranscriptMessage prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.fissy.dialer.rtt.RttTranscriptMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<RttTranscriptMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /**
     * <code>optional string content = 1;</code>
     */
    public boolean hasContent() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional string content = 1;</code>
     */
    public java.lang.String getContent() {
        return content_;
    }

    /**
     * <code>optional string content = 1;</code>
     */
    private void setContent(
            java.lang.String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        content_ = value;
    }

    /**
     * <code>optional string content = 1;</code>
     */
    public com.google.protobuf.ByteString
    getContentBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(content_);
    }

    /**
     * <code>optional string content = 1;</code>
     */
    private void setContentBytes(
            com.google.protobuf.ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        content_ = value.toStringUtf8();
    }

    /**
     * <code>optional string content = 1;</code>
     */
    private void clearContent() {
        bitField0_ = (bitField0_ & ~0x00000001);
        content_ = getDefaultInstance().getContent();
    }

    /**
     * <code>optional int64 timestamp = 2;</code>
     */
    public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional int64 timestamp = 2;</code>
     */
    public long getTimestamp() {
        return timestamp_;
    }

    /**
     * <code>optional int64 timestamp = 2;</code>
     */
    private void setTimestamp(long value) {
        bitField0_ |= 0x00000002;
        timestamp_ = value;
    }

    /**
     * <code>optional int64 timestamp = 2;</code>
     */
    private void clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
    }

    /**
     * <pre>
     * Whether this message is sent from local device or received from remote
     * party.
     * </pre>
     *
     * <code>optional bool is_remote = 3;</code>
     */
    public boolean hasIsRemote() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <pre>
     * Whether this message is sent from local device or received from remote
     * party.
     * </pre>
     *
     * <code>optional bool is_remote = 3;</code>
     */
    public boolean getIsRemote() {
        return isRemote_;
    }

    /**
     * <pre>
     * Whether this message is sent from local device or received from remote
     * party.
     * </pre>
     *
     * <code>optional bool is_remote = 3;</code>
     */
    private void setIsRemote(boolean value) {
        bitField0_ |= 0x00000004;
        isRemote_ = value;
    }

    /**
     * <pre>
     * Whether this message is sent from local device or received from remote
     * party.
     * </pre>
     *
     * <code>optional bool is_remote = 3;</code>
     */
    private void clearIsRemote() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isRemote_ = false;
    }

    /**
     * <code>optional bool is_finished = 4;</code>
     */
    public boolean hasIsFinished() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bool is_finished = 4;</code>
     */
    public boolean getIsFinished() {
        return isFinished_;
    }

    /**
     * <code>optional bool is_finished = 4;</code>
     */
    private void setIsFinished(boolean value) {
        bitField0_ |= 0x00000008;
        isFinished_ = value;
    }

    /**
     * <code>optional bool is_finished = 4;</code>
     */
    private void clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isFinished_ = false;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
            output.writeString(1, getContent());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeInt64(2, timestamp_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeBool(3, isRemote_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeBool(4, isFinished_);
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeStringSize(1, getContent());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(2, timestamp_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(3, isRemote_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(4, isFinished_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSerializedSize = size;
        return size;
    }

    protected Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new com.fissy.dialer.rtt.RttTranscriptMessage();
            }
            case IS_INITIALIZED: {
                return DEFAULT_INSTANCE;
            }
            case MAKE_IMMUTABLE: {
                return null;
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case VISIT: {
                Visitor visitor = (Visitor) arg0;
                com.fissy.dialer.rtt.RttTranscriptMessage other = (com.fissy.dialer.rtt.RttTranscriptMessage) arg1;
                content_ = visitor.visitString(
                        hasContent(), content_,
                        other.hasContent(), other.content_);
                timestamp_ = visitor.visitLong(
                        hasTimestamp(), timestamp_,
                        other.hasTimestamp(), other.timestamp_);
                isRemote_ = visitor.visitBoolean(
                        hasIsRemote(), isRemote_,
                        other.hasIsRemote(), other.isRemote_);
                isFinished_ = visitor.visitBoolean(
                        hasIsFinished(), isFinished_,
                        other.hasIsFinished(), other.isFinished_);
                if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
                        .INSTANCE) {
                    bitField0_ |= other.bitField0_;
                }
                return this;
            }
            case MERGE_FROM_STREAM: {
                com.google.protobuf.CodedInputStream input =
                        (com.google.protobuf.CodedInputStream) arg0;
                com.google.protobuf.ExtensionRegistryLite extensionRegistry =
                        (com.google.protobuf.ExtensionRegistryLite) arg1;
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(tag, input)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                String s = input.readString();
                                bitField0_ |= 0x00000001;
                                content_ = s;
                                break;
                            }
                            case 16: {
                                bitField0_ |= 0x00000002;
                                timestamp_ = input.readInt64();
                                break;
                            }
                            case 24: {
                                bitField0_ |= 0x00000004;
                                isRemote_ = input.readBool();
                                break;
                            }
                            case 32: {
                                bitField0_ |= 0x00000008;
                                isFinished_ = input.readBool();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw new RuntimeException(e.setUnfinishedMessage(this));
                } catch (java.io.IOException e) {
                    throw new RuntimeException(
                            new com.google.protobuf.InvalidProtocolBufferException(
                                    e.getMessage()).setUnfinishedMessage(this));
                }
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                if (PARSER == null) {
                    synchronized (com.fissy.dialer.rtt.RttTranscriptMessage.class) {
                        if (PARSER == null) {
                            PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            }
        }
        throw new UnsupportedOperationException();
    }

    /**
     * <pre>
     * Single chat message inside a RTT call.
     * </pre>
     * <p>
     * Protobuf type {@code com.fissy.dialer.rtt.RttTranscriptMessage}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    com.fissy.dialer.rtt.RttTranscriptMessage, Builder> implements
            // @@protoc_insertion_point(builder_implements:com.fissy.dialer.rtt.RttTranscriptMessage)
            com.fissy.dialer.rtt.RttTranscriptMessageOrBuilder {
        // Construct using com.fissy.dialer.rtt.RttTranscriptMessage.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <code>optional string content = 1;</code>
         */
        public boolean hasContent() {
            return instance.hasContent();
        }

        /**
         * <code>optional string content = 1;</code>
         */
        public java.lang.String getContent() {
            return instance.getContent();
        }

        /**
         * <code>optional string content = 1;</code>
         */
        public Builder setContent(
                java.lang.String value) {
            copyOnWrite();
            instance.setContent(value);
            return this;
        }

        /**
         * <code>optional string content = 1;</code>
         */
        public com.google.protobuf.ByteString
        getContentBytes() {
            return instance.getContentBytes();
        }

        /**
         * <code>optional string content = 1;</code>
         */
        public Builder setContentBytes(
                com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setContentBytes(value);
            return this;
        }

        /**
         * <code>optional string content = 1;</code>
         */
        public Builder clearContent() {
            copyOnWrite();
            instance.clearContent();
            return this;
        }

        /**
         * <code>optional int64 timestamp = 2;</code>
         */
        public boolean hasTimestamp() {
            return instance.hasTimestamp();
        }

        /**
         * <code>optional int64 timestamp = 2;</code>
         */
        public long getTimestamp() {
            return instance.getTimestamp();
        }

        /**
         * <code>optional int64 timestamp = 2;</code>
         */
        public Builder setTimestamp(long value) {
            copyOnWrite();
            instance.setTimestamp(value);
            return this;
        }

        /**
         * <code>optional int64 timestamp = 2;</code>
         */
        public Builder clearTimestamp() {
            copyOnWrite();
            instance.clearTimestamp();
            return this;
        }

        /**
         * <pre>
         * Whether this message is sent from local device or received from remote
         * party.
         * </pre>
         *
         * <code>optional bool is_remote = 3;</code>
         */
        public boolean hasIsRemote() {
            return instance.hasIsRemote();
        }

        /**
         * <pre>
         * Whether this message is sent from local device or received from remote
         * party.
         * </pre>
         *
         * <code>optional bool is_remote = 3;</code>
         */
        public boolean getIsRemote() {
            return instance.getIsRemote();
        }

        /**
         * <pre>
         * Whether this message is sent from local device or received from remote
         * party.
         * </pre>
         *
         * <code>optional bool is_remote = 3;</code>
         */
        public Builder setIsRemote(boolean value) {
            copyOnWrite();
            instance.setIsRemote(value);
            return this;
        }

        /**
         * <pre>
         * Whether this message is sent from local device or received from remote
         * party.
         * </pre>
         *
         * <code>optional bool is_remote = 3;</code>
         */
        public Builder clearIsRemote() {
            copyOnWrite();
            instance.clearIsRemote();
            return this;
        }

        /**
         * <code>optional bool is_finished = 4;</code>
         */
        public boolean hasIsFinished() {
            return instance.hasIsFinished();
        }

        /**
         * <code>optional bool is_finished = 4;</code>
         */
        public boolean getIsFinished() {
            return instance.getIsFinished();
        }

        /**
         * <code>optional bool is_finished = 4;</code>
         */
        public Builder setIsFinished(boolean value) {
            copyOnWrite();
            instance.setIsFinished(value);
            return this;
        }

        /**
         * <code>optional bool is_finished = 4;</code>
         */
        public Builder clearIsFinished() {
            copyOnWrite();
            instance.clearIsFinished();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:com.fissy.dialer.rtt.RttTranscriptMessage)
    }
}


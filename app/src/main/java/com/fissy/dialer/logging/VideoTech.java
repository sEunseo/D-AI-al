// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/fissy/dialer/logging/video_tech.proto

package com.fissy.dialer.logging;

/**
 * Protobuf type {@code com.fissy.dialer.logging.VideoTech}
 */
public final class VideoTech extends
        com.google.protobuf.GeneratedMessageLite<
                VideoTech, VideoTech.Builder> implements
        // @@protoc_insertion_point(message_implements:com.fissy.dialer.logging.VideoTech)
        VideoTechOrBuilder {
    // @@protoc_insertion_point(class_scope:com.fissy.dialer.logging.VideoTech)
    private static final com.fissy.dialer.logging.VideoTech DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<VideoTech> PARSER;

    static {
        DEFAULT_INSTANCE = new VideoTech();
        DEFAULT_INSTANCE.makeImmutable();
    }

    private VideoTech() {
    }

    public static com.fissy.dialer.logging.VideoTech parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.fissy.dialer.logging.VideoTech parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.fissy.dialer.logging.VideoTech parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.fissy.dialer.logging.VideoTech parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.fissy.dialer.logging.VideoTech parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.fissy.dialer.logging.VideoTech parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.fissy.dialer.logging.VideoTech parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.fissy.dialer.logging.VideoTech parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.fissy.dialer.logging.VideoTech parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.fissy.dialer.logging.VideoTech parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.fissy.dialer.logging.VideoTech prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.fissy.dialer.logging.VideoTech getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<VideoTech> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        size += unknownFields.getSerializedSize();
        memoizedSerializedSize = size;
        return size;
    }

    protected Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new com.fissy.dialer.logging.VideoTech();
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
                com.fissy.dialer.logging.VideoTech other = (com.fissy.dialer.logging.VideoTech) arg1;
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
                        if (tag == 0) {
                            done = true;
                        } else {
                            if (!parseUnknownField(tag, input)) {
                                done = true;
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
                    synchronized (com.fissy.dialer.logging.VideoTech.class) {
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
     * Protobuf enum {@code com.fissy.dialer.logging.VideoTech.Type}
     */
    public enum Type
            implements com.google.protobuf.Internal.EnumLite {
        /**
         * <code>NONE = 0;</code>
         */
        NONE(0),
        /**
         * <code>IMS_VIDEO_TECH = 1;</code>
         */
        IMS_VIDEO_TECH(1),
        /**
         * <code>LIGHTBRINGER_VIDEO_TECH = 2;</code>
         */
        LIGHTBRINGER_VIDEO_TECH(2),
        /**
         * <code>RCS_VIDEO_SHARE = 3;</code>
         */
        RCS_VIDEO_SHARE(3),
        ;

        /**
         * <code>NONE = 0;</code>
         */
        public static final int NONE_VALUE = 0;
        /**
         * <code>IMS_VIDEO_TECH = 1;</code>
         */
        public static final int IMS_VIDEO_TECH_VALUE = 1;
        /**
         * <code>LIGHTBRINGER_VIDEO_TECH = 2;</code>
         */
        public static final int LIGHTBRINGER_VIDEO_TECH_VALUE = 2;
        /**
         * <code>RCS_VIDEO_SHARE = 3;</code>
         */
        public static final int RCS_VIDEO_SHARE_VALUE = 3;
        private static final com.google.protobuf.Internal.EnumLiteMap<
                Type> internalValueMap =
                number -> Type.forNumber(number);
        private final int value;

        Type(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static Type valueOf(int value) {
            return forNumber(value);
        }

        public static Type forNumber(int value) {
            switch (value) {
                case 0:
                    return NONE;
                case 1:
                    return IMS_VIDEO_TECH;
                case 2:
                    return LIGHTBRINGER_VIDEO_TECH;
                case 3:
                    return RCS_VIDEO_SHARE;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return value;
        }

        // @@protoc_insertion_point(enum_scope:com.fissy.dialer.logging.VideoTech.Type)
    }

    /**
     * Protobuf type {@code com.fissy.dialer.logging.VideoTech}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    com.fissy.dialer.logging.VideoTech, Builder> implements
            // @@protoc_insertion_point(builder_implements:com.fissy.dialer.logging.VideoTech)
            com.fissy.dialer.logging.VideoTechOrBuilder {
        // Construct using com.fissy.dialer.logging.VideoTech.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        // @@protoc_insertion_point(builder_scope:com.fissy.dialer.logging.VideoTech)
    }
}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/fissy/dialer/glidephotomanager/photo_info.proto

package com.fissy.dialer.glidephotomanager;

public interface PhotoInfoOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.fissy.dialer.glidephotomanager.PhotoInfo)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The display name of the number.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();

    /**
     * <pre>
     * The display name of the number.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();

    /**
     * <pre>
     * The display name of the number.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
    getNameBytes();

    /**
     * <pre>
     * The number presented to the user.
     * </pre>
     *
     * <code>optional string formatted_number = 2;</code>
     */
    boolean hasFormattedNumber();

    /**
     * <pre>
     * The number presented to the user.
     * </pre>
     *
     * <code>optional string formatted_number = 2;</code>
     */
    java.lang.String getFormattedNumber();

    /**
     * <pre>
     * The number presented to the user.
     * </pre>
     *
     * <code>optional string formatted_number = 2;</code>
     */
    com.google.protobuf.ByteString
    getFormattedNumberBytes();

    /**
     * <pre>
     * The URI of the photo.
     * </pre>
     *
     * <code>optional string photo_uri = 3;</code>
     */
    boolean hasPhotoUri();

    /**
     * <pre>
     * The URI of the photo.
     * </pre>
     *
     * <code>optional string photo_uri = 3;</code>
     */
    java.lang.String getPhotoUri();

    /**
     * <pre>
     * The URI of the photo.
     * </pre>
     *
     * <code>optional string photo_uri = 3;</code>
     */
    com.google.protobuf.ByteString
    getPhotoUriBytes();

    /**
     * <pre>
     * Value of android.provider.ContactsContract.CommonDataKinds.Photo#_ID
     * </pre>
     *
     * <code>optional int64 photo_id = 4;</code>
     */
    boolean hasPhotoId();

    /**
     * <pre>
     * Value of android.provider.ContactsContract.CommonDataKinds.Photo#_ID
     * </pre>
     *
     * <code>optional int64 photo_id = 4;</code>
     */
    long getPhotoId();

    /**
     * <pre>
     * The Contacts Provider lookup URI for the contact associated with the
     * number.
     * </pre>
     *
     * <code>optional string lookup_uri = 5;</code>
     */
    boolean hasLookupUri();

    /**
     * <pre>
     * The Contacts Provider lookup URI for the contact associated with the
     * number.
     * </pre>
     *
     * <code>optional string lookup_uri = 5;</code>
     */
    java.lang.String getLookupUri();

    /**
     * <pre>
     * The Contacts Provider lookup URI for the contact associated with the
     * number.
     * </pre>
     *
     * <code>optional string lookup_uri = 5;</code>
     */
    com.google.protobuf.ByteString
    getLookupUriBytes();

    /**
     * <pre>
     * Whether a business icon should be displayed.
     * </pre>
     *
     * <code>optional bool is_business = 6;</code>
     */
    boolean hasIsBusiness();

    /**
     * <pre>
     * Whether a business icon should be displayed.
     * </pre>
     *
     * <code>optional bool is_business = 6;</code>
     */
    boolean getIsBusiness();

    /**
     * <pre>
     * Whether a voicemail icon should be displayed.
     * </pre>
     *
     * <code>optional bool is_voicemail = 7;</code>
     */
    boolean hasIsVoicemail();

    /**
     * <pre>
     * Whether a voicemail icon should be displayed.
     * </pre>
     *
     * <code>optional bool is_voicemail = 7;</code>
     */
    boolean getIsVoicemail();

    /**
     * <pre>
     * Whether a "blocked" icon should be displayed.
     * </pre>
     *
     * <code>optional bool is_blocked = 8;</code>
     */
    boolean hasIsBlocked();

    /**
     * <pre>
     * Whether a "blocked" icon should be displayed.
     * </pre>
     *
     * <code>optional bool is_blocked = 8;</code>
     */
    boolean getIsBlocked();

    /**
     * <pre>
     * Whether a "spam" icon should be displayed.
     * </pre>
     *
     * <code>optional bool is_spam = 9;</code>
     */
    boolean hasIsSpam();

    /**
     * <pre>
     * Whether a "spam" icon should be displayed.
     * </pre>
     *
     * <code>optional bool is_spam = 9;</code>
     */
    boolean getIsSpam();

    /**
     * <pre>
     * Whether the photo should be badged as video call.
     * </pre>
     *
     * <code>optional bool is_video = 10;</code>
     */
    boolean hasIsVideo();

    /**
     * <pre>
     * Whether the photo should be badged as video call.
     * </pre>
     *
     * <code>optional bool is_video = 10;</code>
     */
    boolean getIsVideo();

    /**
     * <pre>
     * Whether the photo should be badged as RTT call.
     * </pre>
     *
     * <code>optional bool is_rtt = 11;</code>
     */
    boolean hasIsRtt();

    /**
     * <pre>
     * Whether the photo should be badged as RTT call.
     * </pre>
     *
     * <code>optional bool is_rtt = 11;</code>
     */
    boolean getIsRtt();

    /**
     * <pre>
     * Whether to show conference call icon instead of contact icon.
     * </pre>
     *
     * <code>optional bool is_conference = 12;</code>
     */
    boolean hasIsConference();

    /**
     * <pre>
     * Whether to show conference call icon instead of contact icon.
     * </pre>
     *
     * <code>optional bool is_conference = 12;</code>
     */
    boolean getIsConference();
}

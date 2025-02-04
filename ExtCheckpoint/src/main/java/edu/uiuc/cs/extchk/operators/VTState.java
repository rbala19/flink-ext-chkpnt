package edu.uiuc.cs.extchk.operators;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vtrecord.proto

/**
 * Protobuf type {@code VTState}
 */
public  final class VTState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VTState)
    VTStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VTState.newBuilder() to construct.
  private VTState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VTState() {
    vt_ = emptyIntList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VTState(
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
          case 8: {
            bitField0_ |= 0x00000001;
            offset_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              vt_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            vt_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              vt_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              vt_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        vt_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Vtrecord.internal_static_VTState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Vtrecord.internal_static_VTState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            VTState.class, VTState.Builder.class);
  }

  private int bitField0_;
  public static final int OFFSET_FIELD_NUMBER = 1;
  private int offset_;
  /**
   * <code>optional int32 offset = 1;</code>
   */
  public boolean hasOffset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 offset = 1;</code>
   */
  public int getOffset() {
    return offset_;
  }

  public static final int VT_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList vt_;
  /**
   * <code>repeated int32 vt = 2;</code>
   */
  public java.util.List<java.lang.Integer>
      getVtList() {
    return vt_;
  }
  /**
   * <code>repeated int32 vt = 2;</code>
   */
  public int getVtCount() {
    return vt_.size();
  }
  /**
   * <code>repeated int32 vt = 2;</code>
   */
  public int getVt(int index) {
    return vt_.getInt(index);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, offset_);
    }
    for (int i = 0; i < vt_.size(); i++) {
      output.writeInt32(2, vt_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, offset_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < vt_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(vt_.getInt(i));
      }
      size += dataSize;
      size += 1 * getVtList().size();
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
    if (!(obj instanceof VTState)) {
      return super.equals(obj);
    }
    VTState other = (VTState) obj;

    if (hasOffset() != other.hasOffset()) return false;
    if (hasOffset()) {
      if (getOffset()
          != other.getOffset()) return false;
    }
    if (!getVtList()
        .equals(other.getVtList())) return false;
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
    if (hasOffset()) {
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getOffset();
    }
    if (getVtCount() > 0) {
      hash = (37 * hash) + VT_FIELD_NUMBER;
      hash = (53 * hash) + getVtList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static VTState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VTState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VTState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VTState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VTState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VTState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VTState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VTState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static VTState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static VTState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static VTState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VTState parseFrom(
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
  public static Builder newBuilder(VTState prototype) {
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
   * Protobuf type {@code VTState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VTState)
      VTStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Vtrecord.internal_static_VTState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Vtrecord.internal_static_VTState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VTState.class, VTState.Builder.class);
    }

    // Construct using VTState.newBuilder()
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
      offset_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      vt_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Vtrecord.internal_static_VTState_descriptor;
    }

    @java.lang.Override
    public VTState getDefaultInstanceForType() {
      return VTState.getDefaultInstance();
    }

    @java.lang.Override
    public VTState build() {
      VTState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public VTState buildPartial() {
      VTState result = new VTState(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.offset_ = offset_;
        to_bitField0_ |= 0x00000001;
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        vt_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.vt_ = vt_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof VTState) {
        return mergeFrom((VTState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(VTState other) {
      if (other == VTState.getDefaultInstance()) return this;
      if (other.hasOffset()) {
        setOffset(other.getOffset());
      }
      if (!other.vt_.isEmpty()) {
        if (vt_.isEmpty()) {
          vt_ = other.vt_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureVtIsMutable();
          vt_.addAll(other.vt_);
        }
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
      VTState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (VTState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int offset_ ;
    /**
     * <code>optional int32 offset = 1;</code>
     */
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 offset = 1;</code>
     */
    public int getOffset() {
      return offset_;
    }
    /**
     * <code>optional int32 offset = 1;</code>
     */
    public Builder setOffset(int value) {
      bitField0_ |= 0x00000001;
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 offset = 1;</code>
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      offset_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList vt_ = emptyIntList();
    private void ensureVtIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        vt_ = mutableCopy(vt_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 vt = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getVtList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(vt_) : vt_;
    }
    /**
     * <code>repeated int32 vt = 2;</code>
     */
    public int getVtCount() {
      return vt_.size();
    }
    /**
     * <code>repeated int32 vt = 2;</code>
     */
    public int getVt(int index) {
      return vt_.getInt(index);
    }
    /**
     * <code>repeated int32 vt = 2;</code>
     */
    public Builder setVt(
        int index, int value) {
      ensureVtIsMutable();
      vt_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vt = 2;</code>
     */
    public Builder addVt(int value) {
      ensureVtIsMutable();
      vt_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vt = 2;</code>
     */
    public Builder addAllVt(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureVtIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, vt_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vt = 2;</code>
     */
    public Builder clearVt() {
      vt_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:VTState)
  }

  // @@protoc_insertion_point(class_scope:VTState)
  private static final VTState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VTState();
  }

  public static VTState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<VTState>
      PARSER = new com.google.protobuf.AbstractParser<VTState>() {
    @java.lang.Override
    public VTState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VTState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VTState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VTState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public VTState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


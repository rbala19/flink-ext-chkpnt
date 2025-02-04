package edu.uiuc.cs.extchk.operators;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reduceopstate.proto

/**
 * Protobuf type {@code ReduceOperatorState}
 */
public  final class ReduceOperatorState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReduceOperatorState)
    ReduceOperatorStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReduceOperatorState.newBuilder() to construct.
  private ReduceOperatorState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReduceOperatorState() {
    vTimestamp_ = emptyIntList();
    operatorType_ = 3;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReduceOperatorState(
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
            wordCount_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              vTimestamp_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            vTimestamp_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              vTimestamp_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              vTimestamp_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              inputCounts_ = com.google.protobuf.MapField.newMapField(
                  InputCountsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
            inputCounts__ = input.readMessage(
                InputCountsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            inputCounts_.getMutableMap().put(
                inputCounts__.getKey(), inputCounts__.getValue());
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              outputCounts_ = com.google.protobuf.MapField.newMapField(
                  OutputCountsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000008;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
            outputCounts__ = input.readMessage(
                OutputCountsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            outputCounts_.getMutableMap().put(
                outputCounts__.getKey(), outputCounts__.getValue());
            break;
          }
          case 40: {
            bitField0_ |= 0x00000002;
            operatorType_ = input.readInt32();
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
        vTimestamp_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Reduceopstate.internal_static_ReduceOperatorState_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetInputCounts();
      case 4:
        return internalGetOutputCounts();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Reduceopstate.internal_static_ReduceOperatorState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ReduceOperatorState.class, ReduceOperatorState.Builder.class);
  }

  private int bitField0_;
  public static final int WORDCOUNT_FIELD_NUMBER = 1;
  private int wordCount_;
  /**
   * <code>optional int32 wordCount = 1;</code>
   */
  public boolean hasWordCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 wordCount = 1;</code>
   */
  public int getWordCount() {
    return wordCount_;
  }

  public static final int VTIMESTAMP_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList vTimestamp_;
  /**
   * <code>repeated int32 vTimestamp = 2;</code>
   */
  public java.util.List<java.lang.Integer>
      getVTimestampList() {
    return vTimestamp_;
  }
  /**
   * <code>repeated int32 vTimestamp = 2;</code>
   */
  public int getVTimestampCount() {
    return vTimestamp_.size();
  }
  /**
   * <code>repeated int32 vTimestamp = 2;</code>
   */
  public int getVTimestamp(int index) {
    return vTimestamp_.getInt(index);
  }

  public static final int INPUTCOUNTS_FIELD_NUMBER = 3;
  private static final class InputCountsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                Reduceopstate.internal_static_ReduceOperatorState_InputCountsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Integer> inputCounts_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
  internalGetInputCounts() {
    if (inputCounts_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          InputCountsDefaultEntryHolder.defaultEntry);
    }
    return inputCounts_;
  }

  public int getInputCountsCount() {
    return internalGetInputCounts().getMap().size();
  }
  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */

  public boolean containsInputCounts(
      int key) {
    
    return internalGetInputCounts().getMap().containsKey(key);
  }
  /**
   * Use {@link #getInputCountsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Integer> getInputCounts() {
    return getInputCountsMap();
  }
  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */

  public java.util.Map<java.lang.Integer, java.lang.Integer> getInputCountsMap() {
    return internalGetInputCounts().getMap();
  }
  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */

  public int getInputCountsOrDefault(
      int key,
      int defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetInputCounts().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */

  public int getInputCountsOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetInputCounts().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int OUTPUTCOUNTS_FIELD_NUMBER = 4;
  private static final class OutputCountsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                Reduceopstate.internal_static_ReduceOperatorState_OutputCountsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Integer> outputCounts_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
  internalGetOutputCounts() {
    if (outputCounts_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          OutputCountsDefaultEntryHolder.defaultEntry);
    }
    return outputCounts_;
  }

  public int getOutputCountsCount() {
    return internalGetOutputCounts().getMap().size();
  }
  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */

  public boolean containsOutputCounts(
      int key) {
    
    return internalGetOutputCounts().getMap().containsKey(key);
  }
  /**
   * Use {@link #getOutputCountsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Integer> getOutputCounts() {
    return getOutputCountsMap();
  }
  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */

  public java.util.Map<java.lang.Integer, java.lang.Integer> getOutputCountsMap() {
    return internalGetOutputCounts().getMap();
  }
  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */

  public int getOutputCountsOrDefault(
      int key,
      int defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetOutputCounts().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */

  public int getOutputCountsOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetOutputCounts().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int OPERATORTYPE_FIELD_NUMBER = 5;
  private int operatorType_;
  /**
   * <code>optional int32 OperatorType = 5 [default = 3];</code>
   */
  public boolean hasOperatorType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 OperatorType = 5 [default = 3];</code>
   */
  public int getOperatorType() {
    return operatorType_;
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
      output.writeInt32(1, wordCount_);
    }
    for (int i = 0; i < vTimestamp_.size(); i++) {
      output.writeInt32(2, vTimestamp_.getInt(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetInputCounts(),
        InputCountsDefaultEntryHolder.defaultEntry,
        3);
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetOutputCounts(),
        OutputCountsDefaultEntryHolder.defaultEntry,
        4);
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(5, operatorType_);
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
        .computeInt32Size(1, wordCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < vTimestamp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(vTimestamp_.getInt(i));
      }
      size += dataSize;
      size += 1 * getVTimestampList().size();
    }
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
         : internalGetInputCounts().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
      inputCounts__ = InputCountsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, inputCounts__);
    }
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
         : internalGetOutputCounts().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
      outputCounts__ = OutputCountsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, outputCounts__);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, operatorType_);
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
    if (!(obj instanceof ReduceOperatorState)) {
      return super.equals(obj);
    }
    ReduceOperatorState other = (ReduceOperatorState) obj;

    if (hasWordCount() != other.hasWordCount()) return false;
    if (hasWordCount()) {
      if (getWordCount()
          != other.getWordCount()) return false;
    }
    if (!getVTimestampList()
        .equals(other.getVTimestampList())) return false;
    if (!internalGetInputCounts().equals(
        other.internalGetInputCounts())) return false;
    if (!internalGetOutputCounts().equals(
        other.internalGetOutputCounts())) return false;
    if (hasOperatorType() != other.hasOperatorType()) return false;
    if (hasOperatorType()) {
      if (getOperatorType()
          != other.getOperatorType()) return false;
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
    if (hasWordCount()) {
      hash = (37 * hash) + WORDCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getWordCount();
    }
    if (getVTimestampCount() > 0) {
      hash = (37 * hash) + VTIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getVTimestampList().hashCode();
    }
    if (!internalGetInputCounts().getMap().isEmpty()) {
      hash = (37 * hash) + INPUTCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetInputCounts().hashCode();
    }
    if (!internalGetOutputCounts().getMap().isEmpty()) {
      hash = (37 * hash) + OUTPUTCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetOutputCounts().hashCode();
    }
    if (hasOperatorType()) {
      hash = (37 * hash) + OPERATORTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getOperatorType();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ReduceOperatorState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReduceOperatorState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReduceOperatorState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReduceOperatorState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReduceOperatorState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReduceOperatorState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReduceOperatorState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReduceOperatorState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReduceOperatorState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ReduceOperatorState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReduceOperatorState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReduceOperatorState parseFrom(
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
  public static Builder newBuilder(ReduceOperatorState prototype) {
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
   * Protobuf type {@code ReduceOperatorState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReduceOperatorState)
      ReduceOperatorStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Reduceopstate.internal_static_ReduceOperatorState_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetInputCounts();
        case 4:
          return internalGetOutputCounts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableInputCounts();
        case 4:
          return internalGetMutableOutputCounts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Reduceopstate.internal_static_ReduceOperatorState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReduceOperatorState.class, ReduceOperatorState.Builder.class);
    }

    // Construct using ReduceOperatorState.newBuilder()
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
      wordCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      vTimestamp_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableInputCounts().clear();
      internalGetMutableOutputCounts().clear();
      operatorType_ = 3;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Reduceopstate.internal_static_ReduceOperatorState_descriptor;
    }

    @java.lang.Override
    public ReduceOperatorState getDefaultInstanceForType() {
      return ReduceOperatorState.getDefaultInstance();
    }

    @java.lang.Override
    public ReduceOperatorState build() {
      ReduceOperatorState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ReduceOperatorState buildPartial() {
      ReduceOperatorState result = new ReduceOperatorState(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wordCount_ = wordCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        vTimestamp_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.vTimestamp_ = vTimestamp_;
      result.inputCounts_ = internalGetInputCounts();
      result.inputCounts_.makeImmutable();
      result.outputCounts_ = internalGetOutputCounts();
      result.outputCounts_.makeImmutable();
      if (((from_bitField0_ & 0x00000010) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.operatorType_ = operatorType_;
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
      if (other instanceof ReduceOperatorState) {
        return mergeFrom((ReduceOperatorState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ReduceOperatorState other) {
      if (other == ReduceOperatorState.getDefaultInstance()) return this;
      if (other.hasWordCount()) {
        setWordCount(other.getWordCount());
      }
      if (!other.vTimestamp_.isEmpty()) {
        if (vTimestamp_.isEmpty()) {
          vTimestamp_ = other.vTimestamp_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureVTimestampIsMutable();
          vTimestamp_.addAll(other.vTimestamp_);
        }
        onChanged();
      }
      internalGetMutableInputCounts().mergeFrom(
          other.internalGetInputCounts());
      internalGetMutableOutputCounts().mergeFrom(
          other.internalGetOutputCounts());
      if (other.hasOperatorType()) {
        setOperatorType(other.getOperatorType());
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
      ReduceOperatorState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ReduceOperatorState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int wordCount_ ;
    /**
     * <code>optional int32 wordCount = 1;</code>
     */
    public boolean hasWordCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 wordCount = 1;</code>
     */
    public int getWordCount() {
      return wordCount_;
    }
    /**
     * <code>optional int32 wordCount = 1;</code>
     */
    public Builder setWordCount(int value) {
      bitField0_ |= 0x00000001;
      wordCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 wordCount = 1;</code>
     */
    public Builder clearWordCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wordCount_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList vTimestamp_ = emptyIntList();
    private void ensureVTimestampIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        vTimestamp_ = mutableCopy(vTimestamp_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 vTimestamp = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getVTimestampList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(vTimestamp_) : vTimestamp_;
    }
    /**
     * <code>repeated int32 vTimestamp = 2;</code>
     */
    public int getVTimestampCount() {
      return vTimestamp_.size();
    }
    /**
     * <code>repeated int32 vTimestamp = 2;</code>
     */
    public int getVTimestamp(int index) {
      return vTimestamp_.getInt(index);
    }
    /**
     * <code>repeated int32 vTimestamp = 2;</code>
     */
    public Builder setVTimestamp(
        int index, int value) {
      ensureVTimestampIsMutable();
      vTimestamp_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vTimestamp = 2;</code>
     */
    public Builder addVTimestamp(int value) {
      ensureVTimestampIsMutable();
      vTimestamp_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vTimestamp = 2;</code>
     */
    public Builder addAllVTimestamp(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureVTimestampIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, vTimestamp_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vTimestamp = 2;</code>
     */
    public Builder clearVTimestamp() {
      vTimestamp_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> inputCounts_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetInputCounts() {
      if (inputCounts_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            InputCountsDefaultEntryHolder.defaultEntry);
      }
      return inputCounts_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetMutableInputCounts() {
      onChanged();;
      if (inputCounts_ == null) {
        inputCounts_ = com.google.protobuf.MapField.newMapField(
            InputCountsDefaultEntryHolder.defaultEntry);
      }
      if (!inputCounts_.isMutable()) {
        inputCounts_ = inputCounts_.copy();
      }
      return inputCounts_;
    }

    public int getInputCountsCount() {
      return internalGetInputCounts().getMap().size();
    }
    /**
     * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
     */

    public boolean containsInputCounts(
        int key) {
      
      return internalGetInputCounts().getMap().containsKey(key);
    }
    /**
     * Use {@link #getInputCountsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getInputCounts() {
      return getInputCountsMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.Integer> getInputCountsMap() {
      return internalGetInputCounts().getMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
     */

    public int getInputCountsOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetInputCounts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
     */

    public int getInputCountsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetInputCounts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearInputCounts() {
      internalGetMutableInputCounts().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
     */

    public Builder removeInputCounts(
        int key) {
      
      internalGetMutableInputCounts().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer>
    getMutableInputCounts() {
      return internalGetMutableInputCounts().getMutableMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
     */
    public Builder putInputCounts(
        int key,
        int value) {
      
      
      internalGetMutableInputCounts().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
     */

    public Builder putAllInputCounts(
        java.util.Map<java.lang.Integer, java.lang.Integer> values) {
      internalGetMutableInputCounts().getMutableMap()
          .putAll(values);
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> outputCounts_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetOutputCounts() {
      if (outputCounts_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            OutputCountsDefaultEntryHolder.defaultEntry);
      }
      return outputCounts_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetMutableOutputCounts() {
      onChanged();;
      if (outputCounts_ == null) {
        outputCounts_ = com.google.protobuf.MapField.newMapField(
            OutputCountsDefaultEntryHolder.defaultEntry);
      }
      if (!outputCounts_.isMutable()) {
        outputCounts_ = outputCounts_.copy();
      }
      return outputCounts_;
    }

    public int getOutputCountsCount() {
      return internalGetOutputCounts().getMap().size();
    }
    /**
     * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
     */

    public boolean containsOutputCounts(
        int key) {
      
      return internalGetOutputCounts().getMap().containsKey(key);
    }
    /**
     * Use {@link #getOutputCountsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getOutputCounts() {
      return getOutputCountsMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.Integer> getOutputCountsMap() {
      return internalGetOutputCounts().getMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
     */

    public int getOutputCountsOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetOutputCounts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
     */

    public int getOutputCountsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetOutputCounts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearOutputCounts() {
      internalGetMutableOutputCounts().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
     */

    public Builder removeOutputCounts(
        int key) {
      
      internalGetMutableOutputCounts().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer>
    getMutableOutputCounts() {
      return internalGetMutableOutputCounts().getMutableMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
     */
    public Builder putOutputCounts(
        int key,
        int value) {
      
      
      internalGetMutableOutputCounts().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
     */

    public Builder putAllOutputCounts(
        java.util.Map<java.lang.Integer, java.lang.Integer> values) {
      internalGetMutableOutputCounts().getMutableMap()
          .putAll(values);
      return this;
    }

    private int operatorType_ = 3;
    /**
     * <code>optional int32 OperatorType = 5 [default = 3];</code>
     */
    public boolean hasOperatorType() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int32 OperatorType = 5 [default = 3];</code>
     */
    public int getOperatorType() {
      return operatorType_;
    }
    /**
     * <code>optional int32 OperatorType = 5 [default = 3];</code>
     */
    public Builder setOperatorType(int value) {
      bitField0_ |= 0x00000010;
      operatorType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 OperatorType = 5 [default = 3];</code>
     */
    public Builder clearOperatorType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      operatorType_ = 3;
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


    // @@protoc_insertion_point(builder_scope:ReduceOperatorState)
  }

  // @@protoc_insertion_point(class_scope:ReduceOperatorState)
  private static final ReduceOperatorState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReduceOperatorState();
  }

  public static ReduceOperatorState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ReduceOperatorState>
      PARSER = new com.google.protobuf.AbstractParser<ReduceOperatorState>() {
    @java.lang.Override
    public ReduceOperatorState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReduceOperatorState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReduceOperatorState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReduceOperatorState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ReduceOperatorState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


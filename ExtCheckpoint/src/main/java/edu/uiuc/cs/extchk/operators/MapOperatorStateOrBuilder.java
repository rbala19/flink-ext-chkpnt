package edu.uiuc.cs.extchk.operators;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mapopstate.proto

public interface MapOperatorStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MapOperatorState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 ID = 1;</code>
   */
  boolean hasID();
  /**
   * <code>optional int32 ID = 1;</code>
   */
  int getID();

  /**
   * <code>repeated int32 vTimestamp = 2;</code>
   */
  java.util.List<java.lang.Integer> getVTimestampList();
  /**
   * <code>repeated int32 vTimestamp = 2;</code>
   */
  int getVTimestampCount();
  /**
   * <code>repeated int32 vTimestamp = 2;</code>
   */
  int getVTimestamp(int index);

  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */
  int getInputCountsCount();
  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */
  boolean containsInputCounts(
      int key);
  /**
   * Use {@link #getInputCountsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getInputCounts();
  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getInputCountsMap();
  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */

  int getInputCountsOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;int32, int32&gt; InputCounts = 3;</code>
   */

  int getInputCountsOrThrow(
      int key);

  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */
  int getOutputCountsCount();
  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */
  boolean containsOutputCounts(
      int key);
  /**
   * Use {@link #getOutputCountsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getOutputCounts();
  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getOutputCountsMap();
  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */

  int getOutputCountsOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;int32, int32&gt; OutputCounts = 4;</code>
   */

  int getOutputCountsOrThrow(
      int key);

  /**
   * <code>optional int32 OperatorType = 5 [default = 2];</code>
   */
  boolean hasOperatorType();
  /**
   * <code>optional int32 OperatorType = 5 [default = 2];</code>
   */
  int getOperatorType();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/meta_graph.proto

package org.tensorflow.proto.framework;

public interface CollectionDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CollectionDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.CollectionDef.NodeList node_list = 1;</code>
   */
  boolean hasNodeList();
  /**
   * <code>.tensorflow.CollectionDef.NodeList node_list = 1;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.NodeList getNodeList();
  /**
   * <code>.tensorflow.CollectionDef.NodeList node_list = 1;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.NodeListOrBuilder getNodeListOrBuilder();

  /**
   * <code>.tensorflow.CollectionDef.BytesList bytes_list = 2;</code>
   */
  boolean hasBytesList();
  /**
   * <code>.tensorflow.CollectionDef.BytesList bytes_list = 2;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.BytesList getBytesList();
  /**
   * <code>.tensorflow.CollectionDef.BytesList bytes_list = 2;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.BytesListOrBuilder getBytesListOrBuilder();

  /**
   * <code>.tensorflow.CollectionDef.Int64List int64_list = 3;</code>
   */
  boolean hasInt64List();
  /**
   * <code>.tensorflow.CollectionDef.Int64List int64_list = 3;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.Int64List getInt64List();
  /**
   * <code>.tensorflow.CollectionDef.Int64List int64_list = 3;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.Int64ListOrBuilder getInt64ListOrBuilder();

  /**
   * <code>.tensorflow.CollectionDef.FloatList float_list = 4;</code>
   */
  boolean hasFloatList();
  /**
   * <code>.tensorflow.CollectionDef.FloatList float_list = 4;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.FloatList getFloatList();
  /**
   * <code>.tensorflow.CollectionDef.FloatList float_list = 4;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.FloatListOrBuilder getFloatListOrBuilder();

  /**
   * <code>.tensorflow.CollectionDef.AnyList any_list = 5;</code>
   */
  boolean hasAnyList();
  /**
   * <code>.tensorflow.CollectionDef.AnyList any_list = 5;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.AnyList getAnyList();
  /**
   * <code>.tensorflow.CollectionDef.AnyList any_list = 5;</code>
   */
  org.tensorflow.proto.framework.CollectionDef.AnyListOrBuilder getAnyListOrBuilder();

  public org.tensorflow.proto.framework.CollectionDef.KindCase getKindCase();
}
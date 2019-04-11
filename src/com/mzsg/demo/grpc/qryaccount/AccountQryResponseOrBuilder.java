// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AccountQry.proto

package com.mzsg.demo.grpc.qryaccount;

public interface AccountQryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:accountService.AccountQryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *请求流水
   * </pre>
   *
   * <code>string requestId = 1;</code>
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   *请求流水
   * </pre>
   *
   * <code>string requestId = 1;</code>
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   *返回码，1:成功; -1:失败
   * </pre>
   *
   * <code>int32 rc = 2;</code>
   */
  int getRc();

  /**
   * <pre>
   *错误消息
   * </pre>
   *
   * <code>string msg = 3;</code>
   */
  java.lang.String getMsg();
  /**
   * <pre>
   *错误消息
   * </pre>
   *
   * <code>string msg = 3;</code>
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <pre>
   *账户余额
   * </pre>
   *
   * <code>int32 amount = 4;</code>
   */
  int getAmount();
}

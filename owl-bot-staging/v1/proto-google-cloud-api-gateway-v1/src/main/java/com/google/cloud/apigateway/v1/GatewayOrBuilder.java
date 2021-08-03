// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigateway/v1/apigateway.proto

package com.google.cloud.apigateway.v1;

public interface GatewayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigateway.v1.Gateway)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the Gateway.
   * Format: projects/{project}/locations/{location}/gateways/{gateway}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the Gateway.
   * Format: projects/{project}/locations/{location}/gateways/{gateway}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Created time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Created time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Created time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Updated time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Updated time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Updated time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. Display name.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Optional. Display name.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Required. Resource name of the API Config for this Gateway.
   * Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}
   * </pre>
   *
   * <code>string api_config = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The apiConfig.
   */
  java.lang.String getApiConfig();
  /**
   * <pre>
   * Required. Resource name of the API Config for this Gateway.
   * Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}
   * </pre>
   *
   * <code>string api_config = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for apiConfig.
   */
  com.google.protobuf.ByteString
      getApiConfigBytes();

  /**
   * <pre>
   * Output only. The current state of the Gateway.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.Gateway.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current state of the Gateway.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.Gateway.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.apigateway.v1.Gateway.State getState();

  /**
   * <pre>
   * Output only. The default API Gateway host name of the form
   * `{gateway_id}-{hash}.{region_code}.gateway.dev`.
   * </pre>
   *
   * <code>string default_hostname = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The defaultHostname.
   */
  java.lang.String getDefaultHostname();
  /**
   * <pre>
   * Output only. The default API Gateway host name of the form
   * `{gateway_id}-{hash}.{region_code}.gateway.dev`.
   * </pre>
   *
   * <code>string default_hostname = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for defaultHostname.
   */
  com.google.protobuf.ByteString
      getDefaultHostnameBytes();
}
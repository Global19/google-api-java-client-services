/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * Capabilities of the remote execution system.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2ExecutionCapabilities extends com.google.api.client.json.GenericJson {

  /**
   * Remote execution may only support a single digest function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String digestFunction;

  /**
   * Whether remote execution is enabled for the particular server/instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean execEnabled;

  /**
   * Supported execution priority range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2PriorityCapabilities executionPriorityCapabilities;

  /**
   * Remote execution may only support a single digest function.
   * @return value or {@code null} for none
   */
  public java.lang.String getDigestFunction() {
    return digestFunction;
  }

  /**
   * Remote execution may only support a single digest function.
   * @param digestFunction digestFunction or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutionCapabilities setDigestFunction(java.lang.String digestFunction) {
    this.digestFunction = digestFunction;
    return this;
  }

  /**
   * Whether remote execution is enabled for the particular server/instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExecEnabled() {
    return execEnabled;
  }

  /**
   * Whether remote execution is enabled for the particular server/instance.
   * @param execEnabled execEnabled or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutionCapabilities setExecEnabled(java.lang.Boolean execEnabled) {
    this.execEnabled = execEnabled;
    return this;
  }

  /**
   * Supported execution priority range.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2PriorityCapabilities getExecutionPriorityCapabilities() {
    return executionPriorityCapabilities;
  }

  /**
   * Supported execution priority range.
   * @param executionPriorityCapabilities executionPriorityCapabilities or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutionCapabilities setExecutionPriorityCapabilities(BuildBazelRemoteExecutionV2PriorityCapabilities executionPriorityCapabilities) {
    this.executionPriorityCapabilities = executionPriorityCapabilities;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2ExecutionCapabilities set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2ExecutionCapabilities) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2ExecutionCapabilities clone() {
    return (BuildBazelRemoteExecutionV2ExecutionCapabilities) super.clone();
  }

}

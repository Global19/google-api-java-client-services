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

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * DEPRECATED - use CommandResult instead. Can be used as part of CompleteRequest.metadata, or are
 * part of a more sophisticated message.
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
public final class GoogleDevtoolsRemoteworkersV1test2CommandOverhead extends com.google.api.client.json.GenericJson {

  /**
   * The elapsed time between calling Accept and Complete. The server will also have its own idea of
   * what this should be, but this excludes the overhead of the RPCs and the bot response time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * The amount of time *not* spent executing the command (ie uploading/downloading files).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String overhead;

  /**
   * The elapsed time between calling Accept and Complete. The server will also have its own idea of
   * what this should be, but this excludes the overhead of the RPCs and the bot response time.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * The elapsed time between calling Accept and Complete. The server will also have its own idea of
   * what this should be, but this excludes the overhead of the RPCs and the bot response time.
   * @param duration duration or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandOverhead setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The amount of time *not* spent executing the command (ie uploading/downloading files).
   * @return value or {@code null} for none
   */
  public String getOverhead() {
    return overhead;
  }

  /**
   * The amount of time *not* spent executing the command (ie uploading/downloading files).
   * @param overhead overhead or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandOverhead setOverhead(String overhead) {
    this.overhead = overhead;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandOverhead set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteworkersV1test2CommandOverhead) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandOverhead clone() {
    return (GoogleDevtoolsRemoteworkersV1test2CommandOverhead) super.clone();
  }

}

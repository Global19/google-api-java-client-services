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

package com.google.api.services.monitoring.v3.model;

/**
 * The protocol for the ValidateUptimeCheckConfigResponse response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ValidateUptimeCheckConfigResponse extends com.google.api.client.json.GenericJson {

  /**
   * The results of the uptime check execution (includes one result per group member, up to a
   * maximum of 3 randomly selected group members).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UptimeCheckResult> uptimeCheckResults;

  static {
    // hack to force ProGuard to consider UptimeCheckResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(UptimeCheckResult.class);
  }

  /**
   * The results of the uptime check execution (includes one result per group member, up to a
   * maximum of 3 randomly selected group members).
   * @return value or {@code null} for none
   */
  public java.util.List<UptimeCheckResult> getUptimeCheckResults() {
    return uptimeCheckResults;
  }

  /**
   * The results of the uptime check execution (includes one result per group member, up to a
   * maximum of 3 randomly selected group members).
   * @param uptimeCheckResults uptimeCheckResults or {@code null} for none
   */
  public ValidateUptimeCheckConfigResponse setUptimeCheckResults(java.util.List<UptimeCheckResult> uptimeCheckResults) {
    this.uptimeCheckResults = uptimeCheckResults;
    return this;
  }

  @Override
  public ValidateUptimeCheckConfigResponse set(String fieldName, Object value) {
    return (ValidateUptimeCheckConfigResponse) super.set(fieldName, value);
  }

  @Override
  public ValidateUptimeCheckConfigResponse clone() {
    return (ValidateUptimeCheckConfigResponse) super.clone();
  }

}

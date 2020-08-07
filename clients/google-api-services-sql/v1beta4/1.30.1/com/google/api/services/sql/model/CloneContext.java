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

package com.google.api.services.sql.model;

/**
 * Database instance clone context.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloneContext extends com.google.api.client.json.GenericJson {

  /**
   * Binary log coordinates, if specified, identify the position up to which the source instance is
   * cloned. If not specified, the source instance is cloned up to the most recent binary log
   * coordinates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BinLogCoordinates binLogCoordinates;

  /**
   * Name of the Cloud SQL instance to be created as a clone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationInstanceName;

  /**
   * This is always sql#cloneContext.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long pitrTimestampMs;

  /**
   * Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String pointInTime;

  /**
   * Binary log coordinates, if specified, identify the position up to which the source instance is
   * cloned. If not specified, the source instance is cloned up to the most recent binary log
   * coordinates.
   * @return value or {@code null} for none
   */
  public BinLogCoordinates getBinLogCoordinates() {
    return binLogCoordinates;
  }

  /**
   * Binary log coordinates, if specified, identify the position up to which the source instance is
   * cloned. If not specified, the source instance is cloned up to the most recent binary log
   * coordinates.
   * @param binLogCoordinates binLogCoordinates or {@code null} for none
   */
  public CloneContext setBinLogCoordinates(BinLogCoordinates binLogCoordinates) {
    this.binLogCoordinates = binLogCoordinates;
    return this;
  }

  /**
   * Name of the Cloud SQL instance to be created as a clone.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationInstanceName() {
    return destinationInstanceName;
  }

  /**
   * Name of the Cloud SQL instance to be created as a clone.
   * @param destinationInstanceName destinationInstanceName or {@code null} for none
   */
  public CloneContext setDestinationInstanceName(java.lang.String destinationInstanceName) {
    this.destinationInstanceName = destinationInstanceName;
    return this;
  }

  /**
   * This is always sql#cloneContext.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#cloneContext.
   * @param kind kind or {@code null} for none
   */
  public CloneContext setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPitrTimestampMs() {
    return pitrTimestampMs;
  }

  /**
   * Reserved for future use.
   * @param pitrTimestampMs pitrTimestampMs or {@code null} for none
   */
  public CloneContext setPitrTimestampMs(java.lang.Long pitrTimestampMs) {
    this.pitrTimestampMs = pitrTimestampMs;
    return this;
  }

  /**
   * Reserved for future use.
   * @return value or {@code null} for none
   */
  public String getPointInTime() {
    return pointInTime;
  }

  /**
   * Reserved for future use.
   * @param pointInTime pointInTime or {@code null} for none
   */
  public CloneContext setPointInTime(String pointInTime) {
    this.pointInTime = pointInTime;
    return this;
  }

  @Override
  public CloneContext set(String fieldName, Object value) {
    return (CloneContext) super.set(fieldName, value);
  }

  @Override
  public CloneContext clone() {
    return (CloneContext) super.clone();
  }

}

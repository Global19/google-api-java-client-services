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

package com.google.api.services.lifesciences.v2beta.model;

/**
 * The system resources for the pipeline run.
 *
 * At least one zone or region must be specified or the pipeline run will fail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Life Sciences API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Resources extends com.google.api.client.json.GenericJson {

  /**
   * The list of regions allowed for VM allocation. If set, the `zones` field must not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> regions;

  /**
   * The virtual machine specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VirtualMachine virtualMachine;

  /**
   * The list of zones allowed for VM allocation. If set, the `regions` field must not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> zones;

  /**
   * The list of regions allowed for VM allocation. If set, the `zones` field must not be set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegions() {
    return regions;
  }

  /**
   * The list of regions allowed for VM allocation. If set, the `zones` field must not be set.
   * @param regions regions or {@code null} for none
   */
  public Resources setRegions(java.util.List<java.lang.String> regions) {
    this.regions = regions;
    return this;
  }

  /**
   * The virtual machine specification.
   * @return value or {@code null} for none
   */
  public VirtualMachine getVirtualMachine() {
    return virtualMachine;
  }

  /**
   * The virtual machine specification.
   * @param virtualMachine virtualMachine or {@code null} for none
   */
  public Resources setVirtualMachine(VirtualMachine virtualMachine) {
    this.virtualMachine = virtualMachine;
    return this;
  }

  /**
   * The list of zones allowed for VM allocation. If set, the `regions` field must not be set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getZones() {
    return zones;
  }

  /**
   * The list of zones allowed for VM allocation. If set, the `regions` field must not be set.
   * @param zones zones or {@code null} for none
   */
  public Resources setZones(java.util.List<java.lang.String> zones) {
    this.zones = zones;
    return this;
  }

  @Override
  public Resources set(String fieldName, Object value) {
    return (Resources) super.set(fieldName, value);
  }

  @Override
  public Resources clone() {
    return (Resources) super.clone();
  }

}
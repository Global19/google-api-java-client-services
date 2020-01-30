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

package com.google.api.services.people.v1.model;

/**
 * A request to modify an existing contact group's members. Contacts can be removed from any group
 * but they can only be added to a user group or "myContacts" or "starred" system groups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModifyContactGroupMembersRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The resource names of the contact people to add in the form of `people/{person_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceNamesToAdd;

  /**
   * Optional. The resource names of the contact people to remove in the form of
   * `people/{person_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceNamesToRemove;

  /**
   * Optional. The resource names of the contact people to add in the form of `people/{person_id}`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceNamesToAdd() {
    return resourceNamesToAdd;
  }

  /**
   * Optional. The resource names of the contact people to add in the form of `people/{person_id}`.
   * @param resourceNamesToAdd resourceNamesToAdd or {@code null} for none
   */
  public ModifyContactGroupMembersRequest setResourceNamesToAdd(java.util.List<java.lang.String> resourceNamesToAdd) {
    this.resourceNamesToAdd = resourceNamesToAdd;
    return this;
  }

  /**
   * Optional. The resource names of the contact people to remove in the form of
   * `people/{person_id}`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceNamesToRemove() {
    return resourceNamesToRemove;
  }

  /**
   * Optional. The resource names of the contact people to remove in the form of
   * `people/{person_id}`.
   * @param resourceNamesToRemove resourceNamesToRemove or {@code null} for none
   */
  public ModifyContactGroupMembersRequest setResourceNamesToRemove(java.util.List<java.lang.String> resourceNamesToRemove) {
    this.resourceNamesToRemove = resourceNamesToRemove;
    return this;
  }

  @Override
  public ModifyContactGroupMembersRequest set(String fieldName, Object value) {
    return (ModifyContactGroupMembersRequest) super.set(fieldName, value);
  }

  @Override
  public ModifyContactGroupMembersRequest clone() {
    return (ModifyContactGroupMembersRequest) super.clone();
  }

}

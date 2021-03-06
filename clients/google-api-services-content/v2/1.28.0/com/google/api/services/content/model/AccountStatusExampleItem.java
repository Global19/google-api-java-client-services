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

package com.google.api.services.content.model;

/**
 * Model definition for AccountStatusExampleItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountStatusExampleItem extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String link;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String submittedValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueOnLandingPage;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getItemId() {
    return itemId;
  }

  /**
   * @param itemId itemId or {@code null} for none
   */
  public AccountStatusExampleItem setItemId(java.lang.String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLink() {
    return link;
  }

  /**
   * @param link link or {@code null} for none
   */
  public AccountStatusExampleItem setLink(java.lang.String link) {
    this.link = link;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSubmittedValue() {
    return submittedValue;
  }

  /**
   * @param submittedValue submittedValue or {@code null} for none
   */
  public AccountStatusExampleItem setSubmittedValue(java.lang.String submittedValue) {
    this.submittedValue = submittedValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public AccountStatusExampleItem setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueOnLandingPage() {
    return valueOnLandingPage;
  }

  /**
   * @param valueOnLandingPage valueOnLandingPage or {@code null} for none
   */
  public AccountStatusExampleItem setValueOnLandingPage(java.lang.String valueOnLandingPage) {
    this.valueOnLandingPage = valueOnLandingPage;
    return this;
  }

  @Override
  public AccountStatusExampleItem set(String fieldName, Object value) {
    return (AccountStatusExampleItem) super.set(fieldName, value);
  }

  @Override
  public AccountStatusExampleItem clone() {
    return (AccountStatusExampleItem) super.clone();
  }

}

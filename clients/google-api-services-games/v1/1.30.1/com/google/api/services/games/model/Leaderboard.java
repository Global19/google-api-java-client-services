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

package com.google.api.services.games.model;

/**
 * The Leaderboard resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Leaderboard extends com.google.api.client.json.GenericJson {

  /**
   * The icon for the leaderboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * The leaderboard ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isIconUrlDefault;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#leaderboard`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the leaderboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * How scores are ordered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String order;

  /**
   * The icon for the leaderboard.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  /**
   * The icon for the leaderboard.
   * @param iconUrl iconUrl or {@code null} for none
   */
  public Leaderboard setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The leaderboard ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The leaderboard ID.
   * @param id id or {@code null} for none
   */
  public Leaderboard setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsIconUrlDefault() {
    return isIconUrlDefault;
  }

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * @param isIconUrlDefault isIconUrlDefault or {@code null} for none
   */
  public Leaderboard setIsIconUrlDefault(java.lang.Boolean isIconUrlDefault) {
    this.isIconUrlDefault = isIconUrlDefault;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#leaderboard`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#leaderboard`.
   * @param kind kind or {@code null} for none
   */
  public Leaderboard setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the leaderboard.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the leaderboard.
   * @param name name or {@code null} for none
   */
  public Leaderboard setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * How scores are ordered.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrder() {
    return order;
  }

  /**
   * How scores are ordered.
   * @param order order or {@code null} for none
   */
  public Leaderboard setOrder(java.lang.String order) {
    this.order = order;
    return this;
  }

  @Override
  public Leaderboard set(String fieldName, Object value) {
    return (Leaderboard) super.set(fieldName, value);
  }

  @Override
  public Leaderboard clone() {
    return (Leaderboard) super.clone();
  }

}

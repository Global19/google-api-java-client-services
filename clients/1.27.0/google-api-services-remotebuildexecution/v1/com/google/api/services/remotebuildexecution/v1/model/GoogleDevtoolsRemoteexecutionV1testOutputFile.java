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
 * An `OutputFile` is similar to a FileNode, but it is tailored for output as part of an
 * `ActionResult`. It allows a full file path rather than only a name, and allows the server to
 * include content inline.
 *
 * `OutputFile` is binary-compatible with `FileNode`.
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
public final class GoogleDevtoolsRemoteexecutionV1testOutputFile extends com.google.api.client.json.GenericJson {

  /**
   * The raw content of the file.
   *
   * This field may be used by the server to provide the content of a file inline in an ActionResult
   * and avoid requiring that the client make a separate call to [ContentAddressableStorage.GetBlob]
   * to retrieve it.
   *
   * The client SHOULD NOT assume that it will get raw content with any request, and always be
   * prepared to retrieve it via `digest`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The digest of the file's content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemoteexecutionV1testDigest digest;

  /**
   * True if file is executable, false otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isExecutable;

  /**
   * The full path of the file relative to the input root, including the filename. The path
   * separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with a
   * leading forward slash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The raw content of the file.
   *
   * This field may be used by the server to provide the content of a file inline in an ActionResult
   * and avoid requiring that the client make a separate call to [ContentAddressableStorage.GetBlob]
   * to retrieve it.
   *
   * The client SHOULD NOT assume that it will get raw content with any request, and always be
   * prepared to retrieve it via `digest`.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The raw content of the file.
   *
   * This field may be used by the server to provide the content of a file inline in an ActionResult
   * and avoid requiring that the client make a separate call to [ContentAddressableStorage.GetBlob]
   * to retrieve it.
   *
   * The client SHOULD NOT assume that it will get raw content with any request, and always be
   * prepared to retrieve it via `digest`.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * The raw content of the file.
   *
   * This field may be used by the server to provide the content of a file inline in an ActionResult
   * and avoid requiring that the client make a separate call to [ContentAddressableStorage.GetBlob]
   * to retrieve it.
   *
   * The client SHOULD NOT assume that it will get raw content with any request, and always be
   * prepared to retrieve it via `digest`.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testOutputFile setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The raw content of the file.
   *
   * This field may be used by the server to provide the content of a file inline in an ActionResult
   * and avoid requiring that the client make a separate call to [ContentAddressableStorage.GetBlob]
   * to retrieve it.
   *
   * The client SHOULD NOT assume that it will get raw content with any request, and always be
   * prepared to retrieve it via `digest`.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleDevtoolsRemoteexecutionV1testOutputFile encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * The digest of the file's content.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testDigest getDigest() {
    return digest;
  }

  /**
   * The digest of the file's content.
   * @param digest digest or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testOutputFile setDigest(GoogleDevtoolsRemoteexecutionV1testDigest digest) {
    this.digest = digest;
    return this;
  }

  /**
   * True if file is executable, false otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsExecutable() {
    return isExecutable;
  }

  /**
   * True if file is executable, false otherwise.
   * @param isExecutable isExecutable or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testOutputFile setIsExecutable(java.lang.Boolean isExecutable) {
    this.isExecutable = isExecutable;
    return this;
  }

  /**
   * The full path of the file relative to the input root, including the filename. The path
   * separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with a
   * leading forward slash.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The full path of the file relative to the input root, including the filename. The path
   * separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with a
   * leading forward slash.
   * @param path path or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testOutputFile setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteexecutionV1testOutputFile set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteexecutionV1testOutputFile) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteexecutionV1testOutputFile clone() {
    return (GoogleDevtoolsRemoteexecutionV1testOutputFile) super.clone();
  }

}

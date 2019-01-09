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
 * An `OutputSymlink` is similar to a Symlink, but it is used as an output in an `ActionResult`.
 *
 * `OutputSymlink` is binary-compatible with `SymlinkNode`.
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
public final class BuildBazelRemoteExecutionV2OutputSymlink extends com.google.api.client.json.GenericJson {

  /**
   * The full path of the symlink relative to the working directory, including the filename. The
   * path separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with a
   * leading forward slash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The target path of the symlink. The path separator is a forward slash `/`. The target path can
   * be relative to the parent directory of the symlink or it can be an absolute path starting with
   * `/`. Support for absolute paths can be checked using the Capabilities API. The canonical form
   * forbids the substrings `/./` and `//` in the target path. `..` components are allowed anywhere
   * in the target path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * The full path of the symlink relative to the working directory, including the filename. The
   * path separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with a
   * leading forward slash.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The full path of the symlink relative to the working directory, including the filename. The
   * path separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with a
   * leading forward slash.
   * @param path path or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2OutputSymlink setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * The target path of the symlink. The path separator is a forward slash `/`. The target path can
   * be relative to the parent directory of the symlink or it can be an absolute path starting with
   * `/`. Support for absolute paths can be checked using the Capabilities API. The canonical form
   * forbids the substrings `/./` and `//` in the target path. `..` components are allowed anywhere
   * in the target path.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * The target path of the symlink. The path separator is a forward slash `/`. The target path can
   * be relative to the parent directory of the symlink or it can be an absolute path starting with
   * `/`. Support for absolute paths can be checked using the Capabilities API. The canonical form
   * forbids the substrings `/./` and `//` in the target path. `..` components are allowed anywhere
   * in the target path.
   * @param target target or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2OutputSymlink setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2OutputSymlink set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2OutputSymlink) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2OutputSymlink clone() {
    return (BuildBazelRemoteExecutionV2OutputSymlink) super.clone();
  }

}

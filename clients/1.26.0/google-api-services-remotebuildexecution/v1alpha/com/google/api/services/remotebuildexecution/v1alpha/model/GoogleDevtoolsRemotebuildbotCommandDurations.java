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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * CommandDuration contains the various duration metrics tracked when a bot performs a command.
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
public final class GoogleDevtoolsRemotebuildbotCommandDurations extends com.google.api.client.json.GenericJson {

  /**
   * The time spent preparing the command to be run in a Docker container (includes pulling the
   * Docker image, if necessary).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String dockerPrep;

  /**
   * The time spent downloading the input files and constructing the working directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String download;

  /**
   * The time spent executing the command (i.e., doing useful work).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String execution;

  /**
   * The timestamp when preparation is done and bot starts downloading files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String isoPrepDone;

  /**
   * The time spent completing the command, in total.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String overall;

  /**
   * The time spent uploading the stdout logs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String stdout;

  /**
   * The time spent uploading the output files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String upload;

  /**
   * The time spent preparing the command to be run in a Docker container (includes pulling the
   * Docker image, if necessary).
   * @return value or {@code null} for none
   */
  public String getDockerPrep() {
    return dockerPrep;
  }

  /**
   * The time spent preparing the command to be run in a Docker container (includes pulling the
   * Docker image, if necessary).
   * @param dockerPrep dockerPrep or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandDurations setDockerPrep(String dockerPrep) {
    this.dockerPrep = dockerPrep;
    return this;
  }

  /**
   * The time spent downloading the input files and constructing the working directory.
   * @return value or {@code null} for none
   */
  public String getDownload() {
    return download;
  }

  /**
   * The time spent downloading the input files and constructing the working directory.
   * @param download download or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandDurations setDownload(String download) {
    this.download = download;
    return this;
  }

  /**
   * The time spent executing the command (i.e., doing useful work).
   * @return value or {@code null} for none
   */
  public String getExecution() {
    return execution;
  }

  /**
   * The time spent executing the command (i.e., doing useful work).
   * @param execution execution or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandDurations setExecution(String execution) {
    this.execution = execution;
    return this;
  }

  /**
   * The timestamp when preparation is done and bot starts downloading files.
   * @return value or {@code null} for none
   */
  public String getIsoPrepDone() {
    return isoPrepDone;
  }

  /**
   * The timestamp when preparation is done and bot starts downloading files.
   * @param isoPrepDone isoPrepDone or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandDurations setIsoPrepDone(String isoPrepDone) {
    this.isoPrepDone = isoPrepDone;
    return this;
  }

  /**
   * The time spent completing the command, in total.
   * @return value or {@code null} for none
   */
  public String getOverall() {
    return overall;
  }

  /**
   * The time spent completing the command, in total.
   * @param overall overall or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandDurations setOverall(String overall) {
    this.overall = overall;
    return this;
  }

  /**
   * The time spent uploading the stdout logs.
   * @return value or {@code null} for none
   */
  public String getStdout() {
    return stdout;
  }

  /**
   * The time spent uploading the stdout logs.
   * @param stdout stdout or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandDurations setStdout(String stdout) {
    this.stdout = stdout;
    return this;
  }

  /**
   * The time spent uploading the output files.
   * @return value or {@code null} for none
   */
  public String getUpload() {
    return upload;
  }

  /**
   * The time spent uploading the output files.
   * @param upload upload or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandDurations setUpload(String upload) {
    this.upload = upload;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildbotCommandDurations set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildbotCommandDurations) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildbotCommandDurations clone() {
    return (GoogleDevtoolsRemotebuildbotCommandDurations) super.clone();
  }

}

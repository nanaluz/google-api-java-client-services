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

package com.google.api.services.bigquery.model;

/**
 * Model definition for JobStatistics3.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobStatistics3 extends com.google.api.client.json.GenericJson {

  /**
   * [Output-only] The number of bad records encountered. Note that if the job has failed because of
   * more bad records encountered than the maximum allowed in the load job configuration, then this
   * number can be less than the total number of bad records present in the input data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long badRecords;

  /**
   * [Output-only] Number of bytes of source data in a load job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long inputFileBytes;

  /**
   * [Output-only] Number of source files in a load job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long inputFiles;

  /**
   * [Output-only] Size of the loaded data in bytes. Note that while a load job is in the running
   * state, this value may change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long outputBytes;

  /**
   * [Output-only] Number of rows imported in a load job. Note that while an import job is in the
   * running state, this value may change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long outputRows;

  /**
   * [Output-only] The number of bad records encountered. Note that if the job has failed because of
   * more bad records encountered than the maximum allowed in the load job configuration, then this
   * number can be less than the total number of bad records present in the input data.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBadRecords() {
    return badRecords;
  }

  /**
   * [Output-only] The number of bad records encountered. Note that if the job has failed because of
   * more bad records encountered than the maximum allowed in the load job configuration, then this
   * number can be less than the total number of bad records present in the input data.
   * @param badRecords badRecords or {@code null} for none
   */
  public JobStatistics3 setBadRecords(java.lang.Long badRecords) {
    this.badRecords = badRecords;
    return this;
  }

  /**
   * [Output-only] Number of bytes of source data in a load job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInputFileBytes() {
    return inputFileBytes;
  }

  /**
   * [Output-only] Number of bytes of source data in a load job.
   * @param inputFileBytes inputFileBytes or {@code null} for none
   */
  public JobStatistics3 setInputFileBytes(java.lang.Long inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

  /**
   * [Output-only] Number of source files in a load job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInputFiles() {
    return inputFiles;
  }

  /**
   * [Output-only] Number of source files in a load job.
   * @param inputFiles inputFiles or {@code null} for none
   */
  public JobStatistics3 setInputFiles(java.lang.Long inputFiles) {
    this.inputFiles = inputFiles;
    return this;
  }

  /**
   * [Output-only] Size of the loaded data in bytes. Note that while a load job is in the running
   * state, this value may change.
   * @return value or {@code null} for none
   */
  public java.lang.Long getOutputBytes() {
    return outputBytes;
  }

  /**
   * [Output-only] Size of the loaded data in bytes. Note that while a load job is in the running
   * state, this value may change.
   * @param outputBytes outputBytes or {@code null} for none
   */
  public JobStatistics3 setOutputBytes(java.lang.Long outputBytes) {
    this.outputBytes = outputBytes;
    return this;
  }

  /**
   * [Output-only] Number of rows imported in a load job. Note that while an import job is in the
   * running state, this value may change.
   * @return value or {@code null} for none
   */
  public java.lang.Long getOutputRows() {
    return outputRows;
  }

  /**
   * [Output-only] Number of rows imported in a load job. Note that while an import job is in the
   * running state, this value may change.
   * @param outputRows outputRows or {@code null} for none
   */
  public JobStatistics3 setOutputRows(java.lang.Long outputRows) {
    this.outputRows = outputRows;
    return this;
  }

  @Override
  public JobStatistics3 set(String fieldName, Object value) {
    return (JobStatistics3) super.set(fieldName, value);
  }

  @Override
  public JobStatistics3 clone() {
    return (JobStatistics3) super.clone();
  }

}
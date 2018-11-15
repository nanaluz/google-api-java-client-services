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

package com.google.api.services.dataflow.model;

/**
 * Represents a snapshot of a job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Snapshot extends com.google.api.client.json.GenericJson {

  /**
   * The time this snapshot was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTime;

  /**
   * The unique ID of this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The project this snapshot belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The job this snapshot was created from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceJobId;

  /**
   * The time after which this snapshot will be automatically deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String ttl;

  /**
   * The time this snapshot was created.
   * @return value or {@code null} for none
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * The time this snapshot was created.
   * @param creationTime creationTime or {@code null} for none
   */
  public Snapshot setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The unique ID of this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique ID of this snapshot.
   * @param id id or {@code null} for none
   */
  public Snapshot setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The project this snapshot belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * The project this snapshot belongs to.
   * @param projectId projectId or {@code null} for none
   */
  public Snapshot setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The job this snapshot was created from.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceJobId() {
    return sourceJobId;
  }

  /**
   * The job this snapshot was created from.
   * @param sourceJobId sourceJobId or {@code null} for none
   */
  public Snapshot setSourceJobId(java.lang.String sourceJobId) {
    this.sourceJobId = sourceJobId;
    return this;
  }

  /**
   * The time after which this snapshot will be automatically deleted.
   * @return value or {@code null} for none
   */
  public String getTtl() {
    return ttl;
  }

  /**
   * The time after which this snapshot will be automatically deleted.
   * @param ttl ttl or {@code null} for none
   */
  public Snapshot setTtl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  @Override
  public Snapshot set(String fieldName, Object value) {
    return (Snapshot) super.set(fieldName, value);
  }

  @Override
  public Snapshot clone() {
    return (Snapshot) super.clone();
  }

}

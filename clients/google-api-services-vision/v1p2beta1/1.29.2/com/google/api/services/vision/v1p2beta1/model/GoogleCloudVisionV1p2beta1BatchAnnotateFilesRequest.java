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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * A list of requests to annotate files using the BatchAnnotateFiles API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p2beta1BatchAnnotateFilesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Target project and location to make a call.
   *
   * Format: `projects/{project-id}/locations/{location-id}`.
   *
   * If no parent is specified, a region will be chosen automatically.
   *
   * Supported location-ids:     `us`: USA country only,     `asia`: East asia areas, like Japan,
   * Taiwan,     `eu`: The European Union.
   *
   * Example: `projects/project-A/locations/eu`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * The list of file annotation requests. Right now we support only one AnnotateFileRequest in
   * BatchAnnotateFilesRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p2beta1AnnotateFileRequest> requests;

  static {
    // hack to force ProGuard to consider GoogleCloudVisionV1p2beta1AnnotateFileRequest used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVisionV1p2beta1AnnotateFileRequest.class);
  }

  /**
   * Optional. Target project and location to make a call.
   *
   * Format: `projects/{project-id}/locations/{location-id}`.
   *
   * If no parent is specified, a region will be chosen automatically.
   *
   * Supported location-ids:     `us`: USA country only,     `asia`: East asia areas, like Japan,
   * Taiwan,     `eu`: The European Union.
   *
   * Example: `projects/project-A/locations/eu`.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Optional. Target project and location to make a call.
   *
   * Format: `projects/{project-id}/locations/{location-id}`.
   *
   * If no parent is specified, a region will be chosen automatically.
   *
   * Supported location-ids:     `us`: USA country only,     `asia`: East asia areas, like Japan,
   * Taiwan,     `eu`: The European Union.
   *
   * Example: `projects/project-A/locations/eu`.
   * @param parent parent or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1BatchAnnotateFilesRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The list of file annotation requests. Right now we support only one AnnotateFileRequest in
   * BatchAnnotateFilesRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p2beta1AnnotateFileRequest> getRequests() {
    return requests;
  }

  /**
   * The list of file annotation requests. Right now we support only one AnnotateFileRequest in
   * BatchAnnotateFilesRequest.
   * @param requests requests or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1BatchAnnotateFilesRequest setRequests(java.util.List<GoogleCloudVisionV1p2beta1AnnotateFileRequest> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p2beta1BatchAnnotateFilesRequest set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p2beta1BatchAnnotateFilesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p2beta1BatchAnnotateFilesRequest clone() {
    return (GoogleCloudVisionV1p2beta1BatchAnnotateFilesRequest) super.clone();
  }

}

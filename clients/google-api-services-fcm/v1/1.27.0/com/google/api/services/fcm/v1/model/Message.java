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

package com.google.api.services.fcm.v1.model;

/**
 * Message to send by Firebase Cloud Messaging Service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Cloud Messaging API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Message extends com.google.api.client.json.GenericJson {

  /**
   * Input only. Android specific options for messages sent through [FCM connection
   * server](https://goo.gl/4GLdUl).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidConfig android;

  /**
   * Input only. [Apple Push Notification Service](https://goo.gl/MXRTPa) specific options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApnsConfig apns;

  /**
   * Condition to send a message to, e.g. "'foo' in topics && 'bar' in topics".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * Input only. Arbitrary key/value payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> data;

  /**
   * Output Only. The identifier of the message sent, in the format of
   * `projects/messages/{message_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Input only. Basic notification template to use across all platforms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Notification notification;

  /**
   * Registration token to send a message to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String token;

  /**
   * Topic name to send a message to, e.g. "weather". Note: "/topics/" prefix should not be
   * provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * Input only. [Webpush protocol](https://tools.ietf.org/html/rfc8030) options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WebpushConfig webpush;

  /**
   * Input only. Android specific options for messages sent through [FCM connection
   * server](https://goo.gl/4GLdUl).
   * @return value or {@code null} for none
   */
  public AndroidConfig getAndroid() {
    return android;
  }

  /**
   * Input only. Android specific options for messages sent through [FCM connection
   * server](https://goo.gl/4GLdUl).
   * @param android android or {@code null} for none
   */
  public Message setAndroid(AndroidConfig android) {
    this.android = android;
    return this;
  }

  /**
   * Input only. [Apple Push Notification Service](https://goo.gl/MXRTPa) specific options.
   * @return value or {@code null} for none
   */
  public ApnsConfig getApns() {
    return apns;
  }

  /**
   * Input only. [Apple Push Notification Service](https://goo.gl/MXRTPa) specific options.
   * @param apns apns or {@code null} for none
   */
  public Message setApns(ApnsConfig apns) {
    this.apns = apns;
    return this;
  }

  /**
   * Condition to send a message to, e.g. "'foo' in topics && 'bar' in topics".
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * Condition to send a message to, e.g. "'foo' in topics && 'bar' in topics".
   * @param condition condition or {@code null} for none
   */
  public Message setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Input only. Arbitrary key/value payload.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getData() {
    return data;
  }

  /**
   * Input only. Arbitrary key/value payload.
   * @param data data or {@code null} for none
   */
  public Message setData(java.util.Map<String, java.lang.String> data) {
    this.data = data;
    return this;
  }

  /**
   * Output Only. The identifier of the message sent, in the format of
   * `projects/messages/{message_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output Only. The identifier of the message sent, in the format of
   * `projects/messages/{message_id}`.
   * @param name name or {@code null} for none
   */
  public Message setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Input only. Basic notification template to use across all platforms.
   * @return value or {@code null} for none
   */
  public Notification getNotification() {
    return notification;
  }

  /**
   * Input only. Basic notification template to use across all platforms.
   * @param notification notification or {@code null} for none
   */
  public Message setNotification(Notification notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Registration token to send a message to.
   * @return value or {@code null} for none
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * Registration token to send a message to.
   * @param token token or {@code null} for none
   */
  public Message setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  /**
   * Topic name to send a message to, e.g. "weather". Note: "/topics/" prefix should not be
   * provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * Topic name to send a message to, e.g. "weather". Note: "/topics/" prefix should not be
   * provided.
   * @param topic topic or {@code null} for none
   */
  public Message setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Input only. [Webpush protocol](https://tools.ietf.org/html/rfc8030) options.
   * @return value or {@code null} for none
   */
  public WebpushConfig getWebpush() {
    return webpush;
  }

  /**
   * Input only. [Webpush protocol](https://tools.ietf.org/html/rfc8030) options.
   * @param webpush webpush or {@code null} for none
   */
  public Message setWebpush(WebpushConfig webpush) {
    this.webpush = webpush;
    return this;
  }

  @Override
  public Message set(String fieldName, Object value) {
    return (Message) super.set(fieldName, value);
  }

  @Override
  public Message clone() {
    return (Message) super.clone();
  }

}

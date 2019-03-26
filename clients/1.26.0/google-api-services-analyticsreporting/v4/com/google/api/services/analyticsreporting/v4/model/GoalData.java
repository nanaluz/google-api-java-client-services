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

package com.google.api.services.analyticsreporting.v4.model;

/**
 * Represents all the details pertaining to a goal.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoalData extends com.google.api.client.json.GenericJson {

  /**
   * URL of the page where this goal was completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String goalCompletionLocation;

  /**
   * Total number of goal completions in this activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long goalCompletions;

  /**
   * This identifies the goal as configured for the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer goalIndex;

  /**
   * Name of the goal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String goalName;

  /**
   * URL of the page one step prior to the goal completion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String goalPreviousStep1;

  /**
   * URL of the page two steps prior to the goal completion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String goalPreviousStep2;

  /**
   * URL of the page three steps prior to the goal completion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String goalPreviousStep3;

  /**
   * Value in this goal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double goalValue;

  /**
   * URL of the page where this goal was completed.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoalCompletionLocation() {
    return goalCompletionLocation;
  }

  /**
   * URL of the page where this goal was completed.
   * @param goalCompletionLocation goalCompletionLocation or {@code null} for none
   */
  public GoalData setGoalCompletionLocation(java.lang.String goalCompletionLocation) {
    this.goalCompletionLocation = goalCompletionLocation;
    return this;
  }

  /**
   * Total number of goal completions in this activity.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGoalCompletions() {
    return goalCompletions;
  }

  /**
   * Total number of goal completions in this activity.
   * @param goalCompletions goalCompletions or {@code null} for none
   */
  public GoalData setGoalCompletions(java.lang.Long goalCompletions) {
    this.goalCompletions = goalCompletions;
    return this;
  }

  /**
   * This identifies the goal as configured for the profile.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGoalIndex() {
    return goalIndex;
  }

  /**
   * This identifies the goal as configured for the profile.
   * @param goalIndex goalIndex or {@code null} for none
   */
  public GoalData setGoalIndex(java.lang.Integer goalIndex) {
    this.goalIndex = goalIndex;
    return this;
  }

  /**
   * Name of the goal.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoalName() {
    return goalName;
  }

  /**
   * Name of the goal.
   * @param goalName goalName or {@code null} for none
   */
  public GoalData setGoalName(java.lang.String goalName) {
    this.goalName = goalName;
    return this;
  }

  /**
   * URL of the page one step prior to the goal completion.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoalPreviousStep1() {
    return goalPreviousStep1;
  }

  /**
   * URL of the page one step prior to the goal completion.
   * @param goalPreviousStep1 goalPreviousStep1 or {@code null} for none
   */
  public GoalData setGoalPreviousStep1(java.lang.String goalPreviousStep1) {
    this.goalPreviousStep1 = goalPreviousStep1;
    return this;
  }

  /**
   * URL of the page two steps prior to the goal completion.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoalPreviousStep2() {
    return goalPreviousStep2;
  }

  /**
   * URL of the page two steps prior to the goal completion.
   * @param goalPreviousStep2 goalPreviousStep2 or {@code null} for none
   */
  public GoalData setGoalPreviousStep2(java.lang.String goalPreviousStep2) {
    this.goalPreviousStep2 = goalPreviousStep2;
    return this;
  }

  /**
   * URL of the page three steps prior to the goal completion.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoalPreviousStep3() {
    return goalPreviousStep3;
  }

  /**
   * URL of the page three steps prior to the goal completion.
   * @param goalPreviousStep3 goalPreviousStep3 or {@code null} for none
   */
  public GoalData setGoalPreviousStep3(java.lang.String goalPreviousStep3) {
    this.goalPreviousStep3 = goalPreviousStep3;
    return this;
  }

  /**
   * Value in this goal.
   * @return value or {@code null} for none
   */
  public java.lang.Double getGoalValue() {
    return goalValue;
  }

  /**
   * Value in this goal.
   * @param goalValue goalValue or {@code null} for none
   */
  public GoalData setGoalValue(java.lang.Double goalValue) {
    this.goalValue = goalValue;
    return this;
  }

  @Override
  public GoalData set(String fieldName, Object value) {
    return (GoalData) super.set(fieldName, value);
  }

  @Override
  public GoalData clone() {
    return (GoalData) super.clone();
  }

}
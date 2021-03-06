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

package com.google.api.services.billingbudgets.v1beta1.model;

/**
 * A filter for a budget, limiting the scope of the cost to calculate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing Budget API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBudgetsV1beta1Filter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creditTypesTreatment;

  /**
   * Optional. A single label and value pair specifying that usage from only this set of labeled
   * resources should be included in the budget. Currently, multiple entries or multiple values per
   * entry are not allowed. If omitted, the report will include all labeled and unlabeled usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.util.List<java.lang.Object>> labels;

  /**
   * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only
   * this set of projects should be included in the budget. If omitted, the report will include all
   * usage for the billing account, regardless of which project the usage occurred on. Only zero or
   * one project can be specified currently.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> projects;

  /**
   * Optional. A set of services of the form `services/{service_id}`, specifying that usage from
   * only this set of services should be included in the budget. If omitted, the report will include
   * usage for all the services. The service names are available through the Catalog API:
   * https://cloud.google.com/billing/v1/how-tos/catalog-api.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> services;

  /**
   * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that
   * usage from only this set of subaccounts should be included in the budget. If a subaccount is
   * set to the name of the parent account, usage from the parent account will be included. If
   * omitted, the report will include usage from the parent account and all subaccounts, if they
   * exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subaccounts;

  /**
   * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreditTypesTreatment() {
    return creditTypesTreatment;
  }

  /**
   * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
   * @param creditTypesTreatment creditTypesTreatment or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1Filter setCreditTypesTreatment(java.lang.String creditTypesTreatment) {
    this.creditTypesTreatment = creditTypesTreatment;
    return this;
  }

  /**
   * Optional. A single label and value pair specifying that usage from only this set of labeled
   * resources should be included in the budget. Currently, multiple entries or multiple values per
   * entry are not allowed. If omitted, the report will include all labeled and unlabeled usage.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.util.List<java.lang.Object>> getLabels() {
    return labels;
  }

  /**
   * Optional. A single label and value pair specifying that usage from only this set of labeled
   * resources should be included in the budget. Currently, multiple entries or multiple values per
   * entry are not allowed. If omitted, the report will include all labeled and unlabeled usage.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1Filter setLabels(java.util.Map<String, java.util.List<java.lang.Object>> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only
   * this set of projects should be included in the budget. If omitted, the report will include all
   * usage for the billing account, regardless of which project the usage occurred on. Only zero or
   * one project can be specified currently.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProjects() {
    return projects;
  }

  /**
   * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only
   * this set of projects should be included in the budget. If omitted, the report will include all
   * usage for the billing account, regardless of which project the usage occurred on. Only zero or
   * one project can be specified currently.
   * @param projects projects or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1Filter setProjects(java.util.List<java.lang.String> projects) {
    this.projects = projects;
    return this;
  }

  /**
   * Optional. A set of services of the form `services/{service_id}`, specifying that usage from
   * only this set of services should be included in the budget. If omitted, the report will include
   * usage for all the services. The service names are available through the Catalog API:
   * https://cloud.google.com/billing/v1/how-tos/catalog-api.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServices() {
    return services;
  }

  /**
   * Optional. A set of services of the form `services/{service_id}`, specifying that usage from
   * only this set of services should be included in the budget. If omitted, the report will include
   * usage for all the services. The service names are available through the Catalog API:
   * https://cloud.google.com/billing/v1/how-tos/catalog-api.
   * @param services services or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1Filter setServices(java.util.List<java.lang.String> services) {
    this.services = services;
    return this;
  }

  /**
   * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that
   * usage from only this set of subaccounts should be included in the budget. If a subaccount is
   * set to the name of the parent account, usage from the parent account will be included. If
   * omitted, the report will include usage from the parent account and all subaccounts, if they
   * exist.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubaccounts() {
    return subaccounts;
  }

  /**
   * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that
   * usage from only this set of subaccounts should be included in the budget. If a subaccount is
   * set to the name of the parent account, usage from the parent account will be included. If
   * omitted, the report will include usage from the parent account and all subaccounts, if they
   * exist.
   * @param subaccounts subaccounts or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1Filter setSubaccounts(java.util.List<java.lang.String> subaccounts) {
    this.subaccounts = subaccounts;
    return this;
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1Filter set(String fieldName, Object value) {
    return (GoogleCloudBillingBudgetsV1beta1Filter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1Filter clone() {
    return (GoogleCloudBillingBudgetsV1beta1Filter) super.clone();
  }

}

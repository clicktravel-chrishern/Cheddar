/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.clicktravel.cheddar.metrics;

import java.util.Map;

public interface MetricCollector {

    void createOrganisation(MetricOrganisation metricOrganisation);

    void updateOrganisation(MetricOrganisation metricOrganisation);

    void tagOrganisation(String tagName, MetricOrganisation metricOrganisation);

    void createUser(MetricUser user);

    void updateUser(MetricUser user);

    void addCustomAttributesToUser(String userId, Map<String, Object> customAttributes);

    void addOrganisationToUser(String userId, String organisationId);

    void removeOrganisationFromUser(String userId, String organisationId);

    void deleteUser(String userId);

    void sendMetric(Metric metric);

    MetricUser getUser(String userId);

    void convertExistingContactToUser(String contactId, MetricUser metricUser);

}
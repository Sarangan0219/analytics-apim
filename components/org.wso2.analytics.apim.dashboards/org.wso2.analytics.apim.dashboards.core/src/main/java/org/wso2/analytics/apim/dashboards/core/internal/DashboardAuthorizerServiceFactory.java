/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.analytics.apim.dashboards.core.internal;

import org.wso2.carbon.analytics.idp.client.core.api.AnalyticsHttpClientBuilderService;

/**
 * REST API service used to access service stub for calling workers.
 */
public class DashboardAuthorizerServiceFactory {

    public static DashboardAuthorizerServiceStub getAuthorizerHttpsClient(AnalyticsHttpClientBuilderService service,
                                                                          String url,
                                                                          String username,
                                                                          String password) {
        return service.build(username, password, 5000, 5000, DashboardAuthorizerServiceStub.class, url);
    }
}

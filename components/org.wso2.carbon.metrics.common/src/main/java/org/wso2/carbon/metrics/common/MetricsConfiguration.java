/*
 * Copyright 2015 WSO2 Inc. (http://wso2.org)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.metrics.common;

/**
 * Configuration for Metrics
 */
public abstract class MetricsConfiguration {

    public abstract String getFirstProperty(String key);

    public final String getFirstProperty(String key, String defaultValue) {
        String returnValue = getFirstProperty(key);
        if (returnValue == null || returnValue.trim().length() == 0) {
            return defaultValue;
        }
        return returnValue;
    }

    public final String getFirstProperty(String key, DefaultValueProvider defaultValueProvider) {
        return getFirstProperty(key, defaultValueProvider.getValue());
    }

}

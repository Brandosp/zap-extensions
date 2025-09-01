/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2025 The ZAP Development Team
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
package org.zaproxy.addon.pscan;

import java.util.List;
import org.parosproxy.paros.core.scanner.Plugin.AlertThreshold;

/**
 * @since 0.4.0
 */
public interface PassiveScanRuleProvider {
    record PassiveScanRule(int id, String i18nName, AlertThreshold threshold) {}

    void enableAllRules();

    void disableAllRules();

    boolean enableRule(int id);

    boolean disableRule(int id);

    boolean setThreshold(int id, AlertThreshold threshold);

    List<PassiveScanRule> getRules();

    PassiveScanRule getRule(int id);

    boolean hasRule(int id);
}

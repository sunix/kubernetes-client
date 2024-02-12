/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview;
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview;
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview;
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview;
import io.fabric8.kubernetes.client.dsl.InOutCreateable;
import io.fabric8.kubernetes.client.dsl.NamespacedInOutCreateable;

public interface V1AuthorizationAPIGroupDSL extends Client {
  InOutCreateable<SelfSubjectAccessReview, SelfSubjectAccessReview> selfSubjectAccessReview();

  InOutCreateable<SubjectAccessReview, SubjectAccessReview> subjectAccessReview();

  NamespacedInOutCreateable<LocalSubjectAccessReview, LocalSubjectAccessReview> localSubjectAccessReview();

  InOutCreateable<SelfSubjectRulesReview, SelfSubjectRulesReview> selfSubjectRulesReview();
}

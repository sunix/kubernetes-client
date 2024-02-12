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
package io.fabric8.mockwebserver.dsl;

import java.util.concurrent.ScheduledExecutorService;

public interface WebSocketable<T> {

  T andUpgradeToWebSocket();

  /**
   * @deprecated the provided ScheduledExecutorService is not used, use {@link #andUpgradeToWebSocket()} instead.
   *             The ExecutorService is handled internally by WebSocketSession, external executors are no longer allowed.
   */
  @Deprecated
  T andUpgradeToWebSocket(ScheduledExecutorService executor);

}

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.agent;

import java.util.ArrayList;
import java.util.List;
import org.apache.ambari.server.state.Alert;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Status of the host as described by the agent.
 *
 */
public class HostStatus {
  public HostStatus(Status status, String cause) {
    super();
    this.status = status;
    this.cause = cause;
  }
  public HostStatus() {
    super();
  }
  
  public enum Status {
    HEALTHY,
    UNHEALTHY
  }
  Status status;
  String cause;
  List<Alert> alerts = new ArrayList<Alert>();
      
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }
    
  @JsonProperty("status")
  public void setStatus(Status status) {
    this.status = status;
  }
  
  @JsonProperty("cause")  
  public String getCause() {
    return cause;
  }
  
  @JsonProperty("cause")
  public void setCause(String cause) {
    this.cause = cause;
  }
  
  @JsonProperty("alerts")
  public List<Alert> getAlerts() {
    return alerts;
  }
  
  @JsonProperty("alerts")
  public void setAlerts(List<Alert> alerts) {
    this.alerts = alerts;
  }
 
  @Override
  public String toString() {
    return "HostStatus{" +
            "status=" + status +
            ", cause='" + cause + '\'' +
            ", alerts=" + alerts.size() + '}';
  }
}

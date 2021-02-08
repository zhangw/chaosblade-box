/*
 * Copyright 1999-2021 Alibaba Group Holding Ltd.
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

package com.alibaba.chaosblade.platform.service.model.experiment.activity;

import com.alibaba.chaosblade.platform.cmmon.DeviceMeta;
import com.alibaba.chaosblade.platform.cmmon.constants.ChaosConstant;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @author yefei
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(exclude = "activityTaskId")
public class ActivityTaskDTO {

    private Long flowId;

    private Long experimentTaskId;

    private Long activityId;

    private Long activityTaskId;

    private Long preActivityTaskId;

    private Long nextActivityTaskId;

    private Long sceneId;

    private String sceneCode;

    private String phase;

    private String target;

    private String action;

    private Boolean manualChecked;

    private Long waitOfBefore;

    private Long waitOfAfter;

    private Map<String, String> arguments;

    private List<DeviceMeta> deviceMetas;

    public boolean isRecoverPhase() {
        return ChaosConstant.PHASE_RECOVER.equals(phase);
    }

    public boolean isAttackPhase() {
        return ChaosConstant.PHASE_ATTACK.equals(phase);
    }

}
package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VersionGroupDetail {
  @JsonProperty("level_learned_at")
  private Integer levelLearnedAt;

  @JsonProperty("version_group")
  private NamedApiResource versionGroup;

  @JsonProperty("move_learn_method")
  private NamedApiResource moveLearnMethod;

  private Integer order;
}

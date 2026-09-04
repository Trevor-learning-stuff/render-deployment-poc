package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PastAbilityEntry {
  private NamedApiResource ability;

  @JsonProperty("is_hidden")
  private Boolean isHidden;

  private Integer slot;
}

package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Ability {
  @JsonProperty("is_hidden")
  private Boolean isHidden;

  private Integer slot;
  private NamedApiResource ability;
}

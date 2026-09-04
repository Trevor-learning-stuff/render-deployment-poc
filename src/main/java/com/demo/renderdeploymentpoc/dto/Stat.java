package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Stat {
  @JsonProperty("base_stat")
  private Integer baseStat;

  private Integer effort;
  private NamedApiResource stat;
}

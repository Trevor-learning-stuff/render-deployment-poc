package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GameIndex {
  @JsonProperty("game_index")
  private Integer gameIndex;

  private NamedApiResource version;
}

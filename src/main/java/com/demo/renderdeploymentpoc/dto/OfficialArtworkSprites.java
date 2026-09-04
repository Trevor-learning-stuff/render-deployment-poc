package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OfficialArtworkSprites {
  @JsonProperty("front_default")
  private String frontDefault;

  @JsonProperty("front_shiny")
  private String frontShiny;
}

package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OtherSprites {
  @JsonProperty("dream_world")
  private DreamWorldSprites dreamWorld;

  private HomeSprites home;

  @JsonProperty("official-artwork")
  private OfficialArtworkSprites officialArtwork;

  private ShowdownSprites showdown;
}

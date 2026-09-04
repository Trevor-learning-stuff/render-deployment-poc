package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import lombok.Data;

@Data
public class Sprites {
  @JsonProperty("back_default")
  private String backDefault;

  @JsonProperty("back_female")
  private String backFemale;

  @JsonProperty("back_shiny")
  private String backShiny;

  @JsonProperty("back_shiny_female")
  private String backShinyFemale;

  @JsonProperty("front_default")
  private String frontDefault;

  @JsonProperty("front_female")
  private String frontFemale;

  @JsonProperty("front_shiny")
  private String frontShiny;

  @JsonProperty("front_shiny_female")
  private String frontShinyFemale;

  private OtherSprites other;

  private Map<String, Map<String, GenerationVersionSprites>> versions;
}

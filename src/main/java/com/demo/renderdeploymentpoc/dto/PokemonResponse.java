package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PokemonResponse {

  private Integer id;
  private String name;

  @JsonProperty("base_experience")
  private Integer baseExperience;

  private Integer height;

  @JsonProperty("is_default")
  private Boolean isDefault;

  private Integer order;
  private Integer weight;

  private List<Ability> abilities;
  private List<NamedApiResource> forms;

  @JsonProperty("game_indices")
  private List<GameIndex> gameIndices;

  @JsonProperty("held_items")
  private List<HeldItem> heldItems;

  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;

  private List<Move> moves;
  private NamedApiResource species;
  private Sprites sprites;
  private Cries cries;
  private List<Stat> stats;
  private List<Type> types;

  @JsonProperty("past_types")
  private List<PastType> pastTypes;

  @JsonProperty("past_abilities")
  private List<PastAbility> pastAbilities;
}

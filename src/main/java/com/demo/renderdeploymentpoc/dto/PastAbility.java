package com.demo.renderdeploymentpoc.dto;

import java.util.List;
import lombok.Data;

@Data
public class PastAbility {
  private NamedApiResource generation;
  private List<PastAbilityEntry> abilities;
}

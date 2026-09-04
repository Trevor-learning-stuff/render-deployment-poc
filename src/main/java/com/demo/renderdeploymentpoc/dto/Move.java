package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class Move {
  private NamedApiResource move;

  @JsonProperty("version_group_details")
  private List<VersionGroupDetail> versionGroupDetails;
}

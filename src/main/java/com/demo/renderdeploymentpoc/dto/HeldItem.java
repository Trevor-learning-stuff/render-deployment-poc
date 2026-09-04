package com.demo.renderdeploymentpoc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class HeldItem {
  private NamedApiResource item;

  @JsonProperty("version_details")
  private List<HeldItemVersionDetail> versionDetails;
}

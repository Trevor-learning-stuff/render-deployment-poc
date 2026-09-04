package com.demo.renderdeploymentpoc.dto;

import java.util.List;
import lombok.Data;

@Data
public class PastType {
  private NamedApiResource generation;
  private List<Type> types;
}

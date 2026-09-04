package com.demo.renderdeploymentpoc.controller;

import com.demo.renderdeploymentpoc.dto.PokemonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pokefetcher")
public interface PokemonFetcherApi {

  @GetMapping(path = "/{identifier}")
  ResponseEntity<PokemonResponse> getPokemonByIdOrName(@PathVariable("identifier") String idOrName);
}

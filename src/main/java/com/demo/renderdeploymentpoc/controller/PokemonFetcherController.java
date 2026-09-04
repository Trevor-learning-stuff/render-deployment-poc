package com.demo.renderdeploymentpoc.controller;

import com.demo.renderdeploymentpoc.dto.PokemonResponse;
import com.demo.renderdeploymentpoc.service.PokemonFetcherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PokemonFetcherController implements PokemonFetcherApi {

  private final PokemonFetcherService pokemonFetcherService;

  @Override
  public ResponseEntity<PokemonResponse> getPokemonByIdOrName(String idOrName) {
    return pokemonFetcherService.getPokemonByIdOrName(idOrName);
  }

}

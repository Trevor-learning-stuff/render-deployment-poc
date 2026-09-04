package com.demo.renderdeploymentpoc.service;

import com.demo.renderdeploymentpoc.client.PokeApiClient;
import com.demo.renderdeploymentpoc.dto.PokemonResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PokemonFetcherService {

  private final PokeApiClient pokeApiClient;

  public ResponseEntity<PokemonResponse> getPokemonByIdOrName(String idOrName) {
    return pokeApiClient.getPokemon(idOrName);
  }
}

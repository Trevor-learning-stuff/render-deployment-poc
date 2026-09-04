package com.demo.renderdeploymentpoc.client;

import com.demo.renderdeploymentpoc.dto.PokemonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class PokeApiClient {

  private final RestClient restClient;

  private static final String BASE_URL = "https://pokeapi.co";
  private static final String GET_POKEMON_URL = "/api/v2/pokemon/";

  public ResponseEntity<PokemonResponse> getPokemon(String idOrName) {
    return restClient.get()
        .uri(BASE_URL + GET_POKEMON_URL + idOrName)
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .toEntity(PokemonResponse.class);
  }
}

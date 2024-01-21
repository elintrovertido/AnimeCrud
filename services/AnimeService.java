package com.webclient.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.webclient.demo.models.Anime;
import com.webclient.demo.models.TopAnime;


@Service
public class AnimeService {

    private final String  baseURL = "https://myanimelist.p.rapidapi.com";
    private final String API_KEY = "0091ead0ebmshba1710fc1a31c45p149a8cjsnd1b14f67a789";
    private final String API_HOST = "myanimelist.p.rapidapi.com";

    private final WebClient webClient;

    public AnimeService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(baseURL).build();
    }

    public Anime getAnime(int animeID){
        Anime result = webClient.get()
        .uri("/anime/{id}",animeID)
        .header("X-RapidAPI-Key",API_KEY)
        .header("X-RapidAPI-Host",API_HOST)
        .retrieve()
        .bodyToMono(Anime.class)
        .block();

        // System.out.println(result.getTitle_ov());
        return result;
    }

    public List<TopAnime> getTopAnime(){
        List<TopAnime> result = webClient.get()
        .uri("/anime/top/all")
        .header("X-RapidAPI-Key",API_KEY)
        .header("X-RapidAPI-Host",API_HOST)
        .retrieve()
        .bodyToFlux(TopAnime.class)
        .collectList()
        .block();

        return result;
    }

    
}

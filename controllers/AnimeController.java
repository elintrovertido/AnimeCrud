package com.webclient.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webclient.demo.models.Anime;
import com.webclient.demo.models.TopAnime;
import com.webclient.demo.services.AnimeService;

@RestController
public class AnimeController {
    
    private final AnimeService animeService;

    public AnimeController(AnimeService animeService)
    {
        this.animeService = animeService;
    }

    @GetMapping("/{id}")
    public Anime getAnimeDetails(@PathVariable int id){
        return animeService.getAnime(id);
    }

    @GetMapping("/getTopAnime")
    public List<TopAnime> getTopAnimes(){
        return animeService.getTopAnime();
    }

}

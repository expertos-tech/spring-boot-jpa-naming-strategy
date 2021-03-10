package com.chinook.store.api.controller;

import com.chinook.store.api.model.ArtistModel;
import com.chinook.store.api.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArtistController {

    private final ArtistRepository artistRepository;

    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @GetMapping("/all-artists")
    public Iterable<ArtistModel> allArtists() {
        return artistRepository.findAll();
    }
}

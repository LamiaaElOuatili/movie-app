package com.example.movieappback.controller;

import com.example.movieappback.entity.FavouriteMovie;
import com.example.movieappback.repository.FavouriteMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:80")
@RequestMapping("")
public class FavouriteMovieController {

    @Autowired
    private FavouriteMovieRepository favouriteMovieRepository;

    @GetMapping("/favourites")
    public List<FavouriteMovie> getAllFavouriteMovies(){
      return favouriteMovieRepository.findAll();
    }

    @PostMapping("/addfavourite")
    public FavouriteMovie createFavouriteMovie(@RequestBody FavouriteMovie favouriteMovie){
        return favouriteMovieRepository.save(favouriteMovie);
    }
}

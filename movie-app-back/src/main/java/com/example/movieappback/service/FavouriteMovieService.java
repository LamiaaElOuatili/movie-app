package com.example.movieappback.service;

import com.example.movieappback.entity.FavouriteMovie;
import com.example.movieappback.repository.FavouriteMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavouriteMovieService {

    @Autowired
    private FavouriteMovieRepository favouriteMovieRepository;

    public FavouriteMovie addFavouriteMovie(FavouriteMovie favouriteMovie){
        // I need to add things
        return favouriteMovieRepository.save(favouriteMovie);
    }
}

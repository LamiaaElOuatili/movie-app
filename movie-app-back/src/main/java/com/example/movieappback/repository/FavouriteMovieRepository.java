package com.example.movieappback.repository;

import com.example.movieappback.entity.FavouriteMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteMovieRepository extends JpaRepository<FavouriteMovie, Integer> {

}

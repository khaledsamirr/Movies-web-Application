package com.movieAPI.Movies.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/")
    public ResponseEntity<List> allMovies(){
    return new ResponseEntity<List>(movieService.allMovies(), HttpStatus.OK);

    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieByImdb(@PathVariable String imdbId){

        return new ResponseEntity<Optional<Movie>>(movieService.getMoviebyImdb(imdbId),HttpStatus.OK);

    }
}

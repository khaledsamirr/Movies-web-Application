package com.movieAPI.Movies.Movie;

import com.movieAPI.Movies.Movie.Movie;
import com.movieAPI.Movies.Movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    };

    public Optional<Movie> getMoviebyImdb(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    };

}

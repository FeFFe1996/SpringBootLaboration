package org.example.springprojekt.movies;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovieList() {
        return movieRepository.findAll();
    }
}

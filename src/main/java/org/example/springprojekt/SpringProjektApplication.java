package org.example.springprojekt;

import org.example.springprojekt.movies.Movie;
import org.example.springprojekt.movies.MovieRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProjektApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringProjektApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(MovieRepository movieRepository) {
        return args -> {
            if (movieRepository.count() == 0) {
                Movie movie = new Movie();
                movie.setTitle("The Shawshank Redemption");
                movie.setDirector("Frank Darabont");
                movie.setYear("1994");
                movieRepository.save(movie);
            }
        };
    }
}

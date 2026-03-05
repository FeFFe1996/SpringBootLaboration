package org.example.springprojekt.movies;

import org.springframework.data.repository.ListCrudRepository;

public interface MovieRepository extends ListCrudRepository<Movie, Integer> {
}

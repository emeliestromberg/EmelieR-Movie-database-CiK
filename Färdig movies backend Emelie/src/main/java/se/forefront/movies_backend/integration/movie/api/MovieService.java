package se.forefront.movies_backend.integration.movie.api;

import se.forefront.movies_backend.domain.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();

    void addMovie(Movie movie);

    void deleteMovie(String id);
}

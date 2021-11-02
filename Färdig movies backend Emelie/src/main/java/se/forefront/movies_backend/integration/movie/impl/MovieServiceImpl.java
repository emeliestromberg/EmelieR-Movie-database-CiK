package se.forefront.movies_backend.integration.movie.impl;

import org.springframework.stereotype.Service;
import se.forefront.movies_backend.domain.model.Movie;
import se.forefront.movies_backend.integration.movie.api.MovieService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    List<Movie> fakeBadMovieDatabase = new ArrayList<>();

    @Override
    public List<Movie> getAllMovies() {
        return fakeBadMovieDatabase;
    }

    @Override
    public void addMovie(Movie movie) {
        Integer id =  fakeBadMovieDatabase.size() + 1;
        movie.setId(id.toString());
        fakeBadMovieDatabase.add(movie);
    }

    @Override
    public void deleteMovie(String id) {
        List<Movie> tempList  = fakeBadMovieDatabase.stream()
                .filter(movie -> !movie.getId().equals(id)).collect(Collectors.toList());

        fakeBadMovieDatabase = tempList;
    }


}

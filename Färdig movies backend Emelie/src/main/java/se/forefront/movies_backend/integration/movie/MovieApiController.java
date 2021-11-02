package se.forefront.movies_backend.integration.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.forefront.movies_backend.domain.model.Movie;
import se.forefront.movies_backend.integration.BaseApiController;
import se.forefront.movies_backend.integration.movie.api.MovieService;

import java.util.List;

@RestController
public class MovieApiController extends BaseApiController {

    private final MovieService movieService;

    @Autowired
    public MovieApiController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie/getAll")
    public List<Movie> getMovies() {

        return movieService.getAllMovies();
    }

    @PostMapping("/movie/add")
    public void addMovie(@RequestBody Movie movie) {

        movieService.addMovie(movie);
    }

    @DeleteMapping("/movie/delete" )
    public void deleteMovie(@RequestParam("id") String id){

        movieService.deleteMovie(id);
    }
}

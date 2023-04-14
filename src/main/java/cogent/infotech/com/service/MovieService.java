package cogent.infotech.com.service;

import cogent.infotech.com.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Movie save(Movie movie);
    Optional<Movie> get(long movieId);
    List<Movie> fetchMovieList();
    Movie update(Movie movie);
    void delete(Movie movie);
    void deleteAll();
}

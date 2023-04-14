package cogent.infotech.com.service;

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Optional<Movie> get(long movieId) {
        return movieRepository.findById(movieId);
    }

    @Override
    public List<Movie> fetchMovieList() {
        return movieRepository.findAll();
    }

    @Override
    public Movie update(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void delete(Movie movie) {
        movieRepository.delete(movie);
    }

    @Override
    public void deleteAll() {
        movieRepository.deleteAll();
    }
}

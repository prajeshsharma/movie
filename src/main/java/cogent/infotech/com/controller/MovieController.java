package cogent.infotech.com.controller;

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/movies")
    public Movie add(@Validated @RequestBody Movie movie) {
        return movieService.save(movie);
    }
}

package com.example.demo.repository;

import com.example.demo.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Repository
public class MovieRepository {

    public Set<Movie> getMovieList() {
        Set<Movie> movies = new HashSet<>();
        Movie movie = new Movie();
        movie.setName("Spring in Action");
        movie.setPublishDate(new Date(2005));
        Movie movie2 = new Movie();
        movie2.setName("Java in Action");
        movie2.setPublishDate(new Date(2015));
        Movie movie3 = new Movie();
        movie3.setName("JavaScript in Action");
        movie3.setPublishDate(new Date(2025));
        movies.add(movie);
        movies.add(movie2);
        movies.add(movie3);
        return movies;
    }

    public Set<Movie> getMovieList(int a) {
        return null;
    }
}

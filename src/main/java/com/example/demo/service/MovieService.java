package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Set<Movie> getMovieList() {
        return movieRepository.getMovieList(1);
    }
}

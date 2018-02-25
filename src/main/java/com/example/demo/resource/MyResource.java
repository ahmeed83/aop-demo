package com.example.demo.resource;

import com.example.demo.exception.BookNotFoundException;
import com.example.demo.exception.MovieNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.model.Movie;
import com.example.demo.service.BookService;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;
import java.util.logging.Logger;


@Path("/")
@Component
public class MyResource {

    @Autowired
    BookService bookService;

    @Autowired
    MovieService movieService;

    private static final Logger log = Logger.getLogger(MyResource.class.getName());

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Book> geBooks() throws BookNotFoundException {
        int customerId = 1;
        String endpointName = "read books";
        Set<Book> books = bookService.getBookList();
        if(books == null) {
            throw new BookNotFoundException("my friend you are not allowed to " + endpointName, customerId);
        }
        return books;
    }

    @GET
    @Path("/movies")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Movie> getMovies() throws MovieNotFoundException {
        int customerId = 2;
        String endpointName = "watch movies";
        Set<Movie> movies = movieService.getMovieList();
        if(movies == null) {
            throw new MovieNotFoundException("my friend you are not allowed to " + endpointName, customerId);
        }
        return movies;
    }
}


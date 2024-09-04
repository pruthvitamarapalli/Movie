package com.example.movie;

import java.util.*;

interface MovieRepository {
    ArrayList<Movie> getAllMovies();

    Movie getMovieById(int movieId);

    Movie addMovie(Movie movie);

    Movie updateMovie(int movieId, Movie movie);

    void deleteMovie(int movieId);

}
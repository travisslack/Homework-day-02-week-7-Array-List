package com.example.movieranking.Movie;

import java.util.ArrayList;

/**
 * Created by travisgrimmond on 07/08/2017.
 */

public class MovieRanking {

    private ArrayList<Movie> movies;

    public MovieRanking() {
        movies = new ArrayList<Movie>();
    }

    public MovieRanking(ArrayList<Movie> newMovies) {
        movies = newMovies;
    }

    public ArrayList<Movie> getMovies() {
        return new ArrayList<Movie> (movies);
    }


    public int getLength() {
        return movies.size;
    }
}

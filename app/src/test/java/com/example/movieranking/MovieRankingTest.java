package com.example.movieranking;

import com.example.movieranking.Movie.Movie;
import com.example.movieranking.Movie.MovieRanking;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by travisgrimmond on 07/08/2017.
 */

public class MovieRankingTest {

    ArrayList<Movie> testRankings;

    @Before
    public void before() {
        testRankings = new ArrayList<Movie>();
        testRankings.add("Film1")
        testRankings.add("Film2")
    }

    @Test
    public void testCreateMovieRankingsWithList() {
        MovieRanking movieRanking = new MovieRanking(testRankings);
        assertEquals(2, movieRanking.getLength());
    }
}

package com.example.movieranking;

import com.example.movieranking.Movie.Movie;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;

public class MovieTest {

    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Lord of the Rings", "Adventure", 3);
    }

    @Test
    public void testSetName() {
        assertEquals("Lord of the Rings", movie.getName());
    }

    @Test
    public void testSetGenre() {
        assertEquals("Adventure", movie.getGenre());
    }

    @Test
    public void testSetRanking() {
        assertEquals(3, movie.getRanking());
    }


}

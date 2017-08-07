package com.example.movieranking.Movie;

public class Movie {
    private String name;
    private String genre;
    private int currentRanking;

    public Movie(String name, String genre, int currentRanking) {
        this.name = name;
        this.genre = genre;
        this.currentRanking = currentRanking;
    }


    public String getName() {

        return this.name;
    }

    public String getGenre() {

        return this.genre;
    }

    public int getRanking() {

        return this.currentRanking;
    }

    public String toString() {
        return "Title: " + this.name + " , Genre: " + this.genre + " , Ranking: " + this.currentRanking;
    }
}
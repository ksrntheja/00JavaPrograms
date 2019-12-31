package org.ksrntheja.javaprograms.eigth.consumer.consumeregs;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {

    String name;
    String hero;
    String heroine;

    Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }

}


public class DisplayMovieInformation {

    public static void main(String[] args) {

        ArrayList<Movie> l = new ArrayList<Movie>();
        populate(l);

        Consumer<Movie> movieConsumer = movie -> {
            System.out.println("Movie Name:" + movie.name);
            System.out.println("Movie Hero:" + movie.hero);
            System.out.println("Movie Heroine:" + movie.heroine);
            System.out.println();
        };

        for (Movie movie : l) {
            movieConsumer.accept(movie);
        }

    }

    public static void populate(ArrayList<Movie> l) {
        l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
        l.add(new Movie("Rayees", "Sharukh", "Sunny"));
        l.add(new Movie("Dangal", "Ameer", "Ritu"));
        l.add(new Movie("Sultan", "Salman", "Anushka"));
    }

}

/*
Movie Name:Bahubali
Movie Hero:Prabhas
Movie Heroine:Anushka

Movie Name:Rayees
Movie Hero:Sharukh
Movie Heroine:Sunny

Movie Name:Dangal
Movie Hero:Ameer
Movie Heroine:Ritu

Movie Name:Sultan
Movie Hero:Salman
Movie Heroine:Anushka
 */
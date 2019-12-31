package org.ksrntheja.javaprograms.eigth.consumer.chain;

import java.util.function.Consumer;

class Movie {

    String name;
    String result;

    Movie(String name, String result) {
        this.name = name;
        this.result = result;
    }

}


public class DisplayMovieInformationChain {

    public static void main(String[] args) {


        Consumer<Movie> releaseConsumer = m -> System.out.println("Movie:" + m.name + " is ready to release");

        Consumer<Movie> releasedConsumer = m -> System.out.println("Movie:" + m.name + " is just Released and it is:" + m.result);

        Consumer<Movie> dataBaseConsumer = m -> System.out.println("Movie:" + m.name + " information storing in the database");

        Consumer<Movie> chainedC = releaseConsumer.andThen(releasedConsumer).andThen(dataBaseConsumer);

        Movie m1 = new Movie("Bahubali", "Hit");
        chainedC.accept(m1);

        Movie m2 = new Movie("Spider", "Flop");
        chainedC.accept(m2);

    }

}

/*
Movie:Bahubali is ready to release
Movie:Bahubali is just Released and it is:Hit
Movie:Bahubali information storing in the database
Movie:Spider is ready to release
Movie:Spider is just Released and it is:Flop
Movie:Spider information storing in the database
 */
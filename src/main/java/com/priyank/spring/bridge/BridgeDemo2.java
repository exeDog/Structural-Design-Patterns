package com.priyank.spring.bridge;

public class BridgeDemo2 {

    public static void main(String[] args) {
        Movie movie = new Movie("Action", "John Wick", "120", "2017");

        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(new PrintFormatter());

        String htmlMaterial = moviePrinter.print(new HtmlFormatter());

        System.out.println(printedMaterial);
        System.out.println(htmlMaterial);
    }
}

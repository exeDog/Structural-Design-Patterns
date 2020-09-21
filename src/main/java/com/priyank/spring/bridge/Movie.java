package com.priyank.spring.bridge;

public class Movie {
    private String classification;
    private String title;
    private String runTime;
    private String year;

    public Movie(String classification, String title, String runTime, String year) {
        this.classification = classification;
        this.title = title;
        this.runTime = runTime;
        this.year = year;
    }

    public String getClassification() {
        return classification;
    }

    public String getTitle() {
        return title;
    }

    public String getRunTime() {
        return runTime;
    }

    public String getYear() {
        return year;
    }
}

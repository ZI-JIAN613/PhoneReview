package com.example.phonereview;

import java.io.Serializable;

public class Phone implements Serializable {

    private int id;
    private String name;
    private String description;
    private int yearReleased;
    private int stars;

    public Phone(String name, String description, int yearReleased, int stars) {
        this.name = name;
        this.description = description;
        this.yearReleased = yearReleased;
        this.stars = stars;
    }

    public Phone(int id, String name, String description, int yearReleased, int stars) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.yearReleased = yearReleased;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public Phone setId(int id) {
        this.id = id;
        return this;

    }

    public String getName() {
        return name;
    }

    public Phone setName(String title) {
        this.name = title;
        return this;
    }

    public String getDescription() {
        return description;
    }


    public Phone setDescription(String singers) {
        this.description = singers;
        return this;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public Phone setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
        return this;
    }

    public int getStars() {
        return stars;
    }

    public Phone setStars(int stars) {
        this.stars = stars;
        return this;
    }

    @Override
    public String toString() {
        String starsString = "";
        /*
        if (stars == 5){
            starsString = "*****";
        } else if (stars == 4){
            starsString = "****";
        }
        */

        //or
        for(int i = 0; i < stars; i++){
            starsString += " *";
        }
        return starsString;

    }
}
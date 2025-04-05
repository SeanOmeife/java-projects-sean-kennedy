package com.project;

public class project {
    public static void main(String[] args) {

        // Declare variables for the dinosaurs breed
        String breed, dino_name, diet;
        int height, length, weight;
        int age;

        // Assign values to the variables
        breed = "Triceratops";
        height = 22; //in ft
        weight = 20; //in tonnes
        length= 23; //in meters
        age = 200;
        dino_name = "Snadra";
        diet = "herbivore";

        // Print the dinosaur's basic details
        System.out.printf("Meet %s , a %d-year old %s. As a %s, it has a robust weight of %d tonnes, as tall as %dft and as long as %dmeters", dino_name, age, breed, diet, weight, height, length);
    }
}

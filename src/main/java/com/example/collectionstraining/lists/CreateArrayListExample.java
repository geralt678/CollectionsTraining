package com.example.collectionstraining.lists;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CreateArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of String using
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        animals.forEach(log::info);
        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        animals.forEach(log::info);

    }
}
package com.example.collectionstraining.lists;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        log.info("Does names array contain \"Bob\"? : " + names.contains("Bob"));

        // Find the index of the first occurrence of an element in an ArrayList
        log.info("indexOf \"Steve\": " + names.indexOf("Steve"));
        log.info("indexOf \"Mark\": " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        log.info("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
        log.info("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));
    }
}

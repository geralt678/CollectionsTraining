package com.example.collectionstraining.lists;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {


        String [] colors = {"red", "black"};

        log.info(colors[0]);

        List<String> topCompanies = new ArrayList<>();

        topCompanies.add("firma-1");
        topCompanies.add("firma-2");
        topCompanies.add(1, "firma3");



        //podstawowa pętla for
        for (int i = 0; i < topCompanies.size(); i++) {
            log.info("element numer: {} - {}", i, topCompanies.get(i));
        }




        log.info("zawiera? {} ", topCompanies.contains("firma3"));

        topCompanies.remove("firma3");

        //pętla foreach
        for (String element : topCompanies) {
            log.info("element numer: {} ", element);
        }
        log.info("zawiera? {} ", topCompanies.contains("firma3"));


        // [0] [1] [2] [3]



        // Check if an ArrayList is empty
        log.info("Is the topCompanies list empty? : {} {}", topCompanies.isEmpty(), colors[1]);

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        topCompanies.add("Cisco");

        // Find the size of an ArrayList
        log.info("Here are the top " + topCompanies.size() + " companies in the world");


        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        log.info("Best Company: " + bestCompany);
        log.info("Second Best Company: " + secondBestCompany);
        log.info("Last Company in the list: " + lastCompany);

        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        log.info("Modified top companies list: " + topCompanies);
    }
}

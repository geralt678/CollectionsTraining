package com.example.collectionstraining.lists;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Slf4j
public class IterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");

        log.info("=== Iterate using Java 8 forEach and lambda ===");
        tvShows.forEach(log::info);

        log.info("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            log.info(tvShow);
        }

        log.info("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            log.info(tvShow);
        });

        log.info("\n=== Iterate using a listIterator() to traverse in both directions ===");
        // Here, we start from the end of the list and traverse backwards.
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            log.info(tvShow);
        }

        log.info("\n=== Iterate using simple for-each loop ===");
        for(String tvShow: tvShows) {
            log.info(tvShow);
        }

        log.info("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvShows.size(); i++) {
            log.info(tvShows.get(i));
        }
    }
}

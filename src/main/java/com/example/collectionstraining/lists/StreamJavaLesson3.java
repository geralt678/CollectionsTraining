package com.example.collectionstraining.lists;

import com.example.collectionstraining.model.Oem;
import com.example.collectionstraining.model.User;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StreamJavaLesson3 {
    public static void main(String[] args) {



        List<User> users = new ArrayList<>();


        User user1 = new User("Agnieszka", 56);
        User user2 = new User("Ala", 16);
        User user3 = new User("Alicja", 46);
        User user4 = new User("Marta", 46);
        User user5 = new User("Natalia", 26);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);


        // Przed java 8
        List<User>  youngUserList = new ArrayList<>();
        for (User user : users) {
            if (filter30(user.getAge())) {
                youngUserList.add(user);
            }
        }

        log.info("Nowa lista ma {} userow", youngUserList.size());


        // Od Java 8
        List<User> newKoleckjaStream = users.stream()
                .filter(user -> user.getAge() < 30)
                .filter(user -> user.getName().length() < 6)
                .toList();

        log.info("praca ze stream'ami jest super {} ", newKoleckjaStream.size());


        users.forEach(user -> log.info("user {} ", user.getName()));



        //same imiona
        List<String> sameImiona = users.stream()
                .map(User::getName)
                .toList();

        sameImiona.forEach(imie -> log.info("imie -  {} ", imie));


        //dodanie 20 lat
        users.forEach(User::add20);

        users.forEach(user -> log.info("user  nowy wiek -  {} ", user.getAge()));


        //pociecie stringa
        String names = "Tomek, Agnieszka, Jacek, Bogdan";

        List<String> list = Arrays.stream(names.split(",")).toList();
        list.forEach(imie -> log.info("lista imion  -  {} ", imie));

    }

    public static boolean filter30(int age) {
        return age < 30;
    }

}

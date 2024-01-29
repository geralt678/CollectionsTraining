package com.example.collectionstraining.lists;

import com.example.collectionstraining.model.Oem;
import com.example.collectionstraining.model.User;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class IfArrayListExampleLesson3 {
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


        int i = 0;

        while (user1.getAge() > user2.getAge() && i < 20) {
            log.info("krece się {}", i);
            i++;
        }

        do {

            log.info("zakreciłem sie za bardzo {} ", i);
            i--;

            if (i == 15) {
                log.info("15 koniec roboty");
                break;
            }
        } while (user1.getAge() > user2.getAge() && i < 20 && i >= 0);


        log.info("switch test {}", showAge(546));



        User carUser = new User("Bogdan", 90, Oem.OPEL);


        log.info("oem id : {} ", showIdNumber(carUser.getOem()));

    }

    public static boolean ageGreaterThan(User user1, User user2) {
        return user1.getAge() > user2.getAge();
    }

    public static String ageGreaterThan2(User user1, User user2) {
        if (user1.getAge() > user2.getAge()) {
            return "wieksze";
        }
        return "mniejsze";
    }

    public static String ageGreaterThan3(User user1, User user2) {
        return user1.getAge() > user2.getAge() ? "wieksze" : "mniejsze";
    }

    public static String showAge(int age) {

        return switch (age) {
            case 56 -> "piec sześć";
            case 16 -> "16";
            case 26 -> "26";
            default -> "nie ma takiego wieku";
        };

/**
        switch (age) {
            case 56: {
                return "piec sześć";
            }
            case 16: {
                return "16";
            }
            case 26: {
                return "26";
            }
            default: return "nie ma takiego wieku";
        }

 **/
    }

    public static Integer showIdNumber(Oem type) {
        return switch (type) {
            case OPEL -> Oem.OPEL.getOemId();
            case RENAULT -> Oem.RENAULT.getOemId();
            case SKODA -> Oem.SKODA.getOemId();
        };
    }

}

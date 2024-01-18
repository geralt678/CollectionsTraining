package com.example.collectionstraining.lists;

import com.example.collectionstraining.model.User;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ArrayListUserDefinedObjectExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Rajeev", 25));
        users.add(new User("John", 34));
        users.add(new User("Steve", 29));

        users.forEach(user -> {
            log.info("Name : " + user.getName() + ", Age : " + user.getAge());
        });
    }
}

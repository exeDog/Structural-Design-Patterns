package com.priyank.spring.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeDemo {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("site_role", "person");
        person.put("access_role", "limited");

        Map<String, String> group = new HashMap<>();

        group.put("group_role", "claims");

        Map<String, String> security = new HashMap<>();
        security.putAll(person);
        security.putAll(group);

        System.out.println(security);
    }
}

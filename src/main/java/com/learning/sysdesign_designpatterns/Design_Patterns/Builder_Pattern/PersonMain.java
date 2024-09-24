package com.learning.sysdesign_designpatterns.Design_Patterns.Builder_Pattern;

public class PersonMain {
    public static void main(String[] args) {
        Person person = Person
                .builder()
                .name("Sid")
                .age(30)
                .build();
        System.out.println(person);
    }
}

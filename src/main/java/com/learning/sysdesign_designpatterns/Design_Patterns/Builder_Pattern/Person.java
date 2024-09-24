package com.learning.sysdesign_designpatterns.Design_Patterns.Builder_Pattern;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {
    private String name;
    private int age;
}


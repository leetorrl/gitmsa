package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

person[] parr = {
        new person("ddd",40),
        new person("a",20),
        new person("bb",30),
        new person("ccc",40),
};

        Arrays.sort(parr);

        System.out.println(Arrays.toString(parr));
    }
}
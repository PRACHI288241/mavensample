package org.sample.mavensample;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {

        String name = "Prachi";

        boolean result = StringUtils.isEmpty(name);

        System.out.println("Is empty? " + result);
    }
}
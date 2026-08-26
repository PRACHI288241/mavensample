package org.sample.mavensample;

import org.apache.commons.lang3.StringUtils;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        String name = "Prachi";

        boolean result = StringUtils.isEmpty(name);

        logger.info("Name: " + name);
        logger.info("Is empty? " + result);

        String reversedName = StringUtils.reverse(name);
        logger.info("Reversed name: " + reversedName);
    }
}
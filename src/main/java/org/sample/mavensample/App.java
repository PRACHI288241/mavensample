package org.sample.mavensample;

import org.apache.commons.lang3.StringUtils;
import java.util.logging.Logger;
import java.util.logging.Level;

public class App {

    private static final Logger logger =
            Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        String name = "Prachi";

        boolean result = StringUtils.isEmpty(name);

        logger.log(Level.INFO, "Name: {0}", name);
        logger.log(Level.INFO, "Is empty? {0}", result);

        String reversedName = StringUtils.reverse(name);

        logger.log(Level.INFO, "Reversed name: {0}", reversedName);
    }
}
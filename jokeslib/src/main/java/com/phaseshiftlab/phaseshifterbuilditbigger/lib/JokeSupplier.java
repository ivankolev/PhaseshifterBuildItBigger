package com.phaseshiftlab.phaseshifterbuilditbigger.lib;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

public class JokeSupplier {

    public static String supplyJoke(){
        java.util.Properties prop = new Properties();
        Integer jokesLength;
        try {
            prop.loadFromXML(JokeSupplier.class.getResourceAsStream("/jokes.xml"));
            jokesLength = prop.size() -1;
            int rand = ThreadLocalRandom.current().nextInt(0,jokesLength);
            return prop.getProperty("joke" + rand);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "No Jokes!";
    }
}

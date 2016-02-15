package com.phaseshiftlab.phaseshifterbuilditbigger.lib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JokeSupplier {

    public static String supplyJoke(){
        java.util.Properties prop = new Properties();
        try {
            prop.loadFromXML(JokeSupplier.class.getResourceAsStream("/jokes.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(prop.getProperty("joke1"));
        return prop.getProperty("joke1");
    }
}

package ru.letnes.core;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FGService {
    private static Logger logger = Logger.getLogger(FGService.class.getName());

    public String getMeSomething() {
        logger.log(Level.INFO, "Someone asks for something");
        return "Something";
    }
}

package ru.letnes.app;

import ru.letnes.core.FGService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        logger.log(Level.INFO, "It is app module");
        FGService fgService = new FGService();
        String meSomething = fgService.getMeSomething();
        logger.log(Level.INFO, meSomething);
    }
}

package Java_Core.Theme_4;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Task_4 {

    public static void main(String[] args) {

        Logger.getLogger("Java_Core.Theme_4.Task_4.ClassA").setLevel(Level.ALL);
        Logger.getLogger("Java_Core.Theme_4.Task_4.ClassB").setLevel(Level.WARNING);
        Logger.getLogger("Java_Core.Theme_4.Task_4").setLevel(Level.ALL);

        Logger.getLogger("Java_Core.Theme_4.Task_4.ClassA").info("Test A");
        Logger.getLogger("Java_Core.Theme_4.Task_4.ClassB").warning("Test B");
        Logger.getLogger("Java_Core.Theme_4.Task_4").info("Test B");

        Logger logger = Logger.getLogger("Java_Core.Theme_4.Task_4");
        logger.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());

        logger.addHandler(handler);

    }
}

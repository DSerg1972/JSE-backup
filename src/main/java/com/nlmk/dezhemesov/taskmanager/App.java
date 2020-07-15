package com.nlmk.dezhemesov.taskmanager;

import static com.nlmk.dezhemesov.taskmanager.constants.Console.*;

/**
 * Консольный модуль. Точка входа в приложение
 */

public class App {

    /**
     * Точка входа в приложение
     *
     * @param args - аргументы командной строки
     */
    public static void main(final String[] args) {
        processKeys(args);
        System.out.println("*** WELCOME TO THE TASK MANAGER ***");
    }

    /**
     * Обработчик ключей запуска
     *
     * @param args аргументы командной строки
     */
    private static void processKeys(String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        switch (args[0]) {
            case KEY_ABOUT:
                showAbout();
            case KEY_HELP:
                showHelp();
            case KEY_VERSION:
                showVersion();
            default:
                showUnknownKey(args[0]);
        }
    }

    private static void showAbout() {
        System.out.println("Author: Serge Dezhemesov");
        System.out.println("        dserg1972@gmail.com");
        System.exit(0);
    }

    private static void showVersion() {
        System.out.println("Version: 1.0.0");
        System.exit(0);
    }

    private static void showHelp() {
        System.out.println("Usage: java -jar taskmanager.jar [about|help|version]");
        System.out.println("  about   - display developer info");
        System.out.println("  help    - display usage");
        System.out.println("  version - display version info");
        System.exit(0);
    }

    /**
     * @param key значение неподдерживаемого ключа
     */
    private static void showUnknownKey(String key) {
        System.out.println("Unknown key: \"" + key + "\"");
        System.exit(1);
    }

}

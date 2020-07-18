package com.nlmk.dezhemesov.taskmanager;

import java.util.Scanner;

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
        run(args);
        displayWelcome();
        process();
    }

    /**
     * Основной цикл обработки интерактивных команд
     */
    private static void process() {
        final Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!EXIT.equals(command)) {
            command = scanner.nextLine();
            run(command);
            System.out.println();
        }
    }

    /**
     * Обработчик ключей запуска
     *
     * @param args аргументы командной строки
     */
    private static void run(String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        String command = args[0];
        int result = run(command);
        System.exit(result);
    }

    /**
     * Обработчик команды
     *
     * @param command команда на исполнение
     * @return результат выполнения команды
     */
    private static int run(final String command) {
        if (command == null || command.isEmpty()) return -1;
        switch (command) {
            case VERSION:
                return displayVersion();
            case ABOUT:
                return displayAbout();
            case HELP:
                return displayHelp();
            case EXIT:
                return exit();
            default:
                return displayError();
        }
    }

    /**
     * Вывод строки-приветствия
     */
    private static void displayWelcome() {
        System.out.println("*** WELCOME TO THE TASK MANAGER ***");
    }

    /**
     * Сведения о программе
     */
    private static int displayAbout() {
        System.out.println("Author: Serge Dezhemesov");
        System.out.println("        dserg1972@gmail.com");
        return 0;
    }

    /**
     * Сведенеия о версии
     */
    private static int displayVersion() {
        System.out.println("Version: 1.0.0");
        return 0;
    }

    /**
     * Перечень команд
     */
    private static int displayHelp() {
        System.out.println("Usage: java -jar taskmanager.jar [about|help|version]");
        System.out.println("  about   - display developer info");
        System.out.println("  help    - display usage");
        System.out.println("  version - display version info");
        System.out.println("  exit    - terminate program");
        return 0;
    }

    /**
     * Сообщение об ошибочной команде
     */
    private static int displayError() {
        System.out.println("Unknown command");
        return -1;
    }

    /**
     * Обработка команды выхода из программы
     *
     * @return результат вызова
     */
    private static int exit() {
        System.out.println("Terminating program ...");
        System.exit(0);
        return 0;
    }

}

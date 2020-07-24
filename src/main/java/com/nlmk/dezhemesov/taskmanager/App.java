package com.nlmk.dezhemesov.taskmanager;

import com.nlmk.dezhemesov.taskmanager.dao.ProjectDAO;
import com.nlmk.dezhemesov.taskmanager.dao.TaskDAO;

import java.util.Scanner;

import static com.nlmk.dezhemesov.taskmanager.constants.Console.*;

/**
 * Консольный модуль. Точка входа в приложение
 */

public class App {

    /**
     * Хранилище проектов
     */
    private static final ProjectDAO projects = new ProjectDAO();

    /**
     * Хранилище задач
     */
    private static final TaskDAO tasks = new TaskDAO();

    /**
     * Обработчик системного ввода
     */
    private static final Scanner scanner = new Scanner(System.in);

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
     * Чтение команды из системного ввода
     *
     * @return команда
     */
    private static String readCommand() {
        String command;
        command = scanner.nextLine();
        return command;
    }

    /**
     * Основной цикл обработки интерактивных команд
     */
    private static void process() {
        String command = "";
        while (!EXIT.equals(command)) {
            command = readCommand();
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
            case PROJECT_CREATE:
                return createProject();
            case PROJECT_LIST:
                return listProject();
            case PROJECT_CLEAR:
                return clearProject();
            case TASK_CREATE:
                return createTask();
            case TASK_LIST:
                return listTask();
            case TASK_CLEAR:
                return clearTask();
            default:
                return displayError();
        }
    }

    /**
     * Добавление проекта в хранилище
     *
     * @return код возврата
     */
    private static int createProject() {
        System.out.println("[CREATE PROJECT]");
        System.out.print("Enter project name: ");
        final String name = readCommand();
        projects.create(name);
        System.out.println("[OK]");
        return 0;
    }

    /**
     * Вывод списка проектов в хранилище
     *
     * @return код возврата
     */
    private static int listProject() {
        System.out.println("[LIST PROJECT]");
        System.out.println(projects.findAll());
        System.out.println("[OK]");
        return 0;
    }

    /**
     * Удаление всех проектов из хранилища
     *
     * @return код возврата
     */
    private static int clearProject() {
        System.out.println("[CLEAR PROJECT]");
        projects.clear();
        System.out.println("[OK]");
        return 0;
    }

    /**
     * Добавление задачи в хранилище
     *
     * @return код возврата
     */
    private static int createTask() {
        System.out.println("[CREATE TASK]");
        System.out.print("Enter task name: ");
        final String name = readCommand();
        tasks.create(name);

        System.out.println("[OK]");
        return 0;
    }

    /**
     * Вывод списка задач в хранилище
     *
     * @return код возврата
     */
    private static int listTask() {
        System.out.println("[LIST TASK]");
        System.out.println(tasks.findAll());
        System.out.println("[OK]");
        return 0;
    }

    /**
     * Удаление всех задач из хранилища
     *
     * @return код возврата
     */
    private static int clearTask() {
        System.out.println("[CLEAR TASK]");
        tasks.clear();
        System.out.println("[OK]");
        return 0;
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
        System.out.println("Usage: java -jar taskmanager.jar [command]");
        System.out.println("Commands:");
        System.out.println("  about   - display developer info");
        System.out.println("  help    - display usage");
        System.out.println("  version - display version info");
        System.out.println("  exit    - terminate program");
        System.out.println();
        System.out.println("  project-create - create new project");
        System.out.println("  project-list   - display list of projects");
        System.out.println("  project-clear  - remove all projects");
        System.out.println();
        System.out.println("  task-create - create new task");
        System.out.println("  task-list   - display list of tasks");
        System.out.println("  task-clear  - remove all task");
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

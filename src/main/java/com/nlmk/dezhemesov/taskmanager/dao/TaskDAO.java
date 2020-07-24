package com.nlmk.dezhemesov.taskmanager.dao;

import com.nlmk.dezhemesov.taskmanager.entity.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Хранилище задач
 */
public class TaskDAO {

    /**
     * Список задач
     */
    private List<Task> tasks = new ArrayList<>();

    /**
     * Создание задачи и добавление в хранилище
     *
     * @param name имя задачи
     * @return созданная задача
     */
    public Task create(final String name) {
        final Task task = new Task(name);
        tasks.add(task);
        return task;
    }

    /**
     * Очистка хранилища
     */
    public void clear() {
        tasks.clear();
    }

    /**
     * Список задач
     *
     * @return список задач
     */
    public List<Task> findAll() {
        return tasks;
    }


}

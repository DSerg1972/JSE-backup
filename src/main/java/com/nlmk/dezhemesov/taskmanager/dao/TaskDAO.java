package com.nlmk.dezhemesov.taskmanager.dao;

import com.nlmk.dezhemesov.taskmanager.entity.Project;
import com.nlmk.dezhemesov.taskmanager.entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskDAO {

    private List<Task> tasks = new ArrayList<>();

    public Task create(final String name) {
        final Task task = new Task(name);
        tasks.add(task);
        return task;
    }

    public void clear() {
        tasks.clear();
    }

    public List<Task> findAll() {
        return tasks;
    }

    public static void main(String[] args) {
        final TaskDAO taskDAO = new TaskDAO();
        taskDAO.create("First task");
        taskDAO.create("Second task");
        System.out.println(taskDAO.findAll());
    }

}

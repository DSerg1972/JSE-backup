package com.nlmk.dezhemesov.taskmanager.dao;

import com.nlmk.dezhemesov.taskmanager.entity.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Хранилище проектов
 */
public class ProjectDAO {

    /**
     * Список проектов
     */
    private List<Project> projects = new ArrayList<>();

    /**
     * Создание проекта и добавление в хранилище
     *
     * @param name имя проекта
     * @return созданный проект
     */
    public Project create(final String name) {
        final Project project = new Project(name);
        projects.add(project);
        return project;
    }

    /**
     * Очистка хранилища
     */
    public void clear() {
        projects.clear();
    }

    /**
     * Возврат ссылки на хранилище
     *
     * @return ссылка на хранилище
     */
    public List<Project> findAll() {
        return projects;
    }


}

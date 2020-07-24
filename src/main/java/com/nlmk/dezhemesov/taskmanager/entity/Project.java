package com.nlmk.dezhemesov.taskmanager.entity;

/**
 * Сущность "Проект"
 */
public class Project {

    /**
     * Идентификатор экземпляра
     */
    private long id = System.nanoTime();

    /**
     * Имя проекта
     */
    private String name = "";

    /**
     * Описание проекта
     */
    private String description = "";

    /**
     * Получение идентификатора экземпляра
     *
     * @return Идентификатор экземпляра проекта
     */
    public long getId() {
        return id;
    }

    /**
     * Получение имени проекта
     *
     * @return имя проекта
     */
    public String getName() {
        return name;
    }

    /**
     * Получение описания проекта
     *
     * @return описание проекта
     */
    public String getDescription() {
        return description;
    }

    /**
     * Задание имени проекта
     *
     * @param name новое имя проекта
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Задание описания проекта
     *
     * @param description описание проекта
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Получение текстового представления данных проекта
     *
     * @return текстовое представление данных проекта
     */
    @Override
    public String toString() {
        return id + ": " + name + " (" + description + ")";
    }
}

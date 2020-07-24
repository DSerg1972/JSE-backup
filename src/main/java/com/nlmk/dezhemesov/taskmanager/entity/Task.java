package com.nlmk.dezhemesov.taskmanager.entity;

public class Task {
    /**
     * Идентификатор экземпляра
     */
    private long id = System.nanoTime();

    /**
     * Имя задачи
     */
    private String name = "";

    /**
     * Описание задачи
     */
    private String description = "";

    /**
     * Получение идентификатора экземпляра
     *
     * @return Идентификатор экземпляра задачи
     */
    public long getId() {
        return id;
    }

    /**
     * Получение имени задачи
     *
     * @return имя задачи
     */
    public String getName() {
        return name;
    }

    /**
     * Получение описания задачи
     *
     * @return описание задачи
     */
    public String getDescription() {
        return description;
    }

    /**
     * Задание имени проекта
     *
     * @param name новое имя задачи
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Задание описания задачи
     *
     * @param description описание задачи
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

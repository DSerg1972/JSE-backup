package com.nlmk.dezhemesov.taskmanager.entity;

public class Task {
    /**
     * Идентификатор экземпляра
     */
    private Long id = System.nanoTime();

    /**
     * Имя задачи
     */
    private String name = "";

    /**
     * Описание задачи
     */
    private String description = "";

    /**
     * Конструктор по умолчанию
     */
    public Task() {

    }

    /**
     * Конструктор с заданием имени задачи
     *
     * @param name имя задачи
     */
    public Task(String name) {
        this.name = name;
    }

    /**
     * Конструктор с заданием имени и описания задачи
     *
     * @param name        имя задачи
     * @param description описание задачи
     */
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Получение идентификатора экземпляра
     *
     * @return Идентификатор экземпляра задачи
     */
    public Long getId() {
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

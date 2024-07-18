package org.example.springboot_exo1m2i.model;


public class Todo {
    private int id;
    private String name;
    private String description;
    private Boolean statut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    public Todo(int id, String name, String description, Boolean statut) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.statut = statut;



    }
}

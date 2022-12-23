package model;

import java.util.UUID;

public class Teacher {
    private String name;
    private String surname;
    private String password;
    private String experience;
    private UUID id;

    public Teacher() {
        this.id=UUID.randomUUID();
    }

    public Teacher(String name, String surname, String experience, String password) {
        this.name = name;
        this.password=password;
        this.surname = surname;
        this.experience = experience;
    }

    public UUID getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", experience=" + experience +
                ", id=" + id +
                '}';
    }
}

package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String login;
    private String pass;
    private Position position;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    private List<Integer> reportsInProgress = new ArrayList<>(); //? Все-таки нужна абстракция, потому что reportsInProgress будет только у ассистентов
    private List<Integer> reports = new ArrayList<>(); //? Все-таки нужна абстракция, потому что reports будет только у пациентов

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

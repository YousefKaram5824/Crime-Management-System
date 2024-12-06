package com.example.crime_management_system_gui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PoliceOfficer extends Citizen {
    private final String id;
    protected Department department;
    protected List<Case> handledCases;
    private double salary;
    private int Rate;
    private String password;

    public PoliceOfficer(String id, String name, LocalDate birthDate, Gender gender, String address, String phoneNumber, String ssn, double salary, Department department, int Rate) {
        super(name, birthDate, gender, address, phoneNumber, ssn);
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.handledCases = new ArrayList<>();
        this.Rate = Rate;
    }

    public PoliceOfficer(String id, double salary, String password) {
        this.id = id;
        this.salary = salary;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    //----------------------------------------------------------------
    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Case> getHandledCases() {
        return handledCases;
    }

    public void setHandledCases(List<Case> handledCases) {
        this.handledCases = handledCases;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //----------------------------------------------------------------

}

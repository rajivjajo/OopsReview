package com.bridgelabz.workshop2;

public class Employee {
    private String name, city, state, department;
    private int age;
    private Long phoneNum;

    public Employee() {
    }

    public Employee(String name, String city, String state, String department, int age, Long phoneNum) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.department = department;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", department='" + department + '\'' +
                ", Age=" + age +
                ", phoneNum=" + phoneNum +
                '}';
    }
}

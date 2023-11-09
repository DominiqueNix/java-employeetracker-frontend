package com.employeetracker.employeetracker2;

public class Employee {
    private int employeeId;
    private String name;
    private int age;
    private String jobTitle;
    private int salary;
    private int managerID;

    public Employee(){

    }



    Employee(int employeeId, String name, int age, String jobTitle, int salary, int managerID){
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.managerID = managerID;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String toString(){
        return String.format("name: %s, age: %d, job Title: %s, salary: %d", this.name, this.age, this.jobTitle, this.salary);
    }
}

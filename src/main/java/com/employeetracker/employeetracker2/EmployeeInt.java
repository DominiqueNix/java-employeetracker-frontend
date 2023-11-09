package com.employeetracker.employeetracker2;
import java.util.List;
public interface EmployeeInt {
    //see all employee
    public List<Employee> allEmployees();
    //see one employee
    public Employee oneEmployee(int id);
    //add employee
    public void addEmployee(Employee emp);
    //update employee
    public void updateEmployee(int id);
    //delete employee
    public void deleteEmployee(int id);
}

package com.employeetracker.employeetracker2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImp implements EmployeeInt{
    @Override
    public List<Employee> allEmployees() {
        Connection conn = DBConnection.createDBConnection();
        String qurey = "select * from employees";
        List<Employee> allEmps = new ArrayList<>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qurey);
            while(rs.next()){
                Employee emp = new Employee();
                emp.setEmployeeId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setAge(rs.getInt("age"));
                emp.setJobTitle(rs.getString("jobTitle"));
                emp.setSalary(rs.getInt("salary"));
                emp.setManagerID(rs.getInt("managerID"));
                allEmps.add(emp);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return allEmps;
    }

    @Override
    public Employee oneEmployee(int id) {
        return null;
    }

    @Override
    public void addEmployee(Employee emp) {
        Connection conn = DBConnection.createDBConnection();
        String query = "insert into employees values(?,?,?,?,?,?)";
        try{
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, emp.getEmployeeId());
            pstmt.setString(2, emp.getName());
            pstmt.setInt(3, emp.getAge());
            pstmt.setString(4, emp.getJobTitle());
            pstmt.setInt(5, emp.getSalary());
            pstmt.setInt(6, emp.getManagerID());
            int cnt = pstmt.executeUpdate();
            if(cnt != 0){
                System.out.println("Employee Added");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateEmployee(int id) {

    }

    @Override
    public void deleteEmployee(int id) {
        Connection conn = DBConnection.createDBConnection();

    }
}

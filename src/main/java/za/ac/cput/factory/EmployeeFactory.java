package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {

    public static Employee buildEmployee(String first_name, String last_name, String email, String password){
        if(Helper.isNullorEmpty(first_name)||Helper.isNullorEmpty(last_name)){
            return null;
        }

        String employeeNumber = Helper.generateId();
        if (!Helper.isValidEmail(email)){
            return null;
        }
        Employee employee = new Employee.Builder()
                .setEmployeeNumber(employeeNumber)
                .setFirst_name(first_name)
                .setLast_name(last_name)
                .setEmail(email)
                .setPassword(password)
                .buildEmployee();

        return employee;
    }
}
package pro.sky.Service;

import org.springframework.stereotype.Service;
import pro.sky.Person.Employee;

@Service

public class EmployeeService {
    private final int MAX_EMPLOYEES_COUNT = 2;
    private final Employee[] employees = new Employee[MAX_EMPLOYEES_COUNT];


    public Employee add(String name, String surName) {
        Employee employee = new Employee(name, surName);
        if (employees[MAX_EMPLOYEES_COUNT - 1] != null) {
            return null;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
        return employee;
    }

    public Employee find(String name, String surName) {
        Employee employee = null;
        for (Employee person : employees) {
            if (person != null && name.equals(person.getName()) && surName.equals(person.getSurName())) {
                employee = person;
            }
        }
        return employee;
    }

    public Employee delete(String name, String surName) {
        Employee employee = find(name, surName);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(employee)) {
                employees[i] = null;
            }

        }
        return employee;

    }

    public Employee[] getAll() {
        return employees;
    }
}



package pro.sky.Person;

import java.util.Objects;

public class Employee {


    private String name;
    private String surName;




    public Employee(String name, String surName) {
        this.name = name;
        this.surName = surName;

    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }




    @Override
    public String toString() {
        return  "Имя" + this.name + "Фамилия" + this.surName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
            Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName);

    }
}

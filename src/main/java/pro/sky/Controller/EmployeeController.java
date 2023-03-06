package pro.sky.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Person.Employee;
import pro.sky.Service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public Employee addPerson(@RequestParam ("name")  String name, @RequestParam ("surname") String surName) {
        return employeeService.add(name, surName);
    }

    @GetMapping(path = "/find")
    public Employee findPerson(@RequestParam ("name") String name, @RequestParam ("surname") String surName) {
        return employeeService.find(name, surName);
    }

    @GetMapping(path = "/delete")
    public Employee deletePerson(@RequestParam("name") String name, @RequestParam("surname") String surName) {
        return employeeService.delete(name, surName);

    }

    @GetMapping(path = "/findAll")
    public Employee [] getEmployees() {
        return employeeService.getAll();
    }
}

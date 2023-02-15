package com.elmiraantipina.spring.springboot.spring_data_rest.dao;

import com.elmiraantipina.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //JpaRepository<Employee - ЭТО entity класс, Integer - тип данных PRIMARY KEY - int id - Integer>

    // findAll - получение всех работников
    // findById - получение одного работника
    // save - добавление работника
    // save - изменение работника
    // deleteById - удаление работника

    //пишем свой метод, поиск работников с одним именем




    //УДАЛЯЕМ ВСЕ МЕТОДЫ,
    /*public List <Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);*/
}


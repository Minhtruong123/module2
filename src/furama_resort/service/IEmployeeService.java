package furama_resort.service;

import furama_resort.model.person.Employee;

public interface IEmployeeService {
    void disPlayListEmployee();

    void add(Employee employee);

    int findID(String id);

    Employee findEmployee(String id);

    void delete(int index);

    void change(Employee employee);
}

package furama_resort.service.Impl;

import furama_resort.model.person.Employee;
import furama_resort.service.IEmployeeService;
import furama_resort.util.EmployeeRnW;

import java.util.List;

public class EmployeeService implements IEmployeeService {

    @Override
    public void disPlayListEmployee() {
        List<Employee> employeeList = EmployeeRnW.readFile();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = EmployeeRnW.readFile();
        employeeList.add(employee);
        EmployeeRnW.writeFile(employeeList);
    }

    @Override
    public int findID(String id) {
        List<Employee> employeeList = EmployeeRnW.readFile();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Employee findEmployee(String id) {
        List<Employee> employeeList = EmployeeRnW.readFile();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                return employeeList.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(int index) {
        List<Employee> employeeList = EmployeeRnW.readFile();
        employeeList.remove(index);
        EmployeeRnW.writeFile(employeeList);
    }

    @Override
    public void change(Employee employee) {
        List<Employee> employeeList = EmployeeRnW.readFile();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(employee.getId())) {
                employeeList.set(i, employee);
                break;
            }
        }
        EmployeeRnW.writeFile(employeeList);
    }
}

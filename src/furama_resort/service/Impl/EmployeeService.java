package furama_resort.service.Impl;

import furama_resort.model.person.Employee;
import furama_resort.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {

    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee(1,"Nguyen Van A","12/12/1999",95551127,true,201864364,"nguyenvanA@gmail.com","University","Director",100000));
        employeeList.add(new Employee(2,"Nguyen Van B","7/5/1990",95132545,false,201892564,"nguyenvanB@gmail.com","University","Staff",7000));
        employeeList.add(new Employee(3,"Nguyen Van C","24/8/1995",95284613,false,2018413265,"nguyenvanC@gmail.com","University","Monitor",8000));
    }

    @Override
    public void disPlayListEmployee() {
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public int findID(int id) {
        for (int i=0;i<employeeList.size();i++){
            if (employeeList.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i=0;i<employeeList.size();i++){
            if (employeeList.get(i).getId()==id){
                return employeeList.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(int index) {
        employeeList.remove(index);
    }

    @Override
    public void change(Employee employee) {
        for (int i=0;i<employeeList.size();i++){
            if (employeeList.get(i).getId()==employee.getId()){
                employeeList.set(i,employee);
                break;
            }
        }
    }
}

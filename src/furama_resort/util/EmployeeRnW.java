package furama_resort.util;

import furama_resort.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRnW {
    private static final String FILE_PATH = "src\\furama_resort\\data\\Employee.csv";

    public static List<Employee> readFile() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
                employeeList.add(employee);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static void writeFile(List<Employee> list) {
        try {
            FileWriter writer = new FileWriter(FILE_PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Employee employee : list) {
                bufferedWriter.write(employee.getId() + "," + employee.getName() + "," + employee.getdateOfBirth() + "," +
                        employee.getPhoneNumber() + "," + employee.isGender() + "," + employee.getIdentityCard() + "," +
                        employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary());
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

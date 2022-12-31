package furama_resort.util;

import furama_resort.model.person.Customer;
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
                String id = arr[0];
                String name = arr[1];
                String dateOfBirth = arr[2];
                String phoneNumber = arr[3];
                String gender = arr[4];
                String identityCard = arr[5];
                String email = arr[6];
                String level = arr[7];
                String position = arr[8];
                String salary = arr[9];
                Employee employee = new Employee(id, name, dateOfBirth, phoneNumber, gender, identityCard, email, level, position, salary);
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
            FileWriter writer = new FileWriter(FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Employee employee : list) {
                bufferedWriter.write(employee.getId() + "," + employee.getName() + "," + employee.getdateOfBirth() + "," +
                        employee.getPhoneNumber() + "," + employee.isGender() + "," + employee.getIdentityCard() + "," +
                        employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package furama_resort.util;

import furama_resort.model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRnW {
    private static final String FILE_PATH = "src\\furama_resort\\data\\Customer.csv";

    public static List<Customer> readFile() {
        List<Customer> stringList = new ArrayList<>();
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
                String type = arr[7];
                String address = arr[8];
                Customer customer = new Customer(id, name, dateOfBirth, phoneNumber, gender, identityCard, email, type, address);
                stringList.add(customer);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void writeFile(List<Customer> list) {
        try {
            FileWriter writer = new FileWriter(FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Customer customer : list) {
                bufferedWriter.write(customer.getId() + "," + customer.getName() + "," + customer.getdateOfBirth() + "," +
                        customer.getPhoneNumber() + "," + customer.isGender() + "," + customer.getIdentityCard() + "," +
                        customer.getEmail() + "," + customer.getType() + "," + customer.getAddress());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
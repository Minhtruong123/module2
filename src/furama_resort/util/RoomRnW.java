package furama_resort.util;

import furama_resort.model.facility.Facility;
import furama_resort.model.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoomRnW {
    private static final String FILE_PATH = "src\\furama_resort\\data\\Room.csv";

    public static Map<Facility, Integer> readFile() {
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
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
                String serviceName = arr[1];
                String usableArea = arr[2];
                String rentalCosts = arr[3];
                String maxNumOfPeople = arr[4];
                String retalType = arr[5];
                String freeService = arr[6];
                int numbOfUse = Integer.parseInt(arr[7]);
                Facility room = new Room(id, serviceName, usableArea, rentalCosts, maxNumOfPeople, retalType, freeService);
                facilityList.put(room, numbOfUse);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityList;
    }

    public static void writeFile(Map<Facility, Integer> listMap) {
        try {
            FileWriter writer = new FileWriter(FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Facility room : listMap.keySet()) {
                bufferedWriter.write(room + "," + listMap.get(room));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


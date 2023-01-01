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
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                Facility room = new Room(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
                facilityList.put(room, Integer.parseInt(arr[7]));
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


package furama_resort.util;

import furama_resort.model.facility.Facility;
import furama_resort.model.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class VillaRnW {
    private static final String FILE_PATH = "src\\furama_resort\\data\\Villa.csv";

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
                Facility villa = new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                facilityList.put(villa, Integer.parseInt(arr[9]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityList;
    }

    public static void writeFile(Map<Facility, Integer> listMap) {
        try {
            FileWriter writer = new FileWriter(FILE_PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Facility villa : listMap.keySet()) {
                bufferedWriter.write(villa.toString1() + "," + listMap.get(villa));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package ss16.bai_tap.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        try {
            File file = new File("D:\\Codegym\\Module_2\\src\\ss16\\bai_tap\\doc_file\\National.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                objects.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Lỗi");
        }

        try {
            FileWriter fileWriter = new FileWriter("D:\\Codegym\\Module_2\\src\\ss16\\bai_tap\\doc_file\\NationalOut.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < objects.size(); i++) {
                bufferedWriter.write(String.valueOf(objects.get(i)) + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

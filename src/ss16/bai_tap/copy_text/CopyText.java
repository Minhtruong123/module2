package ss16.bai_tap.copy_text;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CopyText {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        int count = 0;
        try {
            File file = new File("D:\\Codegym\\Module_2\\src\\ss16\\bai_tap\\copy_text\\CopyText.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
                count += Integer.parseInt(String.valueOf(line.length()));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Lỗi");
        }

        try {
            FileWriter writer = new FileWriter("D:\\Codegym\\Module_2\\src\\ss16\\bai_tap\\copy_text\\CopyTextWrite.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < stringList.size(); i++) {
                bufferedWriter.write(stringList.get(i) + "\n");
            }
            bufferedWriter.write("Tổng số kí tự là: " + count + " ký tự");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

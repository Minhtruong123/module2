package Test;


import java.util.*;

public class NewTest {
    char[] solution(String arg1) {
        Map<Character, Integer> maps= new TreeMap<>();
        for (int i=0;i<arg1.length();i++){
            if (maps.containsKey((arg1.charAt(i)))){
                maps.put(arg1.charAt(i), maps.get(arg1.charAt(i))+1);
            } else{
                maps.put(arg1.charAt(i), 1);
            }
        }
        int i=0;
        char[] arr=new char[maps.keySet().size()];
        for (char charac:maps.keySet()){
            if (maps.get(charac)>1){
                arr[i]=charac;
                i++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        NewTest newTest = new NewTest();
        System.out.println(newTest.solution(str));
    }
}

package Lessons.Exercise._Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,String> fiveNumbers= new HashMap<>();
        fiveNumbers.put(1,"One");
        fiveNumbers.put(2,"Two");
        fiveNumbers.put(3,"Three");
        fiveNumbers.put(4,"Four");
        fiveNumbers.put(5,"Five");

        HashMap<Integer,String> dieciNumeri= new HashMap<>();

        dieciNumeri.put(1,"Uno");

        dieciNumeri.put(3,"tre");

        dieciNumeri.put(5,"Cinque");

        dieciNumeri.put(7,"Sette");

        dieciNumeri.put(9,"Nove");

        fiveNumbers.putAll(dieciNumeri);

        System.out.println(fiveNumbers);

        System.out.println(fiveNumbers.getOrDefault(5, "no associated value"));
        System.out.println(fiveNumbers.getOrDefault(6, "no associated value"));
        System.out.println(fiveNumbers.getOrDefault(7, "no associated value"));
        System.out.println(fiveNumbers.getOrDefault(8, "no associated value"));
        System.out.println(fiveNumbers.getOrDefault(9, "no associated value"));
















        }
}













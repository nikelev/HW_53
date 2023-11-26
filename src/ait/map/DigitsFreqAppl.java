package ait.map;

import java.util.*;

public class DigitsFreqAppl {
    static Random random=new Random();
    public static void main(String[] args) {
        //Generate 1 mln random int positiv numbers
        //and calculate digits frequency

        Map<String,Integer> digMap=new HashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            Integer digRandom= random.nextInt(Integer.MAX_VALUE);
            String[] digArr =digRandom.toString().split("");
            for (String dig  :digArr ) {

                    digMap.put(dig, digMap.getOrDefault(dig, 0) + 1);

            }
        }
        Set<Map.Entry<String, Integer>> entries = digMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

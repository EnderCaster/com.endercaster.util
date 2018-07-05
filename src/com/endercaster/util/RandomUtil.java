package com.endercaster.util;

import java.util.HashMap;
import java.util.Random;

public class RandomUtil {
    public static int nextInt(int range){
        Random rand=new Random();
        int result=rand.nextInt(range);
        return result;
    }
    public static int nextInt(int start,int end){
        int range=end-start;
        return nextInt(range)+start;
    }
    public  static String getRandomValue(String[] values){
        int index=nextInt(values.length);
        return values[index];

    }
    public  static String getRandomValue(HashMap<Object,String> valueMap){
        String[] rangeArray= (String[]) valueMap.values().toArray();
        return getRandomValue(rangeArray);
    }
}

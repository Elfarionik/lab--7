package com.company;

public class StringToLongArrConverter implements IConverter {
    public long[] convert(String input){
        String[] stringArr = input.split(" ");
        long[] longArr = new long[stringArr.length];
        for (int i = 0; i < stringArr.length; i++){
            longArr[i] = Long.parseLong(stringArr[i]);
        }
        return longArr;
    }
}

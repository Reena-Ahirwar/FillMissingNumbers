package com.reena.fillMissingNumber;

import java.util.Arrays;

public class Main {

    public static int [] fillMissingNumbers(int [] array){
        if(array.length == 0 || array == null){
            return array;
        }

        //sort tne array
        Arrays.sort(array);

        if(array[0] < 0){
            return  new int[]{};
        }
        int min = 1;
        int max = array[array.length-1];

        int [] result = new int[max];

        for (int i = 0; i < max; i++) {
            result[i] = min;
            min = min + 1;
        }
        return result;
    }

    public static void main(String[] args) {
	    int [] result = fillMissingNumbers(new int [] {58,60,55});
        System.out.println(Arrays.toString(result));
    }
}

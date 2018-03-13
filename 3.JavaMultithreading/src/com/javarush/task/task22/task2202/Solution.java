package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if(string == null) throw new TooShortStringException();

        int start = (string.indexOf(32)) + 1;
        int finish;
        int position = start;
        for(int i = 0; i < 3; i++) {
            finish = string.indexOf(32, position);
            if(finish == -1) throw new TooShortStringException();
            position = finish + 1;
        }
        int temp = string.indexOf(32, position);
        if(temp != -1){
             return string.substring(start, temp);
        }
        return string.substring(start);
    }


    public static class TooShortStringException extends RuntimeException {
    }
}

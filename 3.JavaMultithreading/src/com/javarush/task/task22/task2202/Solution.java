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

//      Searching for index of 3-rd "space" int the string
        int temp;
        int position = start;
        for(int i = 0; i < 3; i++) {
            temp = string.indexOf(32, position);
            if(temp == -1) throw new TooShortStringException();
            position = temp + 1;
        }

//      If string has at least 1 more "space" - finish of our substring will be char before this "space"
        int finish = string.indexOf(32, position);
        if(finish != -1){
             return string.substring(start, finish);
        }
        return string.substring(start);
    }


    public static class TooShortStringException extends RuntimeException {
    }
}

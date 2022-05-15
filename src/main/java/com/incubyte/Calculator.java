package com.incubyte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static  void main(String... arg){
        Scanner s = new Scanner(System.in);
        String inputText = s.next();
        System.out.println(Add(inputText));
    }

    public static int Add(String input) throws NullPointerException {
        try {
            if(null==input || input.isEmpty()){
                throw new NullPointerException();
            }
            else {
                int sum = 0;
                String[] numbers = extractNumbers(input);

                for(String num : numbers){
                    int n = Integer.parseInt(num);
                    sum+=n;
                }
                return sum;
            }
        } catch (NullPointerException ne) {
            return 0;
        }  catch (Exception e) {
            return 0;
        }
    }

    public static String[] extractNumbers(String input){
        if(input.startsWith("//")){
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
            m.matches();
            String newDelimiter = m.group(1);
            String numberList = m.group(2);
            return numberList.split(newDelimiter);
        }
        String[] numbers = input.split(",|\n");
        return numbers;
    }
}

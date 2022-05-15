package com.incubyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static  void main(String... arg)  {
        Scanner s = new Scanner(System.in);
        String inputText = s.next();
        System.out.println(Add(inputText));
    }

    public static int Add(String input) {
        List<Integer> negativeNumbers = new ArrayList<>();
        if(null==input || input.isEmpty()){
            return 0;
        }
        else {
            int sum = 0;
            int n;
            String[] numbers = extractNumbers(input);
            List<Integer> allNumbers = new ArrayList<>();

            for (String num : numbers) {
                n = Integer.parseInt(num);
                allNumbers.add(n);
                if (n < 0) {
                    negativeNumbers.add(n);
                }
            }
            if (negativeNumbers.size() > 0) {
                String message = "";
                for (int x : negativeNumbers)
                    message=message.concat(x + " ");
                throw new RuntimeException("negatives not allowed: " + message);
            }
            for (int x : allNumbers)
                sum += x;

            return sum;
        }
    }

    public static String[] extractNumbers(String input){
        if(input.startsWith("//")){
            return getNumbersUsingCsutomDelimiter(input);
        }
        String[] numbers = input.split(",|\n");
        return numbers;
    }

    private static String[] getNumbersUsingCsutomDelimiter(String input){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        m.matches();
        String newDelimiter = m.group(1);
        String numberList = m.group(2);
        return numberList.split(newDelimiter);
    }
}

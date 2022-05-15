package com.incubyte;

import java.util.Scanner;

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
            else if(input.contains(",")){
                String[] numbers = input.split(",");
                int num1 = Integer.parseInt(numbers[0]);
                int num2 = Integer.parseInt(numbers[1]);

                return num1+num2;
            } else {
                return Integer.parseInt(input);
            }


        } catch (NullPointerException ne) {
            return 0;
        }  catch (Exception e) {
            return 0;
        }
    }
}

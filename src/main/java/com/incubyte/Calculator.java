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
                int sum = 0;
                String[] numbers = input.split(",");

                for(String num : numbers){
                    int n = Integer.parseInt(num);
                    sum+=n;
                }
                return sum;
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

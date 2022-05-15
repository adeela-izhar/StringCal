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
            //return 1;

        } catch (NullPointerException ne) {
            return 0;
        } catch (Exception e) {

        }
        return 0;
    }
}

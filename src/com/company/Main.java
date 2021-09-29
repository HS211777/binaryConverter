package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    //denary to binary
    System.out.println("Enter a denary integer:");
    int userInput = input.nextInt();
    int binary = 128;
    String output = "";
    if (userInput > 255){
        System.out.println("number too large");
    }
    else if (userInput < 0){
        System.out.println("number must be positive");
    }
    else{
        for (int i = binary; i >= 1; i=i/2){
            if (userInput-i >= 0){
                output = output + "1";
                userInput = userInput - i;
            }
            else{
                output = output + "0";
            }
        }
        System.out.println(output);
    }

    //binary to denary
    System.out.println("Enter an 8-bit binary number");
    String userInputBi = input.next();
    int addition;
    int outputDen = 0;
    if (userInputBi.length() > 8){
        int removeChar = userInputBi.length() - 8;
        for (int i = 0; i < removeChar; i++){
            userInputBi = userInputBi.substring(1);
        }
        System.out.println("some digits were removed");
    }
    else if (userInputBi.length() < 8){
        int addChar = 8 - userInputBi.length();
        for (int i = 0; i < addChar; i++){
            userInputBi = "0"+userInputBi;
        }
    }
    for (int i = 0; i < 8; i++){
        if (userInputBi.substring(i,i+1).equals("1")){
            int power = 7-i;
            addition = (int)Math.pow(2,power);
            outputDen = outputDen + addition;
        }
    }
    System.out.println(outputDen);
    }
}

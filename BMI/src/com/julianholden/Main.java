package com.julianholden;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double weight;
        double height;
        double bmi;

        while(true){
            System.out.print("Enter your weight (Kg:) ");
            weight = input.nextDouble();
            System.out.print("Enter your height (M:) ");
            height = input.nextDouble();
            if(weight > 0 && height > 0) break;
            System.out.println("Incorrect weight or height provided");
        }

        bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
    }
}

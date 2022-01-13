package Fundamentals;

import java.util.Scanner;

public class Sorcerer_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long testcase = sc.nextLong();
        while(testcase > 0){
            long first = sc.nextInt();
            System.out.print(first + " ");
            while(first > 1) {
                if (first % 2 == 0){
                    first = (long) Math.sqrt(first);
                    System.out.print(first + " ");
                }
                else{
                    first = (long)(first * Math.sqrt(first));
                    System.out.print(first + " ");
                }
            }
            System.out.println();
            testcase--;
        }
    }
}

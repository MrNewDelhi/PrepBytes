package Fundamentals;

import java.util.Scanner;

public class Table_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int present = sc.nextInt();
            int t1 = sc.nextInt();   //cost of 1
            int t2 = sc.nextInt();   //cost of 2
            int t3 = sc.nextInt();   //cost of 3
            int amount = 0;
            if(present % 4 == 0){
                System.out.println(0);
            }
            else{
                if(4 - (present % 4)== 1){
                    amount = t1;
                }
                else if(4 - (present % 4) == 2){
                    int amount1 = t1 + t1;
                    int amount2 = t2;
                    amount = Math.min(amount1,amount2);
                }
                else{
                    int amount1 = t1 + t1 + t1;
                    int amount2 = t1 + t2;
                    int amount3 = t3;
                    if(amount1 < amount2 && amount2 < amount3){
                        amount = amount1;
                    }
                    else if(amount2 < amount1 && amount2 < amount3){
                        amount = amount2;
                    }
                    else{
                        amount = amount3;
                    }
                }
                System.out.println(amount);
            }
            testcases--;
        }
    }
}

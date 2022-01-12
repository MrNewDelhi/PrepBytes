package Fundamentals;

import java.util.Scanner;

public class V_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'V'){
            int n = 5;
            int row = 1;
            int nsp = 8;
            int nst = 1;
            while(row <= n){
                int cst = 1;
                while(cst <= nst){
                    System.out.print(cst);
                    cst++;
                }
                int csp = 1;
                while(csp <= nsp){
                    System.out.print(" ");
                    csp++;
                }
                cst -= 1;
                while(cst > 0){
                    System.out.print(cst);
                    cst--;
                }
                row++;
                nsp-=2;
                nst++;
                System.out.println();
            }
        }
    }
}

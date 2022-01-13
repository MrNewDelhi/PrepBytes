package Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Perfect_Number_And_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int num = sc.nextInt();
            if(num == 1){
                System.out.println("false");
            }
            else {
                boolean[] arr = new boolean[num + 1];
                Arrays.fill(arr, true);
                int index = 2;
                int sum = 1;
                while (index <= num) {
                    int product = index + index;
                    while (product <= num) {
                        if (arr[product]) {
                            arr[product] = false;
                        }
                        product += index;
                    }
                    index++;
                }
                for (int i = 2; i <= num; i++) {
                    if (arr[i]) {
                        if (num % i == 0) {
                            sum += i;
                            sum += (num / i);
                            if (arr[num / i]) {
                                arr[num / i] = false;
                            }
                        }
                    }
                }
                if (sum == num) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
            testcases--;
        }
    }
}

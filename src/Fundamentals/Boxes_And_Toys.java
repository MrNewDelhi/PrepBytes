package Fundamentals;

import java.util.Scanner;

public class Boxes_And_Toys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximum_possible_boxes = 0;
        int total_boxes = sc.nextInt();
        while(total_boxes > 0){
            int toys_present = sc.nextInt();
            int max_capacity = sc.nextInt();
            if(max_capacity - toys_present >= 2){
                maximum_possible_boxes++;
            }
            total_boxes--;
        }
        System.out.println(maximum_possible_boxes);
    }
}

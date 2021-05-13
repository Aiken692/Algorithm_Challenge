package com.walterzcode;

import java.util.Scanner;

public class Main {


    public void test(){
        int no = 100000;
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements do you want to enter?");
        no = input.nextInt();
        int[] N = new int[no];

        for(int C = 0; C < no; C++){
            System.out.println("Enter the numbers" + (C + 1));
            N[C] = input.nextInt();
        }

        input.close();

        for(int C = 0; C < no; C++){
            boolean isDistinct = false;

            for (int j = 0; j < C; j++){
                if (N[C] == N[j]){
                    isDistinct = true;
                    break;
                }
            }

            if (!isDistinct){
                System.out.println(N[C] + " ");
            }
        }
    }

    public static void main(String[] args){
        Main dup = new Main();
        dup.test();
    }


}

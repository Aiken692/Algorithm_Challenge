package com.walterzcode;

public class Main {


    public static void findDistinct (int[] a){

        int sum = 0;

        for(int i = 0; i < a.length; i++){
            boolean isDistinct = false;

            for(int j = 0; j < i; j++){
                if(a[i] == a[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.println(a[i] + " ");

//                Sum of the values
                sum  = sum + a[i];
            }

//            This calculates the total of the distinct values
//            System.out.println(sum);

        }

        System.out.println("==============");
        System.out.println("Total is");
        System.out.println(sum);
    }

    public static void main(String[] args) {
	        int arr[] = {10, 11, 10, 11, 15};
	        findDistinct(arr);

    }


}

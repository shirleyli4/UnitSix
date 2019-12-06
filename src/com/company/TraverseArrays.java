package com.company;
import java.util.Scanner;
public class TraverseArrays {
    public static void main(String[] args){
        int[] arr = {2,1,2,3,4};
        System.out.println(countEven(arr));
        System.out.println("Enter your desired length");
        Scanner input = new Scanner(System.in);
        int dl = input.nextInt();
        System.out.println(buildArray(dl));
        System.out.println(sum28(arr));
        System.out.println(zeroMax(arr));
    }
    public static int countEven(int[] nums){
        int even=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]%2==0){
                even++;
            }
        }
        return even;
    }

    public static int[] buildArray(int desireLength){
        int[] arr = new int[desireLength];
        for(int i=0;i<=desireLength-1;i++){
            arr[i]=i;
        }
        return arr;
    }

    public static boolean sum28(int[] numbers){
        int num=0;
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]==2){
                num+=2;
            }
        }
        if(num==8){
            return true;
        }else{
            return false;
        }
    }

    public static int[] zeroMax(int[] original){
        for(int i=0;i<=original.length-1;i++){
            if(original[i]==0){
                for(int j=i;j<=original.length-1;j++){
                    if(original[j]%2==1&&original[i]<original[j]){
                        original[i]=original[j];
                    }else{
                        original[i]=0;
                    }
                }
            }
        }
        return original;
    }
}

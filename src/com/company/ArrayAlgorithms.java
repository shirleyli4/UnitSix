package com.company;
// test
public class ArrayAlgorithms {
    public static void main(String[] args){
        int[] list1 = {-2,-9,-6,-8,-9,-3,-1};
        //test
        int a=4;
    }

    public static String printArray(int[] nums){
        String ret="";
        for(int i =0;i<nums.length;i++){
            ret+=nums[i]+" ";
        }
        return ret;
    }

    public static boolean checkForAllNegatives(int[] list){
        boolean ret = true;
        for(int i=0;i<list.length;i++){
            if(list[i]>=0) {
                return false;
            }
        }
        return ret;
    }

    public static boolean hasDupes(int[] list){
        boolean ret=false;
        for(int i=0;i<list.length;i++){
            for(int j =i+1;j<list.length;j++){
                if(list[i]==list[j]) {
                    return true;
                }
            }
        }
        return ret;
    }

    public static int countEvens(int[] arr){
        int evens = 0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                evens++;
            }
        }
        return evens;
    }

    public static int[] leftShift(int[] nums, int shift){
        //new array
        //plus shift 0s
        int[] ret = new int[shift+nums.length];
        for(int i=0;i<ret.length;i++){
            if(i<=nums.length-1) {
                ret[i] = nums[i];
            }else{
                ret[i]=0;
            }
        }
        return ret;
    }

    public static String reverseArray(int[] ary) {
        int hold;
        String ret = "";
        String up = "";
        String down = "";
        String med="";
        if (ary.length % 2 == 0) {
            for (int i = 0; i < ary.length / 2; i++) {
                hold = ary[ary.length - i - 1];
                ary[ary.length - i - 1] = ary[i];
                ary[i] = hold;
                up += ary[i] + " ";
                down = ary[ary.length - i - 1] + " " + down;
            }
            ret = up + med+down;
            return ret;
        } else {
            med=ary[ary.length/2]+" ";
            for (int i = 0; i < ary.length / 2; i++) {
                hold = ary[ary.length - i - 1];
                ary[ary.length - i - 1] = ary[i];
                ary[i] = hold;
                up += ary[i] + " ";
                down = ary[ary.length - i - 1] + " " + down;
            }
            ret = up +med+ down;
            return ret;
        }
    }
}


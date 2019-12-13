package com.company;

public class ArrayAlgorithms {
    public static void main(String[] args){
        int[] list1 = {-2,-9,-6,-8,-9,-3,-1};
    }
    public static String printArray(int[] nums){
        String ret="";
        for(int i =0;i<nums.length;i++){
            ret+=nums[i]+" ";
        }
        return ret;
    }

    public static boolean checkForAllNegatives(int[] list){
        boolean ret = false;
        for(int i=0;i<list.length;i++){
            if(list[i]<0){
                ret=false;
            }else{
                ret=true;
            }
        }
        return ret;
    }

    public static boolean hasDupes(int[] list){
        boolean ret=false;
        for(int i=0;i<list.length;i++){
            for(int j =i+1;j<list.length;j++){
                if(list[i]==list[j]){
                    ret=true;
                    break;
                }else{
                    ret=false;
                }
            }
        }
        return ret;
    }

    public static int countEvens(int[] arr){

    }

}

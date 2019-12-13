package com.company;

public class EnhancedForLoops {
    public static void main(String[] args){
        int[] aryint = {1,2,3,4,5};
        double[] arydoub = {1.1,2.2,3.3,4.4,5.5};
        String[] arystr = {"a","b","c","d","e"};
    }
    public static String printStandardFor(String[] arr){
        String ret = "";
        for(int i=0;i<arr.length;i++){
            ret+=arr[i]+" ";
        }
        return ret;
    }

    public static String printStandardFor(int[] arr){
        String ret = "";
        for(int i=0;i<arr.length;i++){
            ret+=arr[i]+" ";
        }
        return ret;
    }

    public static String printStandardFor(double[] arr) {
        String ret = "";
        for(int i=0;i<arr.length;i++){
            ret+=arr[i]+" ";
        }
        return ret;
    }

    public static String printEnhancedFor(String[] arr){
        String ret="";
        for(String i:arr){
            ret+=i+" ";
        }
        return ret;
    }

    public static String printEnhancedFor(int[] arr){
        String ret="";
        for(int i:arr){
            ret+=i+" ";
        }
        return ret;
    }

    public static String printEnhancedFor(double[] arr){
        String ret="";
        for(double i:arr){
            ret+=i+" ";
        }
        return ret;
    }

    public static String printStandardWhile(String[] arr) {
        String ret="";
        int i=0;
        while(i<arr.length){
            ret+=arr[i]+" ";
            i++;
        }
        return ret;
    }

    public static String printStandardWhile(int[] arr) {
        String ret="";
        int i=0;
        while(i<arr.length){
            ret+=arr[i]+" ";
            i++;
        }
        return ret;
    }

    public static String printStandardWhile(double[] arr) {
        String ret="";
        int i=0;
        while(i<arr.length){
            ret+=arr[i]+" ";
            i++;
        }
        return ret;
    }

}

//Shirley Shuzhou Li, Birthday paradox program 1/8/20
package com.company;

public class Birthday {
    public static void main (String[] args){
        double same=0.0;

        for(int i=0;i<1000;i++) {
            if(hasDupes(dates(23))==true){
                same++;
            }
        }
        double percentage = (same/1000.0)*100;
        System.out.println("The percent of times there were duplicate birthdays is "+percentage+"%");
    }

    public static int[] dates(int num){
        int[] dates = new int[num];
        for(int i=0;i<dates.length;i++){
            int number = (int)(Math.random()*365);
            dates[i]=number;
        }
        return dates;
    }

    public static boolean hasDupes(int[] birthdays){
        boolean ret=false;
        for(int i=0;i<birthdays.length;i++){
            for(int j=i+1;j<birthdays.length;j++){
                if(birthdays[i]==birthdays[j]){
                    ret=true;
                }
            }
        }
        return ret;
    }

}

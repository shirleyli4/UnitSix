package com.company;

public class ArrayCreation {
    public static void main (String[] args){
        double[] numbers = {89, 75, 100};
        System.out.println(getAverage(numbers));
        String[] names = {"Fred", "Barney", "Betty", "Wilma", "Pebbles"};
        System.out.println(stringArray(names));
        String[] names1 = {"Athos", "Porthos", "Aramis"};
        System.out.println(stringArray(names1));

    }
    public static double getAverage(double[] numbers){
        if(numbers.length<3){
            return 0.0;
        }else{
            double ret=0.0;
            for(int i=0;i<=numbers.length-1;i++){
                if(i==0) {
                    System.out.println(numbers[i]);
                    ret += numbers[i];
                }else if(i==numbers.length-1){
                    System.out.println(numbers[i]);
                    ret += numbers[i];
                }else if(i==numbers.length/2){
                    System.out.println(numbers[i]);
                    ret += numbers[i];
                }
            }
            double aver=((int)((ret/3)*100))/100;
            return aver;
        }
    }

    public static String stringArray(String[] friends){
        if(friends.length!=5){
            return "";
        }else{
            String ret = "";
            for(int i=0;i<=friends.length-1;i++){
                int leng = friends[i].length();
                ret+=leng+" ";
            }
            return ret;
        }
    }

    public static String countryData(){
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya",
                "Mexico", "United Kingdom", "Burkina Faso", "United States"};
        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
                "Mexico City", "London", "Ouagadougou", "Washington D.C."};
        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
                "Swahili", "Spanish", "English", "French", "English"};
        int index = (int)(Math.random()*13);
        return "The capital of "+countries[index]+" is "+capitals[index]+" and the primary language is "+languages[index];
    }
}

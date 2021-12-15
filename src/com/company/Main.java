package com.company;

import java.util.Objects;
public class Main {

    public static void main(String[] args) {
        Eggs eggs1=new Eggs("Одно", 80);
        Eggs eggs2=new Eggs( "Два", 160);
        Eggs eggs3=new Eggs("Три",  240);
        eggs1.system_print();
        eggs2.system_print();
        eggs3.system_print();
        Eggs[] breakfast=new Eggs[4];

        breakfast[0]=new Eggs("Два",  160);
        breakfast[1]=new Eggs("Одно", 80);
        breakfast[2]=new Eggs("Три",  240);
        breakfast[3]=new Eggs("Два",  160);

        int count1=0;
        int count2=0;
        int count3=0;
        for(Eggs eggs : breakfast){
            if(Objects.equals(eggs.number, "Одно")){
                count1++;
            }
        }

        for(Eggs eggs : breakfast){
            if(Objects.equals(eggs.number, "Два")){
                count2++;
            }
        }

        for(Eggs eggs : breakfast){
            if(Objects.equals(eggs.number, "Три")){
                count3++;
            }
        }

        System.out.println("Завтрак состоит из "+ count1+ " Одного, "+ count2+ " Двух, "+count3+ " Трех Яиц");
        int cal=0;
        for(Eggs eggs : breakfast){
            cal+=eggs.calculateCalories();
        }
        System.out.println("Общее кол-во калорий завтрака: "+ cal);
    }
}
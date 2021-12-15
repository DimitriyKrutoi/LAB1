package com.company;

public class Eggs  implements Nutritious{
    int calories;
    String number;

    public Eggs(String eggsNumber, int eggsCalories)
    {
        this.number = eggsNumber;
        this.calories=eggsCalories;
    }
    public void system_print(){

        System.out.println("Число: "+ number+",калории: "+calories);
    }

    @Override
    public int calculateCalories(){
        return this.calories;
    }
}

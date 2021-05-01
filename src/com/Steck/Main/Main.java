package com.Steck.Main;
import com.Steck.Reliz.Steck;
public class Main {
    public static void main(String args[]){
        Steck one=new Steck();
        one.add(3);
        System.out.println(one.reading());
        one.add(5);
        System.out.println(one.reading());
        System.out.println(one.GetmaxSize());
        one.Delete();
        System.out.println(one.reading());
    }
}

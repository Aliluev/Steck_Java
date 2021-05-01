package com.Steck.Reliz;

public class Steck {
    protected int maxSize; // размер массива
    protected int[] stackArray; // массив
    protected int top; //вершина стека
// ДОБАВЛЕНИЕ, ИЗВЛЕЧЕНИЕ, ЧТЕНИЕ, ПОЛНОТА СТЕКА, ПУСТ СТЕК
    public Steck() {
        stackArray=new int[1];
        maxSize=1;
        int top=0;
        stackArray[top]=0;

    }
//Добавление
    public void add(int a){
        int[] array=new int[maxSize];
        for(int i=0;i<maxSize;i++) {
            array[i]=stackArray[i];
        }
        //stackArray=null;
        top=maxSize;
        maxSize=maxSize+1;
       stackArray=new int[maxSize];
       for(int i=0;i<top;i++) {
           stackArray[i]=array[i];
       }
        stackArray[top]=a;

    }
    //ЧТЕНИЕ
    public int reading() {
       return stackArray[top] ;
    }

    //ИЗВЛЕЧЕНИЕ
    public void Delete() {
        stackArray[top]=0;
        top-=1;
        maxSize-=1;
    }

    //ПУСТОТА СТЕКА

    public boolean pustota() {
        if(top==-1){
            return true;
        }else return false;
    }


    public int GetmaxSize(){
        return maxSize;
    }

}

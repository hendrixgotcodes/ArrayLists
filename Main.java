package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Array array = new Array();
        array.getArray();
        array.getIntegers();
        array.printArray();
        array.sortIntegers();
        array.printArray();

    }
}
class Array
{

    private Scanner scanner =  new Scanner(System.in);

    private int[] anArray;

    public void getArray()
    {

        System.out.println("Please enter the size of the array");
        int number =  scanner.nextInt();
        anArray = new int[number];

        for (int i =0; i < anArray.length; i++)
        {
            System.out.println("Please enter the contents of the array");
            anArray[i] = scanner.nextInt();


        }
        System.out.println("Done");

    }

    public void find()
    {

        System.out.println("Please enter the number you want to get");
        int number = scanner.nextInt();

        for(int i : anArray)
        {
            if(i == number)
            {
                System.out.println("Number found");
            }
        }

    }
    public int[] getIntegers()
    {
        return anArray;
    }
    public void printArray()
    {
        for (int i : anArray)
        {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    public int[] sortIntegers()
    {
        for (int i = anArray.length-1; i >= 0; i--)
        {

            for (int a = 0; a < i; a++ )
            {
                if (anArray[a] > anArray[a+1])
                {

                    int temp = anArray[a];
                    anArray[a] = anArray[a+1];
                    anArray[a+1] = temp;
                }
            }

        }
        return anArray;
    }

}

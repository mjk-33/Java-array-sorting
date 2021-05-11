package Sorting;

import java.util.Random;
import java.util.Scanner;

public class Sorting
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[200];
        System.out.println("1. Sortowanie babelkowe");
        System.out.println("2. Sortowanie kubelkowe");
        System.out.print("Wybor: ");

        int choice = scan.nextInt();
        for(int i = 0; i <  array.length; i++)
        {
            array[i] = (int)(Math.random() * 200);
            System.out.print(array[i] + "  ");
        }

        switch(choice)
        {
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                System.out.println("Przed posortowaniem babelkowym:");
                bubbleSort.sort(array);
                System.out.println("Po posortowaniu babelkowym: ");
                bubbleSort.printArray(array);
                break;

            case 2:
                BucketSort bucketSort = new BucketSort();
                System.out.println("Przed posortowaniem kubelkowym:");
                bucketSort.sort(array);
                System.out.println("Po posortowaniu kubelkowym: ");
                bucketSort.printArray(array);
                break;
        }






    }
}

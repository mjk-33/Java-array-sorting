package Sorting;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects.*;
import java.util.Vector;
import java.util.*;

public class BucketSort implements Sortable
{
    @Override
        public void sort(int[] array)
    {
        int counter = 0;
        int[] results = getMinMax(array);
        int yMax = results[1];
        int yMin = results[0];
        int[] bucket = new int[yMax - yMin + 1];

        for (int x = 0; x < (yMax - yMin + 1); x++)
        {
            bucket[x] = 0;
        }

        for (int x = 0; x < array.length; x++)
        {
            bucket[array[x] - yMin]++;
        }

        int last = 0;
        for (int x = 0; x < (yMax - yMin + 1); x++)
        {
            int y;
            for (y = last; y < bucket[x] + last; y++)
            {
                array[y] = x + yMin;
                counter++;
            }
            last = y;
        }
        System.out.println("Krokow sortowania: "+counter);
    }


    @Override
        public void printArray(int[] array)
    {
        for (int i=0; i<array.length; ++i)
        {
            System.out.print(array[i] + "  ");
        }

    }

    public static int[] getMinMax(int[] array)
    {
        int[] result = new int[2];
        result[0] = array[0];
        result[1] = array[0];
        for(int i : array)
        {
            if(result[0] > i)
            {
                result[0] = i;
            }
            else if (result[1] < i)
            {
                result[1] = i;
            }
        }
        return result;
    }


}


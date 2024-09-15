package ali.artukov;

import ali.artukov.sort.BubbleSort;
import ali.artukov.sort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int sizeOfArray = 1_000_000;
        int[] unsortedArray = Arrays.stream(new int[sizeOfArray]).map(x -> random.nextInt(0, sizeOfArray)).toArray();

        System.out.println(BubbleSort.optimizedSortWithStat(unsortedArray.clone()));
        System.out.println(SelectionSort.sortWithStat(unsortedArray.clone()));
    }
}
package ali.artukov.sort;

import ali.artukov.model.ResultDto;

/**
 * In computer science, selection sort is an in-place comparison sorting algorithm.
 * It has an O(n²) time complexity, which makes it inefficient on large lists,
 * and generally performs worse than the similar insertion sort.
 * <a href="https://en.wikipedia.org/wiki/Selection_sort">Wikipedia</a>
 */
public class SelectionSort {

    private SelectionSort() {
    }

    public static int[] sort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temporary = unsortedArray[i];
            unsortedArray[i] = unsortedArray[minIndex];
            unsortedArray[minIndex] = temporary;
        }
        return unsortedArray;
    }

    public static ResultDto sortWithStat(int[] unsortedArray) {
        long startTime = System.nanoTime();
        long endTime;
        long stepCount = 0;
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[minIndex]) {
                    minIndex = j;
                }
                stepCount++;
            }
            int temporary = unsortedArray[i];
            unsortedArray[i] = unsortedArray[minIndex];
            unsortedArray[minIndex] = temporary;
        }
        endTime = System.nanoTime();
        return new ResultDto(unsortedArray, stepCount, endTime - startTime);
    }
}

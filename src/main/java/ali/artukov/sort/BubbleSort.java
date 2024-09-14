package ali.artukov.sort;

import ali.artukov.model.ResultDto;

/**
 * Bubble sort, sometimes referred to as sinking sort,
 * is a simple sorting algorithm that repeatedly steps through the input list element by element,
 * comparing the current element with the one after it, swapping their values if needed.
 * <a href="https://en.wikipedia.org/wiki/Bubble_sort">Wikipedia</a>
 */

public class BubbleSort {

    private BubbleSort() {
    }

    public static int[] sort(int[] unsortedArray) {
        for (int i = unsortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
        return unsortedArray;
    }

    public static int[] optimizedSort(int[] unsortedArray) {
        boolean isCycleSortedAnyValue = false;

        for (int i = unsortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                    isCycleSortedAnyValue = true;
                }
            }
            if (!isCycleSortedAnyValue) {
                return unsortedArray;
            } else {
                isCycleSortedAnyValue = false;
            }
        }
        return unsortedArray;
    }

    public static ResultDto optimizedSortWithStat(int[] unsortedArray) {
        long startTime = System.nanoTime();
        long endTime;
        long stepCount = 0;
        boolean isCycleSortedAnyValue = false;

        for (int i = unsortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                    isCycleSortedAnyValue = true;
                }
                stepCount++;
            }
            if (!isCycleSortedAnyValue) {
                endTime = System.nanoTime();
                return new ResultDto(unsortedArray, stepCount, endTime - startTime);
            } else {
                isCycleSortedAnyValue = false;
            }
        }
        endTime = System.nanoTime();
        return new ResultDto(unsortedArray, stepCount, endTime - startTime);
    }
}

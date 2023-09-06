package model;
import java.util.Random;
/**
 *
 * @author lenovo
 */
public class SortModel {
    private int[] array;

 public void setArray(int[] customArray) {
        this.array = customArray;
    }
    public int[] getArray() {
        return array;
    }

    public void bubbleSort() {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
 

}



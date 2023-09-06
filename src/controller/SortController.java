package controller;

import model.SortModel;
import view.SortView;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class SortController {
    
    private SortModel model;
    private SortView view;

    public SortController(SortModel model, SortView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        int[] customArray = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            customArray[i] = scanner.nextInt();
        }

        model.setArray(customArray);

        System.out.println("Unsorted Array:");
        view.displayArray(model.getArray());

        model.bubbleSort();

        System.out.println("\nSorted Array:");
        view.displayArray(model.getArray());

        scanner.close();
    }

    public static void main(String[] args) {
        SortModel model = new SortModel();
        SortView view = new SortView();
        SortController controller = new SortController(model, view);
        
        controller.run();
    }
    
}

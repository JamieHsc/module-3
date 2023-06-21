package module33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedArrayMerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int size1 = scanner.nextInt();
        List<Integer> array1 = new ArrayList<>();
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            array1.add(scanner.nextInt());
        }
        Collections.sort(array1); // Sort the first array in ascending order

        System.out.print("Enter the number of elements in the second array: ");
        int size2 = scanner.nextInt();
        List<Integer> array2 = new ArrayList<>();
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            array2.add(scanner.nextInt());
        }
        Collections.sort(array2); // Sort the second array in ascending order

        List<Integer> mergedArray = mergeSortedArrays(array1, array2);

        System.out.println("Merged array in ascending order:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static List<Integer> mergeSortedArrays(List<Integer> array1, List<Integer> array2) {
        List<Integer> mergedArray = new ArrayList<>();

        int i = 0; // index for array1
        int j = 0; // index for array2

        while (i < array1.size() && j < array2.size()) {
            if (array1.get(i) <= array2.get(j)) {
                mergedArray.add(array1.get(i));
                i++;
            } else {
                mergedArray.add(array2.get(j));
                j++;
            }
        }

        while (i < array1.size()) {
            mergedArray.add(array1.get(i));
            i++;
        }

        while (j < array2.size()) {
            mergedArray.add(array2.get(j));
            j++;
        }

        return mergedArray;
    }
}

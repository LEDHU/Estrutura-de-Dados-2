public class App {
    public static void main(String[] args) {

        //int array[] = {23, 45, 12, 56, 78, 9, 34, 67, 89, 10, 43, 76, 98, 21, 54, 87, 32, 65, 99, 4, 66, 90, 13, 77, 47,
                //68, 33, 92, 22, 55, 79, 88};
        
        int array[] = {85,99,98,97,96,95,94,93,92,91,90,89, 87,86, 74};

        MergeSort sorting = new MergeSort();

        System.out.println("Given array is");
        sorting.printArray(array);

        sorting.mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted array is");
        sorting.printArray(array);

    }
}

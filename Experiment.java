import java.util.Arrays;

public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();
    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        long startTime = System.nanoTime();
        if (type.equals("basic")) sorter.basicSort(copy);
        else sorter.advancedSort(copy);
        return System.nanoTime() - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        searcher.search(arr, target);
        return System.nanoTime() - startTime;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000}; // Маленький, средний, большой [cite: 56, 57, 58]
        for (int size : sizes) {
            System.out.println("--- Размер массива: " + size + " ---");
            int[] randomArr = sorter.generateRandomArray(size);
            long bTime = measureSortTime(randomArr, "basic");
            long aTime = measureSortTime(randomArr, "advanced");
            System.out.println("Bubble Sort: " + bTime + " ns");
            System.out.println("Quick Sort: " + aTime + " ns");
            Arrays.sort(randomArr);
            long sTime = measureSearchTime(randomArr, randomArr[size/2]);
            System.out.println("Binary Search: " + sTime + " ns\n");
        }
    }
}
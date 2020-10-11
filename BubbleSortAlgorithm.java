import java.util.Arrays;

public class BubbleSortAlgorithm {
	
	public static void main(String[] args) { // Main method for test
		int[] dataSet = { 0, 3, 5, 2, 6, 9, 10, 16, 1, 0 };
		BubbleSort solutionBubbleSort = new BubbleSort();
		System.out.println(Arrays.toString(solutionBubbleSort.bubble_sort(dataSet)));
	}
}

class BubbleSort {
	int[] bubble_sort(int[] dataSet) {
		for (int i = 0; i < dataSet.length; i++) { 
			boolean swapped = false;
			for (int j = 0; j < dataSet.length - i - 1; j++) {
				if (dataSet[j] > dataSet[j + 1]) { // Swap value
					int temp = dataSet[j + 1];
					dataSet[j + 1] = dataSet[j];
					dataSet[j] = temp;
					swapped = true;
				}
			}
			if (swapped == false) { // If no swapped occurred then its already sorted so break the loop to make algorithm more efficient.
				break;
			}
		}
		return dataSet;
	}
}

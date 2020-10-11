import java.util.Arrays;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {
		int[] dataSet = { 10, 5, 0, 2, 8, 7 };
		SelectionSort solutionSelectionSort = new SelectionSort();
		System.out.println(Arrays.toString(solutionSelectionSort.selection_sort(dataSet)));
	}
}

class SelectionSort {
	int[] selection_sort(int[] dataSet) {
		for (int i = 0; i < dataSet.length; i++) {
			int index_min = i; // first index as current minimum value
			for (int j = index_min + 1; j < dataSet.length; j++) { // Finding minimum value among the rest
				if (dataSet[j] < dataSet[index_min]) {
					index_min = j;
				}
			}
			if (dataSet[index_min] <= dataSet[i]) {
				int temp = dataSet[i];
				dataSet[i] = dataSet[index_min];
				dataSet[index_min] = temp;
			}
		}
		return dataSet;
	}
}

public class LinearSearchAlgorithm {
	public static void main(String[] args) {
		int[] dataList = { 1, 5, 3, 9, 10, 41, 6, 8 };
		int value = 8;
		LinearSearch solutionLinearSearch = new LinearSearch();
		int result = solutionLinearSearch.Linear_search(dataList, value); // result
		if (result == 1) {
			System.out.println("Value found");
		} else {
			System.out.println("Value not found");
		}
	}
}

class LinearSearch {
	int Linear_search(int[] dataList, int value) { // Main function
		for (int i = 0; i < dataList.length; i++) { // Value check
			if (dataList[i] == value) {
				return 1; // Value found
			}
		}
		return -1; // Value not found
	}
}

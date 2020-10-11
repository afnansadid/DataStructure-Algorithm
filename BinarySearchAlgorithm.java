public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		int[] dataList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int value = 4;
		BinarySearch solutionBinarySearch = new BinarySearch();
		int result = solutionBinarySearch.binary_Search(dataList, value);
		if (result == 1) {
			System.out.println("Value found");
		} else {
			System.out.println("Value not found");
		}
	}
}
class BinarySearch {
	int binary_Search(int[] dataList, int value) {
		int leftIndex = 0;
		int rightIndex = dataList.length - 1;
		while (leftIndex <= rightIndex) {
			int middleIndex = (leftIndex + rightIndex) / 2; // Integer division
			if (value == dataList[middleIndex]) {
				return 1; // Value found
			}
			if (value < dataList[middleIndex]) {
				rightIndex = middleIndex - 1;
			} else {
				leftIndex = middleIndex + 1;
			}
		}
		return -1; // Value not found
	}
}

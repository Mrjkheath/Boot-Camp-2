
public class Boot_Camp_2 {
	// Task 1
	public static int smallest(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	// Task 2
	public static int[] populateArray(int left, int right, int count) {
		int[] arr;
		arr = new int[count];
		for (int i = left; i < right; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		return arr;
	}

	// Task 3
	public static double[] populateArray(double left, double right, int count) {
		double[] arr;
		arr = new double[count];
		for (int i = (int) left; i < right; i++) {
			arr[i] = Math.random() * 10;
		}
		return arr;
	}

	// Task 4
	public static int[] grow(int[] arr) {
		int[] temp = new int[2 * arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}

	// Task 5
	public static int[] shrink(int[] arr) {
		int[] temp = new int[arr.length / 2];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}

	// Task 6
	public static double[] grow(double[] arr){
		double[] temp = new double[arr.length * 2];
		for(int i = 0; i < arr.length; i++){
			temp[i] = arr[i];
		}
		return temp;
	}

	// Task 7
	public static double[] shrink(double[] arr){
		double[] temp = new double[arr.length / 2];
		for(int i = 0; i < temp.length; i++){
			temp[i] = arr[i];
		}
		return temp;
	}

}

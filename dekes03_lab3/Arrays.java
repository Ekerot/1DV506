package dekes03_lab3;

public class Arrays {

	public static void main(String[] args) {

		int[] array = { 3, 4, 5, 6, 7 };
		int[] arrayAttSortera = { 34, 2, 67, 4, 1, 687 };

		int summeradArr = sumArr(array); // anropar metoden summArr och berättar
											// att arrayen arr ska användas
											// arrayen arr ska användas
		int gammaltTal = 5;
		int nyttTal = 32;

		int[] primeArray = { 3, 4, 5, 6, 7 }; // arrayerna som ska användas
		int[] sub = { 4, 9, 6 };

		Arrays.toString(array);

		// de olika anrop som görs för att köra de olika metoderna

		int[] laggTillN = Arrays.addN(array, 5);

		int[] rvrse = reverse(array);

		boolean varde = hasN(array, 10);

		replaceAll(array, gammaltTal, nyttTal);
		System.out.println("");

		int[] sorteradArray = sort(arrayAttSortera);

		boolean varde2 = hasSubsequence(primeArray, sub);

		// nedanför ligger alla System.out.print

		System.out.println("Summerad array: " + summeradArr);

		System.out.println("Adderad med N: " + toString(laggTillN));

		System.out.println("Reversed array: " + toString(rvrse));

		System.out.println("Finns talet 10 i arrayen? " + varde);

		System.out.println("Sorterad array: " + toString(sorteradArray));

		System.out.println("Finns substringen i arrayen? " + varde2);

	}

	private static String toString(int[] arr) { // toString som gör det vi
												// returnerar läsbart
		String temp = "";

		for (int l = 0; l < arr.length; l++) {
			temp += arr[l];

			if (l < arr.length - 1) {
				temp += ", ";

			}

		}

		String out = temp;
		return out;

	}

	private static int sumArr(int[] arr) {
		int out;
		int temp = 0;

		for (int j = 0; j < arr.length; j++) { // kör igenom hela index i arr
												// och
												// plussar index i
												// in-variabeln[i] med
												// den temporärt lagrade värdet
												// i variabeln temp
			temp = temp + arr[j];
		}
		out = temp; // tilldelar värdet i temp med out

		return out; // returnerar out

	}

	private static int[] reverse(int[] in) {

		int[] reversed = new int[in.length]; // metod som gör en ny array lagt
												// värdena i den nya arrayen
												// baklänges
		for (int k = 0; k < in.length; k++) {
			reversed[k] = in[in.length - 1 - k];
		}

		int[] out = reversed;
		return out;
	}

	private static int[] addN(int[] arr, int n) { // adderar varje tal i array
													// med talet n och sparar i
													// en ny array

		int[] addN = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			addN[i] = n + arr[i];

		}

		return addN;

	}

	private static boolean hasN(int[] arr, int n) { // metoden tittar på om
													// talet n fiins i arrayen
		boolean varde = false;

		for (int i : arr) {

			if (n == i) { // loopar för att kolla varje värde i arrayen och
							// returnerar true om talet finns, annars flase
				varde = true;
				break;

			}

			else {
				varde = false;

			}

		}

		return varde;

	}

	private static void replaceAll(int[] arr, int old, int nw) {
		
		System.out.print("Byter ut 5 mot 32: ");

		for (int m = 0; m < arr.length; m++) { // loppar för att bbyta ut det
												// gammla talet mot det nya
			if (arr[m] == old) {
				arr[m] = nw;
			}

			System.out.print(arr[m]);
			System.out.print(" ");

		}

	}

	private static int[] sort(int[] arr) {
		int[] out = arr;
		boolean flag = true;

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (int o = 0; o < arr.length - 1; o++) {
				if (arr[o] > arr[o + 1]) // change to > for ascending sort
				{
					int temp = arr[o]; // swap elements
					arr[o] = arr[o + 1];
					arr[o + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
		return out;
	}

	private static boolean hasSubsequence(int[] arr, int[] sub) {
		boolean out = false;

		for (int i = 0, j = 0; i < arr.length - 1; i++) { // får igenom hela
															// arrayen för att
															// se om subSequence
															// finns i den

			if (arr[i] == sub[j]) {

				if (++j == sub.length) {
					if (j == sub.length)
						;
					out = true;    //returnerar true om subSequence finns

				}

			} else {  //returnerar false då subSequence inte finns
				i -= j;
				j = 0;

			}
		}
		return out;
	}
}

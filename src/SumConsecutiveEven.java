
/* Save this in a file called Main.java to compile and test it */

import java.util.*;

public class SumConsecutiveEven {
	public static int processArray(ArrayList<Integer> array) {
		/*
		 * Do not make any changes outside this method.
		 *
		 * Modify this method to process `array` as indicated in the question.
		 * At the end, return the size of the array.
		 *
		 * Do not print anything in this method
		 *
		 * Submit this entire program (not just this function) as your answer
		 */
		int tmpSum = 0;
		for (int i = 0; i < array.size() - 1; i++) {
			if ((array.get(i) % 2 == 0) && (array.get(i + 1) % 2 == 0)) {
				tmpSum = array.get(i) + array.get(i + 1);
				array.set(i, tmpSum);
				array.remove(i + 1);
				i--;
			}
		}
		return array.size();
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int num = in.nextInt();
			if (num < 0)
				break;
			arrayList.add(new Integer(num));
		}
		int new_length = processArray(arrayList);
		for (int i = 0; i < new_length; i++)
			System.out.println(arrayList.get(i));
		in.close();
	}
}

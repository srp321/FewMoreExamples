import java.util.*;

public class WordPositionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> allVals = new ArrayList<List<String>>();
		allVals = combinationFinder("2110");

/*		int count = allVals.size();
		System.out.print("count: " + count);
		for (int i = 0; i < allVals.size(); i++) {
			List<String> tmpVal = allVals.get(i);
			for (int j = 0; j < tmpVal.size(); j++) {
				if (tmpVal.get(j).startsWith("0")) {
					count--;
				}
			}
		}*/
		System.out.println(allVals);
	}

	private static List<List<String>> combinationFinder(String str) {
		if (str.isEmpty()) {
			return Collections.singletonList(Collections.emptyList());
		}
		List<List<String>> result = new ArrayList<>();
		if (str.charAt(0) != '0') {
			String firstChar = str.substring(0, 1);
			List<List<String>> combinationsOfRemainingStr = combinationFinder(str.substring(1));
			addAllCombos(result, firstChar, combinationsOfRemainingStr);
			if (str.length() >= 2) {
				String firstSubstring = str.substring(0, 2);
				int firstNumber = Integer.parseInt(firstSubstring);
				if (firstNumber >= 1 && firstNumber <= 26) {
					combinationsOfRemainingStr = combinationFinder(str.substring(2));
					addAllCombos(result, firstSubstring, combinationsOfRemainingStr);
				}
			}
		}
		return result;
	}

	private static void addAllCombos(List<List<String>> result, String firstElement,
			List<List<String>> remainingElements) {
		for (List<String> remCombo : remainingElements) {
			List<String> totalCombo = new ArrayList<>(1 + remCombo.size());
			totalCombo.add(firstElement);
			totalCombo.addAll(remCombo);
			result.add(totalCombo);
		}
	}
}

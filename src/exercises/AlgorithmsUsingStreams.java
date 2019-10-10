package exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmsUsingStreams {

	public static long countGoodEggs(List<String> eggs) {
		return eggs.stream() // 1. create stream
				.filter(egg -> egg.equals("whole")) // 2. intermediate filter operation
				.count(); // 3. terminal operation: reduce to an int
	}

	public static Object findTallest(List<Double> peeps) {
//		return Collections.max(peeps);
		return peeps.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}

	public static long addStringOfNumbers(String numbers) {
		return numbers.chars().mapToObj(c -> Character.toString(c)).mapToInt(num -> Integer.parseInt(num)).sum();
	}

	public static long countPearls(List<Boolean> oysters) {
		return oysters.stream().filter(oyster -> oyster.booleanValue() == true).count();
	}

	public static String findLongestWord(List<String> words) {
		return words.stream().max((String wordOne, String wordTwo) -> wordOne.length() - wordTwo.length()).get();
	}

	public static List<Double> sortScores(List<Double> results) {
		return results.stream().sorted().collect(Collectors.toList());
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		return unsortedSequences.stream()
				.sorted((String wordOne, String wordTwo) -> wordOne.length() - wordTwo.length())
				.collect(Collectors.toList());
	}

	public static List<String> sortWords(List<String> words) {
		return words.stream().sorted().collect(Collectors.toList());
	}

	public static List<String> getDistinctSpellsInAlphabeticalOrder(List<String> spellsCastThisWeek) {
		return spellsCastThisWeek.stream().distinct().sorted().collect(Collectors.toList());
	}

	public static Object getBatPhrases(String[] batmanScript) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int countXs(String xString) {
		return (int) xString.chars().filter(ch -> ch == 'o').count();
	}

	public static Integer addEven(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Double getAverage(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Integer countOccurrences(String[] strArr, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

package org.mael.fourchan.gentoomen.daily;

import java.util.LinkedList;
import java.util.List;

public class AsteriskReplacer {

	private static final Character ASTERISK = new Character('*');

	public static Object replace(String string) {

		return string.replaceAll(".?(\\*)+.?", "");
	}

	public static String replaceTheHardWay(String string) {

		List<Integer> charsIndexToDelete = new LinkedList<>();

		char[] chars = string.toCharArray();

		for (int i = 0; i < chars.length;) {

			if (ASTERISK.equals(string.charAt(i))) {
				if (i != 0) {
					charsIndexToDelete.add(i - 1);
				}
				charsIndexToDelete.add(i);
				charsIndexToDelete.add(++i);
			} else {
				i++;
			}
		}

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < chars.length; i++) {
			if (charsIndexToDelete.contains(i)) {
				charsIndexToDelete.remove((Object) i); // Disambiguate index
														// from element
			} else {
				builder.append(chars[i]);
			}
		}

		return builder.toString();
	}
}

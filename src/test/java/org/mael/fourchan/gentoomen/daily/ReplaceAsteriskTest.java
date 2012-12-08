package org.mael.fourchan.gentoomen.daily;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Write a function that, given a string, removes from the string any *
 * character, or any character that's one to the left or one to the right of a *
 * character. Examples: "adf*lp" --> "adp" "a*o" --> "" "*dech*" --> "ec"
 * "de**po" --> "do" "sa*n*ti" --> "si" "abc" --> "abc"
 */

public class ReplaceAsteriskTest {

	private String[] toReplace = { "adf*lp", "a*o", "*dech*", "de**po",
			"sa*n*ti", "abc", "* *ab" };

	private String[] expected = { "adp", "", "ec", "do", "si", "abc", "b" };

	@Test
	public void testReplaceTheRegexWay() {

		for (int i = 0; i < this.toReplace.length; i++) {
			assertEquals(expected[i], AsteriskReplacer.replace(toReplace[i]));
		}

	}

	@Test
	public void testReplaceTheHardWay() {
		for (int i = 0; i < this.toReplace.length; i++) {
			assertEquals(expected[i],
					AsteriskReplacer.replaceTheHardWay(toReplace[i]));
		}
	}

}

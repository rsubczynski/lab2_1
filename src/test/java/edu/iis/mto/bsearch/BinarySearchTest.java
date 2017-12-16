package edu.iis.mto.bsearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void ElementIsInTheSequenceAndSequenceLengthIsOne() {
		int element = 1;
		int[] seq = { 1 };
		assertTrue(BinarySearch.search(element, seq).isFound());
	}

	@Test
	public void ElementIsNotInTheSequenceAndSequenceLengthIsOne() {
		int element = 2;
		int[] seq = { 1 };
		assertFalse(BinarySearch.search(element, seq).isFound());
	}

	@Test
	public void ElementIsFirstInTheSequenceAndSequenceLengthIsMoreThanOne() {
		int element = 3;
		int[] seq = { 3, 4, 5, 6 };
		assertEquals(BinarySearch.search(element, seq).getPosition(), 1);
	}

	@Test
	public void ElementIsLastInTheSequenceAndSequenceLengthIsMoreThanOne() {
		int element = 6;
		int[] seq = { 3, 4, 5, 6 };
		assertEquals(BinarySearch.search(element, seq).getPosition(), seq.length);
	}

	@Test
	public void ElementIsInTheMiddleOfTheSequenceAndSequenceLengthIsMoreThanOne() {
		int element = 4;
		int[] seq = { 3, 4, 5 };
		assertEquals(BinarySearch.search(element, seq).getPosition(), seq.length / 2 + 1);
	}

	@Test
	public void ElementIsNotInTheSequenceAndSequenceLengthIsMoreThanOne() {
		int element = 6;
		int[] seq = { 1, 2, 3, 4, 5 };
		assertFalse(BinarySearch.search(element, seq).isFound());
	}
}

package edu.iis.mto.bsearch;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void ElementIsInTheSequenceAndSequenceLengthIsOne() {
		int element = 1;
		int[] seq = { 1 };
		assertTrue(BinarySearch.search(element, seq).isFound());
	}

}

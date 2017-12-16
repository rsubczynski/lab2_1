package edu.iis.mto.bsearch;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void ElementIsInTheSequenceAndSequenceLengthIsOne() {
		int element = 1;
		int[] seq = { 1 };
		assertThat(BinarySearch.search(element, seq).isFound(), Matchers.is(true));
	}

	@Test
	public void ElementIsNotInTheSequenceAndSequenceLengthIsOne() {
		int element = 2;
		int[] seq = { 1 };
		assertThat(BinarySearch.search(element, seq).isFound(), Matchers.is(false));
	}

	@Test
	public void ElementIsFirstInTheSequenceAndSequenceLengthIsMoreThanOne() {
		int element = 3;
		int[] seq = { 3, 4, 5, 6 };
		assertThat(BinarySearch.search(element, seq).getPosition(), Matchers.is(1));
	}

	@Test
	public void ElementIsLastInTheSequenceAndSequenceLengthIsMoreThanOne() {
		int element = 6;
		int[] seq = { 3, 4, 5, 6 };
		assertThat(BinarySearch.search(element, seq).getPosition(), Matchers.is(seq.length));
	}

	@Test
	public void ElementIsInTheMiddleOfTheSequenceAndSequenceLengthIsMoreThanOne() {
		int element = 4;
		int[] seq = { 3, 4, 5 };
		assertThat(BinarySearch.search(element, seq).getPosition(), Matchers.is(seq.length / 2 + 1));
	}

	@Test
	public void ElementIsNotInTheSequenceAndSequenceLengthIsMoreThanOne() {
		int element = 6;
		int[] seq = { 1, 2, 3, 4, 5 };
		assertThat(BinarySearch.search(element, seq).isFound(), Matchers.is(false));
	}

	@Test(expected = IllegalArgumentException.class)
	public void SequenceLengthEqualsZero() {
		int[] seq = {};
		int key = 1;
		BinarySearch.search(key, seq);
	}

	@Test
	public void ElementIsInTheSecondPartOfTheSequence() {
		int element = 4;
		int[] seq = { 1, 2, 3, 4, 5, 6 };
		assertThat(BinarySearch.search(element, seq).getPosition(), Matchers.greaterThanOrEqualTo(seq.length / 2 + 1));
	}
}

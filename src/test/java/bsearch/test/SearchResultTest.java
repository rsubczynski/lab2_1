package bsearch.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchResultTest {

    private final int KEY_NOT_FOUND = -1;

    @org.junit.Test
    public void keyIsInSequenceWithASizeEqualToOne() {
        final int key = 2;
        final int[] sequence = {2};
        final int keyPositionInSequence = 1;
        boolean actualResult = false;
        boolean expectedResult = true;

        SearchResult result = BinarySearch.search(key, sequence);
        actualResult = result.isFound() == true && result.getPosition() == keyPositionInSequence;

        assertThat(actualResult, Matchers.equalTo(expectedResult));
    }

    @org.junit.Test
    public void keyIsNotInSequenceWithASizeEqualToOne() {
        final int key = 1;
        final int[] sequence = {2};
        boolean actualResult = false;
        boolean expectedResult = true;

        SearchResult result = BinarySearch.search(key, sequence);
        actualResult = result.isFound() == false && result.getPosition() == KEY_NOT_FOUND;

        assertThat(actualResult, Matchers.equalTo(expectedResult));
    }

    @org.junit.Test
    public void keyIsFirstElementInSequence() {
        final int key = 1;
        final int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int keyPositionInSequence = 1;
        boolean actualResult = false;
        boolean expectedResult = true;

        SearchResult result = BinarySearch.search(key, sequence);
        actualResult = result.isFound() == true && result.getPosition() == keyPositionInSequence;

        assertThat(actualResult, Matchers.equalTo(expectedResult));
    }

    @org.junit.Test
    public void keyIsLastElementInSequence() {
        final int key = 10;
        final int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int keyPositionInSequence = 10;
        boolean actualResult = false;
        boolean expectedResult = true;

        SearchResult result = BinarySearch.search(key, sequence);
        actualResult = result.isFound() == true && result.getPosition() == keyPositionInSequence;

        assertThat(actualResult, Matchers.equalTo(expectedResult));
    }

    @org.junit.Test
    public void keyIsInTheMiddleOfSequence() {
        final int key = 6;
        final int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        final int keyPositionInSequence = (0 + sequence.length - 1) / 2 + 1;
        boolean actualResult = false;
        boolean expectedResult = true;

        SearchResult result = BinarySearch.search(key, sequence);
        actualResult = result.isFound() == true && result.getPosition() == keyPositionInSequence;

        assertThat(actualResult, Matchers.equalTo(expectedResult));
    }

    @org.junit.Test
    public void noKeyInSequence() {
        final int key = 11; // random Element which is not in sequence
        final int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean actualResult = false;
        boolean expectedResult = true;

        SearchResult result = BinarySearch.search(key, sequence);
        actualResult = result.isFound() == false && result.getPosition() == KEY_NOT_FOUND;

        assertThat(actualResult, Matchers.equalTo(expectedResult));
    }

    @org.junit.Test
    public void noElementsInSequenceThrowIllegalArgumentException() throws IllegalArgumentException {
        final int key = 1;
        final int[] sequence = {};
        boolean expectedResult = true;
        boolean actualResult = false;

        try {
            BinarySearch.search(key, sequence);
        } catch (IllegalArgumentException exception) {
            actualResult = true;
        }

        assertThat(actualResult, is(expectedResult));
    }
}

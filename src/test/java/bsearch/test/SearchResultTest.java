package bsearch.test;

import static org.junit.Assert.assertTrue;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchResultTest {

    private final int KEY_NOT_FOUND = -1;

    @org.junit.Test
    public void keyIsInSequenceWithASizeEqualToOne() {
        final int key = 2;
        final int[] sequence = {2};
        final int keyPositionInSequence = 1;

        SearchResult result = BinarySearch.search(key, sequence);
        assertTrue(result.isFound() == true && result.getPosition() == keyPositionInSequence);
    }

    @org.junit.Test
    public void keyIsNotInSequenceWithASizeEqualToOne() {
        final int key = 1;
        final int[] sequence = {2};

        SearchResult result = BinarySearch.search(key, sequence);
        assertTrue(result.isFound() == false && result.getPosition() == KEY_NOT_FOUND);
    }

    @org.junit.Test
    public void keyIsFirstElementInSequence() {
        final int key = 1;
        final int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int keyPositionInSequence = 1;

        SearchResult result = BinarySearch.search(key, sequence);
        assertTrue(result.isFound() == true && result.getPosition() == keyPositionInSequence);
    }

    @org.junit.Test
    public void keyIsLastElementInSequence() {
        final int key = 10;
        final int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int keyPositionInSequence = 10;

        SearchResult result = BinarySearch.search(key, sequence);
        assertTrue(result.isFound() == true && result.getPosition() == keyPositionInSequence);
    }

    @org.junit.Test
    public void keyIsInTheMiddleOfSequence() {
        final int key = 6;
        final int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        final int keyPositionInSequence = 6;

        SearchResult result = BinarySearch.search(key, sequence);
        assertTrue(result.isFound() == true && result.getPosition() == keyPositionInSequence);
    }

}

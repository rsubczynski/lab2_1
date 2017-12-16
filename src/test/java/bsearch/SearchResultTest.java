package bsearch;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchResultTest {

    @Test
    public void isInSequenceOfSizeOne() {
        final int key = 3;
        final int[] seq = {3};
        final int positionInSequence = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() && searchResult.getPosition() == positionInSequence);
    }

    @Test
    public void isNotInSequenceOfSizeOne() {
        final int key = 2;
        final int[] seq = {3};
        final int positionInSequence = -1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertFalse(searchResult.isFound());
        assertTrue(searchResult.getPosition() == positionInSequence);
    }

    @Test
    public void isFirstInSequence() {
        final int key = 1;
        final int[] seq = {1, 2, 3, 4, 5};
        final int positionInSequence = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() && searchResult.getPosition() == positionInSequence);
    }

    @Test
    public void isLastInSequence() {
        final int key = 5;
        final int[] seq = {1, 2, 3, 4, 5};
        final int positionInSequence = 5;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() && searchResult.getPosition() == positionInSequence);
    }

    @Test
    public void isInMiddleOfSequence() {
        final int key = 3;
        final int[] seq = {1, 2, 3, 4, 5};
        final int positionInSequence = 3;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() && searchResult.getPosition() == positionInSequence);
    }
}

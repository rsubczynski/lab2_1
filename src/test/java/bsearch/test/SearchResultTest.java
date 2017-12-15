package bsearch.test;

import static org.junit.Assert.assertTrue;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchResultTest {

    @org.junit.Test
    public void isInSequenceWithASizeEqualToOne() {
        final int key = 2;
        final int[] sequence = {2};
        final int keyPositionInSequence = 1;

        SearchResult result = BinarySearch.search(key, sequence);
        assertTrue(result.isFound() == true && result.getPosition() == keyPositionInSequence);
    }

    @org.junit.Test
    public void isNotInSequenceWithASizeEqualToOne() {
        final int key = 1;
        final int[] sequence = {2};
        final int keyPositionInSequence = -1; // KEY not found

        SearchResult result = BinarySearch.search(key, sequence);
        assertTrue(result.isFound() == false && result.getPosition() == keyPositionInSequence);
    }

}

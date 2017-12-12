import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchTest {

    private SearchResult searchResult;
    private int key;
    private int[] seq;

    @Test
    public void searchShouldReturnExceptionWhenZeroElementInputSequence() {
        key = 1;
        seq = new int[] {};
        searchResult = BinarySearch.search(key, seq);
        assertNotNull(IllegalArgumentException.class);
    }

    @Test
    public void searchShouldReturnIsInSequenceWhenOneElementInputSequence() {
        key = 1;
        seq = new int[] {1};
        searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
    }

    @Test
    public void searchShouldReturnIsNotInSequenceWhenOneElementInputSequence() {
        key = 1;
        seq = new int[] {2};
        searchResult = BinarySearch.search(key, seq);
        assertFalse(searchResult.isFound());
    }
}

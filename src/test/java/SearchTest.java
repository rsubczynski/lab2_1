import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchTest {

    private SearchResult searchResult;
    private BinarySearch binarySearch;
    private int key;
    private int[] seq;

    @Before
    public void setup() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void searchShouldReturnIsInSequenceWhenOneElementInputSequence() {
        key = 1;
        seq = new int[] {1};
        searchResult = binarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
    }

    @Test
    public void searchShouldReturnIsNotInSequenceWhenOneElementInputSequence() {
        key = 1;
        seq = new int[] {2};
        searchResult = binarySearch.search(key, seq);
        assertFalse(searchResult.isFound());
    }
}

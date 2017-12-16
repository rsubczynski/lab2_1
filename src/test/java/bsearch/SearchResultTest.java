package bsearch;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Test;

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

}

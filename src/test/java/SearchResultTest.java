
import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchResultTest {

    @Test
    public void keyShouldExistSequenceOfSizeOne() {
        final int key = 3;
        final int[] seq = {3};
        final int positionInSequence = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound() && searchResult.getPosition() == positionInSequence);
    }

    @Test
    public void keyShouldntExistInSequenceOfSizeOne() {
        final int key = 2;
        final int[] seq = {3};
        final int positionInSequence = -1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertFalse(searchResult.isFound());
        assertTrue(searchResult.getPosition() == positionInSequence);
    }

}

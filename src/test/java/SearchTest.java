import static org.junit.Assert.*;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Before;
import org.junit.Test;

public class SearchTest {

    private SearchResult searchResult;
    private BinarySearch binarySearch;
    private int key;
    private int[] seq;

    @Before
    public void setup(){
        binarySearch = new BinarySearch();
    }

    @Test
    public void searchShouldReturnIsInSequenceWhenOneElementInputSequence(){
        key = 1;
        seq = new int[]{1};
        searchResult = binarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
    }
}

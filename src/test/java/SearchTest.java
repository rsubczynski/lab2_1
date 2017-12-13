import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchTest {

    private SearchResult searchResult;
    private int key;
    private int[] seq;

    @Test(expected = IllegalArgumentException.class)
    public void searchShouldReturnExceptionWhenZeroElementInputSequence() {
        key = 1;
        seq = new int[] {};
        searchResult = BinarySearch.search(key, seq);
    }

    @Test
    public void searchShouldReturnIsInSequenceWhenOneElementInputSequence() {
        key = 1;
        seq = new int[] {1};
        searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchShouldReturnIsNotInSequenceWhenOneElementInputSequence() {
        key = 1;
        seq = new int[] {2};
        searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), Matchers.is(false));
    }

    @Test
    public void searchShouldReturnIsFirstInSequenceWhenMultiElementInputSequence() {
        key = 10;
        seq = new int[] {10, 12, 23, 43};
        searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), Matchers.is(0));
    }

    @Test
    public void searchShouldReturnIsLastInSequenceWhenMultiElementInputSequence() {
        key = 30;
        seq = new int[] {7, 15, 23, 27, 30};
        searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), Matchers.is(seq.length - 1));
    }

    @Test
    public void searchShouldReturnIsMiddleInOddSequenceWhenMultiElementInputSequence() {
        key = 13;
        seq = new int[] {5, 11, 13, 34, 89};
        searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), Matchers.is((seq.length-1)/2));
    }

    @Test
    public void searchShouldReturnIsMiddleInEvenSequenceWhenMultiElementInputSequence() {
        key = 7;
        seq = new int[] {1, 2, 3, 7, 9, 11, 13, 40};
        searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), Matchers.is((seq.length-1)/2));
    }

    @Test
    public void searchShouldReturnIsNotInSequenceWhenMultiElementInputSequence() {
        key = 4;
        seq = new int[] {1, 2, 3, 5, 14};
        searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), Matchers.is(-1));
    }
}

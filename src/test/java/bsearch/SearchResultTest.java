package bsearch;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchResultTest {

    private final int NOT_FOUND = -1;

    @Test
    public void isInSequenceOfSizeOne() {
        final int key = 3;
        final int[] seq = {3};
        final int positionInSequence = 1;
        final boolean expectResult = true;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound() && searchResult.getPosition() == positionInSequence, is(expectResult));
    }

    @Test
    public void isNotInSequenceOfSizeOne() {
        final int key = 2;
        final int[] seq = {3};
        final int positionInSequence = NOT_FOUND;
        final boolean expectResult = true;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound() == false && searchResult.getPosition() == positionInSequence,
                is(expectResult));
    }

    @Test
    public void isFirstInSequence() {
        final int key = 1;
        final int[] seq = {1, 2, 3, 4, 5};
        final int positionInSequence = 1;
        final boolean expectResult = true;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound() && searchResult.getPosition() == positionInSequence, is(expectResult));
    }

    @Test
    public void isLastInSequence() {
        final int key = 5;
        final int[] seq = {1, 2, 3, 4, 5};
        final int positionInSequence = 5;
        final boolean expectResult = true;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound() && searchResult.getPosition() == positionInSequence, is(expectResult));
    }

    @Test
    public void isInMiddleOfSequence() {
        final int key = 3;
        final int[] seq = {1, 2, 3, 4, 5};
        final int positionInSequence = ((0 + seq.length - 1) / 2) + 1;
        final boolean expectResult = true;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound() && searchResult.getPosition() == positionInSequence, is(expectResult));
    }

    @Test
    public void isNotInSequence() {
        final int key = 6;
        final int[] seq = {1, 2, 3, 4, 5};
        final int positionInSequence = NOT_FOUND;
        final boolean expectResult = true;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound() == false && searchResult.getPosition() == positionInSequence,
                is(expectResult));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sequenceIsEmpty() throws IllegalArgumentException {
        final int key = 6;
        final int[] seq = {};

        SearchResult searchResult = BinarySearch.search(key, seq);

    }
}

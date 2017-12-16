import static edu.iis.mto.bsearch.BinarySearch.search;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.SearchResult;

public class SearchTest {

    private SearchResult searchResult;
    private int key;
    private int[] sequenceZero;
    private int[] sequenceOne;
    private int[] sequenceEven;
    private int[] sequenceOdd;
    private int[] sequenceUnordered;

    @Before
    public void setUp() {
        sequenceZero = new int[] {};
        sequenceOne = new int[] {5};
        sequenceEven = new int[] {1, 2, 3, 7, 9, 11, 13, 40};
        sequenceOdd = new int[] {5, 11, 13, 34, 89};
        sequenceUnordered = new int[] {4, 10, 2, 3, 5, 14, 1};
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchReturnExceptionWhenZeroElementSequence() {
        key = 5;
        searchResult = search(key, sequenceZero);
    }

    @Test
    public void searchReturnIsFoundInSequenceWhenOneElementSequence() {
        key = 5;
        searchResult = search(key, sequenceOne);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void searchReturnPositionInSequenceWhenOneElementSequence() {
        key = 5;
        searchResult = search(key, sequenceOne);
        assertThat(searchResult.getPosition(), is(0));
    }

    @Test
    public void searchReturnIsNotFoundInSequenceWhenOneElementSequence() {
        key = 1;
        searchResult = search(key, sequenceOne);
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void searchReturnFailureCodeWhenOneElementSequence() {
        key = 1;
        searchResult = search(key, sequenceOne);
        assertThat(searchResult.getPosition(), is(-1));
    }

    @Test
    public void searchReturnIsFoundFirstInSequenceWhenMultiElementSequence() {
        key = 5;
        searchResult = search(key, sequenceOdd);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void searchReturnFirstPositionInSequenceWhenMultiElementSequence() {
        key = 5;
        searchResult = search(key, sequenceOdd);
        assertThat(searchResult.getPosition(), is(0));
    }

    @Test
    public void searchReturnIsFoundLastInSequenceWhenMultiElementSequence() {
        key = 89;
        searchResult = search(key, sequenceOdd);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void searchReturnLastPositionInSequenceWhenMultiElementSequence() {
        key = 89;
        searchResult = search(key, sequenceOdd);
        assertThat(searchResult.getPosition(), is(sequenceOdd.length - 1));
    }

    @Test
    public void searchReturnIsFoundMiddleInOddSequenceWhenMultiElementSequence() {
        key = 13;
        searchResult = search(key, sequenceOdd);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void searchReturnMiddlePositionInOddSequenceWhenMultiElementSequence() {
        key = 13;
        searchResult = search(key, sequenceOdd);
        assertThat(searchResult.getPosition(), is((sequenceOdd.length - 1) / 2));
    }

    @Test
    public void searchReturnIsFoundMiddleInEvenSequenceWhenMultiElementSequence() {
        key = 7;
        searchResult = search(key, sequenceEven);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void searchReturnMiddlePositionInEvenSequenceWhenMultiElementSequence() {
        key = 7;
        searchResult = search(key, sequenceEven);
        assertThat(searchResult.getPosition(), is((sequenceEven.length - 1) / 2));
    }

    @Test
    public void searchReturnIsFoundBeforeMiddleInSequenceWhenMultiElementSequence() {
        key = 2;
        searchResult = search(key, sequenceEven);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void searchReturnBeforeMiddlePositionInSequenceWhenMultiElementSequence() {
        key = 2;
        searchResult = search(key, sequenceEven);
        assertThat(searchResult.getPosition(), is(1));
    }

    @Test
    public void searchReturnIsFoundAfterMiddleInSequenceWhenMultiElementSequence() {
        key = 13;
        searchResult = search(key, sequenceEven);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void searchReturnAfterMiddlePositionInSequenceWhenMultiElementSequence() {
        key = 13;
        searchResult = search(key, sequenceEven);
        assertThat(searchResult.getPosition(), is(6));
    }

    @Test
    public void searchReturnIsNotInSequenceWhenMultiElementSequence() {
        key = 4;
        searchResult = search(key, sequenceOdd);
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void searchReturnFailureCodeWhenMultiElementSequence() {
        key = 4;
        searchResult = search(key, sequenceOdd);
        assertThat(searchResult.getPosition(), is(-1));
    }

    @Test
    public void searchReturnFailureCodeWhenUnorderedSequence() {
        key = 2;
        searchResult = search(key, sequenceUnordered);
        assertThat(searchResult.getPosition(), is(-1));
    }
}

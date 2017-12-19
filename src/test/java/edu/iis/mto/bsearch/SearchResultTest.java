package edu.iis.mto.bsearch;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Lukasz on 2017-12-19.
 */
public class SearchResultTest {

    @Test
    public void checkByIsFoundThatElementExistsInOneElementSequence() {
        int element = 11;
        int[] sequence = {11};

        SearchResult searchResult = BinarySearch.search(element, sequence);
        assertTrue(searchResult.isFound());
    }

    @Test
    public void checkByGetPositionThatElementExistsInOneElementSequence() {
        int element = 11;
        int[] sequence = {11};
        int positionWhenElementNotExist = -1;

        SearchResult searchResult = BinarySearch.search(element, sequence);
        assertTrue(searchResult.getPosition() > positionWhenElementNotExist);
    }

    @Test
    public void checkByIsFoundThatElementNotExistsInOneElementSequence() {
        int element = 121;
        int[] sequence = {11};

        SearchResult searchResult = BinarySearch.search(element, sequence);
        assertFalse(searchResult.isFound());
    }

    @Test
    public void checkByGetPositionThatNotElementExistsInOneElementSequence() {
        int element = 121;
        int[] sequence = {11};
        int positionWhenElementNotExist = -1;

        SearchResult searchResult = BinarySearch.search(element, sequence);
        assertTrue(searchResult.getPosition() == positionWhenElementNotExist);
    }



}
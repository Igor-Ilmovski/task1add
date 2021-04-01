package java.by.igorilmovsky.test.service;

import by.igorilmovsky.training.entity.BaseArray;
import by.igorilmovsky.training.service.SearchBaseArrayService;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class BaseArrayServiceTest {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    BaseArray array = new BaseArray(arr);
    SearchBaseArrayService service = new SearchBaseArrayService();

    @Test
    public void negativeSearch() {
        int actual = service.getBaseArrayNegative(array);
        int expected = 1;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxItem() {
        // When
        int actual = service.searchBaseArrayMax(array);
        int expected = 9;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findMinItem() {
        // When
        int actual = service.searchBaseArrayMin(array);
        int expected = 1;
        // Then
        assertEquals(expected, actual);
    }
}

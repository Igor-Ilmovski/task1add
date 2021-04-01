package by.igorilmovsky.training.service;

import by.igorilmovsky.training.entity.BaseArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SortBaseArrayService {
    final static  Logger Logger = LogManager.getLogger(SortBaseArrayService.class);

    public BaseArray sortByBubble(BaseArray array) {
        Logger.log(Level.DEBUG, "bubble sort array starts..");

        for (int i = 0; i < array.getBaseArrayLength() - 1; i++) {
            for (int j = 0; j < array.getBaseArrayLength() - i - 1; j++) {
                if (array.getItem(j) > array.getItem(j + 1)) {
                    int item = array.getItem(j);
                    array.setItem(j, array.getItem(j + 1));
                    array.setItem(j + 1, item);
                }
            }
        }
        Logger.log(Level.DEBUG, "bubble sort array finished.");
        return array;
    }

    public BaseArray sortBySelection(BaseArray array) {
        Logger.log(Level.DEBUG, "bubble sort array starts..");

        for (int i = 0; i < array.getBaseArrayLength(); i++) {
            int item = array.getItem(i);
            int minIdx = i;
            for (int j = i+1; j < array.getBaseArrayLength(); j++) {
                if (array.getItem(j) < item) {
                    item = array.getItem(j);
                    minIdx = j;
                }
            }
            if (i != minIdx) {
                int item = array.getItem(i);
                array.setItem(i, array.getItem(minIdx));
                array.setItem(minIdx, item);
            }
        }
        Logger.log(Level.DEBUG, "bubble sort array finished.");
        return array;
    }
}

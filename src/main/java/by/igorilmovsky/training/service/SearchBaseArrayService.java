package by.igorilmovsky.training.service;

import by.igorilmovsky.training.entity.BaseArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchBaseArrayService {
    final static org.apache.logging.log4j.Logger Logger = LogManager.getLogger(SearchBaseArrayService.class);

    //Logger.log(Level.DEBUG, "Debug Service");

    public int searchBaseArrayMin(BaseArray array) {
        int min = array.getItem(0);
        for (int i=0; i <array.getBaseArrayLength(); i++) {
            if (min > array.getItem(0)) {
                min = array.getItem(0);
            }
        }
        Logger.log(Level.DEBUG, "min BaseArray item is: %d", min);
        return min;
    }

    public int searchBaseArrayMax(BaseArray array) {
        int max = array.getItem(0);
        for (int i=0; i <array.getBaseArrayLength(); i++) {
            if (max < array.getItem(0)) {
                max = array.getItem(0);
            }
        }
        Logger.log(Level.DEBUG, "max BaseArray item is: %d", max);
        return max;
    }

    public int replaceItem(BaseArray array, int oldValue, int newValue) {
        int item;
        int replacedCount = 0;
        for (int i=0; i <array.getBaseArrayLength(); i++) {
            item = array.getItem(i);
            if (item == oldValue) {
               array.setItem(i, newValue);
               replacedCount++;
            }
        }
        Logger.log(Level.DEBUG, " BaseArray replaced  %d items", replacedCount);
        return replacedCount;
    }

    public double getBaseArrayAverage(BaseArray array) {
        int arrayLength = array.getBaseArrayLength();
        if (arrayLength > 0) {

            double average = getBaseArraySumm(array) / arrayLength;
            Logger.log(Level.DEBUG, " BaseArray's average: %f", average);
            return average;
        }
        else {
            Logger.log(Level.DEBUG, " BaseArray has zero length, no average found");
            return 0;
        }
    }

    public double getBaseArraySumm(BaseArray array) {
        double summ = 0;

        for (int i = 0; i < array.getBaseArrayLength(); i++) {
            summ = summ + array.getItem(i);
        }
        Logger.log(Level.DEBUG, " BaseArray total summ: %f", summ);
        return summ;
    }

    //определение числа положительных\отрицательных элементов массива.
    public int getBaseArrayPositive(BaseArray array) {
        int summ = 0;
        int item;

        for (int i = 0; i < array.getBaseArrayLength(); i++) {
            item = array.getItem(i);
            if (item >0) {
                summ = summ + item;
            }
        }
        Logger.log(Level.DEBUG, " BaseArray positive summ: %f", summ);
        return summ;
    }

    public int getBaseArrayNegative(BaseArray array) {
        int summ = 0;
        int item;

        for (int i = 0; i < array.getBaseArrayLength(); i++) {
            item = array.getItem(i);
            if (item <0) {
                summ = summ + item;
            }
        }
        Logger.log(Level.DEBUG, " BaseArray negative summ: %f", summ);
        return summ;
    }

}

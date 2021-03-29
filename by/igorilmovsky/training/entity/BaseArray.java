package by.igorilmovsky.training.entity;

import javafx.scene.chart.ScatterChart;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class BaseArray {
    final static org.apache.logging.log4j.Logger Logger = LogManager.getLogger();

    int arrayLength = 0;
    private int array[];

    public void baseArray(int arrayLength) {
        this.arrayLength = arrayLength;
        initBaseArray();
    }

    public void initBaseArray() {
        if (arrayLength > 0) {
            int[] array = new int[arrayLength];
            Logger.log(Level.DEBUG, " BaseArray object created");
        }
    }

    public int getBaseArrayLength() {
        return arrayLength;
    }

    public void setBaseArray(int[] array) {
        this.array = array;
    }

    public void setBaseArrayLength(int length) {
        arrayLength = length;
    }

    public int getBaseArrayItem( int idx) {
        int item = 0;
        if (idx > arrayLength) {
            throw new  ArrayIndexOutOfBoundsException("invalid BaseArray index");
        }
        else
            try {
                item = array[idx];
            } catch (Exception e) {
                Logger.log(Level.ERROR, "item %d is invalid", idx);
                e.printStackTrace();
            }
            return item;
    }

    public void setBaseArrayItem( int idx, int newValue) {
        if (idx > arrayLength) {
            throw new  ArrayIndexOutOfBoundsException("invalid BaseArray index");
        }
        else
        try {
            array[idx] = newValue;
        }
        catch ( Exception e) {
            Logger.log(Level.ERROR, "item %d is invalid", idx);
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "baseArray{" +
                "arrayLength=" + arrayLength +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result = prime * result + (int) (array[i] ^ (array[i] >>> 32));
        }
        return result;
    }

}
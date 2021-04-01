package by.igorilmovsky.training.entity;

import java.lang.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class BaseArray {
    //static org.apache.logging.log4j.Logger Logger = LogManager.getLogger();
    static Logger Logger = LogManager.getLogger();

    int arrayLength = 0;
    int array[];

    public BaseArray() {
    }

    public BaseArray(int[] array) {
        setBaseArray(array);
    }

    public BaseArray(int arrayLength) {
        this.arrayLength = arrayLength;
        initBaseArray();
    }

    public void initBaseArray() {
        if (arrayLength > 0) {
            int[] array = new int[arrayLength];
            Logger.log(Level.DEBUG, "BaseArray object created");
        }
    }

    public int getBaseArrayLength() {
        return arrayLength;
    }

    public void setBaseArray(int[] array) {
        setBaseArrayLength(array.length);
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getBaseArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setBaseArrayLength(int length) {
        arrayLength = length;
        int[] array = new int[arrayLength];
        Logger.log(Level.DEBUG, "BaseArray object re-initialized");
    }

    public int getItem( int idx) {
        if (arrayLength <= 0) {
            throw new  ArrayIndexOutOfBoundsException("BaseArray is not initialized."); }

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

    public void setItem( int idx, int newValue) {
        if (arrayLength <= 0) {
            throw new  ArrayIndexOutOfBoundsException("BaseArray is not initialized."); }

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof BaseArray))
            return false;

        BaseArray arr = (BaseArray) obj;
        return Arrays.equals(array, ((BaseArray) arr).array);
    }
}
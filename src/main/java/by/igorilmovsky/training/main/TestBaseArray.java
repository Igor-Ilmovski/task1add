package by.igorilmovsky.training.main;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.igorilmovsky.training.entity.BaseArray;
import org.apache.logging.log4j.Level;

public class TestBaseArray {

    public static void main(String[] args) {
        int size = 57;
        int value;

        BaseArray arr = new BaseArray(size);
        value = arr.getItem( 5);
    }
}

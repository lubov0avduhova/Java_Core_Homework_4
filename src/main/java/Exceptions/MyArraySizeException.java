package Exceptions;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Размер массива превышен!");
    }

}
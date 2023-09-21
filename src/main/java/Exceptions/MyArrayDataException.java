package Exceptions;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
        super("Неправильное значение массива!");
    }


    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        super("Неправильное значение массива!");
        this.i = i;
        this.j = j;

    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
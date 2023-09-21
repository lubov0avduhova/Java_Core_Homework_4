import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;


public class App {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                System.out.println(firstTask(arr));
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }
        catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("ќшибка в €чейке: " + e.getI() + "x" + e.getJ());
        }
    }


    public static int firstTask(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}
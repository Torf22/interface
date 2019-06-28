import java.util.Arrays;

public class LaptopCalculator implements Calculator {
//    private String massenge;

    @Override
    public void calculate(int a, int b) {

    }

    @Override
    public void scream() {
        System.out.println("aaaaaaaaaa!!!");
    }

    @Override
    public int[] creator() {
        int[] array = new int[LENGHT];
        for (int i = 0; i < LENGHT; i++) {
            array[i] = (int) (Math.random() * 200);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

}

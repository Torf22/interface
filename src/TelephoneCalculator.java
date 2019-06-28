import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class TelephoneCalculator implements Calculator {
    private String massenge;
    private int maxNumber;

    public TelephoneCalculator() {
    }

    @Override
    public void calculate(int a, int b) {

    }

    @Override
    public void scream() {
        System.out.println("yyyyyyyyyyyyyy!!!");
    }

    @Override
    public int[] creator() {
        int[] array = new int[LENGHT];
        for (int i = 0; i < LENGHT; i++) {
            array[i] = (int) (Math.random() * maxNumber);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }


    public TelephoneCalculator(String massenge, int maxNumber) {
        this.massenge = massenge;
        this.maxNumber = maxNumber;
    }

    @Override
    public String toString() {
        return "TelephoneCalculator{" +
                "massenge='" + massenge + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneCalculator that = (TelephoneCalculator) o;
        return massenge.equals(that.massenge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(massenge);
    }

    public String getMassenge() {
        return massenge;
    }

    public void setMassenge(String massenge) {
        this.massenge = massenge;
    }
}

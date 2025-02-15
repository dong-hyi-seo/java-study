package section6.item38;

import java.util.Arrays;
import java.util.Collection;

public class Item38Test {

    public static void main(String[] args) {
        double x = Double.parseDouble("22");
        double y = Double.parseDouble("10");
        test(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static void test(Collection<? extends Operation> opSet,
                             double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}

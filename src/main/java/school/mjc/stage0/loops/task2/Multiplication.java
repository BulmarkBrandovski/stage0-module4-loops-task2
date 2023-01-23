package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int value = 0;

        if (multiplyByAndToInclusive == 0) {
            return;
        }

        while (value <= Math.abs(multiplyByAndToInclusive)) {
            System.out.println(value * multiplyByAndToInclusive);
            value++;
        }
    }
}

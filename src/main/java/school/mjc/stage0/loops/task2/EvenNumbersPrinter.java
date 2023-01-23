package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int num = 0;
        while (num <= printTillInclusive) {
            System.out.println(num);
            num += 2;
        }
    }
}

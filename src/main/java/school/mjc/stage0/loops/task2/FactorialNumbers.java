package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 0;

        while (num <= printToInclusive) {

            int fact = 1;
            int prevNum = 1;
            while (prevNum <= num) {
                fact *= prevNum;
                prevNum++;
            }

            System.out.println(fact);

            num++;
        }

    }

    public static void main(String[] args) {
        var  a = new FactorialNumbers();
        a.printFactorialRow(7);
    }
}

package chap3_17;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        if (++a > 0 || ++b > 0) {
            System.out.print("a=" + a);
            System.out.print(",b=" + b);
        }
    }
}

package chernyh.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {





        do1();
        do2();
        out.println(do3());
        out.println(do4());
        out.println(do5());
        out.println(do6());
    }

    private static void do1() {
        IntStream.rangeClosed(1, 99).forEach(out::println);
    }

    private static void do2() {
        out.println("Делятся на 3:");
        IntStream.rangeClosed(1, 100).filter(i -> i % 3 == 0).forEach(out::println);
        out.println("Делятся на 5:");
        IntStream.rangeClosed(1, 100).filter(i -> i % 5 == 0).forEach(out::println);
        out.println("Делятся и на 3, и на 5:");
        IntStream.rangeClosed(1, 100).filter(i -> i % 3 == 0 && i % 5 == 0).forEach(out::println);
    }

    private static boolean do3() {
        Scanner scanner = new Scanner(in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            out.print("Введите " + (i + 1) + " число: ");
            arr[i] = scanner.nextInt();
        }
        return arr[0] + arr[1] == arr[2];
    }

    private static boolean do4() {
        Scanner scanner = new Scanner(in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            out.print("Введите " + (i + 1) + " число: ");
            arr[i] = scanner.nextInt();
        }
        return arr[1] > arr[0] && arr[2] > arr[1];
    }

    private static boolean do5() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        out.println("Array: " + Arrays.toString(arr));
        return arr[0] == 3 || arr[arr.length - 1] == 3;
    }

    private static boolean do6() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        out.println("Array: " + Arrays.toString(arr));
        return Arrays.stream(arr).anyMatch(c -> c == 1 || c == 3);
    }








        // write your code here
}


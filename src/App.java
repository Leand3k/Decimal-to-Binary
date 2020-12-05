import java.util.Scanner;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        number = in.nextInt();
        if (number < 0) {
            System.out.print("Error: This number is non-positive.");

        } else {
            System.out.print("The binary is: ");
        }
        printBinary(number);
        in.close();
    }
    

    private static void printBinary(int number) {
        int rem;
        if (number <= 1) {
            System.out.print(number);
            return;
        }
        rem = number % 2;
        printBinary(number >> 1);
        System.out.print(rem);
    }

    // @Test
    // public void testPrintBinary() {
    //     assertEquals(11, printBinary(3));
    // }
}

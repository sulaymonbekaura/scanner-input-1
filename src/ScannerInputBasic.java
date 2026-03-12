import java.util.Scanner;

public class ScannerInputBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Scanner Input Demo ===");
        System.out.println("(Demo mode: using predefined inputs to show what Scanner does)\n");

        // In real usage you'd call scanner.nextXxx() and wait for user
        // Below we show all Scanner methods with documentation
        System.out.println("Scanner methods:");
        System.out.println("  scanner.nextInt()     — reads integer:    42");
        System.out.println("  scanner.nextDouble()  — reads double:     3.14");
        System.out.println("  scanner.nextLine()    — reads full line:  Hello World");
        System.out.println("  scanner.nextBoolean() — reads boolean:    true");
        System.out.println("  scanner.next()        — reads one word:   Java");

        // Simulated input processing
        System.out.println("\n=== Simulated Student Record Entry ===");
        String name   = "Alice";
        int    age    = 20;
        double gpa    = 3.85;
        String major  = "Computer Science";

        System.out.println("--- Processing Student ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.printf( "GPA   : %.2f%n", gpa);
        System.out.println("Major : " + major);
        System.out.printf( "Status: %s%n", gpa >= 3.5 ? "Dean's List" : "Regular");

        scanner.close();
        System.out.println("\nScanner closed. In real app: scanner reads from System.in");
    }
}

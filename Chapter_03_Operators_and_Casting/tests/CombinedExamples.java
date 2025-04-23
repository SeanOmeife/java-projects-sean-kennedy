public class CombinedExamples {

    public static void testBitwiseAnd() {
        // Using the bitwise AND (&) operator
        boolean b1 = (5 > 1) & (10 < 20); // true & true -> true
        boolean b2 = (5 < 10) & (10 > 20); // true & false -> false
        System.out.println("Bitwise AND Results:");
        System.out.println(b1 + "\n" + b2);
    }

    public static void testBitwiseOr() {
        // Using the bitwise OR (|) operator
        boolean b1 = (5 > 1) | (10 < 20); // true | true -> true
        boolean b2 = (5 < 10) | (10 > 20); // true | false -> true
        System.out.println("\nBitwise OR Results:");
        System.out.println(b1 + "\n" + b2);
    }

    public static void testBitwiseXor() {
        // Using the bitwise XOR (^) operator
        boolean b1 = (5 > 1) ^ (10 < 20); // true ^ true -> false
        boolean b2 = (5 < 10) ^ (10 < 20); // true ^ true -> false
        System.out.println("\nBitwise XOR Results:");
        System.out.println(b1 + "\n" + b2);
    }

    public static void testBooleanTest() {
        // Boolean test with simple true/false values
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("\nBoolean Test Results:");
        System.out.println(b1 + "\n" + b2);
    }

    public static void testLogicalAnd() {
        // Using the logical AND (&&) operator
        boolean b1 = (5 > 1) && (10 < 20); // true && true -> true
        boolean b2 = (5 < 10) && (10 > 20); // true && false -> false
        System.out.println("\nLogical AND Results:");
        System.out.println(b1 + "\n" + b2);
    }

    public static void testLogicalOr() {
        // Using the logical OR (||) operator
        boolean b1 = (5 > 1) || (10 < 20); // true || true -> true
        boolean b2 = (5 < 10) || (10 > 20); // true || false -> true
        System.out.println("\nLogical OR Results:");
        System.out.println(b1 + "\n" + b2);
    }

    public static void testRelational() {
        // Relational operator tests
        int x = 3, y = 4;
        System.out.println("\nRelational Test Results:");
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x > y);  // false
        System.out.println(x >= y); // false
        System.out.println(x < y);  // true
        System.out.println(x <= y); // true
    }
}

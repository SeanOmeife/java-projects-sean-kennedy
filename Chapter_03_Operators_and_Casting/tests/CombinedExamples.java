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

    public static void testTernary(){
        System.out.println("\nTernary Operator Results:");
        int x = 5;
        String s = x % 2 == 0 ? " is an even number" : " is an odd number";
        System.out.println(x + s);
    }

    public static void compoundAssignment(){
        // byte b1 = 3, b2 = 4;
        // b1 = (byte)(b1 + b2);
        // b1 += b2;

        // simple expression
        int x = 2;
        x *= 2 + 5;
        System.out.println(x);

        // Slightly complex
        int k=1;
        k += (k=4) * (k+2);
        System.out.println(k);
    }

    public static void widening(){
        System.out.println("\nFloat: " + Float.MAX_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}

// ? (Ternary operator):
//The ? is part of the ternary operator, which is a shorthand for an if-else statement.
//The syntax is: condition ? value_if_true : value_if_false.
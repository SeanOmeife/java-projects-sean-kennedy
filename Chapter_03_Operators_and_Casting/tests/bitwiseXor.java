

public class bitwiseXor {
    public static void main(String[] args) {
        // Using the bitwise XOR (^) operator to compare boolean expressions
        // XOR returns true if exactly one of the operands is true, otherwise false

        boolean b1 = (5 > 1) ^ (10 < 20); // true ^ true -> false
        boolean b2 = (5 < 10) ^ (10 < 20); // true ^ true -> false
        boolean b3 = (5 > 1) ^ (10 < 2); // true ^ false -> true
        boolean b4 = (5 > 10) ^ (10 < 2); // false ^ false -> false

        // Print the results of the XOR operations
        System.out.println(b1 + "\n " + b2 + "\n " + b3 + "\n " + b4);
    }
}

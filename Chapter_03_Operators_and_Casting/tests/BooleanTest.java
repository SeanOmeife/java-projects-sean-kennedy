public class BooleanTest {
    public static void main(String[] args) {
        boolean b1 = true, b2 = true;
        boolean res = b1 && (b2 = false); // F && (assignment not evaluated)
        System.out.println(b1 + " " + b2 + " " + res); // false true false
    }
}

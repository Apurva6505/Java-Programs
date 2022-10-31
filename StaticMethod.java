public class StaticMethod {
    // Static method
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String args[]) {
        // Calling static method without creating an object
        add(10, 20);
    }

}
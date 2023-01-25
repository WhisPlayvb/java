public class Exception16 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b; // ArithmeticException
            System.out.println("Result: " + c);

            try {
                int[] arr = new int[5];
                arr[10] = 50; // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
            }

            try {
                String str = null;
                str.length(); // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception");
            }

            try {
                int num = Integer.parseInt("hello"); // NumberFormatException
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }
}

public class Square {
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = square(number);
        System.out.println("Square of " + number + " is: " + result);
    }
}
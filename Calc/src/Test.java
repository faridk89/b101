public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,20);
        System.out.println(calculator.sum());
        System.out.println(calculator.multiply());
        System.out.println(calculator.subtract());
        System.out.println(calculator.divide());
    }
}

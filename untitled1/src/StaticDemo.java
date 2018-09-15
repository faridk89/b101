public class StaticDemo {

    private static int objectCounter =0;

    public static int numberOfStudent = 10;
    private String className = "SelBoot";

    public StaticDemo(){
        System.out.println(numberOfStudent);
        System.out.println("Coming from Static Print");



    }

    public static void staticPrint() {
        System.out.println("className");
    }

        public static void printCounter(){
            System.out.println("printCounter");
        }
    }

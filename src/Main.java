public class Main {
    public static void main(String[] args) {
        //primitive types for autoboxing
        int int1 = 3;
        double double1 = 6.9;
        char char1 = 'T';
        Integer numInt1 = int1;
        Double numDouble1 = double1;
        Character charChar1 = char1;

        //object for unboxing
        Integer numInt2 = 10;
        Double numDouble2 = 9.6;
        Character charChar2 = 'F';
        int int2 = numInt2;
        double double2 = numDouble2;
        char char2 = charChar2;

        //method
        intAdder(3,2);
        charPrinter('C');
        integerAdder(10,5);
        characterPrinter('L');
    }

    //int sum method
    public static void intAdder(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    // char printer method
    public static void charPrinter(char char1){
        System.out.println(char1);
    }

    //sum integer method
    public static void integerAdder(Integer int1, Integer int2){
        Integer result = int1 + int2;
        System.out.println(result);
    }

    //character printing method
    public static void characterPrinter(Character char1){
        System.out.println(char1);
    }

}

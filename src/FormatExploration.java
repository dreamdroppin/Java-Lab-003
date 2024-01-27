public class FormatExploration {
    public static void main(String args[]){
        //1. Display a value of int using %f
        int intValue = 9;
        System.out.printf("Display a value of int using %f\n", (float) intValue);

        //2. double using %d
        double doubleValue = 1.23456;
        System.out.printf("Display value of double using %d\n", (int) (doubleValue));

        //3. %d (12345) and %f (6.78900) to be one value
        //Format specifiers

        int intValueForThree = 123456;
        double doubleValueForThree = 6.78900;
        System.out.printf("Bring them into one value: %d %f%n", intValueForThree, (float) intValueForThree);

    }

}

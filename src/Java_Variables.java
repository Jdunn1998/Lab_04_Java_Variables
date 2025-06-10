public class Java_Variables {
    public static void main(String[] args) {

        // Intergers
        int intOperandA = 23;
        int intOperandB = 57;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        // Double Intergers
        double doubleOperandA = 3.50;
        double doubleOperandB = 7.50;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;

        //Outputs
        System.out.println("The sum using ints: " + intOperandA + " + " + intOperandB + " = " + intSum);
        System.out.println("The Product using ints: " + intOperandA + " * " + intOperandB + " = " + intProduct);
        System.out.println("The Difference using ints: " + intOperandA + " - " + intOperandB + " = " + intDifference);
        System.out.println("The Quotient using ints: " + intOperandA + " / " + intOperandB + " = " + intQuotient);
        System.out.println("The Modulo using ints: " + intOperandA + " % " + intOperandB + " = " + intModulo);
        System.out.println("The Sum using doubles: " + doubleOperandA + " + " + doubleOperandB + " = " + doubleSum);
        System.out.println("The Product using doubles: " + doubleOperandA + " * " + doubleOperandB + " = " + doubleProduct);
        System.out.println("The Difference using doubles: " + doubleOperandA + " - " + doubleOperandB + " = " + doubleDifference);
        System.out.println("The Quotient using doubles: " + doubleOperandA + " / " + doubleOperandB + " =  " + doubleQuotient);




    }
}

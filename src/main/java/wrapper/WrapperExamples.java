package wrapper;

public class WrapperExamples {

    public static void main(String[] args) {
        //Boolean, Byte, Character, Double, Float, Integer, Long, Short
        //boolean, byte, char, double, float, int, long, short

        //Why do we need Wrapper Classes in Java?
            //A wrapper class wraps (encloses) around a data type and gives it an object appearance
            //Reasons why we need Wrapper Classes
                //null is a possible value and null cannot be assigned to a primitive data type
                //we need to use it in a Collection
                //we need to take advantage of things like Methods that support Object like create from other types...
                //like String - Integer number2 = new Integer("55");

        //Wrapper classes are final

        //Ways to build wrapper classes
        //1. Using a Wrapper Class Constructor
        Integer number = new Integer(55);//int

        Integer value = 10;
        value = value + 1;

        Integer number2 = new Integer("55");//String

        Float number3 = new Float(55.0);// double argument
        Float number4 = new Float(55.0f);// float argument
        Float number5 = new Float("55.0f");// String

        Character c1 = new Character('C');// Only char constructor
        // Character c2 = new Character(124);//COMPILER ERROR

        Boolean b = new Boolean(true);

        // "true" "True" "tRUe" - all String Values give True
        // Anything else gives false
        Boolean b1 = new Boolean("true");// value stored - true
        Boolean b2 = new Boolean("True");// value stored - true
        Boolean b3 = new Boolean("False");// value stored - false
        Boolean b4 = new Boolean("SomeString");// value stored - false

        b = false;

        // Wrapper Objects are immutable (like String)

        int i = 5;
        i = 6;
        i = 7;

        //Immutability
        //Wrapper Classes and String
        Integer integer = 6;
        integer = 7;

        //2. valueOf Static Methods
        Integer hundred = Integer.valueOf("100");
        Integer seven = Integer.valueOf("111", 2); //binary 111 is converted to 7

        //What is the difference in using the two ways of creating Wrapper Classes above?
            //Using the Constructor you will always create a new object, while using valueOf() static method, it may
            //return you a cached value within a range
            //We should prefer static valueOf method, because it might save you some memory

        //stopped at 4:00 mark
    }
}

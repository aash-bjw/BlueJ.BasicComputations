 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        return Integer.toBinaryString(value);
    }

    public String printIntegerAsOctal(int value){
        return Integer.toString(value, 8);
    }

    public String printIntegerAsHexadecimal(int value){
        return Integer.toString(value, 16);
    }

    public static void main(String[] args){

    }
}

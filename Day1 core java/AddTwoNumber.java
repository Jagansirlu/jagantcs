package abc;

 class AddTwoNumbers {
	// method
    void SumOfTwoNumbers() {
    	
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        
        System.out.print("Sum of two numbers " + result);
    }
    
}
 
public class AddTwoNumber {
	
    public static void main(String arg[]) {
    	
        AddTwoNumbers object = new AddTwoNumbers();// object of this class -> AddTwoNumber
        object.SumOfTwoNumbers();// calling from here
    }
}
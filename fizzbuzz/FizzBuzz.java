// FizzBuzz: Output numbers from 1 to x. If the number is
// divisible by 3, replace it with "Fizz"
// If it is divisible by 5, replace it with "Buzz". If it is divisible by 3 and 5 replace it with "FizzBuzz".
//
// eg. 1, 2, Fizz, 4, Buzz, 6, ... 14, FizzBuzz, 16
//

public class FizzBuzz {
    private int number;
    public FizzBuzz(int input){
	number = input;
	for (int i = 1; i <= number; i++){
          	if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
		else if (i % 3 == 0) System.out.println("Fizz");
		else if (i % 5 == 0) System.out.println("Buzz");
		else System.out.println(i);
	}
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz(15));
    }
}

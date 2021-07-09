public class FizzBuzz {
	public String fizzBuzz(int num){
		if (num % 3 == 0 && num % 5 == 0){
			return "FizzBuzz";
		}
		else if (num % 3 == 0){
			return "Buzz";
		}
		else if (num % 5 == 0){
			return "Fizz";
		}
		else {
			return Integer.toString(num);
		}
	}


	public void run () {
		for (int x = 1; x <= 100; x++){
			String result = fizzBuzz(x);
			System.out.println("num " + x + " - " + "Result: " + result);
		}
	}
}
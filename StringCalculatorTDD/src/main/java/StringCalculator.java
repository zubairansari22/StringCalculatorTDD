
public class StringCalculator {
	public static int add(String numbers) {
	    if (numbers.isEmpty()) {
	        return 0;
	    }
	    String delimiter = ",";
	    if (numbers.startsWith("//")) {
	        delimiter = Character.toString(numbers.charAt(2));
	        numbers = numbers.substring(4);
	    }
	    numbers = numbers.replace("\n", delimiter);
	    String[] nums = numbers.split(delimiter);
	    int sum = 0;
	    for (String num : nums) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}

}

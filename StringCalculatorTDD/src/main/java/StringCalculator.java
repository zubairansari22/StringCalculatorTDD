
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
	    StringBuilder negativeNumbers = new StringBuilder();
	    for (String num : nums) {
	        int n = Integer.parseInt(num);
	        if (n < 0) {
	            if (negativeNumbers.length() > 0) {
	                negativeNumbers.append(",");
	            }
	            negativeNumbers.append(n);
	        }
	        sum += n;
	    }
	    if (negativeNumbers.length() > 0) {
	        throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers.toString());
	    }
	    return sum;
	}


}

// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]); // money been put
        double rate = Double.parseDouble(args[1]);  // rate
        int years = Integer.parseInt(args[2]);;  // how many years
		
		rate = rate / 100.0;

		double futureValue = currentValue * Math.pow(1 + rate, years);	
        
		System.out.println("After " + years + " years, $" + currentValue +
						   " saved at " + (rate * 100) + "% will yield $" + (int) futureValue);	
						
	}
}
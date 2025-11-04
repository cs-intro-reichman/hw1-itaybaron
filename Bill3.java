// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {        
		String name1 = args[0];  // Ron
        String name2 = args[1];  // Lisa
        String name3 = args[2];  // Dan
        int totalAmount = Integer.parseInt(args[3]); // 100

        double perPerson = Math.ceil((double) totalAmount / 3);

        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1
                + ": pay " + perPerson + " Shekels each." + "thank you for coming!");
    	
   }
}

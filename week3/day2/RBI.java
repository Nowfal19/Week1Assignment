package week3.day2;

public interface RBI {
	String rule = "CDM service charges 25";
	/**
	 * This is a New bank rules with effect from 16 th of october.
	 * The users have to maintain minimum balance with respect to the individual bank norms.
	 * @param -> Please provide minimum balance 
	 * @param -> Please provide debit card
	 * @author Nowfal
	 * @ exception -> NoSuchElementException  
	 */

	public void minimumBalance(int amount);
	public void debitCard(String visa);
}

package game;
import java.util.*;

/**
 * This class establishes a full roulette wheel of numbers 0-36
 * Includes corresponding colors correctly attached to each number
 * Play by betting on evens/odds, colors, or numbers
 */
public class RouletteWheel {
	
	private int win_num;
	
	/**
	 * This is a constructor for the roulette wheel; it has the winning number initialized to 0
	 */
	public RouletteWheel()
	{
		win_num = 0;
	}
	

	/**
	 * This method gets the winning number
	 * @return returns the winning number for use in determining a win or loss
	 */
	public int getNumber()
	{
		return win_num;
	}
	
	
	/**
	 * This method spins the wheel and gets a random number ranging from 0-36
	 * That number is assigned to be the winning number
	 */
	public void spin()
	{
		Random Wheel = new Random();
		int random_int = Wheel.nextInt(37);
		win_num = random_int;
	}
	
	
	/**
	 * @return This returns a boolean true or false, the method checked to see if the winning number was even or odd
	 */
	public boolean isEven()
	{
		if ((win_num % 2)==0)
			return true;
		else
			return false;
	}
	
	
	/**
	 * This method includes the logic for assigning each number its corresponding color
	 * @return this returns the winning color
	 */
	public String getColor()
	{
		String win_color = " ";
		String black = "BLACK";
		String red = "RED";
		String green = "GREEN";
		
		//Black coloring for evens 2 to 10 and 22 to 30
		if (((isEven() == true) && (win_num <= 10 && win_num > 0)) || ((isEven() == true) && ((win_num <=30) && (win_num >= 22)))) 
			win_color = black;
		
		//Red coloring for odds 1 to 9 and 21 to 29
		else if (((isEven() == false) && (win_num <= 9)) || ((isEven() == false) && ((win_num <=29) && (win_num >= 21))))
			win_color = red;
		
		//Red coloring for evens 12 to 20 and 32 to 36
		else if (((isEven() == true) && ((win_num <= 20) && (win_num >= 12))) || ((isEven() == true) && ((win_num <= 36) && (win_num >= 32)))) 
			win_color = red;
		
		//Black coloring for odds 11 to 19 and 31 to 35
		else if (((isEven() == false) && ((win_num <= 19) && (win_num >= 11))) || ((isEven() == false) && ((win_num <= 35) && (win_num >= 31))))
			win_color = black;
		
		//Green coloring for 0
		else if (win_num == 0)
					
			win_color = green;
		
		return win_color;
	}

	
	
	
	
	
}

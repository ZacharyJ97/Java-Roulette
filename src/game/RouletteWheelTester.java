package game;
import java.util.*;

public class RouletteWheelTester {

	public static void main(String[] args)
		{
			String color_answer = " ";
			String odd_even_answer = " ";
			int number_answer = 0;
				
			Scanner scan = new Scanner(System.in);
			System.out.println("Please choose how you would like to play the roulette wheel: ");
			System.out.println("-play by number, enter 1");
			System.out.println("-play by colors, enter 2");
			System.out.println("-play by odds/evens, enter 3");
			int first_answer = scan.nextInt();
		
			if (first_answer == 3)
			{
				System.out.println("Please choose odds or evens, type O for odds or E for evens: ");
				odd_even_answer = scan.next();
				odd_even_answer = odd_even_answer.toUpperCase();
			}
			else if (first_answer == 2)
			{
				System.out.println("Please choose either black, red, or green; type B for black, R for red, or G for green: ");
				color_answer = scan.next();
				color_answer.toUpperCase();
				color_answer = color_answer.toUpperCase();
			}
			else if (first_answer == 1)
			{
				System.out.println("Please enter a number from 0 to 36: ");
				number_answer = scan.nextInt();
			}
			
			RouletteWheel Jackpot = new RouletteWheel();
			Jackpot.spin();
			System.out.println("Spinning the wheel...");
			System.out.println("The number is " + Jackpot.getNumber()+ " (" + Jackpot.getColor()+ ")");
			
			
			if ((first_answer == 3) && ((odd_even_answer.equals("E")) && (Jackpot.isEven() == true)))
			{
				System.out.println("Congratulations, you won!");
			}
			else if ((first_answer == 3) &&((odd_even_answer.equals("O")) && (Jackpot.isEven() == false)))
			{
				System.out.println("Congratulations, you won!");
			}
			else if ((first_answer == 2) && (Jackpot.getColor().startsWith(color_answer)))
			{
				System.out.println("Congratulations, you won!");
			}
			else if ((first_answer == 1) && (number_answer == Jackpot.getNumber()))
			{
			System.out.println("Congratulations, you won!");
			}
			else
				System.out.println("Sorry, you lost. Please try again.");			
			
			
				
		}

}

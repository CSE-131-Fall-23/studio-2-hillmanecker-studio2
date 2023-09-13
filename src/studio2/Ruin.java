package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("What is your starting amout?");
	double startAmount = in.nextDouble();
	
	System.out.println("What is the winning probability as an integer between 0 and 100:");
	double winChance = in.nextDouble();
	
	System.out.println("What is the win limit?");
	double winLimit = in.nextDouble();
	
	double currentAmount = startAmount;
	
	int lost = 0;
	
	int won = 0;
	
	int loopNumber = 0;
	
	System.out.println("How many days would you like to play for:");
	int totalSimulations = in.nextInt();
	
	for (int i = totalSimulations; totalSimulations <= loopNumber; i++)
	{
	while ((currentAmount < winLimit) && (currentAmount > 0 ))
		
	
	{
		double randomNum = (Math.random())*100;
		
		boolean isWin = (randomNum >= winChance);
		
		if(isWin)
		{
			currentAmount += 1;
			loopNumber += 1;
			won += 1;
		}
		else
		{
			currentAmount -= 1;
			loopNumber += 1;
			lost += 1;
		}
	}
	}
	if (currentAmount == winLimit)
	{
		System.out.println("You won!");
		System.out.println("You ended the game with " + currentAmount);
		System.out.println("You played the game " + loopNumber + " times");
		System.out.println("Win times:" + won);
		System.out.println("Lose times:" + lost);
	}
	else
	{
		System.out.println("You lost! L Buddy");
		System.out.println("You ended the game with " + currentAmount);
		System.out.println("You played the game " + loopNumber + " times");
		System.out.println("Win times:" + won);
		System.out.println("Lose times:" + lost);
	}
	
	}

}

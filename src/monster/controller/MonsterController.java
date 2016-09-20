package monster.controller;

import monster.model.FirstMonster;
import java.util.Scanner;

public class MonsterController
{
	private FirstMonster marshmallowMonster;
	private Scanner keyboardInput;

	public MonsterController()
	{
		marshmallowMonster = new FirstMonster("Bill", 2.5, 2, true, 6, 2);
		keyboardInput = new Scanner(System.in);

	}

	public void start()
	{
		System.out.println("Here is my monster:" + marshmallowMonster);
		System.out.println("My monster has " + marshmallowMonster.getantennaCount()+ " antenna!");
//		if(marshmallowMonster.getantennaCount() < 3)
			System.out.println("My monster has " + marshmallowMonster.getEyeCount() + " eyes!!");
		System.out.println("My monsters belly button is " + marshmallowMonster.gethasBellyButton());
		System.out.println("My monster has " + marshmallowMonster.getarmCount() + " arms!!");
		System.out.println("My monster has " + marshmallowMonster.getnoseCount() + " noses!!");
		{
//			System.out.println("Thats a lot of antenne!");
		}
	
	System.out.println("Do you want to change my name?");
	String answer = keyboardInput.nextLine();
	
		if(answer.equalsIgnoreCase("yes"))
	{
		System.out.println("what do you want my name to be?");
		String newName = keyboardInput.nextLine();
		marshmallowMonster.setName(newName);
	}
		else
		{
			System.out.println("Fine dont change my name!!");
		}
		System.out.println(marshmallowMonster);
		
		{
			System.out.println("Do you like my half antenna?");
			String answer1 = keyboardInput.nextLine();
				
			if(answer1.equalsIgnoreCase("yes"))
			{
				System.out.println("Ha, only losers like my antenna.");
			}
			else
			{
				System.out.println("WOW!! Jerk! You didnt even ask what happened to it!! >:(");
			}
			{
				System.out.println("Would you like to know what happened to it?");
			String answer2 = keyboardInput.nextLine();
			
			if(answer2.equalsIgnoreCase("yes"))
			{
			System.out.println("It was a fierce battle between a cat that was trying to eat me, because "
					+ "you know, IM MADE OF MARSHMALLOW!!>:(");	
			}
			else
			{
				System.out.println("Wow....Okay I'm begining to think you're just a big meanie :'(");
				{
					loopMonster(); 
				}
				private void loopMonster()
				{
					//define a variable for condition/test
					int numberOfTimes = 0;
					while(numberOfTimes < 1000)
					{
						
						System.out.print("first monster words" + marshmallowMonster);
						
						numberOfTimes++;
					}
				for(int count = 0; count < 100; count++)
				{
					System.out.println("First monster words" + marshmallowMonster);
				}
				
				}
			}
			




					
				
			
		
	

/*
 * name = Bill antennaCount = 2eyeCount = 2 hasBellyButton = True armCount = 2
 * noseCount = 2
 */
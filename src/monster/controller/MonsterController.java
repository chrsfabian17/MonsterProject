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
	}
}
/*
 *name = Bill 
 * antennaCount = 2
 *eyeCount = 2
 * hasBellyButton = True
 * armCount = 2
 *noseCount = 2
 */
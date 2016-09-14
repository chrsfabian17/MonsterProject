package monster.controller;

import monster.model.FirstMonster;

public class MonsterController
{
	private FirstMonster marshmallowMonster;

	public MonsterController()
	{
	 marshmallowMonster = new FirstMonster("Bill", 2.5, 2, true, 6, 2);
				      
	}
	
	public void start()
	{
		System.out.println("Here is my monster:" + marshmallowMonster);
		System.out.println("My monster has " + marshmallowMonster.getantennaCount()+ "antenna!");
		if(marshmallowMonster.getantennaCount() > 3)
			System.out.println("My monster has " + marshmallowMonster.getEyeCount() + " eyes!!");
		System.out.println("My monsters belly button is " + marshmallowMonster.gethasBellyButton());
		System.out.println("My monster has " + marshmallowMonster.getarmCount() + " arms!!");
		System.out.println("My monster has " + marshmallowMonster.getnoseCount() + " noses!!");
		{
			System.out.println("Thats a lot of antenne!");
		}
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
package monster.controller;

import monster.model.FirstMonster;

public class MonsterController
{
	private FirstMonster marshmallowMonster;

	public MonsterController()
	{
	 marshmallowMonster = new FirstMonster("Bill", 2.5, 2, true, 2, 2);
				      
	}
	
	public void start()
	{
		System.out.println("Here is my monster:" + marshmallowMonster);
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
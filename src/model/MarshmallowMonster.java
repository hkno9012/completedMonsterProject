package model;

public class MarshmallowMonster
{
	//Declaration section
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNose;
	private int armCount;
	
	//Constructor that initializes the myMonster object
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int armCount)
	{
		this.name = name;//this. is an implicit reference to the object
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNose = hasNose;
		this.armCount = armCount;
	}
	
	//Constructor that initializes the userMonster object
	public MarshmallowMonster()
	{
		
	}
//_______________________________________________________________________________________________________
	//Getters can never be of type void
	//Getters return the value of the attribute
	public String getName()//First getter
	{
		return name;//Return is an immediate exit point for a method(Should be the method's last line)
	}
	//-----------------------------------------------------------------------------------------------
	public double getLegCount()//Second getter
	{
		return legCount;
	}
	//----------------------------------------------------------------------------------------------
	public int getEyeCount()//Third getter
	{
		return eyeCount;
	}
	//------------------------------------------------------------------------------------------------
	public boolean getHasNose()//Fourth getter
	{
		return hasNose;
	}
	//-----------------------------------------------------------------------------------------------
	public int getArmCount()//Fifth getter
	{
		return armCount;
	}
//_______________________________________________________________________________________________
	//Setters are always of type void
	//Setters assign a parameter to the attribute
	public void setName(String name)//First setter(not all programs need setters)
	{
		this.name = name;//this. gives the variable value (parameter) (right) to the current object (attribute) (left).
		//The = takes what's on the right and shoves it to the left
	}
	//---------------------------------------------------------------------------------------------
	public void setLegCount(double legCount)//Second setter
	{
		this.legCount = legCount;
	}
	//-------------------------------------------------------------------------------------------
	public void setEyeCount(int eyeCount)//Third setter
	{
		this.eyeCount = eyeCount;
	}
	//-------------------------------------------------------------------------------------------
	public void setHasNose(boolean hasNose)//Fourth setter
	{
		this.hasNose = hasNose;
	}
	//---------------------------------------------------------------------------------------
	public void setArmCount(int ArmCount)//Fifth setter
	{
		this.armCount = ArmCount;
	}
//__________________________________________________________________________________________________
	public String changeBoolean()
	{
		String changedFromBoolean;
		if(hasNose == true)
		{
			changedFromBoolean = "has a nose";
		}
		else
		{
			changedFromBoolean = "doesn't have a nose";
		}
		return changedFromBoolean;//This is what will show up when you call the method
	}
//_____________________________________________________________________________________
	public String toString()
	{
		String myMonsterDescription = "This monster is named " + name
									+ "\n He has " + legCount + " legs"
									+ "\n He has " + eyeCount + " eyes"
									+ "\n He " + changeBoolean()
									+ "\n He has " + armCount + " arms";
		
		return myMonsterDescription;
	}
}

package controller;

import model.MarshmallowMonster;
//import java.util.Scanner;Nothing with JOptionPane is needed
import javax.swing.JOptionPane;

public class Controller
{
	//Data member section
	//Declaration section
	//All data members should be private
	private MarshmallowMonster myMonster;//myMonster object is initialized, and will then be constructed
	private MarshmallowMonster userMonster;
//_____________________________________________________________________________
	//Constructors construct object: put all the objects in here (for now)
	//Constructors must have the same name as the class, and they can't have an explicit return type
	public Controller()
	{
		myMonster = new MarshmallowMonster("Larry", 2.5, 4, true, 6);
		//A new MarshmallowMonster object is constructed with these parameters
		userMonster = new MarshmallowMonster();
		//Another new MarshmallowMonster object is constructed, but no parameters
	}
//____________________________________________________________________________________
	public void start()
	{
		JOptionPane.showMessageDialog(null, myMonster);//Uses the toString method in the models
		questions();
		JOptionPane.showMessageDialog(null, userMonster);
	}
//______________________________________________________________________________________________________
	public void questions()
	{
		questionsName();
		questionsLegCount();
		questionsEyeCount();
		questionsHasNose();
		questionsArmCount();
	}
//_______________________________________________________________________________________________________
	public void questionsName()
	{
		String name = JOptionPane.showInputDialog("What's your monster's name");
		userMonster.setName(name);//Sets monster name
		JOptionPane.showMessageDialog(null, "Your monster's name is now " + userMonster.getName());
	}
//--------------------------------------------------------------------------------------------------------------
		public void questionsLegCount()
		{
			String legCountInput = JOptionPane.showInputDialog(null, "How many legs does " + userMonster.getName() + " have? (Partial legs are allowed)");
			if(validDouble(legCountInput))//Tests to see if the input is a double
			{
				double legCount = Double.parseDouble(legCountInput);//Changes the String entered by the user into a Double
				userMonster.setLegCount(legCount);
				JOptionPane.showMessageDialog(null, userMonster.getName() + " has " + userMonster.getLegCount() + " legs");
			}
			else//If it's not, then the question will be asked again
			{
				questionsLegCount();
			}
		}
//-----------------------------------------------------------------------------------------------------------------
		public void questionsEyeCount()
		{
			String eyeCountInput = JOptionPane.showInputDialog(null, "How about " + userMonster.getName() + "'s number of eyes?");
			if(validInt(eyeCountInput))
			{
				int eyeCount = Integer.parseInt(eyeCountInput);
				userMonster.setEyeCount(eyeCount);
				JOptionPane.showMessageDialog(null, userMonster.getName() + " has " + userMonster.getEyeCount() + " eyes now");
			}
			else
			{
				questionsEyeCount();
			}
		}
//-------------------------------------------------------------------------------------------------------------------
		public void questionsHasNose()
		{
			String hasNoseInput = JOptionPane.showInputDialog(null, "Does " + userMonster.getName() + " have a nose?"
															+ "(Type True or False)");
			boolean hasNose = true;
			String hasNoseStatus = "";//What will go in the message
			if(hasNoseInput.equals("True") || hasNoseInput.equals("true") || hasNoseInput.equals ("T") || hasNoseInput.equals ("t"))
				//Remember to use .equals when testing String equality
			{
				hasNoseStatus = " does";
				userMonster.setHasNose(hasNose);
				JOptionPane.showMessageDialog(null, userMonster.getName() + hasNoseStatus + " have a nose");
			}
			else if(hasNoseInput.equals("False") || hasNoseInput.equals("false") || hasNoseInput.equals("F") || hasNoseInput.equals("f"))
			{
				hasNose = false;
				hasNoseStatus = " doesn't";
				userMonster.setHasNose(hasNose);
				JOptionPane.showMessageDialog(null, userMonster.getName() + hasNoseStatus + " have a nose");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Type true or false");
				questionsHasNose();
			}
		}
//-------------------------------------------------------------------------------------------------------------
		public void questionsArmCount()
		{
			String armCountInput = JOptionPane.showInputDialog(null, "How many arms does " + userMonster.getName() + " have?");
			if(validInt(armCountInput))
			{
				int armCount = Integer.parseInt(armCountInput);
				userMonster.setArmCount(armCount);
				JOptionPane.showMessageDialog(null, userMonster.getName() + " now has " + userMonster.getArmCount() + " arms");
			}
			else
			{
				questionsArmCount();
			}
		}
//__________________________________________________________________________________________________________________
	private boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);//If the String can turn into an integer, then it's valid
			isValid = true;
		}
		//If this particular exception is caught, fix it with the following
		catch (NumberFormatException exception)//Always use this exception with parse methods
		{
			JOptionPane.showMessageDialog(null, "Type in a whole number");
		}
		
		return isValid;
	}
	//-------------------------------------------------------------------------------------
	private boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);//If the String can turn into a double, then it's valid
			isValid = true;
		}
		//If this particular exception is thrown, catch it with the following
		catch (NumberFormatException exception)//Always use this exception with parse methods
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value");
		}
		
		return isValid;
	}
}

package com.personal;

public class VinoProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRSTNAME+"vino");
		System.out.println(ProfileConstants.LASTNAME+"selvam");
		System.out.println( ProfileConstants.AGE+"20");
			
	}     
		
	

	@Override
	public void myHobbies() {
		System.out.println("My hobbies are listening music and watching tv");
		
		
	} 
	

}

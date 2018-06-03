package com.personal;

public class PaviProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println( ProfileConstants.FIRSTNAME+"PAVI");
		System.out.println(ProfileConstants.LASTNAME+"kumar");
		System.out.println(ProfileConstants.AGE+"20");
	}

	@Override
	public void myHobbies() {
		System.out.println("My  friend hobbies are listening music and watching tv");
		
	}

}

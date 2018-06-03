package com.personal;

public class TestProfile {    
	public static void printProfile(IProfile profile){
		profile.myHobbies();
		profile.myBasicInfo();
	}
	public static void main( String args[]) {
		IProfile myprofile=new PaviProfile() ;
         printProfile(myprofile);
		
		
		
		
	}
}
	
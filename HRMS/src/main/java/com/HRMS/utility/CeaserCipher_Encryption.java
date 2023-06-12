package com.HRMS.utility;

public class CeaserCipher_Encryption {

	public String encrypt(String OriMsg)
	{
		//Comment Added For Test
		char encryptString[]=new char[OriMsg.length()];
		
		for(int i=0;i<OriMsg.length();i++)
		{
			int ascii=(int)OriMsg.charAt(i);
			ascii=ascii+3;
			encryptString[i]=(char) ascii;
			
		}
		String encryptedString=String.valueOf(encryptString);
		
//		System.out.print(encryptedString);
		return encryptedString;
	}
	
	public String decrypt(String OriMsg)
	{
		
		char DecryptString[]=new char[OriMsg.length()];
		
		for(int i=0;i<OriMsg.length();i++)
		{
			int ascii=(int)OriMsg.charAt(i);
			ascii=ascii-3;
			DecryptString[i]=(char) ascii;
		}
		String DecryptedString=String.valueOf(DecryptString);
		
//		System.out.print(encryptedString);
		return DecryptedString;
	}
	
	public static void main(String agrs[])
	{
//		CeaserCipher_Encryption c=new CeaserCipher_Encryption();
//		System.out.print(""+c.encrypt("Madhav"));
	}

}

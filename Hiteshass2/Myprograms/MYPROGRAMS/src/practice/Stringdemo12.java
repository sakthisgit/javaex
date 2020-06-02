package practice;

public class Stringdemo12 {
//hiteshsonar00@gmail.com
	//domain means @ chya pudhcha ani com cha pahila 
	//tar aplyala ya @ ani com ch pahila vla karaych tr ya madhla sathi substring ahe pan t
	//tya sathi index ne value gyavi lagel
	//nantr substring madhe takun dyaych
	public static void main(String[]args)
	{
		String str="hiteshsonar00@gmail.com";
		int firstname=str.indexOf('@');
		int lastname=str.lastIndexOf('.');
		String domain=str.substring(firstname, lastname);
		System.out.println(domain);
	}
}

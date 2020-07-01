package firstprj;

abstract class main1
{
int score1;
void display(int score1)
{
	System.out.println("score:"+score1);
}
abstract void computescore();
abstract void play();
}

class Batmiton extends main1
{
	void play()
	{
		System.out.println("PLAY GAME");
	}
	void computescore()
	{
		System.out.println("computing score");
		
	}
}

class abstractclass
{
	public static void main(String args[])
	{
		Batmiton bat=new Batmiton();
		bat.play();
		bat.computescore();
		bat.display(123);
	}
}
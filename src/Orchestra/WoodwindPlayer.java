package Orchestra;

import static java.lang.System.*;
class WoodwindPlayer extends MusicMaker
{
	public WoodwindPlayer()
	{
		instrument = "Woodwind";
	}
	public WoodwindPlayer(String WoodwindType, int years)
	{
		instrument = WoodwindType;
		yearsStudied = years;
	}
	public void play()
	{
		out.println("I usually get nice solo parts");
	}
}

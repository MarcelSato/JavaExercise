package Orchestra;

import static java.lang.System.*;
class BrassPlayer extends MusicMaker
{
	public BrassPlayer()
	{
		instrument = "Brass";
	}
	public BrassPlayer(String brassType, int years)
	{
		instrument = brassType;
		yearsStudied = years;
	}
	public void play()
	{
		out.println("It needs a lot of breath to play a brass instrument");
	}
}

package Orchestra;

import static java.lang.System.*;
class StringsPlayer extends MusicMaker
{
	public StringsPlayer()
	{
		instrument = "Strings";
	}
	public StringsPlayer(String StringsType, int years)
	{
		instrument = StringsType;
		yearsStudied = years;
	}
	public void play()
	{
		out.println( "I always carry a spare set of strings");
	}
}


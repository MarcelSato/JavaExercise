package Orchestra;

import static java.lang.System.*;
class TestMusicians 
{
	public static void main(String[] args) 
	{
		MusicMaker sam = new WoodwindPlayer();
		out.println("this musician plays the " +sam.getInstrument());
		out.println("this musician has played for " +sam.getYears()+ "  yrs");
		sam.setInstrument("Flute");
		sam.setYears(5);
		out.println("this musician plays the " +sam.getInstrument());
		out.println("this musician has played for " +sam.getYears()+ "  yrs");
		sam.play();

		MusicMaker jo = new WoodwindPlayer("Clarinet",7);
		out.println("this musician plays the " +jo.getInstrument());
		out.println("this musician has played for " +jo.getYears()+ "  yrs");
		jo.play();

		MusicMaker pete = new BrassPlayer();
		out.println("this musician plays the " +pete.getInstrument());
		out.println("this musician has played for " +pete.getYears()+ "  yrs");
		pete.setInstrument("Trumpet");
		pete.setYears(6);
		out.println("this musician plays the " +pete.getInstrument());
		out.println("this musician has played for " +pete.getYears()+ "  yrs");
		pete.play();

		MusicMaker dud = new BrassPlayer("Trombone",3);
		out.println("this musician plays the " +dud.getInstrument());
		out.println("this musician has played for " +dud.getYears()+ "  yrs");
		dud.play();
		
		MusicMaker mo = new StringsPlayer();
		out.println("this musician plays the " +mo.getInstrument());
		out.println("this musician has played for " +mo.getYears()+ "  yrs");
		mo.setInstrument("violin");
		mo.setYears(10);
		out.println("this musician plays the " +mo.getInstrument());
		out.println("this musician has played for " +mo.getYears()+ "  yrs");
		mo.play();

		MusicMaker jacky = new StringsPlayer("Cello", 20);
		out.println("this musician plays the " +jacky.getInstrument());
		out.println("this musician has played for " +jacky.getYears()+ "  yrs");
		jacky.play();
	}
}

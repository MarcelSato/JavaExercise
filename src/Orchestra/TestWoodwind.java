package Orchestra;

import static java.lang.System.*;
class TestWoodwind
{
	public static void main(String[] args) 
	{
		WoodwindPlayer  fred = new WoodwindPlayer();
		out.println("he plays the  " + fred.getInstrument());
		out.println("he has played for  " + fred.getYears() +" years");
		fred.setInstrument("clarinet");
		fred.setYears(15);
		out.println("he plays the  " + fred.getInstrument());
		out.println("he has played for  " + fred.getYears() +" years");
		fred.play();
		
		WoodwindPlayer benny = new WoodwindPlayer("oboe",8);
		out.println("he plays the  " + benny.getInstrument());
		out.println("he has played for  " + benny.getYears() +" years");
		benny.play();
	}
}

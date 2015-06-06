package Orchestra;

abstract class  MusicMaker
{
	protected String instrument ;
	protected int yearsStudied ;
	
	public MusicMaker()
	{
	    instrument = "Guitar";
	    yearsStudied = 0;
	}	
	public MusicMaker(String instr, int yrs)
	{
		instrument = instr;
		yearsStudied = yrs;
	}
	public void setInstrument(String givenInst)
	{
		instrument = givenInst;
	}
	public String  getInstrument()
	{
		return instrument;
	}
	public void setYears(int givenYrs)
	{
		yearsStudied = givenYrs;
	}
	public int  getYears()
	{
		return yearsStudied;
	}
	//method of playing to be determined later
	public abstract void play();	
}

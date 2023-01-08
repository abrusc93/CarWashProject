public class Statistics {
	
  private Exit e;
  
  public Statistics(Exit e)
  {
	  this.e = e;
  }
  
  public void exampleStat()
	{
		int car = 0;
		
		for(Car c : e.returnExit())
		{
			if((c.getend() > 800) && (c.getend() < 899))
			{
				car++;
			}	
		}
		System.out.println("The number of cars that exited between ticks 800 and 899 are: " + car); 
	}
  
	/*public int averageTime()
	{
		int car = 0;
		int totalDiff = 0;
		int average = 0;
		for(carList c: Car)
		{
			car++;
			totalDiff += c.getTotal;
			
		}
		average = totalDiff/car;
		return average;
	}*/

}


import java.util.ArrayList;

public class Exit {

	private ArrayList<Car> carExit;
	
	public Exit ()
	{
		
		carExit = new ArrayList<>();
		
	}
	
	public void addCar(Car c)
	{
		
		carExit.add(c);
		
	}
	
	public ArrayList<Car> returnExit()
	{
		
		return carExit;
		
	}
	
}

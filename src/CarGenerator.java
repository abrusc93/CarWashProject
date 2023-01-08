import java.util.Random;

/**
 * This class generates cars for use
 * inside the car wash.
 * @author Jacob Parliman
 * @version v2.0 SKELETON WORKING
 * @since v1.0
 */
public class CarGenerator implements Actor {
	
	private static final int CAR_GENERATE_PROBABILITY = 10; // placeholder value
	private static final Random rng = new Random();
	private int carID;
	private Queue<Car> lane;
	
	/**
	 * Attempts to generate a new car with a random generator that must
	 * roll higher than that car generate probability.
	 * @return A car object.
	 * @throws CarGeneratorNullException
	 */
	
	public CarGenerator(Queue<Car> lane)
	{
		this.lane = lane;
		carID = 100;
	}
	
	public int getCarID()
	{
		return carID;
	}
	
	public int incrementCarID()
	{
		return carID++;
	}
	
	/**
	 * Every tick, act is called to attempt to generate a car
	 */
	public void act(int tick)
	{
		if (CAR_GENERATE_PROBABILITY > rng.nextInt(99))
		{
			Car car = new Car(tick, 20, getCarID());
			 try {		 
		    	lane.enqueue(car);
		    	incrementCarID();
			} catch (QueueFullException e) {
		    	//System.out.println(e);
			}
		}
	}
}

/**
 * This class retrieves the car's order and tells 
 * the gate whether a car has paid
 * @author Brendan Caudill
 * @version v1.2
 */
public class OrderInput implements Actor
{
	private int price, balance;	//price: the price that the car must pay
								// balance the total balance of the machine 
	private boolean carHasPaid;	// Tells the gate that the car has paid\
	private Queue<Car> lane;
	private Car car;
	
	/**
	 * Class Constructor for Order Input
	 */
	public OrderInput(Queue<Car> lane)	//sets the initial balance and price to 0 and carHasPaid to false
	{ 
		this.lane = lane;
		price = 0;
		balance = 0;
		carHasPaid = false;
	}
	
	public void act(int tick)
	{
		if((lane.isEmpty() == false) && (carHasPaid == false))
		{
			car = lane.peek();
			processOrder();
			setHasPaid(true);
		}
	}
	
	/**
	 * Changes whenever a car has placed an order and paid. 
	 * Used by the Gate whenever a dequeue is performed.
	 * @param tf variable that tells whether a car has paid or not.
	 */
	public void setHasPaid(boolean tf)
	{
		carHasPaid = tf;
	}
	
	public boolean getHasPaid()
	{
		return carHasPaid;
	}
	
	/**
	 * process each individual order and update the balance
	 * @param t The time that this order takes place
	 */
	public void processOrder()
	{
		switch(car.getpayType())	// balance depends on the car's order
		{
		case 1:
			price = 30;		// Instances of prices that can be added to the balance every time the car pays
		case 2:
			price = 20;
		case 3:
			price = 40;
		}
		balance += price;
	}
	
	/** 
	 * Get the balance. 
	 * Can be used for end of the day statistics.
	 * @return the balance of the OrderInput machine
	 */
	public int getBalance()		
	{
		return balance;
	}
	
	public String toString()
	{
		//return "Order Processed: " + Lane.get(0) + "ordered at " + System.currentTimeMillis() + "for " + price;
		return "Order Processed: " + lane.peek() + "ordered at " + System.currentTimeMillis() + "for " + price;
	}
}

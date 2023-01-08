/**
 * This class creates a gate that will let cars into
 * the tunnel to be washed.
 * @author Jacob Parliman
 * @version v2.0 SKELETON WORKING
 * @since v1.0
 */

public class Gate implements Actor {
	
	//private zzzLane zzzLane;  
	private Queue<Car> lane;  //assume lane adjacent to Gate
	private Tunnel tunnel;
	private OrderInput orderInput;
	private boolean gateOpenStatus;
	
	public Gate(Queue<Car> lane, Tunnel tunnel, OrderInput orderInput) 
	{
		this.lane = lane;
		this.tunnel = tunnel;
		this.orderInput = orderInput;
		
		gateOpenStatus = false;
	}
	
	
	public boolean setGateOpenStatus(boolean status)
	{
		return gateOpenStatus = status;
	}
	
	
	public boolean getGateOpenStatus()
	{
		return gateOpenStatus;
	}
	
	public void openGate() 
	{
		try {
			//
			if (!tunnel.isTunnelOccupied() && orderInput.getHasPaid())
			{
				setGateOpenStatus(true);
				tunnel.enqueue(lane.dequeue()); 
				orderInput.setHasPaid(false);
			}
		}
		catch (QueueFullException e)
		{
			System.out.println(e + " Tunnel");
		}
	}
	
	public void closeGate()
	{
		setGateOpenStatus(false);
	}

	public void act(int tick)
	{
		if (!getGateOpenStatus())
		{
			openGate();
		}
		else
		{
			closeGate();
		}
	}

}

/*

import java.util.ArrayList;


//ver. 0.2 aka too many bugs

public class zzzLane extends CarQueue {

	private ArrayList<Car> car;


	public zzzLane() {

		super();
		car = new ArrayList<>();

	}
	/**
	 * Dequeues generated car out of lane.
	 * @return 
	 /
	public Object dequeue()

	{
		for(Car removeCar : car) {
			car.remove(0);

		}
		return car;
	}

	/**
	 * Enqueues generated car into lane
	 * 
	 /
	public void enqueueCar(Car car)


	//ArrayList for zzzLane? To duplicate another lane?
	{
		while(queueMax < 3) {

			if(isEmpty()) {


				car.add();

			}
		}
	}

	/**
	 * Allows exit out of lane once payment is processed and gate opens
	 * 
	 * 
	 /
	public void allowExit() {

		Gate g = new Gate();

		if(Gate.setGateOpenStatus() = true)

			super.dequeue();
	}

}

/**
 * Allows passage to another lane if 1st lane is full
 * 
 /
//public void passOver() {



//if(first lane capacity = max))

//enqueues() onto other lane
*/

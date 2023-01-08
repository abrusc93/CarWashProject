import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * @author Armando Santiago
 * Tunnel queue class <Car> which takes in a collection of incoming/outgoing cars that also has a collection of car statistics
 * V.02
 */ 
public class Tunnel extends Queue <Car> implements Actor { //creates an empty queue
	
Exit e;
int count = 3;
//private ArrayList <Car> incomingCarQueue; // collection of incoming cars
//private ArrayList<Car> exitLot; // collection of cars when done washing (could be a variable for parking lot)
//private ArrayList <Car> carStats; // data collection, holds tick time(s) for later statistics

public Tunnel(Exit e) {  // Constructor
	
	super(4);
	this.e = e;
}

public boolean isTunnelOccupied() {
	
	if(getQueueSize() >= 1) {
		return true;
	}
		return false;	
}

public void act(int tick)  { // counter, every time reaches 0, dequeue to exit
	
	if(isTunnelOccupied() ) {
		count--;
    }
	if(count == 0) {
		Car car = peek();
		car.setend(tick);
		e.addCar(dequeue());
		count = 3;
	}
}
}

import java.util.*;
public class Controller{
	
	private List<Actor> actors;
	Statistics stat;
	Exit ex;
	
	public Controller() {
		actors = new ArrayList<>();
		Queue<Car> lane = new Queue<Car>(10);
		CarGenerator carGen = new CarGenerator(lane);
		OrderInput orderin = new OrderInput(lane);
		ex = new Exit();
		Tunnel tunnel = new Tunnel(ex);
		Gate gate = new Gate(lane, tunnel, orderin);
		stat = new Statistics(ex);
		
		actors.add(carGen);
		actors.add(orderin);
		actors.add(gate);
		actors.add(tunnel);
	}

	public void tick(){
		
		for(int i = 0; i <= 2500; i++) {
			for(Actor actor : actors) {
			      actor.act(i);
			}
		}
		// Invoke statistics methods
		stat.exampleStat();
	}
	
	public static void main(String args[])
	{
		Controller c = new Controller();
		c.tick();
	}
}

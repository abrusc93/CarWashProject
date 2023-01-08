
public class QueueFullException extends Exception{

	public QueueFullException()
	{
		
		super("The queue has no room for additional cars.");
		
	}
	
	public QueueFullException(String msg)
	{
		 
		super("Not enough room: " + msg);
		
	}
	
}

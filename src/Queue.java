/**
 * Queue<T>
 * @author Prof W
 *
 * a generic Queue with some features added for car project
 *   adapted a lot from "CarQueue"
 * 
 */
import java.util.ArrayList;
public class Queue<T>
{
		
		private ArrayList<T> myQ;
		private int queueMax;  //maximum size
		
		public Queue(int max) 
		{
			
			myQ = new ArrayList<>();
			queueMax = max;
			
		}
		
		public boolean isEmpty()
		{
			
			return myQ.size() == 0;
			
		}
		
		public void enqueue(T data) throws QueueFullException
		{
			if(getQueueSize() < getQueueMax())
			{
				
				myQ.add(data);
				
			}
			else throw new QueueFullException();
			
		}

		public T dequeue()
		{
			
			return myQ.remove(0);
			
		}
		
		public T peek()   //protection level??
		{
			
			return myQ.get(0);
			
		}
		
		public int getQueueSize()  //current num of entries
		{
			
			return myQ.size();
			
		}
		
		public int getQueueMax()
		{
			return queueMax;
		}
		
	}


// *might try and file later* import java.io.File;
public class Car { 
	private int start, tunnelStart, tunnelEnd, end, total; 
	private int phase, currentTickCount;
	private int payType;
	private int id;

	public Car(int start,int payType, int id)
	{
		this.start = start;
		tunnelStart = 0;
		tunnelEnd = 0;
		end = 0; 
		total = 0;
		phase = 0;
		currentTickCount = 0;
		this.payType = payType;
		this.id = id;
	}
	
	public int getpayType(){
	    return payType;
	}
	public void setpayType(int payType) {
		this.payType = payType;
	}

	public int getstart() {
		return start;
	}

	public void setstart(int start) {
		this.start = start;
	}

	public int gettunnelStart() {
		return tunnelStart;
	}

	public void settunnelStart(int tunnelStart) {
		this.tunnelStart = tunnelStart;
	}

	public int gettunnelEnd() {
		return tunnelEnd;
	}

	public void settunnelEnd(int tunnelEnd) {
		this.tunnelEnd = tunnelEnd;
	}

	public int getend() {
		return end;
	}

	public void setend(int end) {
		this.end = end;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getTotal() 
	{
		total = (end - start);
		return total;
	}
	
	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}
	
	public int getCurrentTickCount() {
		return currentTickCount;
	}

	public void setCurrentTickCount(int currentTickCount) {
		this.currentTickCount = currentTickCount;
	}

	

}	

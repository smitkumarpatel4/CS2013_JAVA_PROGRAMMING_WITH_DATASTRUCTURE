package CHAPTER_10_OBJECT_ORIENTED_THINKING;

public class Time {
	
	long hour;
	long minute;
	long second;
	
	
	Time(){
		long ts=System.currentTimeMillis()/1000;
		long tm=ts/60;
		long th=tm/60;
		
		
		this.hour=th % 24;
		this.minute=tm % 60;
		this.second=ts % 60;
	}
	
	Time(long elapsedtime){
		long ts=elapsedtime/1000;
		long tm=ts/60;
		long th=tm/60;
				
		this.hour=th % 24;
		this.minute=tm % 60;
		this.second=ts % 60;
	}
	

	Time(long h, long m, long s)
	{
		this.hour=h;
		this.minute=m;
		this.second=s;
	}
	
	public long gethour() {
		return hour;
	}
	
	public long getminute() {
		return minute;
	}
	
	public long getsecond() {
		return second;
	}
	
	public void setTime(long elapsedtime) {
	
		long ts=elapsedtime/1000;
		long tm=ts/60;
		long th=tm/60;
				
		this.hour=th % 24;
		this.minute=tm % 60;
		this.second=ts % 60;
		
		
		System.out.println(hour+ " : "+minute +" : " + second);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t= new Time();
		Time t2= new Time(555550000);
		System.out.println(t2.hour+ " : "+t2.minute +" : " + t2.second);

	}

}

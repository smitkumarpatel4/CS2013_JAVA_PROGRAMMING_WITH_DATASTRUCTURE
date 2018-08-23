package CHAPTER_09_OBJECT_AND_CLASSES.copy;

public class Fan {

	
		final static int SLOW = 1;
		final static int MEDIUM = 2;
		final static int FAST = 3;
		private int speed;
		private boolean on;
		private double radius;
		String color;

		Fan() {
			speed = SLOW;
			on = false;
			radius = 5;
			color = "blue";
		}

		public void setSpeed(int newSpeed) {
			speed = newSpeed;
		}

		public void turnOn() {
				on = true;
		}

		public void turnOff() {
				on = false;
		}

		public void setColor(String newColor) {
			color = newColor;
		}

		public void setRadius(double newRadius) {
			radius = newRadius;
		}

		public String getSpeed() {
			String status = "";
			switch (speed) {
				case SLOW: status = "SLOW"; break;
				case MEDIUM: status = "MEDIUM"; break;
				case FAST: status = "FAST";
			}
			return status;
		}

		public boolean isOn() {
			return on;
		}

		public double getRadius() {
			return radius;
		}

		public String getColor() {
			return color;
		}

		public String toString() {
			if (on == true) {
				return "Fan speed: " + getSpeed() + " color: " + color + " radius: " + radius + "\n";
			}
			else{
				return " Fan is off " + " Fan color: " + color + " radius: " + radius ;
			}
		}	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan fan1 = new Fan();
		
		fan1.setSpeed(FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.turnOn();
		
		Fan fan2 = new Fan();

		fan2.setSpeed(MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.turnOff();

		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

} 
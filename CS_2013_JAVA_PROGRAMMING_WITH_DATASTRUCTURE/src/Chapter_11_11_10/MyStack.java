/***
 *  Exercise 11.10  MyStack Exersice_11_10
 */
package Chapter_11_11_10;
public class MyStack extends java.util.ArrayList {
	private java.util.ArrayList<Object> list;
	
	public MyStack() {
		list = new java.util.ArrayList<Object>();
	}
	
	public void push(Object obj) {
		list.add(0, obj);
	}
	
	public Object peek() {
		return list.get(0);
	}
	
	public Object pop() {
		Object obj = list.get(0);
		list.remove(0);
		return obj;
	}
	
	public String toString() {
		return "stack: " + list.toString();
	}
}
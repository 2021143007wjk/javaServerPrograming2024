package oop;

abstract public class Car {
	int speed;
	int adult;
	int child;
	
	final public void speedup() {
		speed++;
	}
	
	public int people() {
		return adult + child;
	}
	abstract public void move();
}

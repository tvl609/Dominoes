package model;

import java.util.Comparator;

public class Domino implements Comparable<Object>{
	private int[] end;
	public boolean flip = false;
	
	/**
	 * Constructs a new Domino object consisting of 
	 * two integer values ranging from 0 to 6.
	 * @param endA Integer value specifying an end of the Domino
	 * @param endB Integer value specifying the other end of the Domino
	 */
	public Domino(int endA, int endB) {
		end = new int[2];
		end[0] = (endA < 0) ? 0 : (endA > 6) ? 6 : endA;
		end[1] = (endB < 0) ? 0 : (endA > 6) ? 6 : endB;
	}
	
	/**
	 * Returns an integer value representing one end of the Domino.
	 * @return Integer value
	 */
	public int getEndA() {
		if(flip) return end[1];
		return end[0];
	}
	
	/**
	 * Returns an integer value representing the other end of the Domino.
	 * @return Integer value
	 */
	public int getEndB() {
		if(flip) return end[0];
		return end[1];
	}
	
	/**
	 * Returns a boolean value indicating if both ends of the 
	 * Domino are equal.
	 * @return Boolean value
	 */
	public boolean isDouble() {
		return end[0] == end[1];
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Domino)){
			return false;
		}
		Domino d = (Domino) obj;
		return (end[0] == d.getEndA() && end[1] == d.getEndB()) ||
				(end[0] == d.getEndB() && end[1] == d.getEndA());
	}
	
	/**
	 * Compares two Domino values and returns an integer 
	 * representing their sort order.
	 */
	public int compareTo(Object obj) {
		if(!(obj instanceof Domino))
			return 0;
		Domino d = (Domino) obj;
		int[] tmp1 = (getEndA() >= getEndB()) ? 
				new int[]{getEndA(), getEndB()} :
				new int[]{getEndB(), getEndA()};
		int[] tmp2 = (d.getEndA() >= d.getEndB()) ? 
				new int[]{d.getEndA(), d.getEndB()} :
				new int[]{d.getEndB(), d.getEndA()};
		//greater than conditions: return 1
		if (tmp1[0] > tmp2[0] || (tmp1[0] == tmp2[0] && tmp1[1] > tmp2[1]))
			return 1;
		//less than conditions: return -1
		if (tmp1[0] < tmp2[0] || (tmp1[0] == tmp2[0] && tmp1[1] < tmp2[1]))
			return -1;
		//all else return 0
		return 0;
	}
	
	/**
	 * Returns a string literal representations of this object.
	 */
	public String toString() {
		return "[" + getEndA() + "|" + getEndB() + "]";
	}
}

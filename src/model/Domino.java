package model;

import java.util.Comparator;

public class Domino implements Comparator<Domino>{
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
	
	/**
	 * Compares two Domino values and returns an integer 
	 * representing their sort order.
	 */
	public int compare(Domino d1, Domino d2) {
		int[] tmp1 = (d1.getEndA() >= d1.getEndB()) ? 
				new int[]{d1.getEndA(), d1.getEndB()} :
				new int[]{d1.getEndB(), d1.getEndA()};
		int[] tmp2 = (d2.getEndA() >= d2.getEndB()) ? 
				new int[]{d2.getEndA(), d2.getEndB()} :
				new int[]{d2.getEndB(), d2.getEndA()};
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

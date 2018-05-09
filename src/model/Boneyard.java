package model;

/**
 * 
 * @author Shane Bogard
 * 
 */

import model.exceptions.DuplicateDominoException;

public class Boneyard extends BoneCollection {

	private int maxSuitSz;
	
	/**
	 * Constructs a new Boneyard object with a specified max 
	 * suit size.
	 * @param maxSuitSz Integer representing the max suit size
	 */
	public Boneyard(int maxSuitSz) {
		super();
		this.maxSuitSz = maxSuitSz;
		for(int i = maxSuitSz; i >= 0; i--) {
			for(int j = i; j >= 0; j--) {
				boneCollection.add(new Domino(i, j));
			}
		}
	}
	
	/**
	 * Constructs a new Boneyard object. Default max suit
	 * size is 6.
	 */
	public Boneyard() {
		this(6);
	}
	/**
	 * Adds a Domino object to this Boneyard if the Domino
	 * does not currently exist in this Boneyard.
	 * @param d Domino object
	 * @throws DuplicateDominoException Exception
	 */
	public void addBone(Domino d) throws DuplicateDominoException {
		if(boneCollection.contains(d)) {
			throw new DuplicateDominoException("Domino " + d.toString() 
										+ " Already Exists in Collection");
		}else {
			boneCollection.add(d);
		}
	}
	
	
	/**
	 * Returns a string literal representation of this Boneyard object.
	 */
	public String toString() {
		String result = "";
		for(Domino d: boneCollection) {
			if(d.getEndA() != maxSuitSz && d.getEndB() != maxSuitSz) {
				maxSuitSz = (d.getEndA() >= d.getEndB()) ? d.getEndA() : d.getEndB();
				result += "\n";
			}
			result += d.toString();
		}
		return result;
	}	
}

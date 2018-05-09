package model;

/**
 * 
 * @author Shane Bogard
 */

import java.util.ArrayList;
import model.exceptions.DuplicateDominoException;
import model.exceptions.NoSuchDominoException;

public abstract class BoneCollection {
	
	protected ArrayList<Domino> boneCollection; 
	
	public BoneCollection() {
		boneCollection = new ArrayList<Domino>();
	}
	
	/**
	 * Returns an array of Domino objects contained in
	 * this BoneCollection. These objects are duplicates
	 * and any changes to the Array will not effect
	 * this BoneCollection.
	 * @return
	 */
	public Domino[] getCollection() {
		Domino[] temp = new Domino[boneCollection.size()];
		for(int i = 0; i < boneCollection.size(); i++) {
			temp[i] = boneCollection.get(i);
		}
		return temp;
	}
	
	/**
	 * 
	 * @param d
	 * @return
	 * @throws NoSuchDominoException
	 */
	public Domino removeDomino(Domino d) throws NoSuchDominoException{
		if(!boneCollection.contains(d)) 
			throw new NoSuchDominoException("Domino " + d.toString()
						+ " does not exist");
		else {
			boneCollection.remove(d);
			return new Domino(d.getEndA(), d.getEndB());
		}
		
	}
	
	abstract public void addBone(Domino d) throws DuplicateDominoException;
	
}

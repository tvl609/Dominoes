package model;

import java.util.ArrayList;

import model.exceptions.DuplicateDominoException;

public abstract class BoneCollection {
	
	protected ArrayList<Domino> boneCollection; 
	
	public BoneCollection() {
		boneCollection = new ArrayList<Domino>();
	}
	
	public Domino[] getCollection() {
		return (Domino[]) boneCollection.toArray();
	}
	
	abstract public void addBone(Domino d) throws DuplicateDominoException;
	
}

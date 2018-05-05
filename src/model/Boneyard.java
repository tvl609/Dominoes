package model;

import model.exceptions.DuplicateDominoException;

public class Boneyard extends BoneCollection {

	public Boneyard() {
		super();
		for(int i = 6; i >= 0; i--) {
			for(int j = i; j >= 0; j--) {
				boneCollection.add(new Domino(i, j));
			}
		}
	}
	
	public void addBone(Domino d) throws DuplicateDominoException {
		if(boneCollection.contains(d)) {
			throw new DuplicateDominoException("Domino " + d.toString() 
										+ " Already Exists in Collection");
		}else {
			boneCollection.add(d);
		}
		
	}
	
	public String toString() {
		String result = "";
		int suit = 6;
		for(Domino d: boneCollection) {
			if(d.getEndA() != suit && d.getEndB() != suit) {
				suit = (d.getEndA() >= d.getEndB()) ? d.getEndA() : d.getEndB();
				result += "\n";
			}
			result += d.toString();
		}
		return result;
	}	
}

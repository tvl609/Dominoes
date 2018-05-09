package model.tests;

/**
 * @author Shane Bogard
 */

import model.Boneyard;
import model.Domino;
import model.exceptions.DuplicateDominoException;

public class TestBoneyard {

	public static void printTest(String heading, Boneyard b) {
		System.out.println("***STARTOF:" + heading + "***");
		System.out.println("toString(): ");
		System.out.println(b.toString());
		System.out.println("\n-Duplicate Add Test-");
		try {
			b.addBone(new Domino(6, 6));
		}
		catch (DuplicateDominoException dde) {
			System.err.println(dde.getMessage());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("toString() after duplicate attempt: ");
		System.out.println(b.toString());
		System.out.println("\n-getCollection Test-");
		for(Domino d: b.getCollection()) {
			System.out.println(d.toString());
		}
		
		System.out.println("***ENDOF:" + heading + "***\n");
		
	}
	
	
	public static void main(String[] args) {
		printTest("Boneyard Test A",new Boneyard());
		printTest("Boneyard Test B (Increased Size)",new Boneyard(8));

	}

}

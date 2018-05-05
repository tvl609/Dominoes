package model.tests;

import model.Boneyard;
import model.Domino;
import model.exceptions.DuplicateDominoException;

public class TestBoneyard {

	public static void printTest(String heading, Boneyard b) {
		System.out.println("***STARTOF:" + heading + "***");
		System.out.println(b.toString());
		try {
			b.addBone(new Domino(6, 6));
		}
		catch (DuplicateDominoException dde) {
			dde.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(b.toString());
		System.out.println("***ENDOF:" + heading + "***\n");
	}
	
	
	public static void main(String[] args) {
		printTest("Boneyard Test A",new Boneyard());

	}

}

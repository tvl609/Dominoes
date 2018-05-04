package model.tests;

import model.Domino;

public class TestDomino {

	public static void printTest(String heading, Domino d, Domino d2) {
		System.out.println("***STARTOF:" + heading + "***");
		System.out.println("D1 = " + d.toString() + " D2 = " + d2.toString());
		System.out.println("Domino 1");
		System.out.println("End A = " + d.getEndA());
		System.out.println("End B = " + d.getEndB());
		System.out.println("isDouble = " + d.isDouble());
		System.out.println("comparison = " + d.compare(d, d2));
		System.out.println("toString= " + d.toString());
		d.flip = true;
		System.out.println("Flipped End A = " + d.getEndA());
		System.out.println("Flipped End B = " + d.getEndB());
		System.out.println("Flipped toString= " + d.toString());
		System.out.println("Flipped comparison = " + d.compare(d, d2));
		System.out.println("Domino 2");
		System.out.println("End A = " + d2.getEndA());
		System.out.println("End B = " + d2.getEndB());
		System.out.println("isDouble = " + d2.isDouble());
		System.out.println("comparison = " + d2.compare(d2, d));
		System.out.println("toString= " + d2.toString());
		d2.flip = true;
		System.out.println("Flipped End A = " + d2.getEndA());
		System.out.println("Flipped End B = " + d2.getEndB());
		System.out.println("Flipped toString= " + d2.toString());
		System.out.println("Flipped comparison = " + d2.compare(d2, d));
		System.out.println("***ENDOF:" + heading + "***\n");
	}
	
	public static void main(String[] args) {
		printTest("Test Set 1", new Domino(6,2), new Domino(6,0));
		printTest("Test Set 2", new Domino(6,6), new Domino(6,6));
		printTest("Test Set 2", new Domino(5,5), new Domino(6,3));
	}

}

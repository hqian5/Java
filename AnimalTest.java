package zoo;
/*

 * AnimalTest.java  	1.0 01/10/2010
 *
 * Copyright (c) University of Sheffield 2011
 */

/** 
* AnimalTest.java
*
* Test class to demonstrate inheritance
* 
* @version 1.1 01 October 2010
* 
* @author Mark Stevenson (mark.stevenson@sheffield.ac.uk)
* Original code written by Guy Brown and Richard Clayton
*
*/

public class AnimalTest {
    public static void main(String[] args) {
	Cow daisy = new Cow();
	Pig wilbur = new Pig();
	Animal animal = new Animal() {};
	Sheep Tom = new Sheep();
	Animal[] farm = new Animal[5];
	farm[0] = animal;
	farm[1] = daisy;
	farm[2] = wilbur;
	farm[3] = animal;
	farm[4] = Tom;

	for(int i = 0; i < 5; i++) {
	    farm[i].talk();
	} // for
    } // main
}

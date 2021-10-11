package com.Instrument;
/*1.	Create two interfaces Piano & Guitar with single default method 
void play() with different implementations. Add single implementation
class Instrument for both the interfaces. 
Solve method name ambiguity in Instrument class by using two different approaches.*/
class Instrument implements Piano,Guitar {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Both are Instrument");
		
	}

}
public class Main
{
	public static void main(String[] args)
	{
		Guitar guitar;
		Piano piano;
		guitar=new Instrument();
		piano=new Instrument();
		System.out.println("Guitar");
		guitar.play();
		System.out.println("Piano");
		piano.play();
		
	}
}
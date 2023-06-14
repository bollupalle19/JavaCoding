package com.ext;

interface Organization{
	void organize();
}

interface Team extends Organization{
	void Task();
}

class Team1 implements Team{
	public void organize() {
		System.out.println("Organization manages");
	}
	
	public void Task() {
		System.out.println("Team does task");
	}
}
public class Task3 {

	public static void main(String[] args) {
		
		Team1 at = new Team1();
		at.organize();
		at.Task();
	}

}

package com.ext;

interface Organization{
	void organize();
}

interface Team extends Organization{
	void Task();
}

class ApiTeam implements Team{
	public void organize() {
		System.out.println("Organization manages Team");
	}
	
	public void Task() {
		System.out.println("Team does task");
	}
}
public class Task3 {

	public static void main(String[] args) {
		
		ApiTeam at = new ApiTeam();
		at.organize();
		at.Task();
	}

}

package model;

public class Player {
	//Variables
	private String username;
	private int skillPoints;
	private int credits;
	private int hourPlayedWeekly;
	
	//Constructors
	//Default
	public Player()
	{
		this.skillPoints = 0;
		this.credits = 0;
	}
	public Player(String username)
	{
		this.setUsername(username);
		this.skillPoints = 0;
		this.credits = 0;
		this.setHourPlayedWeekly(0);
	}
	
	//Methods
	public String getUsername() {
		return username;
	}
	 
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSkillPoints() {
		return skillPoints;
	}
	
	public int getCredits() {
		return credits;
	}

	public int getHourPlayedWeekly() {
		return hourPlayedWeekly;
	}
	public void setHourPlayedWeekly(int hourPlayedWeekly) {
		this.hourPlayedWeekly = hourPlayedWeekly;
	}
	//Alters the amount of skillPoints
	public int increaseSkillPoints(int points)
	{
		this.skillPoints += points;
		return this.getSkillPoints();
	}
	//Alters credits
	public int addCredits(int credits)
	{
		this.credits += credits;
		return this.getCredits();
	}
	public int spendCredits(int credits)
	{
		this.credits -= credits;
		return this.getCredits();
	}
	
	
	
	
	
	
	
	
	

}

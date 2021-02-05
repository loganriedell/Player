package model;

public class PlayerLogic {
	//Ranks player level by how many skill points they have
	public String getPlayerSkillLevel(Player player)
	{
		String skill = "";
		int points = player.getSkillPoints();
		int low = 1000;
		int moderate = 2000;
		int high = 3000;

		if(points < low)
		{
			skill = "Low";
		}
		else if (points < moderate)
		{
			skill = "Moderate";
		}
		else if (points < high)
		{
			skill = "High";
		}
		else 
		{
			skill = "Insane"; 
		}
		return skill;
	}
	//Figures the type of player based on playing habits
	public String getPlayerType(Player player)
	{
		int hours = player.getHourPlayedWeekly();
		String type = "";
		int casual = 5;
		int dedicated = 15;
		int verySerious = 30;
		if (hours <= casual)
		{
			type = "Casual"; 
		}
		else if (hours <= dedicated)
		{
			type = "Dedicated";
		}
		else if (hours <= verySerious)
		{
			type = "Very Serious";
		}
		else 
		{
			type = "Wake Up, " + player.getUsername() + "... The Matrix has you...";
		}
		return type;
	}

}

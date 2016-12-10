package enums;

public class EnumDemo {
	enum Seasons{
		SUMMER, WINTER, AUTUM, SPRING;
	}
	
	public static void main(String[] args) {
		Seasons season = Seasons.SUMMER;
		
		if(season.equals(Seasons.SUMMER)){
			System.out.println("Its summer");
		}
		
		String seasonName = "spring";
		if(seasonName.equalsIgnoreCase(Seasons.SUMMER.toString()))
			System.out.println("Season is summer");
		else if(seasonName.equalsIgnoreCase(Seasons.SPRING.toString()))
			System.out.println("Season is Spring");
	}
}

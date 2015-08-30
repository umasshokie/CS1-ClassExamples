public class OlympicCountry
{
	private int gold;
	private int silver;
	private int bronze;
	private String name;

	//constructor
	public OlympicCountry(String n, int g, int s, int b)
	{
		name = n;
		gold=g;
		silver=s;
		bronze=b;
	}

	//Purpose: accessor for name
	//parameters: none
	//return: String, value of name data member
	public String getName()
	{
		return name;
	}
	public int getGold()
	{
		return gold;
	}
	public int getSilver()
	{
		return silver;
	}
	public int getBronze()
	{
		return bronze;
	}

	//purpose: mutator for name
	//parameters: String, value to set name to
	//return: none
	public void setName(String n)
	{
		name = n;
	}
	public void setGold(int g)
	{
		gold = g;
	}
	public void setSilver(int s)
	{
		silver = s;
	}
	public void setBronze(int b)
	{
		bronze = b;
	}

	//purpose: determine if two countries are equal
	//algorithm: compare each country based on name, return true if they match and false otherwise
	//parameters: an OlympicCountry object
	//return: boolean, true if match and false otherwise
	public boolean equals(OlympicCountry other)
	{
		if(name.equals(other.name))
			return true;
		return false;
	}

	//purpose: return information about the object in the form of a string
	//algorithm: return each data members value concatenated together
	//parameters: none
	//return: String, representing all values
	public String toString()
	{
		return name + " Gold: " + gold + " Silver: " + silver + " Bronze: " + bronze;
	}

	//purpose: calculate points earned by this country
	//algorithm: gold*2+silver*2+bronze
	//parameters: none
	//return: int, the number of points
	public int calculatePoints()
	{
		return gold*3 + silver*2 + bronze;
	}
}
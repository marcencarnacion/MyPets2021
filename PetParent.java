public abstract class PetParent 
{
    private String name;
    public boolean hasHair;
    public String color;
    public int cuteness;//1-10, 1:ugly
    public double friendliness;//% in decimal form

    public PetParent(String name, boolean hasHair, String color, int cuteness, double friendliness)
    {
      this.name = name;
      this.hasHair = hasHair;
      this.color = color;
      this.cuteness = cuteness;
      this.friendliness = friendliness;
    }

    public PetParent()
    {
      this.name = "";
      this.hasHair = false;
      this.color = "";
      this.cuteness = -1;
      this.friendliness = -0.01;
    }
    
    //getters and setters
    public String getName()
    {
      return name; 
    }//end name getters

    public void setName(String name)
    {
      this.name = name;
    }
    //brain method

    public String dailyRoutine()
    {
      return name + " likes to play in the morning and eat dinner at 5:00 PM";
    }//this got inherited

    //This is an abstract method. It has no body
    public abstract String speak();

    public String toString()
    {
      return "Name = " + name +  "\n hasHair = " + hasHair + 
      "\ncolor = " + color + "\ncuteness = " + cuteness + 
      "\nfriendliness (% in decimal format) = " + friendliness;
    }
}
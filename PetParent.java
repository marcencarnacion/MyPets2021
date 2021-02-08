class PetParent 
{
    public String name;
    public boolean hasHair;
    public String color;
    public int cuteness;//1-10, 1:ugly
    public double friendliness;//% in decimal form

    public PetParent(String name, boolean hasHair, String color, int cuteness, double friendliness)
    {
      this.name = name;
      this. hasHair = hasHair;
      this.color = color;
      this.cuteness = cuteness;
      this.friendliness = friendliness;
    }

    public String toString()
    {
      return "Name = " + name +  "\n hasHair = " + hasHair + 
      "\ncolor = " + color + "\ncuteness = " + cuteness + 
      "\nfriendliness (% in decimal format) = " + friendliness;
    }
}
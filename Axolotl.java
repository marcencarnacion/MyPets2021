public class Axolotl extends PetParent
{
  //instance varibles
  private boolean hasRegenerated;
  //constructors
  public Axolotl(String name, boolean hasHair, String color, int cuteness, double friendliness, boolean hasRegenerated)
  {
    super (name, hasHair, color, cuteness, friendliness);
    this.hasRegenerated = hasRegenerated;
  }
  
  //overriden method
  //This is printed out inside of daily routine (like Piper's) because it goes from child class to parent class - It sees which one comes first. Since the Dog class does not have an overriden method, then it prints out the line from the PetParent class
  @Override
  public String dailyRoutine()
  {
    return super.getName() + " sleep whenever, eat whenever, then float";
  }

  public String speak()
  {
    if (hasRegenerated)
    {
      return "gurgles";
    }
    else 
    {
      return "bloop";
    }
  }

  public void setRegenerate(boolean hasRegenerated)
  {
    this.hasRegenerated = hasRegenerated;
  }

  //toString
  public String toString()
  {
    String output = super.toString();
    output += "\n has it regenerated = " + hasRegenerated;
    return output;
  }//end toString
}//end Axolotl class
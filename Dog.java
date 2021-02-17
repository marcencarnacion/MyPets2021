public class Dog extends PetParent
{
  private boolean hasTail;
  private int loyalty;//1-10
  private String breed;

  public Dog(String name, boolean hasHair, String color, int cuteness, double friendliness, boolean hasTail, int loyalty, String breed)
  {
    super (name, hasHair, color, cuteness, friendliness);
    this.hasTail = hasTail;
    this.loyalty = loyalty;
    this.breed = breed;
  }

  //getters and setters
  public String speak()
  {
    return "Bark";
  }

  public String getLoyalty()
  {
    return this.getName() + " has a loyalty of " + this.loyalty;
  }
  public String toString()
  {
    String output = super.toString();
    output += "\nhas a Tail? = " + hasTail +
              "\nLoyalty (1-10) = " + loyalty + 
              "\nBreed = " + breed;
    return output; 
  }
}
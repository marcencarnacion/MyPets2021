public class Owner
{
  private String name;

  public Owner (String name)
  {
    this.name = name;
  }

  public String feed(Dog d)
  {
    return "Time to feed " + d.getName() + "!";
  }
  public String toString()
  {
    return "I am " + this.name;
  }
}
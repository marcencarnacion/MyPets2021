class Main 
{
  public static void main(String[] args) 
  {
    PetParent blankPet = new PetParent("Bob", true, "yellow-purple", 2, 0.9);

    Dog piper = new Dog("Piper", true, "black and white", 10, 5,false, 8, "Australian Shepherd");
    System.out.println();
    System.out.println(blankPet.toString());
    System.out.println();
    System.out.println(piper.toString());
  }
}
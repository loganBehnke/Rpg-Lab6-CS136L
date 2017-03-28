public class Person{
  protected int health;
  protected String name;

  public boolean isDead(){
    return !(health > 0);
  }
  public Damage attack(){
    return null;
  }

  public void takeDamage(int amount){
    health -= amount;
  }
  public int getHealth(){
    return health;
  }

  public String getName()
  {
    return name;
  }
  public void setHealth(int newHealth){
    health = newHealth;
  }
  public void setName(String newName){
    name = newName;
  }
}

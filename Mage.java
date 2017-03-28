import java.util.Random;

public class Mage extends Person{
  Random rnd;
  public Mage(String newname){
    rnd = new Random();
    health = rnd.nextInt(51) + 10;
    name = newname;
  }
  public void takeDamage(FireDamage amount){
    super.takeDamage(amount.getDamage());
  }
  public void takeDamage(SmashingDamage amount){
    super.takeDamage(amount.getDamage());
  }
  public void takeDamage(SlashingDamage amount){
    super.takeDamage(amount.getDamage());
  }
  public FireDamage attack(){
    FireDamage out = new FireDamage(rnd.nextInt(7));
    return out;
  }
}

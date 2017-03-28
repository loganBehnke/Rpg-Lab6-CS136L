import java.util.Random;

public class Warrior extends Person{
  Random rnd;
  public Warrior(String newname){
    rnd = new Random();
    health = rnd.nextInt(21) + 20;
    name = newname;
  }
  public void takeDamage(FireDamage amount){
    super.takeDamage(amount.getDamage());
  }
  public void takeDamage(SmashingDamage amount){
    int dodge = rnd.nextInt(4);
    if(dodge == 1){
      System.out.println("Attack was dodged");
    }
    else{
      super.takeDamage(amount.getDamage());
    }
  }
  public void takeDamage(SlashingDamage amount){
    int dodge = rnd.nextInt(4);
    if(dodge == 1){
      System.out.println("Attack was dodged");
    }
    else{
      super.takeDamage(amount.getDamage());
    }
  }
  public SlashingDamage attack(){
    SlashingDamage out = new SlashingDamage(rnd.nextInt(7) + 10);
    return out;
  }
}

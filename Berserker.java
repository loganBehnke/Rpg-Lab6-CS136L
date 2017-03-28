public class Berserker extends Person{
  public Berserker(String newname){
    health = 35;
    name = newname;
  }
  public SmashingDamage attack(){
    SmashingDamage out = new SmashingDamage(20);
    return out;
  }
  public void takeDamage(FireDamage amount){
    super.takeDamage(amount.getDamage() / 2);
  }
  public void takeDamage(SmashingDamage amount){
    super.takeDamage(amount.getDamage());
  }
  public void takeDamage(SlashingDamage amount){
    super.takeDamage(amount.getDamage() * 2);
  }
}

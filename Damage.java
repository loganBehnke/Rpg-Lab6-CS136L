public class Damage
{
  private int damage;
  private String type;

  public Damage(int amountDamage, String damageType)
  {
    this.damage = amountDamage;
    this.type = damageType;
  }

  public String getType()
  {
    return type;
  }

  public int getDamage()
  {
    return damage;
  }
}

import java.util.ArrayList;
import java.util.*;

public class Arena
{
  private ArrayList<Person> arenaList = new ArrayList<Person>();
  //Berserker berserk;

  public Arena()
  {
    Person berserk = new Berserker("Berser");
    Person berserk1 = new Berserker("Bruce");
    Person warr = new Warrior("Wade");
    Person warr1 = new Warrior("Wark");
    Person mag = new Mage("Magnificent");
    Person mag1 = new Mage("Master");
    arenaList.add(berserk);
    arenaList.add(berserk1);
    arenaList.add(warr);
    arenaList.add(warr1);
    arenaList.add(mag);
    arenaList.add(mag1);
  }

  public void playRound()
  {
    Random rnd = new Random();
    System.out.println("");
    System.out.println("New Round\n");
    for (Person person : arenaList)
    {
      System.out.println(person.getName() + " has " + person.getHealth() + " health.");
    }
    System.out.println("");
    for (Person person : arenaList)
    {
      // person is attacking random player
      // find person to attack
      int index = rnd.nextInt(arenaList.size());
      Person personToAttack = arenaList.get(index);
      while (person == personToAttack)
      {
        index = rnd.nextInt(arenaList.size());
        personToAttack = arenaList.get(index);
      }
      Damage personDamage = person.attack();
      personToAttack.takeDamage(personDamage.getDamage());
      System.out.println(person.getName() + " attacks " + personToAttack.getName() + " with " + personDamage.getDamage() + " " + personDamage.getType() + " damage.");
    }
    System.out.println("\n");
    checkDead();
  }

  public void checkDead()
  {
    ArrayList<Person> arenaListChecked = arenaList;
    for (int i = 0; i < arenaListChecked.size(); i++)
    {
      Person person = arenaListChecked.get(i);
      if (person.isDead())
      {
        arenaListChecked.remove(person);
        System.out.println(person.getName() + " has died");
      }
      else
      {
        continue;
      }
    }
    arenaList = arenaListChecked;
  }

  public boolean checkVictor()
  {
    if (arenaList.size() == 1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void victorPrint(){
    Person victor = arenaList.get(0);
    System.out.println(victor.getName() + " wins");
  }

  public static void main(String args[])
  {
    Arena arena = new Arena();
    while (!arena.checkVictor())
    {
      arena.playRound();
    }
    arena.victorPrint();
    //arena.getVictor();
  }
}

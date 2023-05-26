/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplegame;


public class SimpleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        monsters[] listOfMonsters;
        listOfMonsters = randomMonster.monsterDraw(); 
        for(monsters myEnemy : listOfMonsters){
            System.out.println(myEnemy.description());
        }
    }
    
    
}
abstract class monsters{
    protected int ap;
    protected int hp;
    protected int def;
    protected abstract void basicStats();
    protected abstract void attack();
    protected abstract void weapon();
    protected abstract String description();
}


class randomMonster{
    public final static int lengthGame = 10;
    public static int[] amountMonsters = new int[lengthGame];
    static int maxMonsters = lengthGame;
   
    public static monsters[] monsterDraw(){
        int minusMonsters = (int)Math.floor(Math.random() * (maxMonsters + 1));
        maxMonsters -= minusMonsters;
        monsters[] newSkeletons = new Skeleton[minusMonsters];
        for(int x = 0; x < newSkeletons.length; x++){
            newSkeletons[x] = new Skeleton();
            newSkeletons[x].basicStats();
            newSkeletons[x].weapon();
        }
     
        minusMonsters = (int)Math.floor(Math.random() * (maxMonsters + 1));
        maxMonsters -= minusMonsters;
        monsters[] newZombies = new Zombie[minusMonsters];
        for(int x = 0; x < newZombies.length; x++){
            newZombies[x] = new Zombie();
            newZombies[x].basicStats();
            newZombies[x].weapon();
        }
        
        monsters[] newRats = new Rat[maxMonsters];
        for(int x = 0; x < newRats.length; x++){
            newRats[x] = new Rat();
            newRats[x].basicStats();
            newRats[x].weapon();
        }
        
        
        monsters[] allMonsters = new monsters[newSkeletons.length + newZombies.length + newRats.length];
        System.arraycopy(newSkeletons, 0, allMonsters, 0, newSkeletons.length);
        System.arraycopy(newZombies, 0, allMonsters, newSkeletons.length, newZombies.length);
        System.arraycopy(newRats, 0, allMonsters, newSkeletons.length + newZombies.length, newRats.length);
        return allMonsters;
    }

}

    



    


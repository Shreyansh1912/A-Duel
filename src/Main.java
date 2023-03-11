public class Main {
    public static void main(String[] args){
    Player1 player = new Player1("Raj","AK-47",100);
       System.out.println(player.getName());
       System.out.println(player.getHealth());
       System.out.println(player.getWeapon());

       player.damageByGun1();
       player.damageByGun1();
       player.heal();

        Player2 best = new Player2("rohan", "machine", 80, false);
        best.damageByGun1();
   }

}
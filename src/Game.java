public class Game {

    public static void main(String[] args) {

        Player one = new Player();
        Player two = new Player();


        while(one.score<3&&two.score<3){
            one.randomAttack();
            two.randomAttack();
            Player.battle(one, two);
        }
        }
}

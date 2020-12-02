public class Player {

    public int attack;
    public int score;
    void randomAttack() {
        Random random = new Random();
        random.x = random.getRandomNumber(1, 6)+1;
        attack = random.x;
        //System.out.println(random.x);

    }

    public int getAttack(){
        return attack;
    }

    public static boolean battle(Player one, Player two){
        if(one.getAttack()<two.getAttack()){
            System.out.println("player one attack: " + one.getAttack());
            System.out.println("player two attack: "+ two.getAttack());
            two.score++;
            System.out.println("score for player two " + two.score);
        }if(one.getAttack()>two.getAttack()){
            System.out.println("player one attack: " + one.getAttack());
            System.out.println("player two attack: " +two.getAttack());
            one.score++;
            System.out.println("score for player one " + one.score);
        }
        return false;
    }











/*
        void battle(Random r, Random p) {
            if (r.x < p.x) {
                System.out.println("liczba pierwsza jest mniejsza od liczby drugiej" + r.x + p.x);
            }
            if (r.x > p.x) {
                System.out.println("liczba pierwsza jest wieksza od liczby drugiej" + r.x + p.x);
            }
            if (r.x == p.x) {

                System.out.println("liczby są równe" + r.x + p.x);

            }
        }*/
    }





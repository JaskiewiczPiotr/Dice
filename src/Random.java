public class Random {

        int x;

    public  int getRandomNumber(int min, int max) {
      x =  (int) ((Math.random() * (max - min)) + min);
      return x;
    }







}

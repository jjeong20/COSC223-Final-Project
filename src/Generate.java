import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Generate {
    public Generate(){

    }
    public int[][] normalGen(int num, int size){
        int[][] toReturn = new int[num][size];
        for(int runs = 0; runs < num; ++runs){
            int[] helper = new int[size];
            for(int i = 1; i <= size; ++i){
                helper[i-1] = i;
            }
            shuffleArray(helper);
            for(int i = 0; i < size; ++i){
                toReturn[runs][i] = helper[i];
            }
        }
        return toReturn;
    }
    public int[][] halfGen(int num, int size){
        int[][] toReturn = new int[num][size];
        for(int runs = 0; runs < num; ++runs){
            int[] helper1 = new int[size/2];
            int[] helper2 = new int[size - size/2];
            for(int i = 1; i <= size/2; ++i){
                helper1[i-1] = i;
            }
            for(int i = 1; i <= size - size/2; ++i){
                helper2[i-1] = i + size/2;
            }
            shuffleArray(helper1);
            shuffleArray(helper2);
            for(int i = 0; i < size/2; ++i){
                toReturn[runs][i] = helper1[i];
            }
            for(int i = 0; i < size - size/2; ++i){
                toReturn[runs][i+size/2] = helper2[i];
            }
        }
        return toReturn;
    }
    static void shuffleArray(int[] ar) //https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}

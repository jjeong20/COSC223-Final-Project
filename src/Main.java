import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Generate gen = new Generate();
        SortClass sort = new SortClass();
        int batchSize = 10000;
        for(int i = 100; i<=10000; i+=100){
            int[][] test1 = gen.normalGen(batchSize, i);
            int[][] test2 = test1.clone();
            long timeStartNormal = System.nanoTime();
            for(int j = 0; j < batchSize; j++){
                sort.sort(test1[j],0);
            }
            long timeFinishNormal = System.nanoTime();
            long timeStartRandom = System.nanoTime();
            for(int j = 0; j < batchSize; j++){
                    sort.sort(test2[j],1);

            }
            long timeFinishRandom = System.nanoTime();
            System.out.println(Long.toString(timeFinishNormal - timeStartNormal) + "                    " + Long.toString(timeFinishRandom - timeStartRandom));
        }
        System.out.println("=====================");
        for(int i = 100; i<=10000; i+=100){
            int[][] test1 = gen.halfGen(batchSize, i);
            int[][] test2 = test1.clone();
            long timeStartNormal = System.nanoTime();
            for(int j = 0; j < batchSize; j++){
                sort.sort(test1[j],0);

            }
            long timeFinishNormal = System.nanoTime();
            long timeStartRandom = System.nanoTime();
            for(int j = 0; j < batchSize; j++){
                sort.sort(test2[j],1);
            }
            long timeFinishRandom = System.nanoTime();
            System.out.println(Long.toString(timeFinishNormal - timeStartNormal) + "                    " + Long.toString(timeFinishRandom - timeStartRandom));
        }
        System.out.println("=====================");
    }

}

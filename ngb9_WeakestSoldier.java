import java.util.PriorityQueue;

public class ngb9_WeakestSoldier {
    static int totalSoldier(int sol[]){
        int count=0;
        for(int i=0;i<sol.length;i++){
            if(sol[i]==1){
                count++;
            }
        }
        return count;
    }
    static class Soldier implements Comparable<Soldier> {
        int noOfSoldier;
        int idx;

        public Soldier(int noOfSoldier, int idx) {
            this.noOfSoldier = noOfSoldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Soldier s2) {
            if (this.noOfSoldier == s2.noOfSoldier) {
                return this.idx - s2.idx;
            }
            return this.noOfSoldier - s2.noOfSoldier;
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 0, 0, 0 },
                           { 1, 1, 1, 1 },
                           { 1, 0, 0, 0 },
                           { 1, 0, 0, 0 } };
        PriorityQueue<Soldier> sQueue=new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            sQueue.add(new Soldier(totalSoldier(matrix[i]), i));
        }
        for(int k=0;k<2;k++){
            System.out.println("ROW"+sQueue.remove().idx);
        }
    }
}

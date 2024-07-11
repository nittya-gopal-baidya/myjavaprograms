import java.util.PriorityQueue;

public class ngb7_NearbyCars  {
    static class Point implements Comparable<Point>{
        int x, y, distSq,idx;

        // constructor
        public Point(int x, int y, int distSq,int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.distSq-p2.distSq;
        }

    }

    public static void main(String[] args) {
        int points[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        PriorityQueue<Point> pQueue=new PriorityQueue<>();

        for(int i=0;i<points.length;i++){
            int distSq=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pQueue.add(new Point(points[i][0],points[i][1],distSq,i));
        }
        for(int j=0;j<k;j++){
           // System.out.println("C"+pQueue.peek().idx);
            System.out.println("C"+pQueue.remove().idx);
            
            
        }

    }
}

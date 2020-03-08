import edu.princeton.cs.algs4.Point2D;

public class ex01
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        Point2D[] ps = new Point2D[N];
        for (int i = 0; i < N; i++)
        {
            ps[i] = new Point2D(Math.random(), Math.random());
            ps[i].draw();
        }
        if(N > 1)
        {
            double min = ps[0].distanceTo(ps[1]);
            for (int i = 0; i < N - 1; i++)
                for (int j = i + 1; j < N; j++) {
                    double tmp = ps[i].distanceTo(ps[j]);
                    min = min < tmp ? min : tmp;
                }

            System.out.println("min distance = " + min);
        }
    }
}
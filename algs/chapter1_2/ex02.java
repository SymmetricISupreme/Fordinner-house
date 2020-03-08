import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

public class ex02
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        Interval1D[] g = new Interval1D[N];

        for (int i = 0; i < N; i++) {
            g[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }

        if (N > 2)
        {
            for (int i = 0; i < N - 1; i++)
                for (int j = i + 1; j < N; j++)
                {
                    if (g[i].intersects(g[j]))
                        System.out.println(g[i] + " intersects " + g[j]);
                }
        }
    }
}
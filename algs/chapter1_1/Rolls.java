import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Rolls
{
    public static void main(String[] args)
    {
        int T = Integer.parseInt(args[0]);
        int sides = 6;
        Counter[] rolls = new Counter[sides + 1];
        for (int i = 1; i <= sides; i++)
        {
            rolls[i] = new Counter(i + "'s");
        }

        for (int t = 0; t < T; t++)
        {
            int res = StdRandom.uniform(1, sides + 1);
            rolls[res].increment();
        }

        for (int i = 0; i <= sides; i++)
        {
            StdOut.println(rolls[i]);
        }
    }
}
import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.Shell;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
    public static double time(String arg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (arg.equals("Insertion"))
            Insertion.sort(a);
        if (arg.equals("Selection"))
            Selection.sort(a);
        if (arg.equals("Shell"))
            Shell.sort(a);
        if (arg.equals("Merge"))
            Merge.sort(a);
        if (arg.equals("Quick"))
            Quick.sort(a);
        if (arg.equals("Heap"))
            Heap.sort(a);

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String arg, int N, int T) {
        double total = 0;
        Double[] a = new Double[N];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < N; j++) {
                a[j] = StdRandom.uniform();
            }

            total += time(arg, a);
        }

        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);

        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);

        StdOut.printf("For %d random Doubles\n%s is", N, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2 / t1, alg2);
    }
}
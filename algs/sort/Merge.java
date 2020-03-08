//top down
// public class Merge
// {
//     private static Comparable[] aux;
//     public static void merge(Comparable[] a, int lo, int mid, int hi)
//     {
//         int i = lo, int j = mid + 1;
//         for (int k = lo; j <= hi; k++)
//         {
//             aux[k] = a[k];
//         }

//         for (int k = lo; k <= hi; k++)
//         {
//             if (i > mid) a[k] = aux[j++];
//             else if (j > hi) a[k] = aux[i++];
//             else if (less(aux[i], aux[j])) a[k] = aux[i++];
//             else a[k] = aux[j++];
//         }
//     }

//     public static void sort(Comparable[] a)
//     {
//         aux = new Comparable[a.length];
//         sort(a, 0, a.length - 1);
//     }

//     public static void sort(Comparable[] a, int lo, int hi)
//     {
//         if (hi <= lo)
//             return;
//         int mid = lo + (hi - lo) / 2;
//         sort(a, lo, mid);
//         sort(a, mid + 1, hi);
//         merge(a, lo, mid, hi);
//     }
// }

//bottom up
public class Merge
{
    private static Comparable[] aux;

    public static void merge(Comparable[] a, int lo, int mid, int hi)
    {
        int i = lo, int j = mid + 1;
        for (int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)    a[k] = aux[j++];
            else if (j > hi)    a[k] = aux[i++];
            else if (less(aux[i], aux[j]))  a[k] = a[i++];
            else a[k] = a[j++];
        }
    }

    public static void sort(Comparable[] a)
    {
        int N = a.length;
        aux = new Comparable[a.length];
        for (int sz = 1; sz < N; sz *= 2)
        {
            for (int lo = 0; lo < N -sz; lo += 2 * sz)
            {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }
}
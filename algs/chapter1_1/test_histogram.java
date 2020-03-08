public class test_histogram
{
    public static int[] histogram(int[] a, int M)
    {
        int[] res = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] <= M - 1)
                res[a[i]]++;
        }

        return res;
    }
    
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] res = histogram(a, 9);
        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
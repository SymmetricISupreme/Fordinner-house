public class er19
{
    public static long[] F(int N)
    {
        long[] res = new long[N + 1];
        if (N == 0)
            return res;
        res[1] = 1;
        if (N == 1)
            return res;
        for (int i = 2; i < N + 1; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        long[] res = F(99);
        for (int i = 0; i < res.length; i++)
            System.out.println(i + " " + res[i]);
    }
}
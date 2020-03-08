public class er20
{
    public static double ln(int N)
    {
        if (N == 1)
            return 0;
        return Math.log(N) + ln(N - 1);
    }

    public static void main(String[] args)
    {
        System.out.printf("%.5f\n", ln(100));
    }
}
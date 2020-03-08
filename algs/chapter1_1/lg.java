public class lg
{
    public static int getlg(int n)
    {
        int cnt = 0;
        do
        {
            n >>= 1;
            cnt++;
        } while (n != 0);

        return cnt - 1;
    }

    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        System.out.println(getlg(N));
    }
}
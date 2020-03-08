public class View2DBoolean
{
    public static void printboolean2D(boolean[][] g)
    {
        System.out.print("  ");
        for (int i = 0; i < g[0].length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < g.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < g[0].length; j++) {
                System.out.print(g[i][j] == true ? "* " : "  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        boolean[][] g = { { true, true, false }, { true, false, true }, { false, true, true } };
        printboolean2D(g);
    }
}
//Same exercise with S1_Ex5 I just wrote it again to make sure I understand it.
namespace S1_Ex5._1.MathLib;

public class Calculator
{
    public int Add(int x, int y)
    {
        return x + y;
    }
    
    public int Add(int[] ints)
    {
        var res = 0;
        foreach (var n in ints)
        {
            res += n; // res += n; is the same with res = res + n;
        }

        return res;
    }
}
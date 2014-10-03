package Interpreter;

public class Command
{
    int lineNum;
    String operator;
    int xxx;
    int yyy;
    int zzz;

    public Command(int lineNum, String operator, int xxx, int yyy, int zzz)
    {
        this.lineNum = lineNum;
        this.operator = operator;
        this.xxx = xxx;
        this.yyy = yyy;
        this.zzz = zzz;
    }

    public void printCommand()
    {
        System.out.printf("%d %s %d %d %d%n", lineNum, operator, xxx, yyy, zzz);
    }

    public int getLineNum()
    {
        return lineNum;
    }

    public void setLineNum(int lineNum)
    {
        this.lineNum = lineNum;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public int getXxx()
    {
        return xxx;
    }

    public void setXxx(int xxx)
    {
        this.xxx = xxx;
    }

    public int getYyy()
    {
        return yyy;
    }

    public void setYyy(int yyy)
    {
        this.yyy = yyy;
    }

    public int getZzz()
    {
        return zzz;
    }

    public void setZzz(int zzz)
    {
        this.zzz = zzz;
    }

}

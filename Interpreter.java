package Interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Interpreter
{

    private String text;
    private ArrayList<Command> commands = new ArrayList<Command>();
    // StringTokenizer tokenizer = new StringTokenizer(text, " ");
    int lineNum = 0;
    int delimetercounter = 0;
    private ArrayList<Integer> vars = new ArrayList();

    public void loadCommand() throws IOException
    {

        BufferedReader load = new BufferedReader(new FileReader("input.txt"));
        while (load.ready())
        {
            String line;
            line = load.readLine();
            System.out.println(line);
            if (line == null)
                continue;
            String[] result = line.split("\\s");
            for (int i = 0; i < result.length; i++)
                result[i].trim();
            /*
             * for (int i = 0; i < result.length; i++) {
             * System.out.println(result[i].toString()); }
             */
            addCommand(result);

        }
    }

    public void addCommand(String[] input)
    {

        int line = lineNum;
        String operator = input[0].substring(0, 2);
        // System.out.println(operator);
        int xxx = Integer.parseInt(input[1]);
        int yyy = Integer.parseInt(input[2]);
        int zzz = Integer.parseInt(input[3]);
        Command newCommand = new Command(line, operator, xxx, yyy, zzz);
        commands.add(newCommand);
        lineNum++;

    }

    public void processCommands()
    {
        for (int i = 0; i < commands.size(); i++)
        {
            if (commands.get(i).operator.equals("+9")
                    && commands.get(i).xxx == 999 && commands.get(i).yyy == 999
                    & commands.get(i).zzz == 999)
            {
                delimetercounter++;
            }
            if (delimetercounter == 0)
            {
                vars.add(0);
            }
            if (delimetercounter == 1)
            {
                if (commands.get(i).operator.equals("+8"))
                {
                    vars.get(i) = commands.get()
                }
            }
        }
    }

    public void printArray()
    {
        for (int i = 0; i < commands.size(); i++)
        {
            commands.get(i).printCommand();
        }
    }
}

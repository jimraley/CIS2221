package Interpreter;

import java.io.IOException;

public class Tester
{

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        Tester tester = new Tester();
        Interpreter il = new Interpreter();
        il.loadCommand();
        il.printArray();
    }

}

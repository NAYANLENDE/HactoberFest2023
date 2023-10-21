

import java.io.*;
 
public class markov
{
    static boolean checkMarkov(double m[][])
    {
     
        for (int i = 0; i < m.length; i++) {
 
       
            double sum = 0;
            for (int j = 0; j < m[i].length; j++)
                sum = sum + m[i][j];
 
            if (sum != 1)
               return false;
        }
 
        return true;
    }
 
    public static void main(String args[])
    {
        // Matrix to check
        double m[][] = { { 0, 0, 1 },
                         { 0.5, 0, 0.5 },
                         { 1, 0, 0 } };
 
        // calls the function check()
        if (checkMarkov(m))
            System.out.println(" yes ");
        else
            System.out.println(" no ");
    }
}

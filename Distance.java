package com.bridgelabz.FunctionalProgram;

import java.lang.Math.*;
import java.util.Scanner.*;


public class Distance {

    public static void main(String[] args)

    {
        int x1,x2,y1,y2;

        double Result;

        x1=Integer.parseInt(args[0]);

        y1=Integer.parseInt(args[1]);

        x2=Integer.parseInt(args[2]);

        y2=Integer.parseInt(args[3]);

        Result=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+Result);

    }
}


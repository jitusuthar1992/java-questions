package exceptions;

import java.io.*;
class N{
    void method()throws IOException{
        System.out.println("device operation performed");
    }
}
class Testthrows3{
    public static void main(String args[])throws IOException{//declare exception
        N m=new N();
        m.method();

        System.out.println("normal flow...");
    }
}

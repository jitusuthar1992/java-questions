package exceptions;

import java.io.IOException;

//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
public  class TestCheckException {
   /* void m(){
        throw new IOException("device error");//checked exception
    }*/
    void n(){
        //m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        TestCheckException obj=new TestCheckException();
        obj.p();
        System.out.println("normal flow");
    }
}

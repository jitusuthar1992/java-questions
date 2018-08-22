package exceptions;

//Rule: By default Unchecked Exceptions are forwarded in calling chain (propagated).
public class TestUnCheckException {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        TestUnCheckException obj=new TestUnCheckException();
        obj.p();
        System.out.println("normal flow...");
    }
}

public class NumberCache {
    public static void main(String args[]) {
        Integer b2=128;
        Integer b3=128;
        System.out.println(b2==b3);

        Integer b4=127;
        Integer b5=127;
        System.out.println(b4==b5);
    }
}

    /*This actually where it gets interesting,
    if you look into the Integer.java class ,
        you will find that there is a inner private class,
        IntegerCache.java that caches all Integer objects between -128 and 127.
*/
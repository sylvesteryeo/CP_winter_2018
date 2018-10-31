package pl.waw.sgh;

public class Blocks {

    static final String MY_CONSTANT = "some text";

    public static void main(String[] args) {
        int i1 = 0;
        System.out.println(MY_CONSTANT);
        {
            System.out.println("inside a block i1= " + i1);
            int i2 = 5;
            System.out.println("inside a block i2= " + i2);
        }
        System.out.println("outside the block i1=" + i1);
        //System.out.println("outside the block i2=" + i2 );
    }
}

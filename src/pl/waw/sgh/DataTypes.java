package pl.waw.sgh;

public class DataTypes {

    //can type psvm to get the code of line below
    public static void main(String[] args) {
        byte b1 = 15;
        byte b2 = 120;

        long i1 = 1345353553;
        int i2 = 985245454;
        int i3 = (int) (i1 + i2);

        int a = 5;
        int b, bb;
        b = a++;
        bb = ++a;

        double d1 = 2;
        double d2 = 3;

        double d3 = Math.pow(d1, d2);
        //sout
        System.out.println("d3:" + d3);


        int ii1, ii2;
        ii1 = 3;
        ii2 = 4;
        boolean cond = ii1 == ii2;


        if (ii1 == ii2) {
            System.out.println("ii1 == ii2");
        } else {
            System.out.println("ii1 is not equal to ii2");
        }

        if (cond || (ii1 >= ii2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}

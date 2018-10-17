package pl.waw.sgh;

public class DoublesFloat {

    public static void main(String[] args) {
        Double d1 = 3223535d;
        Double d2 = 3423535d;

        System.out.println(d1 * d2);

        double d2 = 35135;
        float f2 = 564654;

        float f1 = d1.floatValue();
        d1.intValue();

        //convert primitive to object
        Double d3 = Double.valueOf(d2);
    }
}

package pl.waw.sgh;

public class ExceptionExamples {

    public static void main(String[] args) {

        try {
            throw new RuntimeException("My Exception");
        } catch (Exception e) {
            System.out.println("Problem: " + e.getMessage());
        }

    }
}

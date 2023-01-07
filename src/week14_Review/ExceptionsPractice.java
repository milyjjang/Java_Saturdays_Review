package week14_Review;

public class ExceptionsPractice {

    public static void main(String[] args) {

        /*
        try {
            throw new InterruptedException();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
         */

        try {
            Thread.sleep(3000);
            System.out.println("Try Block");
        } catch (InterruptedException e){
            System.out.println("Catch Block");
            e.printStackTrace();
        }
    }

    public static void sleep (int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

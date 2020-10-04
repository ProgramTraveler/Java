import java.util.Random;

public class homework1 {
    public static void main(String[] arge){
        String[] color={"Clubs","Diamonds","Hearts","Spades"};
        String[] nums={"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        Random r=new Random();
        int c=r.nextInt(4);
        int n=r.nextInt(13);
        System.out.println("The card you picked is "+nums[n]+" of "+color[c]);


    }
}

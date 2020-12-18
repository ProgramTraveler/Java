package ThirdQuestion;

import java.util.Scanner;

public class Screen {
    public static void main(String[] arge){

        Scanner s=new Scanner(new TestRead());


        System.out.println("ReadStart");
        while(s.hasNext()){
            //hasNext()方法会调用read()
            System.out.println("从cb读出"+s.next());
        }
        System.out.println("ReadEnd");
    }
}

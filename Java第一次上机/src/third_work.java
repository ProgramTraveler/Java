import java.util.Scanner;

public class third_work {
    public static void main(String[] arge)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("please input your height(m)");
        double height=sc.nextDouble();

        System.out.println("please input your weight(kg)");
        double weight=sc.nextDouble();

        double BMI=weight/(height*height);

        if(BMI < 18.5)
            System.out.println("您的体重偏瘦！");
        else if(BMI >= 18.5 && BMI < 25.0)
            System.out.println("您的体重正常！");
        else if(BMI >= 25.0 && BMI < 28.0)
            System.out.println("您的体重偏胖！");
        else if(BMI >= 28.0)
            System.out.println("您的体重肥胖！");
    }
}

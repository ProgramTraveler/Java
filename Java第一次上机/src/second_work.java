import java.util.Scanner;
import java.text.DecimalFormat;
public class second_work {
    public static void main(String[] arge)
    {
        //float值和double值的输入，计算它们的和，并保留两位小数
        Scanner in=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("please input a float number");
        float a=in.nextFloat();
        //System.out.println(a);

        System.out.println("please input a double number");
        double b=in.nextDouble();

        System.out.println(df.format(a+b));

        //接收一个1~10的数，计算它的阶乘
        System.out.println("please input a int number");
        int c=in.nextInt();

        while (c>10 ||c<0)
        {
            System.out.println("error number,input the number again");
            c=in.nextInt();
        }
        int c_temp=c;

        int temp1=1;
        while(c>0)
        {
            temp1*=c;
            //System.out.println("temp"+temp);
            c--;
        }

        System.out.println(temp1);
        //System.out.println(c);

        //输入整数n，计算输入的那个数的n次方
        System.out.println("please input the n");
        int n=in.nextInt();

        int temp2=1;
        for(int i=0;i<n;i++)
        {
            temp2*=c_temp;
        }
        System.out.println(temp2);

    }
}

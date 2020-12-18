import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Window extends JFrame {
    //设置不同的图形按钮
    private JButton button1=new JButton("圆形");
    private JButton button2=new JButton("三角形");
    private JButton button3=new JButton("多边形");
    private JButton button4=new JButton("矩形");


    public Window(){
        //设置窗口标题
        this.setTitle("this is a screen");
        //设置窗口大小
        this.setSize(500,500);
        //设置窗口位置
        this.setLocation(500,200);
        //设置窗体可见，因为JFrame最初创建的是一个不可见的窗口
        this.setVisible(true);
        //设置窗口退出，如果不设置这个的话，在关闭窗口后，程序好像不会停止
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //设置布局管理器
        setLayout(new FlowLayout());
        //添加按钮
        add(button1);
        add(button2);
        add(button3);
        add(button4);


        //向圆形按钮添加一个动作监管器
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                /*JFrame jf=new JFrame();
                jf.setLayout(null);
                jf.setTitle("输入窗口");
                JLabel jb1=new JLabel();
                //jf.setVisible(true);
                jb1.setText("输入半径");
                jb1.setBounds(25,25,200,200);
                JLabel jb2=new JLabel();
                jb2.setText("半径");
                jb2.setBounds(0,70,50,20);
                JTextField TextJb2=new JTextField();
                TextJb2.setBounds(50,70,70,20);

                jf.add(jb2);
                jf.add(TextJb2);
                jf.add(jb1);


                jf.setBounds(300,250,300,200);
                jf.setVisible(true);
                jf.setSize(200,300);
                jf.setLocationRelativeTo(null);
                jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);*/

                //输入圆形半径
                Scanner in=new Scanner(System.in);
                System.out.println("Input the radius");
                double ra=in.nextDouble();

                //对异常的处理，如果半径为负，则抛出异常
                try{
                    //circle.girth();
                    CircleDemo circle=new CircleDemo(ra);
                    JOptionPane.showMessageDialog(null,"圆形周长是"+circle.girth());
                } catch (ArithmeticException i) {
                    JOptionPane.showMessageDialog(null,i.toString());;
                }
                //JOptionPane.showMessageDialog(null,"圆形周长是"+circle.girth());
            }
        });

        //add(button1);
        //add(textFile);

        //向三角形按钮添加一个动作监管器
        button2.addActionListener(new ActionListener() {
            /*Label len1=new Label("第一条边");
            Label len2=new Label("第二条边");
            Label len3=new Label("第三条边");
            Label girth=new Label("三角形周长");*/
            @Override
            public void actionPerformed(ActionEvent e) {
                //输入三角形的三条边
                Scanner in=new Scanner(System.in);
                System.out.println("Input the first length");
                double l1=in.nextDouble();
                System.out.println("Input the second length");
                double l2=in.nextDouble();
                System.out.println("Input the third length");
                double l3=in.nextDouble();
                //对异常的处理，如果不能构成三角形，就抛出异常
                try{
                    TriangleDemo triangle=new TriangleDemo(l1,l2,l3);
                    JOptionPane.showMessageDialog(null,"三角形周长是"+triangle.girth());
                }catch (ArithmeticException i){
                    JOptionPane.showMessageDialog(null,i.toString());
                }

                //TriangleDemo triangle=new TriangleDemo(l1,l2,l3);
                //JOptionPane.showMessageDialog(null,"三角形周长是"+triangle.girth());

            }
        });
        //add(button2);

        //对多边形按钮设置一个监管器
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //输入多边形的边数
                Scanner in=new Scanner(System.in);
                System.out.println("input the count");
                int count=in.nextInt();

                //输入多边形每条边的长度
                System.out.println("input the num");
                double len[]=new double[100];
                Scanner x=new Scanner(System.in);
                for(int i=0;i<count;i++){

                    len[i]=x.nextDouble();
                }
                //对异常的处理，如果输入的边长数为负，则抛出异常
                try{
                    PolygonDemo polygon=new PolygonDemo(count,len);
                    JOptionPane.showMessageDialog(null,"多边形周长是"+polygon.girth());
                }catch (ArithmeticException i){
                    JOptionPane.showMessageDialog(null,i.toString());
                }
                //PolygonDemo polygon=new PolygonDemo(count,len);
                //JOptionPane.showMessageDialog(null,"多边形周长是"+polygon.girth());
            }
        });
        //add(button3);

        //对矩形按钮的处理
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //输入长和宽
                Scanner in=new Scanner(System.in);
                System.out.println("Input the length");
                double len=in.nextDouble();
                System.out.println("Input the wide");
                double wide=in.nextDouble();

                //对异常的处理，如果长和宽任意一个为负，则抛出异常
                try{
                    RectangleDemo rec=new RectangleDemo(len,wide);
                    JOptionPane.showMessageDialog(null,"矩形周长是"+rec.girth());
                }catch (ArithmeticException i){
                    JOptionPane.showMessageDialog(null,i.toString());
                }
            }
        });
    }
}

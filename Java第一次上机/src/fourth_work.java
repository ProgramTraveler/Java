
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fourth_work {
    public static void main(String[] arge)
    {
        String s0="aabbb";
        String s1="aa";
        String s2="bbb";
        String s3=s1+s2;

        System.out.println("string:");
        System.out.println(s3==s0); //编译的时候不知道变量里存的是什么，所以没办法在编译的时候进行优化
        System.out.println(s3.equals(s0));

        StringBuffer s00=new StringBuffer("aabbb");
        StringBuffer s11=new StringBuffer(s00);

        System.out.println("StringBuffer:");
        //因为StringBuffer中没有对equals函数重写，里面相当于是判断变量==变量，即判断是否指向同一个地址，这个时候要比较值是否相等可以转换为String类型。
        System.out.println(s11==s00);
        System.out.println(s11.equals(s00));

        StringBuilder s000=new StringBuilder("aabbb");
        StringBuilder s111=new StringBuilder(s000);

        System.out.println("StringBuilder:");
        //当我们使用StringBuilder创建对象时，肯定会在内存中开辟一个新的专属的地址用于存放对象内容，但是即使StringBuilder中存放的内容与其他字符串的内容相同，使用equals来判断也是返回false，这是因为StringBuilder并没有重写equals函数
        System.out.println(s111==s000);
        System.out.println(s111.equals(s000));

        String str0="";
        StringBuilder str00=new StringBuilder("");
        StringBuffer str000=new StringBuffer("");

        System.out.println("string:");
        System.out.println(str0==null);
        System.out.println(str0.isEmpty());

        System.out.println("StringBuilder:");
        System.out.println(str00!=null&&str00.length()>0);

        System.out.println("StringBuffer:");
        System.out.println(str000.toString()==null);

        //StringUtils strutls1=new StringUtils("123");
        //System.out.println(strutls1);


    }
}

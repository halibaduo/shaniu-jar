//import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Welcome {
    void welcome() throws IOException, URISyntaxException, InterruptedException {
//        System.out.println("Welcome come!");
        ImageIcon icon0 = new ImageIcon("img/welcome.jpg");
        ImageIcon icon1 = new ImageIcon("img/info.jpg");
        Object[] possibleValues = {"确定", "取消"};
        int response = JOptionPane.showConfirmDialog(null,
                                        "欢迎进入傻妞激活系统",
                                            "激活",
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.INFORMATION_MESSAGE,
                                            icon0);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                                            "华人牌2060款手机傻妞为您服务~",
                                            "coming",
                                            JOptionPane.INFORMATION_MESSAGE,
                                            icon1);
            int flag0 = 0;
            int psdnum = 0;
            do {
                // 等待输入开机密码
                Password password = new Password();
//            Scanner reader = new Scanner(System.in);
                String psd = JOptionPane.showInputDialog(null,
                        "请输入开机密码",
                        "请输入");
                if (psd.equals("我爱你")) {
                    System.out.println("密码正确");
                    flag0 = 1;
                    psdnum = 0; // 归零
                } else {
                    System.out.println("==== 对不起 密码错误 ====");
                    psdnum++;
                    if (psdnum == 10) {
                        System.out.println("你已输入错误密码十次,系统已锁定,请勿再操作~");
                        System.exit(-1); // 结束所有操作
                    }
                }
            }while(flag0 == 0);
            Expression expression = new Expression();
            expression.expression();
            StartDo do1 = new StartDo();
            do1.doIt();
        }
        else if(response == JOptionPane.NO_OPTION) {
            System.out.println("即将为您退出激活系统~");
        }
    }
}

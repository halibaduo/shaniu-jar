import javax.swing.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StartDo {
    ImageIcon icon = new ImageIcon("img/info.jpg");
    void doIt() throws IOException, URISyntaxException, InterruptedException {
        int response = JOptionPane.showConfirmDialog(null
                                            ,"请问您需要傻妞告诉你些什么吗？"
                                            ,"疑问"
                                            ,JOptionPane.YES_NO_OPTION
                                            ,JOptionPane.INFORMATION_MESSAGE
                                            ,icon);

        if (response == JOptionPane.YES_OPTION) {
            System.out.println("已为你打开百度,自己去搜哦~干嘛,你以为我会呀？");
            Thread.sleep(2000);
            java.net.URI uri = new URL("https://www.baidu.com").toURI();
            java.awt.Desktop.getDesktop().browse(uri);
        } else if (response == JOptionPane.NO_OPTION) {
            int flag = 0;
            do {
                try {
                    System.out.println("主人~请从以下选项中选择功能:");
                    menu();
                    Scanner reader = new Scanner(System.in);
                    int answer = reader.nextInt();
                    if (answer == 1) {
                        Password psd = new Password();
                        System.out.println("当前密码为:" + psd.getPassword());
                        System.out.print("请输入修改后的开机密码:");
                        String password = reader.next();  // 注意此处不能使用nextLine()会读取到回车键
                        psd.setPassword(password);
                        System.out.println("success~");
                    } else if (answer == 2) {
                        Password psd = new Password();
                        System.out.println("当前密码为:"+psd.getPassword());
                    } else if (answer == 3) {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        System.out.println("中国北京当前时间为:"+sdf.format(System.currentTimeMillis()));
                    } else if (answer == 4) {
                        System.exit(-1);
                    } else if(answer == 5) {
                        flag = 1;
                    } else {
                        System.out.println("输入有误,请重新输入 休眠2秒");
                        Thread.sleep(2000);
                        clean(); // bug:暂且清屏功能未能实现
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while(flag == 0);
            System.out.println("byebye");
        }
    }
    void menu() {
        System.out.println("=============================");
        System.out.println("1.修改开机密码        2.查看开机密码");
        System.out.println("3.查看当前时间        4.结束");
        System.out.println("5.退出");
        System.out.println("=============================");
        System.out.print("请输入选择:");
    }
    void clean() {
        try {
            String os = System.getProperty("os.name");
            if(os.contains("windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033c");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

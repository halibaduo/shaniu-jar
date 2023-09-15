import javax.swing.*;

public class Expression {
    ImageIcon icon0 = new ImageIcon("img/傻.png");
    ImageIcon icon1 = new ImageIcon("img/愁.png");
    ImageIcon icon2 = new ImageIcon("img/坏.png");
    ImageIcon icon3 = new ImageIcon("img/酷.png");
    ImageIcon icon4 = new ImageIcon("img/喜.jpg");
    ImageIcon icon5 = new ImageIcon("img/羞.png");
    ImageIcon icon6 = new ImageIcon("img/乐.png");
    ImageIcon icon7 = new ImageIcon("img/哀.png");
    ImageIcon icon8 = new ImageIcon("img/怒.jpg");
    ImageIcon icon9 = new ImageIcon("img/乖.png");

    void expression() {
        Object[] possibleValues = {"傻", "愁", "坏", "酷", "喜", "羞", "乐", "哀", "怒", "乖"};
        Object selectValue = JOptionPane.showInputDialog(null,
                                        "请选择表情",
                                        "emotion",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null,
                                        possibleValues,
                                        possibleValues[2]);
        String str = (String)selectValue;
        if (str.equals("傻")) {
            JOptionPane.showMessageDialog(null
                                        ,"嘿嘿嘿,很高兴为你服务,嘿嘿嘿~"
                                        ,".-."
                                        ,JOptionPane.INFORMATION_MESSAGE
                                        ,icon0);
        }
        if (str.equals("愁")) {
            JOptionPane.showMessageDialog(null
                    ,"ε=(?ο｀*)))唉,很……为你服务，唉~"
                    ,"?_?"
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon1);
        }
        if (str.equals("坏")) {
            JOptionPane.showMessageDialog(null
                    ,"肌肉不错嘛,给我看看你的肌肉~"
                    ,"(*/ω＼*)"
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon2);
        }
        if (str.equals("酷")) {
            JOptionPane.showMessageDialog(null
                    ,"so,你要我干嘛~"
                    ,"φ(*￣0￣)"
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon3);
        }
        if (str.equals("喜")) {
            JOptionPane.showMessageDialog(null
                    ,"哎呦喂,你干嘛~"
                    ,"o(≧▽≦)o"
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon4);
        }
        if (str.equals("羞")) {
            JOptionPane.showMessageDialog(null
                    ,"你好，那个，你叫…人家~有什么事？"
                    ,"(???`?)"
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon5);
        }
        if (str.equals("乐")) {
            JOptionPane.showMessageDialog(null
                    ,"what`s your problem？ bro~"
                    ,"<(￣︶￣)↗[GO!]"
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon6);
        }
        if (str.equals("哀")) {
            JOptionPane.showMessageDialog(null
                    ,"嘤嘤嘤,有咩事吗~"
                    ,"o(*￣▽￣*)ブ"
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon7);
        }
        if (str.equals("怒")) {
            JOptionPane.showMessageDialog(null
                    ,"干嘛，你叫我出来干嘛，说啊！！！"
                    ,""
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon8);
        }
        if (str.equals("乖")) {
            JOptionPane.showMessageDialog(null
                    ,"哥哥好~叫我有什么事吗？"
                    ,"(づ￣ 3￣)づ"
                    ,JOptionPane.INFORMATION_MESSAGE
                    ,icon9);
        }
    }
}

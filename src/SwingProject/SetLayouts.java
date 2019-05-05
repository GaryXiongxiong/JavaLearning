package SwingProject;

import java.awt.*;
import javax.swing.*;
public class SetLayouts{
    public static void borderLayout(String title){//borderLayout测试
        JFrame jf1 = new JFrame(title);
        Container ct1 = jf1.getContentPane();
        ct1.setLayout(new BorderLayout());
        ct1.add(BorderLayout.NORTH, new JButton("North"));
        ct1.add(BorderLayout.EAST, new JButton("East"));
        ct1.add(BorderLayout.SOUTH, new JButton("South"));
        ct1.add(BorderLayout.WEST, new JButton("West"));
        // ct1.add(BorderLayout.BEFORE_FIRST_LINE, new Button("Before First Line"));
        ct1.add(BorderLayout.CENTER, new JButton("Center"));
        jf1.setSize(300, 200);
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void gridBagLayout(String title){//Grid Bag Layout 测试
        JFrame jf2 = new JFrame(title);
        Container ct2 = jf2.getContentPane();
        ct2.setLayout(new GridBagLayout());
        GridBagConstraints grid1 = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0);
        GridBagConstraints grid2 = new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0);
        GridBagConstraints grid4 = new GridBagConstraints(2, 0, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0);
        GridBagConstraints grid3 = new GridBagConstraints(0, 1, 3, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0);
        GridBagConstraints grid5 = new GridBagConstraints(3, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0);

        ct2.add(new JButton("grid1"),grid1);
        ct2.add(new JButton("grid2"),grid2);
        ct2.add(new JButton("grid3"),grid3);
        ct2.add(new JButton("grid4"),grid4);
        ct2.add(new JButton("grid5"),grid5);
        jf2.setSize(500,400);
        jf2.setVisible(true);
        jf2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void panelAndScrollPane(String title){//Jpanel与JScrollpane
        JFrame jf3 = new JFrame(title);
        Container ct3 = jf3.getContentPane();
        ct3.setLayout(new GridLayout(1,2,10,10));//设置面板布局，1行2列
        JPanel p1 = new JPanel(new GridLayout(2, 1,5,5));//创建JPanel面板，2行1列
        JTextArea ta = new JTextArea(20, 50);//创建文本框，20*50
        JScrollPane sp = new JScrollPane(ta);//创建滚动面板，内容为刚才创建的文本框
        p1.add(new JButton("Button1"));//将内容加入JPanel面板
        p1.add(new JButton("Button2"));
        ct3.add(p1);//向内容面板加入p1
        ct3.add(sp);//加入滚动面板
        jf3.setSize(400,300);
        jf3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf3.setVisible(true);
    }
    public static void main(String[] args) {
        borderLayout("BorderLayout");
        gridBagLayout("Grid Bag Layout");
        panelAndScrollPane("Panel and Scroll Pane");
    }
}
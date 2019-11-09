import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//ActionEvent来自这里

class MyJDialog extends JDialog{//弹窗，继承JDialog类
    public MyJDialog(MessageWindow frame, String massage){//构造函数，定义弹出窗口
        super(frame,"MyJDialog",true);//调用父类JDialog的构造函数
        Container container = getContentPane();//初始化内容面板
        container.add(new JLabel(massage));//为内容面板加入内容
        setBounds(120, 120, 100, 100);//设置弹窗尺寸
        setVisible(true);//设置弹窗可见性
    }
}

public class MessageWindow extends JFrame{//主体窗口，继承JFrame类
    public static void main(String[] args) {
        new MessageWindow();//创建主窗口
    }

    public MessageWindow(){//定义主窗口的构造函数
        this.setTitle("JFrame-MessageWindow");//设置窗口title
        this.setBounds(20, 20, 500, 400);//设置窗口大小
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭按钮动作
        Container containner1 = this.getContentPane();//初始化内容面板
        containner1.setLayout(new FlowLayout(FlowLayout.LEADING));//定义内容面板的内容排布方式，参数为LayoutManager对像，构造时可定义参数
        JLabel jl1 = new JLabel("JLabel-jl1");//创建标签
        containner1.add(jl1);//将标签加入内容面板
        JButton bt1 = new JButton("JButton-bt1");//创建按钮
        bt1.setBounds(10,10,100,21);//设置按钮大小
        bt1.addActionListener(new ActionListener(){//给按钮添加ActionListener，参数为新建的ActionListenner接口的匿名类
            @Override
            public void actionPerformed(ActionEvent event){//在类中实现接口的actionPerformed函数
                new MyJDialog(MessageWindow.this,event.getActionCommand());//创建弹窗对象，把弹窗的父窗体作为参数
            }
        });
        containner1.add(bt1);//添加按钮
        this.setVisible(true);//设置窗体可见
    }
}
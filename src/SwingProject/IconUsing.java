package SwingProject;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

class MyIcon implements Icon{//Myicon类实现Icon接口，其中包括3个必须实现的函数
    private int width;
    private int height;
    @Override
    public int getIconWidth(){//获取宽度
        return this.width;
    }
    @Override
    public int getIconHeight(){//获取高度
        return this.height;
    }
    @Override
    public void paintIcon(Component cpn1, Graphics gra1, int x, int y){//icon绘制方法
        gra1.fillRect(x, y, width, height);//fillRect填充正方形
    }
    public MyIcon(int width, int height){//构造函数，定义好大小
        this.width = width;
        this.height = height;
    }
}
public class IconUsing{
    public static void main(String[] args) {
        JFrame jf1 = new JFrame();
        MyIcon ico1 = new MyIcon(20,20);//构造一个MyIcon类型的icon，其中是一个方形，见MyIcon类的paintIcon方法
        JLabel jl1 = new JLabel("Icon in a Label",ico1,SwingConstants.CENTER);//包含ico1的label
        JButton jb1 = new JButton("Icon in a Button", ico1);//包含ico1的button
        Container container = jf1.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jl1);
        container.add(jb1);
        Icon ico2 = new ImageIcon(IconUsing.class.getResource("icon.jpg"));//设置ico2，为ImageIcon，并设定图片路径。其中getResource方法可以获取资源文件的URL路径
        container.add(new JLabel("Image Icon", ico2, SwingConstants.CENTER));//加入含有ico2的label
        jf1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf1.setBounds(120, 120, 500, 400);
        jf1.setTitle("IconUsing");
        jf1.setVisible(true);       
    }

}
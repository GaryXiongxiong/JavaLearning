import java.awt.*;
import javax.swing.*;
public class FirstSwingProject extends JFrame{//主类继承JFrame类，则不需要在类中new JFrame？

    private static final long serialVersionUID = 1L;

    public void initializeJFrame(String title) {// 初始化窗体方法
        // JFrame jf1 = new JFrame(title);//创建一个JFrame对象，因为所在类继承了JFrame，所以可以直接用this进行窗口初始化？
        this.setTitle(title);
        Container container = this.getContentPane();
        JLabel jl = new JLabel("JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(jl);
        container.setBackground(Color.WHITE);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//EXIT_ON_CLOSE-点击退出关闭程序，关闭所有窗口，DISPOSE_ON_CLOSE,关闭当前窗口
    }
    public static void main(String[] args) {
        new FirstSwingProject().initializeJFrame("Window1");
        new FirstSwingProject().initializeJFrame("Window2");
    }
}
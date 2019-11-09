import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StringEditor extends JFrame {
    public StringEditor(){
        this.setTitle("String Editor");
        this.setBounds(120,120,400,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container c = this.getContentPane();
        JButton read = new JButton("Read");
        JButton write = new JButton("Write");
        JTextArea content = new JTextArea(50,50);
        JScrollPane sp = new JScrollPane(content);
        c.setLayout(new FlowLayout());
        c.add(read);
        c.add(write);
        c.add(sp);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        StringEditor se1 = new StringEditor();
    }
}

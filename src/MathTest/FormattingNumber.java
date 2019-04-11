package MathTest;
import java.text.DecimalFormat;
public class FormattingNumber {
    public static void main(String[] args) {
        DecimalFormat form1 = new DecimalFormat("###,###.###");//,分组符合，.小数点，#定义数字位数
        DecimalFormat form2 = new DecimalFormat();
        form2.applyPattern("000.###%");//百分号为显示为百分数模式，值不变,0也表示位数，但是在没有数时补0
        System.out.println(form1.format(11345.5626));
        System.out.println(form2.format(0.6345));
        form2.applyPattern("-##,##.###\u2030");//负号为显示为负数，值也变为负的，\u2030为千分号，变为千分格式，值不变
        System.out.println(form2.format(123.563567));
        form2.applyPattern("###,###.##\u00A4");//\u00A4，显示为货币格式
        System.out.println(form2.format(19888.879));
    }
}

import javax.swing.*;

public class main {
    public static void main(String[] args) throws Exception {

        String x1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        String x2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
        String x3 = JOptionPane.showInputDialog("Ingrese el tercer numero");
        float suma = Float.parseFloat(x1) + Float.parseFloat(x2) + Float.parseFloat(x3);
        System.out.println("El promedio es: " + suma / 3);
}
}

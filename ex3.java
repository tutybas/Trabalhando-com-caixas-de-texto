
package caixas.de.texrto;

import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
        Double pre, nov;
        String A = JOptionPane.showInputDialog("Digite O valor do produto:");
        pre = Double.parseDouble(A);
        if(pre<20){
            nov = pre * 1.45;
        }
        else{
            nov = pre * 1.30;
        }
        String msg = String.format("O valor foi alterado para %.2f", nov);
        JOptionPane.showMessageDialog(null,msg,"Valor auterado",1);
    }

}
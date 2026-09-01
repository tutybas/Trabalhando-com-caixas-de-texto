package caixas.de.texrto;

import javax.swing.JOptionPane;
    
public class ex1 {
    public static void main(String[] args) {
        int num;
        String A = JOptionPane.showInputDialog("Digite um numero");
        num = Integer.parseInt(A);
        if(num%3 == 0){
            JOptionPane.showMessageDialog(null,"O seu numero é divisivel por 3","é divisivel",2);   
        }
        else{
            JOptionPane.showMessageDialog(null,"O seu numero não é divisivel por 3","não é divisivel",0);
        }

    }
    
}

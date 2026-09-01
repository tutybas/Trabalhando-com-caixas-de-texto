
package caixas.de.texrto;

import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        int num1,num2,num3;
        int pos1=0,pos2=0,pos3=0;
        String A = JOptionPane.showInputDialog("Digite um numero");
        num1 = Integer.parseInt(A);
        String B = JOptionPane.showInputDialog("Digite outro numero");
        num2 = Integer.parseInt(B);
        String C = JOptionPane.showInputDialog("Digite só mais um numero");
        num3 = Integer.parseInt(C);
// se num 1 é o maior
        if(num1>num2 && num1>num3){
            if(num2>num3){
                pos1 = num1;
                pos2 = num2;
                pos3 = num3;
            }
            else{
                pos1 = num1;
                pos2 = num3;
                pos3 = num2;
            }
        }
// se num 2 é o maior
        if(num2>num1 && num2>num3){
            if(num1>num3){
                pos1 = num2;
                pos2 = num1;
                pos3 = num3;
            }
            else{
                pos1 = num2;
                pos2 = num3;
                pos3 = num1;
            }
        }
// se num 3 é o maior
        if(num3>num2 && num3>num1){
            if(num2>num1){
                pos1 = num3;
                pos2 = num2;
                pos3 = num1;
            }
            else{
                pos1 = num3;
                pos2 = num1;
                pos3 = num2;
            }
        }

// não consegui colocar menos if e else do que isso. :)
System.out.printf("%d %d %d",pos3,pos2,pos1);
    }
}

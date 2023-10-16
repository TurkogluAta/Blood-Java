/*
 * BloodApp.java
 * @author: Ata Turkoglu
 * Date: 07/03/2023
 */

import javax.swing.JOptionPane;
public class BloodApp{
    public static void main(String args[]){
        //Declare variables
        String blood, donate, receive;
        int age;

        //Declare object
        Blood myBlood;

        //Create object
        myBlood = new Blood();

        //Input
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
        myBlood.setAge(age);

        blood = JOptionPane.showInputDialog(null,"Enter your blood type");
        myBlood.setBlood(blood);

        //Process
        myBlood.compute();

        //Output
        donate = myBlood.getDonate();
        JOptionPane.showMessageDialog(null,donate);
        receive = myBlood.getReceive();
        JOptionPane.showMessageDialog(null,receive);
    }
}
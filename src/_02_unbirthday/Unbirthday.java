package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday{ 
	public static void main(String[] args) {
		String name= JOptionPane.showInputDialog("when is your birthday?");
		String Birthday= JOptionPane.showInputDialog("when is your mm/dd?");	
	   
if (Birthday.equals ("01/21/20")){
	JOptionPane.showMessageDialog(null, "happy birthday");

}else{
	JOptionPane.showMessageDialog(null,"happy unbirthday");
}
		
		
	
} 
	}

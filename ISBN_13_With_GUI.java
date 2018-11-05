//Author:lasisi Akeem Adeshina (IntegralCalculus)

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ISBN_13_With_GUI {
	

		public static void main(String[] args) {
			//declaration of variables 
			
			long sum, counter, sumCheck,d13;
			Scanner in=new Scanner(System.in);//creating a scanner objec
			
			String msg3=String.format("This program validates your ISBN-13 inputs");
			JOptionPane.showMessageDialog(null, msg3);
			
			String bNum=JOptionPane.showInputDialog("Enter the first 12-digits of the ISBN-13:");
			
			String holdNum=bNum;
			long digits=Long.parseLong(bNum);//converting the String to user's entered into an long value
			
			sum=0; counter=1;//initializing sum and counter
			
			while(digits>0){
				long rMod=digits%10;
				if(counter%2!=0){
					sum=sum+(3*rMod);
				}
				else if(counter%2==0){
					sum=sum+(rMod);
				}
				digits=digits/10;
				counter++;
			}//end of while loop
			if (counter<13){
				JOptionPane.showMessageDialog(null,"Invalid input you have made");
			}
			
			
			d13=10-(sum%10);//sumCheck of the calculation
			
			sumCheck=d13;
			
			if(d13!=10 & counter==13){
				String msg=String.format("ISBN-13 of your input %s is %s%s",holdNum,holdNum,d13);
				JOptionPane.showMessageDialog(null,msg);
			}
			
			if(d13==10 & counter==13){
				d13=0;//reinitializing the sumCheck when the condition is true
				String msg2=String.format("ISBN-13 of your input %s is (%s%s)",holdNum,holdNum,d13);
				JOptionPane.showMessageDialog(null,msg2);
				
			}
			
			

		}

	}



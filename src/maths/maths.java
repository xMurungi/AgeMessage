package maths;

import javax.swing.JOptionPane;

import java.util.Random;

public class maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random= new Random();
		int age = random.nextInt(100);
		
		//if statements
		 
		if(age>=75) {
			JOptionPane.showMessageDialog(null, "You are " +age+" year old.You have lived long.");
		}
		else if(age>=13 && age <=19) {
			JOptionPane.showMessageDialog(null, "You are " +age+" year old.You are a teenager.");
		}
		else if (age>=20 && age <=74) {
			JOptionPane.showMessageDialog(null, "You are " +age+" year old. You are an adult.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are " +age+" year old. May you have a rich life.");
		}
	}

}

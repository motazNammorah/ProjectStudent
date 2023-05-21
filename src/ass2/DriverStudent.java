/// NAME:MOTAZ NAMMORA.
/// ID:1193288.
/// SEC:(7).
package ass2;
import java.util.Scanner;

import java.util.Date;
public class DriverStudent {

	public static void main(String[] args) {// the beginning of the main method
		
		Scanner input =new Scanner (System.in);
		int numberOfClass,numberOfStudent;
		
		System.out.print("PLEASE ENTER THE NUMBER OF CLASS:");//print number of class.
		numberOfClass=input.nextInt();
		Student [][]Array=new Student [numberOfClass][];//array 2D 
		float [][]GradeOfStud=new float[numberOfClass][];
		for (int i = 0; i < Array.length; i++) {
         
			System.out.print("PLEASE ENTER THE NUMBER OF STUDENT IN CLASS[" +(i+1)+ "]:");///enter number of student in each class.
			numberOfStudent=input.nextInt();
			
			if(numberOfStudent>1&&numberOfStudent<100) { //if statement to check if number of student>1&&student<100.
				
				Array[i]=new Student[numberOfStudent];
				
				GradeOfStud[i]=new float [numberOfStudent];
				
					for (int k = 0; k < Array[i].length; k++) {//for loop to enter the first and last name and birthday of each student in each class.
						System.out.println("PLEASE ENTER [[FIRSTNAME]] AND [[LASTNAME]] AND [[ID]] AND [[BIRTHDAY]]STUDENT["+(k+1) +"] IN CLASS[" +(i+1)+ "]: ");
						Array[i][k]=new Student(input.next(),input.next(),input.nextInt(),new Date(input.nextInt(),input.nextInt(),input.nextInt()));	
					}
					
					
				
		       
		       
			}
			else {
				
				System.out.println("**ERORR**PLEASE ENTER THE NUMBER OF STUDENT greater than 1 and less than l00 :");
				i=i-1;
			}
			System.out.println("***********************************************");
			
			
		
		}
		
		System.out.println("***********************************************");
		sortArray(Array);//call method.
		for (int i = 0; i < GradeOfStud.length; i++) {
			
			for (int j = 0; j < GradeOfStud[i].length; j++) {
				System.out.println("PLEASE ENTER GRADE FOR NAMEFULL OF STUDENT :"+Array[i][j].getFirstName()+" "+Array[i][j].getLastName());//enter the grade of each student first name and last name.
				
				GradeOfStud[i][j]=input.nextFloat();
			}
		}
		System.out.println("***********************************************");
		
		
		float[]average=new float[Array.length];
		FindAverage(GradeOfStud,average);//call method
		printTheAssigment(Array,GradeOfStud,average);//call method.

	}
	public static void sortArray(Student[][]Array) {//method to sort and compare the alphabet A-Z in the last name between student.
		boolean F;
		Student tmp=new Student();
		for (int i = 0; i < Array.length; i++) {
			for(int j=0;j<Array[i].length-1;j++) {
				
				for(int k=j+1;k<Array[i].length;k++) {
					for(char f='A';f<='Z';f++) {
						F=isTrue(f,Array[i][j].getLastName(),Array[i][k].getLastName());
						if(F==true) {
							tmp=Array[i][j];
							Array[i][j]=Array[i][k];
							Array[i][k]=tmp;
							
						break;
						
						}
						else {
							continue;
						}
					}
				}
				
			}
		}
		
		
			
		
	
	}
	public static boolean isTrue(char A,String Name1,String Name2) {//method to check of the letters in the last name of a student,and number of alphabet (counter++).
		
		int CounterAlphabet1=0,CounterAlphabet2=0;
		Name1=Name1.toUpperCase();
		Name2=Name2.toUpperCase();
		char []Array1=Name1.toCharArray();
		char []Array2=Name2.toCharArray();
		for (int i = 0; i < Array1.length; i++) {
			if(A==Array1[i]) {
				CounterAlphabet1++;
			}
		}
		for (int i = 0; i < Array2.length; i++) {
			
			if(A==Array2[i]) {
				CounterAlphabet2++;
			}
		}
		if(CounterAlphabet2>CounterAlphabet1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void FindAverage(float[][]grade,float []average) {//a method to calculate the average of student for each class.
		int CounterNumStud=0;
		float sum=0,Average;
		for(int i=0;i<grade.length;i++) {
			for (int j = 0; j < grade[i].length; j++) {
				
				sum=sum+grade[i][j];
				CounterNumStud++;
				
			}
			Average=sum/CounterNumStud;
			average[i]=Average;
		}
		 
		
	}
	public static void printTheAssigment(Student [][]ar,float [][]grade,float []averge) {//a print method to will display the list of student and average
		for(int i=0;i<ar.length;i++) {
			System.out.println("THE AVERGE OF CLASS [" + (i+1) + "] is " + "(("+averge[i]+"))");
			for(int j=0;j<ar[i].length;j++) {
				System.out.println(ar[i][j].getFirstName() + " " +  ar[i][j].getLastName() + "  email : " + ar[i][j].getEmail() + " " +  grade[i][j]);
			}
			System.out.println("***********************************************");
		}
	}

}
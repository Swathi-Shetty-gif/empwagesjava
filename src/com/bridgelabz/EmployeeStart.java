package com.bridgelabz;



import java.util.Scanner;

public class EmployeeStart {

	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
					System.out.println("welcome to employee wages");
					
				int IS_FULL_TIME = 1;
				int WAGE_PER_HOUR=20;
				int DAILY_EMPLOY_WAGES=0;
				int i;
				int num=0;
				Scanner sc= new Scanner(System.in);
				System.out.printf("enter the number");
				DAILY_EMPLOY_WAGES=sc.nextInt();
				for(i=0;i<=num;i++)
				{
				double empCheck = (Math.floor(Math.random() *10)%2);
				System.out.println(empCheck);
				if (empCheck == IS_FULL_TIME) {
					
					DAILY_EMPLOY_WAGES=WAGE_PER_HOUR*8; 
					System.out.println(DAILY_EMPLOY_WAGES);
				System.out.printf("employees daily wages: "+DAILY_EMPLOY_WAGES);

			}
				else
				{
					System.out.println("EMPLOYEE not  PRESENT");
				}

		}
				}
		}
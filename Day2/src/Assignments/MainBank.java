package Assignments;


import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) throws InvalidPinException {
		// TODO Auto-generated method stub
		
		SavingsAcount sv=new SavingsAcount("123456789", "karthik",1234, "daer bank", "weewr22",10000);
		
		
		CurrentAccount ca=new CurrentAccount("123456789", "wwwwww",1234, "wwedr bank", "sfvw3434",100000);
		
		
		Scanner sc=new Scanner(System.in);
		
		boolean choice=true;
	
		do {
		System.out.println("Banking Application");
		System.out.println("1. Savings Account \n2. Current Account \n3. Exit\n");
		System.out.print("Your choice:");
		int selected=sc.nextInt();
		if(selected==1) {
			boolean choice2=true;
			do {
				System.out.println("1. Withdraw Amount \n2. Print Account Details \n3. Change Pin \n4. Get Balance\n5. Go Back");
				System.out.print("Your choice:");
				int sav=sc.nextInt();
				
				switch(sav)
				{
					case 1:System.out.print("Enter the amount to withdraw:");
				          int amount=sc.nextInt();
				          sv.withdraw(amount);
				          break;
					case 2:System.out.println(sv);
						  break;
					case 3:System.out.println("Enter curr and new pin");
					System.out.print("Current:");
				       int curr=sc.nextInt();
				       System.out.print("New Pin:");
					       int newPin=sc.nextInt();
						   sv.changePin(curr, newPin);
						   break;
					case 4:sv.getBalance();
						   break;
					case 5:choice2=false;
					 	   break;
					default:System.out.println("Invalid Choice");
				}
			}while(choice2);
			
		}
		else if(selected==2) {
			boolean choice3=true;
			do {
				
				System.out.println("1. Withdraw Amount \n2. Print Account Details \n3. Change Pin \n4. Get OverDraftLimit\n5. Go Back");
				System.out.print("Your choice:");
				int sav=sc.nextInt();
				
				switch(sav)
				{
				case 1:System.out.print("Enter the amount to withdraw:");
				       int amount=sc.nextInt();
				       ca.withdraw(amount);
				       break;
				case 2:System.out.println(ca);
					   break;
				case 3:System.out.println("Enter current and new pin");
				       System.out.print("Current:");
				       int curr=sc.nextInt();
				       System.out.print("New Pin:");
				       int newPin=sc.nextInt();
				       ca.changePin(curr, newPin);
				       break;
				case 4:ca.getOverDraftLimit();
				       break;
				case 5:choice3=false;
					   break;
				default:System.out.println("Invalid Choice");
				}
			}while(choice3);
			
		}
		else if(selected==3)
			choice=false;
		else
			System.out.println("Invalid Choice");
	}while(choice);
		System.out.println("Thank you");
	}

}
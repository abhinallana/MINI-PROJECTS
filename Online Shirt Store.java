import java.util.Scanner;

public class onlineStore {
		public static void main(String[] args) {
			shirts new1 = new shirts("Your Name");
			new1.menu();

		}

	}
  //create all parameters required for Store.........
	class shirts{
		String size;
		String color;
		double price;
		int total;
		int payment;
		String name;
		public shirts(String name) {
			this.name=name;
			
		}
	//Creating the shirt size.....
	 void size() {
		
		 int option = 0;
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println();
		
			System.out.println("+-----------------------------------------+");
			
			System.out.println("Enter the number of ur size u need from below :" );
			System.out.println();
			
			System.out.println("1. XL ");
			System.out.println("2. L ");
			System.out.println("3. M ");
			System.out.println("4. S ");
			System.out.println("5. XXL ");
			System.out.println();
			option = sc.nextInt();
			
      //options using switch case....
      
			switch(option) {
			case 1 :
				System.out.println("Nice Selection.....for XL");
				break;
			case 2 :
				System.out.println("Nice Selection.....for L");
				break;
			case 3 :
				System.out.println("Nice Selection.....for M");
				break;
			case 4 :
				System.out.println("Nice Selection.....for S");
				break;
			case 5 :
				System.out.println("Nice Selection.....for XXL");
				break;
			case 6 :
				System.out.println();
				break;
			default :
				System.out.println("Invalid size ! Enter any valid size....");
				break;
			}
		
		 
		}
		//creating color object.......
		
	public void color() {
		int color =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("+-----------------------------------------+");
		System.out.println("Choose color of ur SHIRT !!!!");
		System.out.println();
		System.out.println("1. RED");
		System.out.println("2. YELLOW");
		System.out.println("3. BLUE");
		System.out.println("4. PURPLE");
		System.out.println("5. PINK");
		System.out.println("6. VIOLET");
		System.out.println("7. BLACK");
		System.out.println("8. WHITE");
		System.out.println();
		color=sc.nextInt();
		switch (color) {
		case 1:
			System.out.println("Thank you for choosing RED color");
			System.out.println();
			System.out.println("Price : 350 $ ");
			break;
		case 2:
			System.out.println("Thank you for choosing YELLOW color");
			System.out.println();
			System.out.println("Price : 400 $ ");
			break;
		case 3:
			System.out.println("Thank you for choosing BLUE color");
			System.out.println();
			System.out.println("Price : 550 $ ");
			break;
		case 4:
			System.out.println("Thank you for choosing PURPLE color");
			System.out.println();
			System.out.println("Price : 400 $ ");
			break;
		case 5:
			System.out.println("Thank you for choosing PINK color");
			System.out.println();
			System.out.println("Price : 300 $ ");
			break;
		case 6:
			System.out.println("Thank you for choosing VIOLET color");
			System.out.println();
			System.out.println("Price : 340 $ ");
			break;
		case 7:
			System.out.println("Thank you for choosing BLACK color");
			System.out.println();
			System.out.println("Price : 900 $ ");
			break;
		case 8:
			System.out.println("Thank you for choosing WHITE color");
			System.out.println();
			System.out.println("Price : 560 $ ");
			break;
		}
		
	}
 
 //proceed for payment
  
	public void proceed() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Shall we Proceed for payment ?? Y/N ");
		char c = sc.next().charAt(0);
		if(c=='Y'||c=='y') {
			System.out.println("Done ! Lets go for payment .........");
		}else if(c=='N'||c=='n') {
			System.out.println("sorry to hear.....");
			color();
		}else {
			System.out.println("Please input right value....");
		}
	}
  
  //price section.....
  
	public void price() {
		int option =0;
		
		
		System.out.println("Payment Options : ");
		System.out.println();
		System.out.println("1. Debit Card");
		System.out.println("2. Credit Card");
		System.out.println("3. Internet Banking");
		System.out.println("4. Paytm");
		System.out.println("5. Cash On Delievery");
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		System.out.println();
		System.out.println("Amount to pay : " );
		String pay = sc.next();
		
		
		
		switch(option) {
		
		case 1 :
			System.out.println("Total Amount to pay :" + pay );
			System.out.println("Confirm - Y/N ");
			char c = sc.next().charAt(0);
			if(c=='Y'||c=='y')System.out.println("Succesfull Payment of " + pay + "$");
			else if(c=='N'||c=='n')System.out.println("Your Transaction is Cancelled...Sorry");
			else System.out.println("Invalid Option");
			break;
		case 2 :
			System.out.println("Total Amount to pay :" + pay );
			System.out.println("Confirm - Y/N ");
			char c1 = sc.next().charAt(0);
			if(c1=='Y'||c1=='y')System.out.println("Succesfull Payment of " + pay + "$");
			else if(c1=='N'||c1=='n')System.out.println("Your Transaction is Cancelled...Sorry");
			else System.out.println("Invalid Option");
			break;
		case 3 :
			System.out.println("Total Amount to pay :" + pay );
			System.out.println("Confirm - Y/N ");
			char c2 = sc.next().charAt(0);
			if(c2=='Y'||c2=='y')System.out.println("Succesfull Payment of " + pay + "$");
			else if(c2=='N'||c2=='n')System.out.println("Your Transaction is Cancelled...Sorry");
			else System.out.println("Invalid Option");
			break;
		case 4 :
			System.out.println("Total Amount to pay :" + pay );
			System.out.println("Confirm - Y/N ");
			char c3 = sc.next().charAt(0);
			if(c3=='Y'||c3=='y')System.out.println("Succesfull Payment of " + pay + "$");
			else if(c3=='N'||c3=='n')System.out.println("Your Transaction is Cancelled...Sorry");
			else System.out.println("Invalid Option");
			break;
		case 5 :
			System.out.println("Total Amount to pay :" + pay );
			System.out.println("Confirm - Y/N ");
			char c4 = sc.next().charAt(0);
			if(c4=='Y'||c4=='y')System.out.println("Delievery of  " + pay + "$ is pending");
			else if(c4=='N'||c4=='n')System.out.println("Your Transaction is Cancelled...Sorry");
			else System.out.println("Invalid Option");
			break;
		}
	}
	
  //Declaring all the objects to be performed.......
  
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("%-----------------------------------------------------%");
		System.out.println();
		 System.out.println("Hello " + name);
		 System.out.println();
		System.out.println("!!!!!! WELCOME TO THE ONLINE STORE OF SHIRTS !!!!!!");
		System.out.println();
		System.out.println("%------------------------------------------------------%");
		System.out.println();
		System.out.println("Check the Size Section : ");
		size();
		System.out.println("---------------------------------------------------------------");
    System.out.println();
		System.out.println("choose color");
		color();
		proceed();
		System.out.println("---------------------------------------------------------------");
		price();
		System.out.println();
		System.out.println("Thank you For Shopping with us .. Do come later  ");
		
		
		
	}
	}
	
	

import java.util.*;
class Onlineexam
{
Scanner sc = new Scanner(System.in);
HashMap<String,Integer> add = new HashMap <String,Integer>();
public void Signin() {
                add.put("ravikiran", 4082003);
		add.put("vassekaran",24122003);
		add.put("Teja",3062003);
		add.put("venky",11032004);
                String name;
		int password;
        System.out.println("******* Welcome to OASIS INFOBYTE ONLINE EXAM ********");
		System.out.println("SIGNIN");
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter Password:");
		password = sc.nextInt();
		if(add.containsKey(name) && add.get(name)==password)
		{
			System.out.println("\nSignin successfullly.");
			List();
		}
		else
		{
			System.out.println("\nInvalid Name or Password.\nTry again\n");
			Signin();
		}
	
}
public void List()
	{
		int choice;
		System.out.println("\nEnter your Choice:");
		System.out.println("1.Update \n2.Start Exam \n3.Signout");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1 -> {
                            add = update();
                            List();
        }
			case 2 -> {
                            Exam();
                            List();
        }
			case 3 ->
			 System.out.println("Wrong choice!!! Choose correct choice");
		}
	}

    public HashMap<String, Integer> update() {
        String update_name;
		int update_password;
		System.out.println("Enter Name:");
		update_name = sc.next();
		System.out.println("Enter Old Password:");
		update_password = sc.nextInt();
		if(add.containsKey(update_name) && add.get(update_name)==update_password)
		{
			System.out.println("Enter New Password:");
			update_password = sc.nextInt();
			add.replace(update_name,update_password);
			System.out.println("Password Changed Successfully!!!");
		}
		else
		{
			System.out.println("Name is not found.\n");
		}
		return add;
    }
    public void Exam()
	{
		long start = System.currentTimeMillis();
		long end = start + 30;
		int marks = 0,answer;
		System.out.println("*******Oasis inforbyte Online Quiz******* ");
		while(System.currentTimeMillis()<end)
		{
			System.out.println("......................................................................");
			System.out.println("Q1.Number of primitive data types in Java are?");
			System.out.println("1. 6 \t2.7 \t3.8 \t4.9");
			System.out.print("Enter Option: ");
			answer = sc.nextInt();
			if(answer == 3)
				marks+=5;
			else
				marks = 0;
			
			System.out.println("...........................................................................");
			System.out.println("Q2.What is the size of float and double in java?");
			System.out.println("1.32 and 64 \t2.32 and 32 \t3.64 andd 64 \t4.64 and 32 ");
			System.out.print("Enter Option: ");
			answer = sc.nextInt();
			if(answer == 1)
				marks+=5;
			else
				marks-=5;
			
			System.out.println("................................................................................");
			System.out.println("Q3.Automatic type conversion is possible in which of the possible cases?");
			System.out.println("1.Byte to int \t2.int to long \t3.long to int \t4.none");
			System.out.print("Enter Option: ");
			answer = sc.nextInt();
			if(answer == 2)
				marks+=5;
			else
				marks-=5;
			
			System.out.println("....................................................................................");
			System.out.println("Q4.When an array is passed to a method, what does the method receive??");
			System.out.println("1.ReferenceArray\t2.Calling an Array \t3.Intializing an array\t4.None");
			System.out.print("Enter Option: ");
			answer = sc.nextInt();
			if(answer == 1)
				marks+=5;
			else
				marks-=5;
			
			System.out.println(".....................................................................................");
			System.out.println("Q5.Select the valid statement to declare and initialize an array?");
			System.out.println("1.init[]A = {}\t2.int [] A = {1,2,3}\t3.int[] A = (1,2,3)\t4.none");
			System.out.print("Enter Option: ");
			answer = sc.nextInt();
			if(answer == 2)
				marks+=5;
			else
				marks-=5;
			System.out.println("......................................................................................");
			break;
		}
		System.out.println("Online Exam Completed!!!");
		System.out.println();
		System.out.println("Your Score is "+marks);
		if(marks>10)
			System.out.println("Congratulations!!!");
		else
			System.out.println("Better Luck Next Time!!!");
	}
           public static void main(String args[])
	{
		Onlineexam exam  = new Onlineexam();
		exam.Signin();
	}     
}
package banksystem;

import java.util.Scanner;

class bank
{

Scanner sc = new Scanner(System.in);

int accno;
String name;
int accto,acctobal=0;
double bal,amt;
int pc=0,pc1=0,ch;

bank()
{
System.out.print("\nenter acc no :");
accno=sc.nextInt();
System.out.print("enter acc name: ");
name=sc.next();
System.out.print("enter acc bal: ");
bal=sc.nextInt();
System.out.print("enter password: ");
pc=sc.nextInt();

ch=this.checkBal();
}

void getAmt()
{
System.out.println("enter amount: ");
amt=sc.nextInt();
}

void showBal()
{
System.out.println("your bal is "+bal);
}

int checkBal()
{

if(bal>=1000000)
{
System.out.println("\nAccount creation failed");
System.out.println("select current acc");
return 5;
}
else
System.out.println("\nAccount created successfully");

return 0;
}

void withdraw()
{
System.out.println();
this.getAmt();
bal-=amt;
System.out.println("amt withdrawn: "+amt);
this.showBal();
}

void deposit()
{
System.out.println();
this.getAmt();
bal+=amt;
System.out.println("amt deposited: "+amt);
this.showBal();
}

void show()
{
System.out.println("\nenter acc no :"+accno);
System.out.println("enter acc name: "+name);
System.out.println("enter acc bal: "+bal);
}

void process()
{
while(ch!=4)
{

System.out.print("\n1.withdraw\n2.deposit\n3.show\n4.exit\nenter your choice:");
ch=sc.nextInt();

switch(ch)
{
case 1:
this.withdraw();
break;

case 2:
this.deposit();
break;

case 3:
this.show();
break;

case 4:
System.out.println("exiting...");
break;

default:
System.out.println("error");
}

}
}

}
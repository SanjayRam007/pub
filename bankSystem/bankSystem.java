package banksystem;

import java.util.*;
import banksystem.*;

class bankSystem
{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int c;
System.out.println("\n\n----------------------------------------------------------");
System.out.println("create 1.Savings Acc 2.Current Acc\nenter your choice:");
c=sc.nextInt();

switch(c)
{
case 1:
savingsAcc sa = new savingsAcc();
sa.process();
break;

case 2:
currentAcc ca = new currentAcc();
ca.process();
break;
}

}
}






















#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
 static int totalCost;
 int i,j,choice,c=1,a[12],cost[12];
 for(i=0;i<12;i++)
 a[i]=0;
 char str[100];
 char items[12][100]={"Sandisk 16 GB",
	 "Logitech Mouse",
	  "Pendrve 16 GB",
	 "Dell Keyboard",
	 "Adidas",
	 "Nike",
	 "Leecooper",
	 "Campus",
	 "Mi Note 3",
	 "Nokia 3",
	 "Samsung" 
	 "LG" ,};
 printf("Please Enter Your Name\n");
 gets(str);
 printf("Hello %s, Welcome to our Online Shopping.\n",str);
 do
 {
 if(c==1)
 {
  printf("Enter\n1 - Computer Accessories\n2 - Shoes\n3 - Mobiles\nAny other number to exit\n");
  scanf("%d",&choice);
  switch(choice)
  {
	case 1:
	{
	    int accessoriesChoice;
	    printf("Enter\n1 - Sandisk 16 GB - Rs.355\n2 - Logitech Mouse- Rs.500\n3 - Pendrive 16 GB - Rs.550\n4 - Dell Keyboard - Rs.1340\nAny other number to exit\n");
	    scanf("%d",&accessoriesChoice);
	    cost[0]=355;
	    cost[1]=500;
	    cost[2]=550;
	    cost[3]=1340;
	    switch(accessoriesChoice)
	    {
	     case 1:
	      {
	       int num;
	       printf("You chose Sandisk 16GB with Rs.355.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	       scanf("%d",&num);
	       if(num==1)
	       {
	        a[0]++;
	        totalCost+=355;
	       }
	       printf("Your Cost in Cart is %d\n",totalCost);
	       break;
	      }
	     case 2:
	      {
	       int num;
	       printf("You chose Logitech Mouse with Rs.500.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	       scanf("%d",&num);
	       if(num==1)
	       {
	        a[1]++;
	        totalCost+=500;
	       }
	       printf("Your Cost in Cart is %d\n",totalCost);
	       break;
	      }
	     case 3:
	      {
	       int num;
	       printf("You chose Pendrive 16GB with Rs.550.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	       scanf("%d",&num);
	       if(num==1)
	       {
	        a[2]++;
	        totalCost+=550;
	       }
	       printf("Your Cost in Cart is %d\n",totalCost);
	       break;
	      }
	    case 4:
	     {
	      int num;
	      printf("You chose Dell Keyboard with Rs.1350.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[3]++;
	       totalCost+=1350;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	    default:
		{
	      printf("Exit from Computer Accesories\n");
	      break;
	     }
	    }
	    break;
	}
	case 2:
	 {
	    int shoesChoice;
	    printf("Enter\n1 - Adidas - Rs.3550\n2 - Nike - Rs.5000\n3 - Leecooper - Rs.2800\n 4- Campus - Rs.2500\nAny other number to exit\n");
	    scanf("%d",&shoesChoice);
	    cost[4]=3550;
	    cost[5]=5000;
	    cost[6]=2800;
	    cost[7]=2500;
	    switch(shoesChoice)
	    {
	     case 1:
	     {
	      int num;
	      printf("You chose Adidas Shoes for Rs.3550.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[4]++;
	       totalCost+=3550;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	     case 2:
	     {
	      int num;
	      printf("You chose Nike Shoes for Rs.5000.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[5]++;
	       totalCost+=5000;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	     case 3:
	     {
	      int num;
	      printf("You chose Leecooper Shoes for Rs.2800.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[6]++;
	       totalCost+=2800;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	      case 4:
	     {
	      int num;
	      printf("You chose Campus Shoes for Rs.2500.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[7]++;
	       totalCost+=2500;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	     default:
		 {
	      printf("Exit from Shoes Category\n");
	      break;
	     }
	    }
	    break;
	   }
	case 3:
	  {
	    int mobileChoice;
	    printf("Enter\n1 - Mi Note 3 - Rs.11000\n2 - Nokia 3 - Rs.9866\n3 - Samsung - Rs.12800\n4 - LG - Rs.1390\nAny other number to exit\n");
	    scanf("%d",&mobileChoice);
	    cost[8]=11000;
	    cost[9]=9866;
	    cost[10]=12800;
	    cost[11]=1390;
	    switch(mobileChoice)
	    {
	     case 1:
	     {
	      int num;
	      printf("You chose to buy Mi Note 3 for Rs.11000.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[8]++;
	       totalCost+=11000;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	     case 2:
	     {
	      int num;
	      printf("You chose to buy Nokia 3 for Rs.9866.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[9]++;
	       totalCost+=9866;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	     case 3:
	     {
	      int num;
	      printf("You chose to buy Samsung for Rs.12800.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[10]++;
	       totalCost+=12800;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	   case 4:
	     {
	      int num;
	      printf("You chose to buy LG for Rs.1390.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
	      scanf("%d",&num);
	      if(num==1)
	      {
	       a[11]++;
	       totalCost+=13900;
	      }
	      printf("Your Cost in Cart is %d\n",totalCost);
	      break;
	     }
	     default:{
	      printf("Exit from Mobile Category\n");
	      break;
	     }
	    }
	    break;
	   }
	   default:
	   {
	    printf("Enter Valid Categories Choice\n");
	    break;
	   }
	  }
	  printf("%s's cart\n",str);
	  printf("Id\tItems\t\t\tQuantity\t\t\tCost\n");
	  for(i=0;i<12;i++)
	  {
	   if(a[i]!=0)
	   {
	    printf("%d\t%s\t\t%d\t\t\t%d\n",i,items[i],a[i],(cost[i]*a[i]));
	   }
	  }
	  printf("Total Cost\t\t\t\t\t%d\n",totalCost);
	  printf("If you wish to buy anything more Enter\n1 to Add Item\n2 to Delete Items \nAny other number to Exit\n");
	  scanf("%d",&c);
	 }
	  if(c==2)
	  {
	   int id;
	   printf("Enter id to delete item\n");
	   scanf("%d",&id);
	   if(id<9&&id>0){
	   totalCost=totalCost-(cost[id]*a[id]);
	   a[id]=0;
	   }
	   else{
	    printf("Enter Valid id\n");
	   }
	       printf("Revised Items \n");
	       printf("Id\tItems\t\t\tQuantity\t\tCost\n");
	        for(i=0;i<12;i++)
	      {
	     if(a[i]!=0)
	      {
	    printf("%d\t%s\t\t%d\t\t%d\n",i,items[i],a[i],(cost[i]*a[i]));
	      }
	     }  
	        printf("Total Cost\t\t\t\t\t%d\n",totalCost);
	        printf("If you wish to buy anything more Enter\n1 to Add Item\n2 to Delete Items \nAny other number to Exit\n");
	     scanf("%d",&c);
	  }
	  
	 }while(c==1 || c==2);
	     system("cls"); // Clear the console screen on Windows
	 printf("Id\tItems\t\t\tQuantity\t\tCost\n");
	        for(i=0;i<12;i++)
	      {
	     if(a[i]!=0)
	      {
	    printf("%d\t%s\t\t%d\t\t\t%d\n",i,items[i],a[i],(cost[i]*a[i]));
	      }
	     }  
	 printf("Your Final Cost is %d\n",totalCost);
	 printf("Thanks %s for Choosing Us and Visit us again.\n",str);
}


#include<stdio.h>
#include<stdlib.h>

void main()
{
	
	
	int i,j,k,c,row,m=1,n,space;
	
	printf("enter the number of rows:");
	scanf("%d",&row);
	
	
		n=row;
	space=n-1;
	for(i=1;i<row;i++)
	{
		 for ( c = 1 ; c <= space ; c++ )
              printf(" ");
	
     space--;
     
 /*}
     for(i=1;i<row;i++)
     
	 {*/
	 
	for(j=0;j<i;j++)
     {
     	
     	if(i==0||j==0)
     	{
		 
     	m=1;
     	}
     	
     	else
     	{
		 
     	m=m*(i-j)/j;
     	
     }
     printf("%d",m);
     printf(" ");
     
	 }
       

printf("\n");
	
}
printf(" ");
}

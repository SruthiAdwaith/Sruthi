#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main()
{
	
	int i,space,j,k,c,row,n;
	
	printf ("enter the number of rows:");
	scanf("%d",&row);
	n=row;
	space=n-1;
	for(i=1;i<=row;i++)
	{
		 for ( c = 1 ; c<= space ; c++ )
              printf(" ");
	
     space--;
	    
		for(k=1;k<2*i;k++)
	
	{
		printf("*");
		
	}


	printf("\n");
}
}

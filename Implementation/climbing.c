#include <stdio.h>

int main() {
	int n,m,a[200000],b[200000],pointer,num,counter = 0;
	scanf("%d",&n);
	for (int i = 0; i < n; ++i)
	{
		scanf("%d", &num);
		if(i == 0) 
			a[counter++] = num;
		else if(a[counter - 1] == num)
			continue;
		else 
			a[counter++] = num;
	}
	pointer = counter - 1;
	scanf("%d", &m);
	for (int i = 0; i < m; ++i)
	{
		scanf("%d", &b[i]);
		for (int j = pointer; j >= 0; j--)
		{
			if(b[i] == a[j]) {
				printf("%d\n", j + 1);
				pointer = j;
				break;
			}
			else if(b[i] < a[j]) {
				printf("%d\n", j + 2);
				pointer = j;
				break;
			}
			else {
				pointer = j;
				if (j == 0)
				{
					printf("1\n");
				}
				continue;
			}
			

		}
		
	}

	return 0;

}


/*
int main() {
	int n,m,a[200000],b[200000],i,num,count = 0,c[200000],k = 0;
	scanf("%d",&n);

	for (i = 0; i < n; ++i)
		scanf("%d", &c[i]);
	a[k] = c[k];
	for (int i = 1; i < n; ++i)
	{
		if(a[k] == c[i])
			continue;
		else
			a[++k] = c[i];
	}

	scanf("%d",&m);
	num = k;
	for (int i = 0; i < m; ++i)
	{
		scanf("%d",&b[i]);
		for (int j = num; j >= 0; --j)
		{
			//count++;
			if(j == k && b[i] < a[j]) {
				printf("%d\n", j+2);
				num = j - 1;
				count = 0;
				break;
			}
			else if(b[i] < a[j]) {

			}
				
			else if(b[i] == a[j]) {
				printf("%d\n", j + 1);
				num = j - 1;
				count = 0;
				break;

			}

			else if(b[i] > a[j]) {
				printf("%d\n", j + 1);
				num = j;
				count = 0;
				break;
			}
		}
	}


	return 0;

}


*/
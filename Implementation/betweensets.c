#include <stdio.h>

int main() {
	int n,m,kmax = 0,count = 0,kmin = 101,status = 1;
	int a[100],b[100];
	scanf("%i%i", &n,&m);
	for (int i = 0; i < n; ++i)
	{
		scanf("%i",&a[i]);
		if (a[i] > kmax)
		{
			kmax = a[i];
		}
	}
	for (int i = 0; i < m; ++i)
	{
		scanf("%i",&b[i]);
		if (b[i] < kmin)
		{
			kmin = b[i];
		}
	}

	for (int i = kmax; i <= kmin; ++i)
	{
		for (int j = 0; j < n; ++j)
		{
			if(i % a[j] != 0) {
				status = 0;
				break;
			}
				
		}
		if(status) {
			for (int j = 0; j < m; ++j)
			{
				if(b[j] % i != 0) {
					status = 0;
				}

			}
			if (status)
			{
				count++;
			}
		}
		status = 1;


	}
	printf("%i\n", count);


	return 0;
}
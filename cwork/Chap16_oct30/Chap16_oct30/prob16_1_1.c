#include <stdio.h>

int main_1611(void)
{
	int arr[3][9];	

	for (int i = 2; i < 5; i++)
	{
		for (int j = 1; j < 10; j++)
		{
			arr[i-2][j-1] = i * j;		//배열이 [0][0]부터 시작하므로 i, j 변수 조건에 맞추어 조절이 필요.
			
		}
	}

	for (int i = 2; i < 5; i++)
	{
		for (int j = 1; j < 10; j++)
		{
			printf("%3d",arr[i-2][j-1]);
		}
		printf("\n");
	}
	
	return 0;
}
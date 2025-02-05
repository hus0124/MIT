/*
문제 09-2
다음은 프로그램 사용자가 입력하는 값을 누적하여 그 합계를 출력하는 예제이다.

#include	<stdio.h>
int total = 0;

int AddToTal(int num)
{
	total += num;
	return total;
}

int main(void)
{
	int num, i;
	for(i = 0;i < 3;i++) {
		printf("입력%d: ", i+1);
		scanf("%d", &num);
		printf("누적: %d\n", AddToTotal(num));
	}
	return 0;
}

위의 예제에서는 함수 AddToTotal에서의 사용을 목적으로 전역변수 total을 선언하였는데, 이를
static 변수로 대체해보자. 단 static 변수로의 대체과정에서 main함수의 변경은 없어야 하며 실행
결과도 동일하여야 한다.

*/

#include	<stdio.h>
//int total = 0;		// 전역변수 사용

int AddToTotal(int num)
{
	static int total = 0;		//static 변수 선언, 처음 호출될 때 한번만 초기화됨.
	int var1 = 10;		// 함수가 호출될때마다 실행됨
	total += num;
	return total;
}

int main_prob092(void)
{
	int num, i;
	for (i = 0; i < 3; i++) {
		printf("입력%d: ", i + 1);
		scanf("%d", &num);
		printf("누적: %d\n", AddToTotal(num));
	}
	return 0;
}
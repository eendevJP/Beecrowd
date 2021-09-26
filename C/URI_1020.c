#include <stdio.h>

int main(){
	int N, anos, meses, dias;
	scanf("%d",&N);
	anos=N/365;
	meses=(N%365)/30;
	dias=(N%365)%30;
	printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
	return 0;
}

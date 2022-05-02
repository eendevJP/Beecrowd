#include <stdio.h>

int main(){
	int A, B;
	double C;
	scanf("%d %d %lf", &A, &B, &C);
	int D, E;
	double F;
	scanf("%d %d %lf", &D, &E, &F);
	printf("VALOR A PAGAR: R$ %.2f\n", (B * C + E * F));
	return 0;
}

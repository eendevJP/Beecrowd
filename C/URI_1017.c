#include <stdio.h>

int main(){
	double gastoHoras, velocidadeMedia, calculo, defaultGasto = 12.0;
	scanf("%lf %lf", &gastoHoras, &velocidadeMedia);
	calculo = (gastoHoras * velocidadeMedia) / defaultGasto;
	printf("%.3lf\n", calculo);
	return 0;
}

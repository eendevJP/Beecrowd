#include <stdio.h>

int main(){
	int codigoX, codigoY;
	float cachorroQuente = 4.00, xSalada = 4.50, xBacon = 5.00, torradaSimples = 2.00, refrigerante = 1.50;
	scanf("%d %d", &codigoX, &codigoY);
	switch(codigoX){
		case 1:
			printf("Total: R$ %.2f\n", codigoY * cachorroQuente);
			break;
		case 2:
			printf("Total: R$ %.2f\n", codigoY * xSalada);
			break;
		case 3:
			printf("Total: R$ %.2f\n", codigoY * xBacon);
			break;
		case 4:
			printf("Total: R$ %.2f\n", codigoY * torradaSimples);
			break;
		case 5:
			printf("Total: R$ %.2f\n", codigoY * refrigerante);
			break;
	}
	return 0;		
}

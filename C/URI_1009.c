#include <stdio.h>
 
int main() {
    char nome;
    double salFixo, montante, calculo;
    scanf("%s %lf %lf", &nome, &salFixo, &montante);
    calculo = salFixo + (15 * montante) / 100;
    printf("TOTAL = R$ %.2f\n", calculo);
    return 0;
}

#include <stdio.h>
 
int main() {
    int func, horas;
    float sal, calculo;
    scanf("%d %d %f", &func, &horas, &sal, &calculo);
    calculo = horas * sal;
    printf("NUMBER = %d\n", func);
    printf("SALARY = U$ %.2f\n", calculo);
    return 0;
}

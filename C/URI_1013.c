#include <stdio.h>
 
int main() {
    int a, b, c, maiorAB;
    scanf("%d %d %d", &a, &b, &c);
    maiorAB = (a + b + abs(a - b)) / 2;
    maiorAB = (c + maiorAB + abs(maiorAB - c)) / 2;
    printf("%d eh o maior\n", maiorAB);
    return 0;
}

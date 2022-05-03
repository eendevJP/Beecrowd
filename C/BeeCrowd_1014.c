#include <stdio.h>
 
int main() {
    int x;
    float y, cal;
    scanf("%d %f", &x, &y);
    cal = x/y;
    printf("%.3f km/l\n", cal);
    return 0;
}

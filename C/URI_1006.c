#include <stdio.h>
 
int main() {
    float A, B, C, Media;
    scanf("%f %f %f", &A, &B, &C);
    Media = ((A * 2) + (B * 3) + (C * 5)) / 10;
    printf("MEDIA = %.1f\n", Media);
    return 0;
}

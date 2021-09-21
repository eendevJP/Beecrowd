#include <stdio.h>

int main(){
	int notaUser, notaAtual, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
	scanf("%d", &notaUser);
	notaAtual = notaUser;
	
	nota100 = notaAtual / 100;
	notaAtual -= nota100 * 100;
	
	nota50 = notaAtual / 50;
	notaAtual -= nota50 * 50;
	
	nota20 = notaAtual / 20;
	notaAtual -= nota20 * 20;
	
	nota10 = notaAtual / 10;
	notaAtual -= nota10 * 10;
	
	nota5 = notaAtual / 5;
	notaAtual -= nota5 * 5;
	
	nota2 = notaAtual / 2;
	notaAtual -= nota2 * 2;

	nota1 = notaAtual;
	printf("%d nota(s) de R$ 100,00\n", nota100);
	printf("%d nota(s) de R$ 50,00\n", nota50);
	printf("%d nota(s) de R$ 20,00\n", nota20);
	printf("%d nota(s) de R$ 10,00\n", nota10);
	printf("%d nota(s) de R$ 5,00\n", nota5);
	printf("%d nota(s) de R$ 2,00\n", nota2);
	printf("%d nota(s) de R$ 1,00\n", nota1);
	return 0;
}

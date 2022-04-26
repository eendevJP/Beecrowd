notas = float(input())

notas100 = notas // 100
notas = notas - notas100*100

notas50 = notas // 50
notas = notas - notas50*50

notas20 = notas // 20
notas = notas - notas20*20

notas10 = notas // 10
notas = notas - notas10*10

notas5 = notas // 5
notas = notas - notas5*5

notas2 = notas // 2
notas = notas - notas2*2

notas1 = notas // 1
notas = notas - notas1*1
notas1=float('%.2f'% notas1)
notas=float('%.2f'% notas)

moedas50 = notas // 0.5
notas = notas - moedas50*0.5
m50=float('%.2f'% moedas50)
notas=float('%.2f'% notas)

moedas25 = notas // 0.25
notas = notas - moedas25*0.25
moedas25=float('%.2f'% moedas25)
notas=float('%.2f'% notas)

moedas10 = notas // 0.10
notas = notas - moedas10*0.10
moedas10=float('%.2f'% moedas10)
notas=float('%.2f'% notas)

moedas5 = notas // 0.05
notas = notas - moedas5*0.05
moedas5=float('%.2f'% moedas5)
notas=float('%.2f'% notas)

moedas1 = notas * 100
moedas1=float('%.2f'% moedas1)
notas=float('%.2f'% notas)

print('NOTAS:')
print('{} nota(s) de R$ 100.00'.format(int(notas100)))
print('{} nota(s) de R$ 50.00'.format(int(notas50)))
print('{} nota(s) de R$ 20.00'.format(int(notas20)))
print('{} nota(s) de R$ 10.00'.format(int(notas10)))
print('{} nota(s) de R$ 5.00'.format(int(notas5)))
print('{} nota(s) de R$ 2.00'.format(int(notas2)))
print('MOEDAS:')
print('{} moeda(s) de R$ 1.00'.format(int(notas1)))
print('{} moeda(s) de R$ 0.50'.format(int(moedas50)))
print('{} moeda(s) de R$ 0.25'.format(int(moedas25)))
print('{} moeda(s) de R$ 0.10'.format(int(moedas10)))
print('{} moeda(s) de R$ 0.05'.format(int(moedas5)))
print('{} moeda(s) de R$ 0.01'.format(int(moedas1)))
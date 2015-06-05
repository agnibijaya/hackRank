
table=[0]*1000000000

def DpFib(n):
	if n<=1:
		return n
	else:
		if (table [n-1]==0):
			table[n-1]=DpFib(n-1)

		if (table[n-2]==0):
			table[n-2]=DpFib(n-2)
		table[n]=table[n-1]+table[n-2]
		return table[n]
			
def test():
	print "Enter a number : "
	num =int(raw_input())
	print(DpFib(num))

test()

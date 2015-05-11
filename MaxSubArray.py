

L = [1,-3,5,-2,9,-8,-6-4]

def test():
	n=int(raw_input())
	
	for n in xrange(n):
		c=int(raw_input())
		v = []
		t = raw_input()
		tt = t.split()
		for x in xrange(c):
			v.append(int(raw_input()))
			print v
test()

def max_subarray():
	current_sum=0;
	current_index=-1;
	best_sum=0;
	best_start_index=-1
	best_end_index=-1
	

	for i in xrange(len(L)):
		val=current_sum + L[i]
		if val>0:
			if current_sum==0:
				current_index=i
			current_sum=val


		else:
			current_sum=0
		
		if current_sum > best_sum:
			best_sum=current_sum
			best_start_index=current_index
			best_end_index=i

	print best_start_index,best_end_index

#	return L[best_start_index:best_end_index+1]

#max_subarray()
		
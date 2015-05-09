# Enter your code here. Read input from STDIN. Print output to STDOUT
p= raw_input()
a=raw_input()
lst1=a.split()
inlst1=list(map(int,lst1))
#print inlst1
q=raw_input()
b=raw_input()
lst2=b.split()
inlst2=list(map(int,lst2))
#set1=set()
set1=set(inlst1)
#print set1
#set2=set()
set2=set(inlst2)
#print set2
x = set1.difference(set2)

#print x
y = set2.difference(set1)
#print y
z = set()
z = x.union(y)
#print z
lst = list(z)
lst = sorted(lst)
for i in range(len(lst)):
    print lst[i]
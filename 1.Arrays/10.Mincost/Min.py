arr=[4,3,2]
n=len(arr)
min=arr[0]
for i in range(n):
    if(arr[i]<min):
        min=arr[i]
        
res=(n-1)*min
print(res)
arrays=[1,2,3,4,5]
arrays1=[1,2,'Hello','Everyone',5]
print(arrays)
print(arrays1)
# Accessing th elements
print(arrays[1])
# Adding the elements
arrays.append(40)
#Poping the element with the index value
arrays.pop(4)
#Removing the element 
arrays.remove(4)
#Deleting the  element with the index value
del arrays[0]
#inseting the index value
arrays.insert(0,"Hello")
#Extending the values in list
arrays.extend([20,30,40])
print(arrays)
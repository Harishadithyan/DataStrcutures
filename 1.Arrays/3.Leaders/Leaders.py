arr = [16, 17, 4, 3, 5, 2]
n = len(arr)

max_from_right = arr[n-1]
leaders = [max_from_right]  # store leaders in a list

for i in range(n-2, -1, -1):
    if arr[i] > max_from_right:
        max_from_right = arr[i]
        leaders.append(arr[i])

# reverse to get original order
leaders.reverse()
print(leaders)

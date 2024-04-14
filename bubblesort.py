arr = [5,4,2,12,3]

def bubble_sort(arr):
    # print(f'unsorted arr: {arr}')
    for i in range(0,len(arr)):
        for j in range(0,len(arr)-i-1):
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
    return arr


def insertion_sort(arr):
    print('unsorted ',arr)
    for i in range(0,len(arr)):
        print('outer ',arr)
        min_value = i
        for j in range(i+1,len(arr)-1):
            print('min ',min_value ,arr[min_value])
            if arr[j] > arr[j+1]:
                min_value = j+1
            temp = arr[i]
            arr[i] = arr[min_value]
            arr[min_value] = temp
            print('inner ',arr)
    return arr
        
insertion_sort(arr)


arr = [5,4,2,12,3]
print(f'unsorted arr: {arr}')
for i in range(0,len(arr)):
    for j in range(0,len(arr)-i-1):
        if arr[j] > arr[j+1]:
            temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp


print(arr)









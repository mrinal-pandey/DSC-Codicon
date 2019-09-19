"""
@author Mrinal Pandey
@date: 12th September, 2019
@day_time Thursday 19:38

"""

def displayData(a, n):
    for i in range(n):
        print (a[i], end = '\t')
    print()

def bubbleSort(a, n):
    for i in range(n - 1):
        for j in range(n - 1 - i):
            if a[j] > a[j + 1]:
                a[j], a[j + 1] = a[j + 1], a[j]

a = [20, 15, 10, 5, 0]
#a = [10, 2, 15, 19, 17]
#a = [8, 6, 9, 14, 22]
#a = [2, 4, 6, 8, 10]

print ("\nArray before sorting:")
n = len(a)
displayData(a, n)
bubbleSort(a, n)
print ("\nArray after sorting")
displayData(a, n)
print()

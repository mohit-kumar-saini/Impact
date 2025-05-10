row = int(input())
col = int(input())
n = int(input())

no_of_trees = row * col
print(f"no_of_trees to be planted:" + str(no_of_trees))

if (n <= col):
    print("MANGO")
elif (n % col == 0):
    print("MANGO")
elif (n % col == 1):
    print("MANGO")
else:
    print("SAPOTA")     
         
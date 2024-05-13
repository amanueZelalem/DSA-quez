def bubleSort(list):
    i = len(list) -1
    j = 0
    while (i>=0):
        while(j < i):
            if(list[j] > list[j+1] ):
                temp = list[j]
                list[j] = list[j+1]

                list[j+1] = temp
            
            j =  j + 1
        i = i - 1
    print(list)

bubleSort(["A", "S", "C"])

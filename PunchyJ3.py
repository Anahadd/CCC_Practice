A = 0
B = 0

while True:
    # stores the string
    line = input("")

    # stores the the first # (1-7)
    x = line[0]

    if x == "1":
        # stores the variable (either A/B)
        v = line[2]

        # stores the numeric value at the end
        s = int(line[4:])

        if v == "A":
            A = s
        elif v == "B":
            B = s
    
    elif x == "2":
        v = line[2]
        if v == "A":
            print(A)
        elif v == "B":
            print(B)
    
    elif x == "3":
        v = line[2]
        if v == "A":
            A = A + B
        elif v == "B":
            B = A + B
    
    elif x == "4":
        v = line[2]
        if v == "A":
            A = A * B
        else:
            B = A * B

    elif x == "5":
        v = line[2]
        if v == "A":
            A = A - B
        else: 
            B = B - A
    
    elif x == "6":
        v = line[2]
        if v == "A":
            A = A // B
        else: 
            B = B // A
    
    elif x == "7":
        break

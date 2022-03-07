print("('+'=addition), ('-'=addition), ('x'or'*'=multiplication), ('/'=division), ('%'=modulus)")
operation = input("Select the operation: ")[0]

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
sum = 0; flag = True

if operation == '+':
    sum = num1 + num2;
elif operation == '-':
    sum = num1 - num2
elif operation == 'X' or operation == 'x' or operation == '*':
    sum = num1 * num2
elif operation == '/':
    sum = num1 / num2
elif operation == '%':
    sum = num1 % num2
else:
    flag = False

if flag == True:
    print("The result is = ", sum)
else:
    print("Error! Invalid operation")
# Python does not support method overloading by default
# But we can make something like method overloading with different ways

# Example 1
class overloading:
    def sum(self, action, num1=None, num2=None):
        if action:
            if num1 != None and num2 != None:
                if action == '+':
                    print("Sum ("+action+"):", (num1 + num2))
                elif action == '-':
                    print("Sum ("+action+"):", (num1 - num2))
                elif action == '*' or action == 'X' or action == 'x':
                    print("Sum ("+action+"):", (num1 * num2))
                elif action == '/':
                    print("Sum ("+action+"):", (num1 / num2))
                else:
                    print("Invalid calculation paramater")
            else:
                print("Add minimum 2 numbers")
        else:
            print("Please enter an calculation type in the first parameter")


calculate = overloading()
calculate.sum('+', 1, 2)
calculate.sum('-', 4, 3)
calculate.sum('x', 5, 6)
calculate.sum('/', 8, 2)


# ===========================================================================


# Example 2
class overloading_2:
    def sum(self, num1=None, num2=None, num3=None):
        if num1 != None and num2 != None and num3 != None:
            print("Sum of (addition) = ", (num1 + num2 + num3))
        elif num1 != None and num2 != None:
            print("Sum of (addition) = ", (num1 + num2))
        else:
            print("Add minimum 2 numbers")

print()
calculate = overloading_2()
calculate.sum(2, 3)
calculate.sum(4, 5, 6)
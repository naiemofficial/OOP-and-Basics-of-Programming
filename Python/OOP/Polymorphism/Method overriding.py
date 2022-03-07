class Parent:
    def address(self):
        print("I'm from Dhaka, Bangladesh")


class Child(Parent):
    def address(self):
        print("I'm from Chittagong, Bangladesh")


Pr = Parent()
Pr.address()

Ch = Child()
Ch.address()
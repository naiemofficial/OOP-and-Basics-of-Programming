# Python does not support method overloading by default
# But we can make something like method overloading with different ways
class constructor():
    def __init__(self, name, id=None):
        if id != None:
            print("Student Name:", name)
            print("ID:", id)
        else:
            print("Dept of.", name)


department = constructor("Computer Engineering")
student = constructor("Abdullah Al Naiem", 123456)

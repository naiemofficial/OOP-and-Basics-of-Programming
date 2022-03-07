# Python does not have the private keyword, unlike some other object oriented languages.
# But encapsulation can be done with the following method (member can be private by double underscore)
class Student:
    def __academicInfo(self, department):
        print("Institute of Engineering"); # just a random name
        print("Dept. of " + department)

    def setName(self, studentName):
        self.__name = studentName

    def setDept(self, studentDept):
        self.__dept = studentDept

    def displayInfo(self):
        self.__academicInfo(self.__dept)
        print("Name: ", self.__name)


class encap:
    naiem = Student()
    naiem.setName("Abdullah Al Naiem")
    naiem.setDept("Computer")
    naiem.displayInfo()

    print()

    sakib = Student()
    sakib.setName("Sakibur Rahman")
    sakib.setDept("Electrical")
    sakib.displayInfo()
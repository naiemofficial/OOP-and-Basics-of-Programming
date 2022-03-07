# Python does not have the private keyword, unlike some other object oriented languages.
# But encapsulation can be done with the following method (member can be private by double underscore)
class Student:
    def setInfo(self, studentName, studentID):
        self.__name = studentName
        self.__id = studentID

    def getInfo(self):
        print("Name: ", self.__name)
        print("ID  : ", self.__id)


class encap:
    naiem = Student()
    naiem.setInfo("Abdullah Al Naiem", 123456)
    naiem.getInfo()

    print()

    sakib = Student()
    sakib.setInfo("Sakibur Rahman", 456123)
    sakib.getInfo()
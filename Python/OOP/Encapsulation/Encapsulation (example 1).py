# Python does not have the private keyword, unlike some other object oriented languages.
# But encapsulation can be done with the following method (member can be private by double underscore)
class Student:
    def setName(self, studentName):
        self.__name = studentName
    
    def getName(self):
        print("Name: ", self.__name)

        
class encap:
    naiem = Student()
    naiem.setName("Abdullah Al Naiem")
    naiem.getName()
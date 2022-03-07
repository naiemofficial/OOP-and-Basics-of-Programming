# Python ≥3.4 is required to run this program
from abc import ABC, abstractmethod
class student(ABC):
    def instituteInfo(self):
        print("Institute of Engineering")  # just a random name
        print("EIIN: 654321")

    @abstractmethod
    def studentInfo(self):
        pass

    @abstractmethod
    def academicInfo(self):
        pass

class Naiem(student):
    def academicInfo(self):
        print("Dept. of Computer")

    def studentInfo(self):
        print("Name: Abdullah Al Naiem")
        print("ID  : 123456")

class Sakib(student):
    def academicInfo(self):
        print("Dept. of Electrical")

    def studentInfo(self):
        print("Name: Sakibur Rahman")
        print("ID  : 456123")


class abstraction:
    student1 = Naiem()
    student1.instituteInfo()
    student1.studentInfo()
    student1.academicInfo()

    print()

    student2 = Sakib()
    student2.instituteInfo()
    student2.studentInfo()
    student2.academicInfo()
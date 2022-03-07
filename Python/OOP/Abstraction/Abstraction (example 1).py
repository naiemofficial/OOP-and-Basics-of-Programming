# Python ≥3.4 is required to run this program
from abc import ABC, abstractmethod
class Student(ABC):
    @abstractmethod
    def studentInfo():
        pass

    def academicInfo(self):
        print("Dept. of Computer")

class Naiem(Student):
    def studentInfo(self):
        print("Name: Abdullah Al Naiem")

class abstraction:
    obj = Naiem()
    obj.studentInfo()
    obj.academicInfo()
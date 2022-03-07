class Institute:
    institute_name = "Institute of Engineering"  # just a random name


class Tacher:
    teacher_name = "Guido van Rossum"
    subject = "Python Programming"


class Student:
    student_name = "Abdullah Al Naiem"


# inherit multiple classes at once and combind into a method
class Multiple_Inh(Institute, Tacher, Student):
    def displayInfo(self):
        print(self.institute_name)
        print("Teacher: ", self.teacher_name)

# Hybrid inheritance is a combination of multiple inheritance and multilevel inheritance. 
# A class is derived from two classes as in multiple inheritance.
# institute, teacher and student class inherited by "multiple" and it's inherited by "hybrid" class
class Hybrid_Inh(Multiple_Inh):
    def displayInfo(self):
        print("Subject: ", self.subject)
        print("Student: ", self.student_name)
        

teacher = Multiple_Inh()
teacher.displayInfo()

student = Hybrid_Inh()
student.displayInfo()
class Institute:
    institute_name = "Institute of Engineering"  # just a random name


class Teacher:
    teacher_name = "Guido van Rossum"
    subject = "Python Programming"


class Student:
    student_name = "Abdullah Al Naiem"


# inherit multiple classes at once and combind into a method
class MultipleInheritance(Institute, Teacher, Student):
    def displayInfo(self):
        print(self.institute_name)
        print("Teacher: ", self.teacher_name)
        print("Subject: ", self.subject)
        print("Student: ", self.student_name)


obj = MultipleInheritance()
obj.displayInfo()
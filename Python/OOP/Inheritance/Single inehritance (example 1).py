class Teacher:
    teacher_name = "Guido van Rossum"
    subject = "Python Programming"


class Student(Teacher):
    student_name = "Abdullah Al Naiem"
    id = 123456

    def displayInfo(self):
        print("Teacher Name:", self.teacher_name)
        print("Student Name:", self.student_name)
        print("Student ID  :", self.id)
        print("Class of    :", self.subject)


class singleInheritance:
    obj = Student()
    obj.displayInfo();
class Teacher:
    teacher_name = "Guido van Rossum"
    subject = "Python Programming"

    def teacherInfo(self):
        print("Teacher Name:", self.teacher_name)


class Student(Teacher):
    student_name = "Abdullah Al Naiem"
    id = 123456

    def studentInfo(self):
        print("Student Name:", self.student_name)
        print("Student ID  :", self.id)
        print("Class of    :", self.subject)


class singleInheritance:
    get = Student()
    get.teacherInfo()
    get.studentInfo()
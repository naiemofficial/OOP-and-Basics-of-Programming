class Teacher:
    teacher_name = "Guido van Rossum"
    subject = "Python Programming"

    def teacherInfo(self):
        print("Teacher info: \n--------------")
        print("Name   :", self.teacher_name)
        print("Subject:", self.subject)


class Student(Teacher):
    student_name = "Abdullah Al Naiem"
    id = 123456

    def studentInfo(self):
        print("\nStudent info: \n--------------")
        print("Name:", self.student_name)
        print("ID  :", self.id)
        print("Class of:", self.subject)


class singleInheritance:
    get = Student()
    get.teacherInfo()
    get.studentInfo()
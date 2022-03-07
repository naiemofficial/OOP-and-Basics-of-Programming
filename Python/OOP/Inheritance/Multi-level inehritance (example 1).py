class Institute:
    institute_name = "Institute of Engineering" # just a random name


class Teacher(Institute):
    teacher_name = "Guido van Rossum"
    subject = "Python Programming"


class Student(Teacher):
    student_name = "Abdullah Al Naiem"

    def displayInfo(self):
        print("Institute Name:", self.institute_name)
        print("Teacher Name  :", self.teacher_name)
        print("Student Name  :", self.student_name)
        print("Class of      :", self.subject)


class multiLevelInheritance:
    obj = Student()
    obj.displayInfo()
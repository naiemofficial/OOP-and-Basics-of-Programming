class Institute:
    __institute_name = "Institute of Engineering"  # just a random name
    __eiin = 654321

    def instituteInfo(self):
        print("Institute Name:", self.__institute_name)
        print("Institute EIIN:", self.__eiin)


class Teacher(Institute):
    teacher_name = "Guido van Rossum"
    subject = "Python Programming"

    def teacherInfo(self):
        print("Teacher Name  :", self.teacher_name)


class Student(Teacher):
    student_name = "Abdullah Al Naiem"
    id = 123456

    def studentInfo(self):
        print("Student Name  :", self.student_name)
        print("Student ID    :", self.id)
        print("Class of      :", self.subject)


class multiLevelInheritance:
    get = Student()
    get.instituteInfo()
    get.teacherInfo()
    get.studentInfo()
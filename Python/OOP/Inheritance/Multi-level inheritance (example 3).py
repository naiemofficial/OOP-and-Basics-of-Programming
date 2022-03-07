class Institute:
    __institute_name = "Institute of Engineering"  # just a random name
    __eiin = 654321

    def instituteInfo(self):
        print("Institute info: \n--------------")
        print("Name:", self.__institute_name)
        print("EIIN:", self.__eiin)


class Teacher(Institute):
    teacher_name = "Guido van Rossum"
    subject = "Python Programming"

    def teacherInfo(self):
        print("\nTeacher info: \n--------------")
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


class multiLevelInheritance:
    get = Student()
    get.instituteInfo()
    get.teacherInfo()
    get.studentInfo()

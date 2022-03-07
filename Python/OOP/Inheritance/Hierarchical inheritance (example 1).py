class Institute:
    _institute_name = "Institute of Engineering"  # just a random name


class Teacher(Institute):
    teacher_name = "Guido van Rossum"

    def info(self):
        print(self.teacher_name + " works as a teacher at " + self._institute_name)


class Student(Institute):
    student_name = "Abdullah Al Naiem"

    def info(self):
        print(self.student_name + " studying at " + self._institute_name)


class hierarchicalInhertance:
    teacher = Teacher()
    teacher.info()
    student = Student()
    student.info()
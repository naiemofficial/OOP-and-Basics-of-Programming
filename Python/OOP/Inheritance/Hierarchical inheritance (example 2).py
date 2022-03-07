class Institute:
    _institute_name = "Institute of Engineering"  # just a random name
    _teacher_salary = 45000
    _tution_fee = 25000


class Teacher(Institute):
    teacher_name = "Guido van Rossum"

    def info(self):
        print(self.teacher_name + " works as a teacher at" + self._institute_name)
        print("Salary per month:", self._teacher_salary)



class Student(Institute):
    student_name = "Abdullah Al Naiem"

    def info(self):
        print(self.student_name + "studying at" + self._institute_name)
        print("Tution fee per semester:", self._tution_fee)


class hierarchicalInhertance:
    teacher = Teacher()
    teacher.info()

    print()

    student = Student()
    student.info()
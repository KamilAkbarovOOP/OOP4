public class Main {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        Person student = personFactory.createPerson("STUDENT");
        Person teacher = personFactory.createPerson("TEACHER");
        Person employee = personFactory.createPerson("EMPLOYEE");

        student.prof();
        teacher.prof();
        employee.prof();
    }
}
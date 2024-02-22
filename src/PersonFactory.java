class PersonFactory {
    public Person createPerson(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("STUDENT")) {
            return new Student();
        } else if (type.equalsIgnoreCase("TEACHER")) {
            return new Teacher();
        } else if (type.equalsIgnoreCase("EMPLOYEE")) {
            return new Employee();
        }
        return null;
    }
}

package lesson0402;

public enum CourseNames {
    FRONTENDBASIC("Front-end Basic"),JAVAPRO("Java Pro");

    public String getCourseName() {
        return courseName;
    }

    CourseNames(String s) {
        courseName = s;
    }

     final String courseName;

}

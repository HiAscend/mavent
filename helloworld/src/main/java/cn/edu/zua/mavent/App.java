package cn.edu.zua.mavent;

/**
 * Hello world!
 *
 * @author ascend
 * @date 2017-12-05
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Student student = new Student();
        student.setUserId("001");
        student.setUsername("adeng");
        student.setAge(23);
        System.out.println(student);
    }
}

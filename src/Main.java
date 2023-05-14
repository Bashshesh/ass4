import java.util.Random;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {

    }
}
        class MyTestingClass {
            private String value;

            //accepts a string parameter value and assigns it to the instance variable value
            public MyTestingClass(String value) {
                this.value = value;
            }

            //returns value
            public String getValue() {
                return value;
            }

            //sets value
            public void setValue(String value) {
                this.value = value;
            }

            //generates a hash code for a String object based on the sum of the ASCII values of its characters
            @Override
            public int hashCode() {
                int result = 0;
                for (char c : value.toCharArray()) {
                    result += (int) c;
                }
                return result;
            }

            //compares the value variable of MyTestingClass if they equal
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                MyTestingClass that = (MyTestingClass) o;
                return Objects.equals(value, that.value);
            }
        }

        class Student {
            private int id;//private потому что так надо
            private String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            //returns id
            public int getId() {
                return id;
            }

            //returns name
            public String getName() {
                return name;
            }

            //returns id
            @Override
            public int hashCode() {
                return id;
            }

            //returns true if the same id
            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Student student = (Student) obj;
                return id == student.id && Objects.equals(name, student.name);
            }
        }




        /*

                    **     **
                   *  *   *  *
                    *   *   *
                     *  N  *
                      *   *
                       * *
                        *
         */
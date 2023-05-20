import java.util.Random;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        //there the 5 assigmnent and code that we don't need, so just ignore it
        BinaryTree tree = new BinaryTree();
        tree.insert(3);
        tree.insert(4);
        tree.insert(1);
        tree.insert(15);
        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(7);
        tree.inOrder();
        tree.getValue(7);


        //creates a new MyHashTable instance and generates 10000 random key-value pairs using MyTestingClass and Student classes as key and value respectively. Finally, it prints the contents of the hash table's buckets
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(Integer.toString(random.nextInt(100)));
            Student value = new Student(5, "Ansar Bashayev");
            table.put(key, value);
        }
        table.printBuckets();
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
//asdasd



        /*

                    **     **
                   *  *   *  *
                    *   *   *
                     *  N  *
                      *   *
                       * *
                        *
         */
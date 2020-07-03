package demo.suanfa;
/**
 * 数组对象排序：
 * 1.对象的类Student实现Comparable<Student>接口
 * 2.重写comparable
 */

import java.util.Arrays;

/**
 * 创建一个数组，存储5个Student对象，向数组中添加Student对象，对数组的Student对象根据成绩高低排序
 *
 * @author Administrator
 */
public class ArrayObjSortByGrade {

    public static void main(String[] args) {
        Student[] stuArray = new Student[5];
        stuArray[0] = new Student("a", 89);
        stuArray[1] = new Student("b", 60);
        stuArray[2] = new Student("c", 19);
        stuArray[3] = new Student("d", 95);
        stuArray[4] = new Student("e", 76);
        Arrays.sort(stuArray);
        /*原按成绩低到高排列：[name=c, grade=19, name=b, grade=60, name=e, grade=76, name=a, grade=89, name=d, grade=95]*/
        System.out.println("原按成绩高到低排列：" + Arrays.toString(stuArray));
        Student[] student = reverse(stuArray);
        /*原按成绩高到低排列：[name=d, grade=95, name=a, grade=89, name=e, grade=76, name=b, grade=60, name=c, grade=19]*/
        System.out.println("原按成绩低到高排列：" + Arrays.toString(stuArray));
    }

    private static Student[] reverse(Student[] stuArray) {
        for (int i = 0; i < stuArray.length / 2; i++) {
            Student temp = stuArray[i];
            stuArray[i] = stuArray[stuArray.length - i - 1];
            stuArray[stuArray.length - i - 1] = temp;
        }
        return stuArray;
    }

    static class Student implements Comparable<Student> {
        String name;
        int grade;

        public Student() {

        }

        public Student(String name, int grade) {
            super();
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "name=" + name + ", grade=" + grade;
        }

        @Override
        public int compareTo(Student o) {
            //按高到低顺序排列
            return o.grade - this.grade;
            //按低到高排列
            //			return  this.grade - o.grade;
        }

    }
}

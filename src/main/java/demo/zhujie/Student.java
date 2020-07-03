package demo.zhujie;

import java.io.Serializable;

@Table(tableName = "Student")
public class Student implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -2264645051475295324L;
    @Column(columnName = "s_id", columnTraint = "PRIMARY KEY")
    private int id;
    @Column(columnName = "s_name", columnTraint = "NOT NULL")
    private String name;
    @Column(columnName = "s_birthday", columnTraint = "NOT NULL")
    private String birthday;
    @Column(columnName = "s_sex", columnTraint = "NOT NULL")
    private char sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Student() {
        super();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + sex;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (birthday == null) {
            if (other.birthday != null)
                return false;
        } else if (!birthday.equals(other.birthday))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sex != other.sex)
            return false;
        return true;
    }

}

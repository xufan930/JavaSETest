package cn.itcast.model;

import java.io.Serializable;

/**
 * @author : XU
 * @date : 2018/12/12 11:50
 */
public class People implements Serializable {
    private static final long serialVersionUID = 1L;
    public String abc;
    private transient int age;
    private String sex;

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public People() {
    }

    public People(String abc, int age, String sex) {
        this.abc = abc;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;

        People people = (People) o;

        if (getAge() != people.getAge()) return false;
        if (getAbc() != null ? !getAbc().equals(people.getAbc()) : people.getAbc() != null) return false;
        return getSex() != null ? getSex().equals(people.getSex()) : people.getSex() == null;
    }

    @Override
    public int hashCode() {
        int result = getAbc() != null ? getAbc().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (getSex() != null ? getSex().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "People{" +
                "abc='" + abc + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

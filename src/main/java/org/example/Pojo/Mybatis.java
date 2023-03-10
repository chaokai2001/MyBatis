package org.example.Pojo;

public class Mybatis {
    private String school;
    private String dddd;
    @Override
    public String toString() {
        return "Mybatis{" +
                "school='" + school + '\'' +
                ", dddd='" + dddd + '\'' +
                '}';
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDddd() {
        return dddd;
    }

    public void setDddd(String dddd) {
        this.dddd = dddd;
    }

}

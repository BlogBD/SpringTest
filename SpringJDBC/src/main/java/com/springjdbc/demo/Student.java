package com.springjdbc.demo;


public class Student {

  private String id;
  private String name;
  private String gender;
  private String college;
  private String specialty;
  private String grade;
  private String counsellor;
  private String phone;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getCollege() {
    return college;
  }

  public void setCollege(String college) {
    this.college = college;
  }


  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }


  public String getCounsellor() {
    return counsellor;
  }

  public void setCounsellor(String counsellor) {
    this.counsellor = counsellor;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", college='" + college + '\'' +
            ", specialty='" + specialty + '\'' +
            ", grade='" + grade + '\'' +
            ", counsellor='" + counsellor + '\'' +
            ", phone='" + phone + '\'' +
            '}';
  }
}

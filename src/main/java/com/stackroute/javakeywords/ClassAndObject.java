//More on Classes and Objects - Anatomy of a class, Constructors, Creating and using objects, this keyword, Controlling access to a member
//OOPs Concepts - Object, Class,Package

package com.stackroute.javakeywords;

public class ClassAndObject {

    private String Name;
    private  int age;

    public ClassAndObject() {
    }

    public ClassAndObject(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ClassAndObject{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}

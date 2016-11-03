package com.ajay.developer.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ajay on 11/3/2016.
 */

public class Student implements Parcelable {

    String name, address, course;
    int age;

    public Student(String name, int age, String address, String course) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.course = course;
    }

    protected Student(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.address = in.readString();
        this.course = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(address);
        dest.writeString(course);

    }
}
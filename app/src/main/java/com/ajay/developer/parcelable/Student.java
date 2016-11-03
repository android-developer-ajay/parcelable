package com.ajay.developer.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ajay on 11/3/2016.
 */

public class Student implements Parcelable {
    String mSName;
    int mSAge;
    String mSAddress;
    String mSCourse;

    public Student(String name, int age, String address, String Course) {
        this.mSName = name;
        this.mSAge = age;
        this.mSAddress = address;
        this.mSCourse = Course;
    }

    private Student(Parcel in) {
        this.mSName = in.readString();
        this.mSCourse = in.readString();
        this.mSAddress = in.readString();
        this.mSAge = in.readInt();


    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSName);
        dest.writeString(mSAddress);
        dest.writeString(mSCourse);
        dest.writeInt(mSAge);
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
}

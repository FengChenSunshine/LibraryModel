package com.duanlu.model;

import android.os.Parcel;
import android.os.Parcelable;

/********************************
 * @name Model
 * @author 段露
 * @createDate 2019/05/15 10:10
 * @updateDate 2019/05/15 10:10
 * @version V1.0.0
 * @describe 数据模型基类.
 ********************************/
public class Model implements Parcelable {

    private long id;

    public Model() {

    }

    public Model(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * 注意：id为0时认为不相等.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass().isInstance(obj) && obj instanceof Model) {
            Model anotherModel = (Model) obj;
            return this.id != 0 && anotherModel.id != 0 && this.id == anotherModel.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
    }

    protected Model(Parcel in) {
        this.id = in.readLong();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel source) {
            return new Model(source);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

}
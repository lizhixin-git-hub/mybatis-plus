package com.lzx.mybatis.generator.model;

import java.io.Serializable;

/**
 * create by :src  2021/3/1
 */
public class EduClass implements Serializable {
    /**
     * 班级id
     */
    private Integer cId;

    /**
     * 班级名称
     */
    private String cName;

    /**
     * 教师id
     */
    private Integer teacherId;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", cId=" + cId +
                ", cName=" + cName +
                ", teacherId=" + teacherId +
                "]";
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EduClass other = (EduClass) that;
        return (this.getcId() == null ? other.getcId() == null : this.getcId().equals(other.getcId()))
                && (this.getcName() == null ? other.getcName() == null : this.getcName().equals(other.getcName()))
                && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getcId() == null) ? 0 : getcId().hashCode());
        result = prime * result + ((getcName() == null) ? 0 : getcName().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        return result;
    }
}
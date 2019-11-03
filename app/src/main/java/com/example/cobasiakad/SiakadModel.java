package com.example.cobasiakad;

public class SiakadModel {
    String semester;
    String matkul1,matkul2,matkul3,matkul4,matkul5,matkul6;
    String sks1;
    String sks2;
    String sks3;
    String sks4;
    String sks5;
    String sks6;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    String total;

    public String getMatkul1() {
        return matkul1;
    }

    public void setMatkul1(String matkul1) {
        this.matkul1 = matkul1;
    }

    public String getMatkul2() {
        return matkul2;
    }

    public void setMatkul2(String matkul2) {
        this.matkul2 = matkul2;
    }

    public String getMatkul3() {
        return matkul3;
    }

    public void setMatkul3(String matkul3) {
        this.matkul3 = matkul3;
    }

    public String getMatkul4() {
        return matkul4;
    }

    public void setMatkul4(String matkul4) {
        this.matkul4 = matkul4;
    }

    public String getMatkul5() {
        return matkul5;
    }

    public void setMatkul5(String matkul5) {
        this.matkul5 = matkul5;
    }

    public String getMatkul6() {
        return matkul6;
    }

    public void setMatkul6(String matkul6) {
        this.matkul6 = matkul6;
    }

    public String getSks1() {
        return sks1;
    }

    public void setSks1(String sks1) {
        this.sks1 = sks1;
    }

    public String getSks2() {
        return sks2;
    }

    public void setSks2(String sks2) {
        this.sks2 = sks2;
    }

    public String getSks3() {
        return sks3;
    }

    public void setSks3(String sks3) {
        this.sks3 = sks3;
    }

    public String getSks4() {
        return sks4;
    }

    public void setSks4(String sks4) {
        this.sks4 = sks4;
    }

    public String getSks5() {
        return sks5;
    }

    public void setSks5(String sks5) {
        this.sks5 = sks5;
    }

    public String getSks6() {
        return sks6;
    }

    public void setSks6(String sks6) {
        this.sks6 = sks6;
    }


    public SiakadModel(String semester, String matkul1, String matkul2, String matkul3, String matkul4, String matkul5, String matkul6, String sks1, String sks2, String sks3, String sks4, String sks5, String sks6, String total) {
        this.semester = semester;
        this.matkul1 = matkul1;
        this.matkul2 = matkul2;
        this.matkul3 = matkul3;
        this.matkul4 = matkul4;
        this.matkul5 = matkul5;
        this.matkul6 = matkul6;
        this.sks1 = sks1;
        this.sks2 = sks2;
        this.sks3 = sks3;
        this.sks4 = sks4;
        this.sks5 = sks5;
        this.sks6 = sks6;
        this.total = total;
    }


    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }


}

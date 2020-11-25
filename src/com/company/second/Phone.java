package com.company.second;

public class Phone {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private int accountNumber;
    private int cityTalkTime;
    private int longDistanceTalkTime;

    public Phone(int id, String surname, String name, String middleName, int accountNumber, int cityTalkTime, int longDistanceTalkTime) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.accountNumber = accountNumber;
        this.cityTalkTime = cityTalkTime;
        this.longDistanceTalkTime = longDistanceTalkTime;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", accountNumber=" + accountNumber +
                ", cityTalkTime=" + cityTalkTime +
                ", longDistanceTalkTime=" + longDistanceTalkTime +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCityTalkTime() {
        return cityTalkTime;
    }

    public void setCityTalkTime(int cityTalkTime) {
        this.cityTalkTime = cityTalkTime;
    }

    public int getLongDistanceTalkTime() {
        return longDistanceTalkTime;
    }

    public void setLongDistanceTalkTime(int longDistanceTalkTime) {
        this.longDistanceTalkTime = longDistanceTalkTime;
    }


}

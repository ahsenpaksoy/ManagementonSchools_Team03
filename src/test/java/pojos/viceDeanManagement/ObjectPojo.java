package pojos.viceDeanManagement;

import java.io.Serializable;

public class ObjectPojo implements Serializable {

 
    private String email;
    private String subject;
    private String message;
    private String date;

    private int userId;
    private String username;
    private String name;
    private String surname;
    private String birthDay;
    private String ssn;
    private String birthPlace;
    private String phoneNumber;
    private String gender;

    public ObjectPojo() {
    }

    public ObjectPojo(int userId, String username, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.ssn = ssn;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;

    }

    @Override
    public String toString() {
        return
                "ObjectPojo{" +


                        ",email = '" + email + '\'' +
                        ",subject = '" + subject + '\'' +
                        ",message = '" + message + '\'' +
                        ",date = '" + date + '\'' +

                        "userId = '" + userId + '\'' +
                        ",username = '" + username + '\'' +
                        ",name = '" + name + '\'' +
                        ",surname = '" + surname + '\'' +
                        ",birthDay = '" + birthDay + '\'' +
                        ",ssn = '" + ssn + '\'' +
                        ",birthPlace = '" + birthPlace + '\'' +
                        ",phoneNumber = '" + phoneNumber + '\'' +
                        ",gender = '" + gender + '\'' +
                        "}";
    }
}


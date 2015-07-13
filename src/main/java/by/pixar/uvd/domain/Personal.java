package by.pixar.uvd.domain;

import javax.persistence.*;

@Entity
@Table(name = "PERSONAL")
public class Personal {

    // ID
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    //'�������'
    @Column(name = "LASTNAME")
    private String lastName;

    //'���'
    @Column(name = "FIRSTNAME")
    private String firstName;

    //'��������'
    @Column(name = "SECONDNAME")
    private String secondName ;




    // Getters and setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


}

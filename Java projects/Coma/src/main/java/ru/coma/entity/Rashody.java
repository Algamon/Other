package ru.coma.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rashody")
public class Rashody implements Serializable {

    @Id
    @Column
    @GeneratedValue
    private int id;

    @Column
    private String date;

    @Column(unique = true)
    private String rashodi;

    @Column(unique = true)
    private String statia;

    @Column(unique = true)
    private String osnovanie;

    public Rashody() {
    }

    public Rashody(int id,String date, String rashodi, String statia, String osnovanie) {
        this.id = id;
        this.date = date;
        this.rashodi = rashodi;
        this.statia = statia;
        this.osnovanie = osnovanie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String name) {
        this.date = name;
    }

    public String getRashodi() {
        return rashodi;
    }

    public void setRashodi(String phone) {
        this.rashodi = phone;
    }

    public String getStatia() {
        return statia;
    }

    public void setStatia(String email) {
        this.statia = email;
    }
    public String getOsnovanie() {
        return osnovanie;
    }

    public void setOsnovanie(String phone) {
        this.osnovanie = phone;
    }
}

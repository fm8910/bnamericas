package com.chile.bnamericas.model;

import javax.persistence.*;

@Entity
@Table(name = "feriados")
public class Feriados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String date;
    public String title;
    public String extra;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}

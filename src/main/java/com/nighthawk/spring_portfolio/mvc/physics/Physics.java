package com.nighthawk.spring_portfolio.mvc.physics;

import javax.persistence.*;

@Entity // Annotation to simplify creating an entity, which is a lightweight persistence domain object. Typically, an entity represents a table in a relational database, and each entity instance corresponds to a row in that table.
public class Physics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    private String equation;
    
    @Column
    private int haha;

    @Column
    private int boohoo;

    @Column
    private int share;

    private Physics() {   

    }

    protected Physics(Long id, String equation, int haha, int boohoo, int share) {
        if (equation == null) throw new NullPointerException("equation");
        this.haha = haha;
        this.boohoo = boohoo;
        System.out.println(equation);
        this.equation = equation;
        this.share = share;
    }

    public String getPhysics() {
        return this.equation;
    }

    public int getHaha() {
        return this.haha;
    }

    public int getBoohoo() {
        return this.boohoo;
    }

    public int getShare() {
        return this.share;
    }

    public void setPhysics(String equation) {
        this.equation=equation;
    }

    public void setHaha(int haha) {
        this.haha=haha;
    }

    public void setBoohoo(int boohoo) {
        this.boohoo=boohoo;
    }

    public void setShare(int share) {
        this.share=share;
    }
}

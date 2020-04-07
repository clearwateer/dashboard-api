package com.dashboard.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.dashboard.entities.Scenario;
/**
 * Created by saad on 4/6/2020.
 */
@Entity
@Table(name = "features")
public class Feature extends BaseEntity {

    @Column(name = "name")
    private String name;

    @OneToMany(
            mappedBy = "feature",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Scenario> scenarios = new ArrayList<Scenario>();

    public Feature(){}

    public Feature(String name){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

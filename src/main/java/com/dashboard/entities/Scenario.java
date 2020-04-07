package com.dashboard.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.dashboard.entities.Feature;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Created by saad on 4/6/2020.
 */
@Entity
@Table(name = "scenarios")
public class Scenario extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "feature_id", referencedColumnName="id", nullable = false)
    private Feature feature;
}

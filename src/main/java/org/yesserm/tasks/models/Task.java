package org.yesserm.tasks.models;

import jakarta.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Task extends PanacheEntity {
    public String title;
    public Boolean completed;
}

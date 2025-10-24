package org.yesserm.tasks.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.yesserm.tasks.models.Task;

@ApplicationScoped
public class TaskRepository implements PanacheRepository<Task> {}


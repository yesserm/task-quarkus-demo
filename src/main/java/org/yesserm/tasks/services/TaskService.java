package org.yesserm.tasks.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.yesserm.tasks.models.Task;
import org.yesserm.tasks.repositories.TaskRepository;
import java.util.List;

@ApplicationScoped
public class TaskService {
    @Inject TaskRepository repo;

    public List<Task> getAll() {
        return repo.listAll();
    }

    public Task create(Task task) {
        task.completed = false;
        repo.persist(task);
        return task;
    }
}

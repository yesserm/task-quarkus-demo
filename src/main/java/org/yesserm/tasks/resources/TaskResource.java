package org.yesserm.tasks.resources;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.yesserm.tasks.models.Task;
import org.yesserm.tasks.services.TaskService;
import java.util.List;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {
    @Inject 
    TaskService service;

    @GET
    public List<Task> getAll() {
        return service.getAll();
    }

    @POST
    @Transactional
    public Task create(Task task) {
        return service.create(task);
    }
}

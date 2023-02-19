package domain.event;

import org.springframework.context.ApplicationEvent;

public class ProjectEvent extends ApplicationEvent {
    private final Long projectId;

    public ProjectEvent(Object source, Long projectId) {
        super(source);
        this.projectId = projectId;
    }

    public Long getProjectId() {
        return projectId;
    }
}

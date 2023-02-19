package domain.event;

import domain.model.Consultant;
import org.springframework.context.ApplicationEvent;

public class ConsultantEvent extends ApplicationEvent {
    private Consultant consultant;
    private String eventType;

    public ConsultantEvent(Consultant consultant, String eventType) {
        super(consultant);
        this.consultant = consultant;
        this.eventType = eventType;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
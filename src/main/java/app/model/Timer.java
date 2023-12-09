package app.model;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        System.out.println("Time bean created");
        return nanoTime;
    }
}

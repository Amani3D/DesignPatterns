package factoryMethod;

public class DevelopmentManager extends HiringManager {

    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}

package factoryMethod;

abstract public class HiringManager {

    abstract protected Interviewer makeInterviewer();

    public void takeInterview() {

        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }
}

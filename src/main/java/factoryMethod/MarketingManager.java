package factoryMethod;

public class MarketingManager extends HiringManager {

    protected Interviewer makeInterviewer() {
        return new CommunityExclusive();
    }
}

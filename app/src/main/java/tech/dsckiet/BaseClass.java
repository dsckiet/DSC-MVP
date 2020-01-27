package tech.dsckiet;

public class BaseClass {

    private static BaseClass mInstance = null;

    public String BASE_URL = "https://www.dsckiet.tech";
    public String BASE_URL_EVENTS = "https://www.dsckiet.tech/api/v1/events";
    public String BASE_URL_STORIES = "https://www.dsckiet.tech/api/v1/stories";
    public String BASE_URL_TEAM = "https://www.dsckiet.tech/api/v1/team";
    public String BASE_URL_PROJECT = "https://www.dsckiet.tech/api/v1/ideas";
    public String BASE_URL_LEADERBOARD = "https://www.dsckiet.tech/api/v1/gscpHackerrank";


    protected BaseClass() {

    }

    public static synchronized BaseClass getInstance() {
        if (null == mInstance) {
            mInstance = new BaseClass();
        }
        return mInstance;
    }
}

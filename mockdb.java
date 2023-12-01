import java.util.HashMap;
import java.util.Map;

public class MockDatabase {

    private static final Map<String, String> data = new HashMap<>();

    static {
        data.put("Project1", "Data Analysis Module Implementation");
        data.put("Project2", "User Authentication System Upgrade");
        // Add more mock data as needed
    }

    public static String getProjectDetails(String projectName) {
        return data.getOrDefault(projectName, null);
    }
}

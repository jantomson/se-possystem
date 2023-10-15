package ee.ut.math.tvt.salessystem.dataobjects;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TeamInfo {
    private static String teamName;
    private String teamContact;
    private String teamMembers;
    private String teamLogoPath;

    public TeamInfo() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            teamName = properties.getProperty("team.name");
            teamContact = properties.getProperty("team.contact");
            teamMembers = properties.getProperty("team.members");
            teamLogoPath = properties.getProperty("team.logo.path");

            System.out.println("Team name: " + teamName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getTeamName() {
        System.out.println("Team name: " + teamName);
        return teamName;
    }

    public String getTeamContact() {
        return teamContact;
    }

    public String getTeamMembers() {
        return teamMembers;
    }

    public String getTeamLogoPath() {
        return teamLogoPath;
    }
}


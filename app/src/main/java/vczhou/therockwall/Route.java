package vczhou.therockwall;

import java.util.*;
import java.text.*;

/**
 * Created by Victoria on 10/22/16.
 */

public class Route {
    private String name;
    private String difficulty;
    private Date lastDate;
    private List<Date> datesClimbed;
    private int timesClimbed;
    private String description;
    SimpleDateFormat ft = new SimpleDateFormat ("E MM.dd.yyyy 'at' hh:mm:ss a zzz");

    public Route() {
        this.name = "unmamed";
        this.difficulty = "n/a";
        this.lastDate = new Date();
        this.datesClimbed = new ArrayList<>();
        this.datesClimbed.add(lastDate);
        this.timesClimbed = 1;
        this.description = "";
    }

    public Route(String name, String difficulty, Date lastDate, String description) {
        this.name = name;
        this.difficulty = difficulty;
        this.lastDate = lastDate;
        datesClimbed = new ArrayList<>();
        datesClimbed.add(lastDate);
        this.timesClimbed = 1;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = name;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date date) {
        this.lastDate = date;
    }

    public List<Date> getDatesClimbed() {
        return datesClimbed;
    }

    public void addDateClimbed(Date date) {
        datesClimbed.add(date);
    }

    public int getTimesClimbed() {
        return timesClimbed;
    }

    public void setTimesClimbed(int times) {
        this.timesClimbed = times;
    }

    public void incrementTimesClimbed() {
        this.timesClimbed++;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        StringBuffer s = new StringBuffer();

        s.append("Name: " + name + "\n");
        s.append("Difficulty: " + difficulty  + "\n");
        s.append("Last date climbed: " + ft.format(lastDate)  + "\n");
        s.append("Total times climbed: " + timesClimbed  + "\n");
        s.append("Description: " + description  + "\n");

        return s.toString();
    }

}

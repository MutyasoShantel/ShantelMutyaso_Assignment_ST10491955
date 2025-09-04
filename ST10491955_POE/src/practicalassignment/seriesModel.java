/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicalassignment;

/**
 *
 * @author lab_services_student
 */
public class seriesModel {
    // Fields to hold all the information for one series
     int seriesId;
     String seriesName;
     int seriesAgeRestriction;
     int seriesNumberOfEpisodes;

    // Constructor to create a new series object
    public seriesModel(int id, String name, int age, int episodes) {
        this.seriesId = id;
        this.seriesName = name;
        this.seriesAgeRestriction = age;
        this.seriesNumberOfEpisodes = episodes;
    }

    // --- Getter methods to access the data ---
    public int getSeriesId() {
        return seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public int getSeriesAgeRestriction() {
        return seriesAgeRestriction;
    }
    
    public int getSeriesNumberOfEpisodes() {
        return seriesNumberOfEpisodes;
    }

    
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public void setSeriesAgeRestriction(int seriesAgeRestriction) {
        this.seriesAgeRestriction = seriesAgeRestriction;
    }

    public void setSeriesNumberOfEpisodes(int seriesNumberOfEpisodes) {
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }
}

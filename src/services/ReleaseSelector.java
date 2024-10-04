package services;

import model.Release;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReleaseSelector {
    public static List<int[]> selectMaxReleases(List<Release> releases) {
        List<int[]> selectedReleases = new ArrayList<>();
        releases.sort(Comparator.comparingInt(r -> r.getDeliveryDay()));

        int currentDay = 1;
        int startDay ;
        int endDay = 0;

        for (Release release : releases) {
            startDay = release.getDeliveryDay();
            endDay += release.getDaysRequired();

            if (startDay <= currentDay && endDay <= 10) {
                System.out.println("Project #:" + startDay);
                System.out.println("day of the sprint: " + currentDay);
                System.out.println("given start date: " + startDay);
                System.out.println("estimated end date: " + endDay);
                selectedReleases.add(new int[]{startDay, endDay});
                currentDay = endDay + 1;
            } else {
   // if not achievable reset end date
                endDay -= release.getDaysRequired();
            }
        }

        return selectedReleases;
    }
}
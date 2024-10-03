package test;

import model.Release;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SprintReleaseSelector {
    public static List<Release> selectMaximumReleases(List<Release> releases) {

        // Sort releases by their start day and duration
        Collections.sort(releases, Comparator.comparingInt(Release::getDeliveryDay).thenComparingInt(Release::getDaysRequired));

        List<Release> selectedReleases = new ArrayList<>();
        int currentDay = 1;

        for (Release release : releases) {
            int startDay = release.getDeliveryDay();
            int duration = release.getDaysRequired();

            if (startDay >= currentDay && startDay + duration - 1 <= 10) {
                selectedReleases.add(release);
                currentDay = startDay + duration;
            }
        }

        return selectedReleases;
    }
}

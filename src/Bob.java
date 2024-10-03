import model.Release;
import services.ReleaseSelector;
import utils.FileUtils;

import java.util.List;

public class Bob {
    public static void main(String[] args) {
        List<Release> releases = FileUtils.readReleasesFromFile("releases2.txt");
        List<int[]> selectedReleases = ReleaseSelector.selectMaxReleases(releases);
        FileUtils.writeSolutionToFile(selectedReleases, "solution.txt");
    }
}


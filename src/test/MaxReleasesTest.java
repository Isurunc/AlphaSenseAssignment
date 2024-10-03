
package test;
import model.Release;
import org.testng.annotations.Test;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class MaxReleasesTest {

    @Test
    public void testEmptyInput() {
        // Empty input list of releases
        List<Release> releases = new ArrayList<>();
        List<Release> selectedReleases = SprintReleaseSelector.selectMaximumReleases(releases);

        // Expecting an empty list
        assertEquals(0, selectedReleases.size());
    }

}



package utils;

import model.Release;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<Release> readReleasesFromFile(String fileName) {
        List<Release> releases = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                int deliveryDay = Integer.parseInt(parts[0]);
                int daysRequired = Integer.parseInt(parts[1]);
                releases.add(new Release(deliveryDay, daysRequired));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return releases;
    }

    public static void writeSolutionToFile(List<int[]> selectedReleases, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(selectedReleases.size() + "\n");
            for (int[] release : selectedReleases) {
                bw.write(release[1] + " " + release[1] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

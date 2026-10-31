package io.github.projectunified.mcserverupdater.updater;

import io.github.projectunified.mcserverupdater.api.JenkinsUpdater;
import io.github.projectunified.mcserverupdater.util.VersionQuery;

import java.util.regex.Pattern;

public class DashSpigotUpdater extends JenkinsUpdater {
    public DashSpigotUpdater(VersionQuery versionQuery) {
        super(versionQuery, "https://jenkins.dashnetwork.xyz/");
    }

    @Override
    public String[] getJob() {
        return new String[]{"DashSpigot"};
    }

    @Override
    public Pattern getArtifactRegex() {
        return Pattern.compile("paperclip\\.jar");
    }

    @Override
    public String getDefaultVersion() {
        return "1.8.8";
    }
}

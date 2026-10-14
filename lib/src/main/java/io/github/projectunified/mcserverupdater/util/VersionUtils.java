package io.github.projectunified.mcserverupdater.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionUtils {
    private static final Pattern VERSION_REGEX = Pattern.compile("(\\d+)\\.(\\d+)(\\.(\\d+))?");

    public static boolean isAtLeast(String version, int major, int minor) {
        Matcher matcher = VERSION_REGEX.matcher(version);
        if (!matcher.find()) {
            return false;
        }
        int majorVersion = Integer.parseInt(matcher.group(2));
        String minorGroup = matcher.group(4);
        int minorVersion = minorGroup != null ? Integer.parseInt(minorGroup) : 0;

        return majorVersion > major || (majorVersion == major && minorVersion >= minor);
    }

    public static boolean isMojmapPaperDefault(String version) {
        return isAtLeast(version, 20, 5);
    }
}

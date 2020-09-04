package uk.co.innoxium.artificer;

import uk.co.innoxium.cybernize.registry.NamedRegistry;

import java.net.URL;

/**
 *
 *
 */
public class Artificer {

    private static final NamedRegistry<MavenRepository> REPOSITORIES = new NamedRegistry<>();

    private static final MavenRepository MAVEN_CENTRAL = MavenRepository
            .builder()
            .name("Maven Central")
            .url("https://repo1.maven.org/maven2/")
            .artifactUrl("https://repo.maven.apache.org/maven2/")
            .build();

    private static final MavenRepository JCENTER = MavenRepository
            .builder()
            .name("JCenter")
            .url("https://jcenter.bintray.com/")
            .build();

    private static final MavenRepository SONATYPE = MavenRepository
            .builder()
            .name("Sonatype")
            .url("https://oss.sonatype.org/content/repositories/releases/")
            .build();

    static {

        REPOSITORIES.setIgnoreValueOnRegister(true);
    }

    public static int addRepository(MavenRepository repository) {

        return REPOSITORIES.register(repository.getName(), repository);
    }

    public static void addMavenCentral() {

        REPOSITORIES.register(MAVEN_CENTRAL.getName(), MAVEN_CENTRAL);
    }

    public static void addJCenter() {

        REPOSITORIES.register(JCENTER.getName(), JCENTER);
    }

    public static void addSonatype() {

        REPOSITORIES.register(SONATYPE.getName(), SONATYPE);
    }

    /**
     *
     * @param artifact based on the gradle style, e.g. "uk.co.innoxium:artificer:1.0"
     *                 , "com.google.inject:guice:3.0:no_app@zip" (@ symbol changes extension from jar to zip)
     * @return A url which can then be accessed for downloading if required
     */
    public static URL findArtifact(String artifact) {

        return null;
    }
}

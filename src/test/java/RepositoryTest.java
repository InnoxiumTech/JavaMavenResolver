import uk.co.innoxium.artificer.Artificer;
import uk.co.innoxium.artificer.MavenRepository;

public class RepositoryTest {

    public static void main(String... args) {

        MavenRepository cybernizeRepo = MavenRepository.builder().name("Cybernize Repo").url("https://dl.bintray.com/candor/cybernize").build();
        Artificer.addRepository(cybernizeRepo);
    }
}

package uk.co.innoxium.artificer;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;

/**
 *
 *
 */
@Builder
public class MavenRepository {

    @NonNull
    @Getter
    private String name;
    @NonNull
    @Getter
    private String url;
    @Singular()
    @Getter
    private List<String> artifactUrls;


}

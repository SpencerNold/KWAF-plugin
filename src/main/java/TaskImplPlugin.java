import org.gradle.api.Plugin;
import org.gradle.api.Project;

public final class TaskImplPlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.getTasks().register("genKeyStore", GenKeyStoreTask.class);
        target.getTasks().register("genSiteMap", GenSiteMapTask.class);
    }
}

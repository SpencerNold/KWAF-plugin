import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class GenSiteMapTask extends DefaultTask {

    @TaskAction
    public void execute() {
        System.out.println("Run genSiteMap!!!");
    }
}

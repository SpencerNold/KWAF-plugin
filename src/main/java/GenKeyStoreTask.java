import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class GenKeyStoreTask extends DefaultTask {

    @TaskAction
    public void execute() {
        System.out.println("Run genKeyStore!!!");
    }
}

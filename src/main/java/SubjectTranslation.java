import java.util.HashMap;
import java.util.Map;

public class SubjectTranslation {

    protected String subjectsToTranslate;

    public SubjectTranslation(String subjects) {
        this.subjectsToTranslate = subjects;
    }

    Map<String, String> translationMap = new HashMap<>();
    SubjectsInRussian subjectsInRussian = new SubjectsInRussian();
    SubjectsInEnglish subjectsInEnglish = new SubjectsInEnglish();
    String[] original = subjectsInRussian.getSubjectsArray();
    String[] translation = subjectsInEnglish.getSubjectsArray();

    public void translate() {
        System.out.println(original.length == translation.length);
    }
}

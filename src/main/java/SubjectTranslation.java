import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubjectTranslation {

    private final String[] subjects;

    public SubjectTranslation(String subjects) {
        this.subjects = subjects.split("\n");
    }

    SubjectsInRussian subjectsInRussian = new SubjectsInRussian();
    SubjectsInEnglish subjectsInEnglish = new SubjectsInEnglish();
    private final String[] original = subjectsInRussian.getSubjectsArray();
    private final String[] translation = subjectsInEnglish.getSubjectsArray();

    private ArrayList<String> getMissingSubjects(Map<String, String> map, String[] array) {
        ArrayList<String> missingSubjects = new ArrayList<>();
        for (String str : array) {
            if (!map.containsKey(str)) {
                missingSubjects.add(str);
            }
        }
        return missingSubjects;
    }

    private boolean isMissing(Map<String, String> map, String[] array) {
        boolean result = false;
        for (String str : array) {
            if (!map.containsKey(str)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private HashMap<String, String> fillMap(String[] originalArray, String[] translationArray) {
        HashMap<String, String> map = new HashMap<>();
        if (originalArray.length != translationArray.length) {
            System.out.println("МАССИВЫ НЕ РАВНЫ!");
        } else {
            for (int i = 0; i < original.length; i++) {
                map.put(original[i], translation[i]);
            }
        }
        return map;
    }

    protected ArrayList<String> translate() {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, String> translationMap = fillMap(original, translation);
        if (isMissing(translationMap, subjects)) {
            result = getMissingSubjects(translationMap, subjects);
        } else {
            for (String subject : subjects) {
                result.add(translationMap.get(subject));
            }
        }
        return result;
    }
}
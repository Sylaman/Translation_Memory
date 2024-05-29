import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubjectTranslation {

    OriginalDB originalDB = new OriginalDB();
    TranslationDB translationDB = new TranslationDB();
    private final String[] allOriginalSubjects;
    private final String[] allTranslatedSubjects;
    private final String[] subjectsToTranslate;

    public SubjectTranslation(String subjectsToTranslate) {
        this.subjectsToTranslate = subjectsToTranslate.split("\n");
        this.allOriginalSubjects = originalDB.getSubjectsArray();
        this.allTranslatedSubjects = translationDB.getSubjectsArray();
    }


    private ArrayList<String> getMissingSubjects(Map<String, String> map) {
        ArrayList<String> missingSubjects = new ArrayList<>();
        for (String str : subjectsToTranslate) {
            if (!map.containsKey(str)) {
                missingSubjects.add(str);
            }
        }
        return missingSubjects;
    }

    private boolean isMissing(Map<String, String> map) {
        boolean result = false;
        for (String str : subjectsToTranslate) {
            if (!map.containsKey(str)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private HashMap<String, String> fillMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < allOriginalSubjects.length; i++) {
            map.put(allOriginalSubjects[i], allTranslatedSubjects[i]);
        }
        return map;
    }

    protected ArrayList<String> translate() {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, String> translationMap = fillMap();

        if (isMissing(translationMap)) {
            result = getMissingSubjects(translationMap);
            return result;
        }
        for (String str : subjectsToTranslate) {
            result.add(translationMap.get(str).concat(" "));
        }
        return result;
    }
}
import java.util.HashMap;

public class SubjectTranslation {

    protected String subjectsToTranslate;
    String[] subjects;

    public SubjectTranslation(String subjects) {
        this.subjectsToTranslate = subjects;
        this.subjects = subjectsToTranslate.split("\n");
    }

    HashMap<String, String> translationMap = new HashMap<>();
    SubjectsInRussian subjectsInRussian = new SubjectsInRussian();
    SubjectsInEnglish subjectsInEnglish = new SubjectsInEnglish();
    String[] original = subjectsInRussian.getSubjectsArray();
    String[] translation = subjectsInEnglish.getSubjectsArray();

    public boolean containsMissingKeys(HashMap<String, String> hashMap, String[] array) {
        boolean missingKeys = false;
        for (String str : array) {
            // Если текущая строка не является ключом в HashMap, выводим ее
            if (!hashMap.containsKey(str)) {
                missingKeys = true;
                System.out.println(str);
            }
        }
        return missingKeys;
    }

    public void translate() {
        for (int i = 0; i < original.length; i++) {
            translationMap.put(original[i], translation[i]);
        }

        if (containsMissingKeys(translationMap, subjects)) {
            System.out.println("Есть отсутствующие строки в ключах HashMap:");
        } else {
            System.out.println("Все строки из массива присутствуют в ключах HashMap.");
            //TODO реализовать вывод значений по всем ключам
        }
    }
}
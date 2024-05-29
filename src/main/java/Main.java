import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String subjects = """
                """.trim();
        String hours = " ";
        String marks = " ";

        HoursSplitter hoursSplitter = new HoursSplitter(hours);
        MarksTranslation marksTranslation = new MarksTranslation(marks);
        SubjectTranslation subjectTranslation = new SubjectTranslation(subjects);

        ArrayList<String> translation = subjectTranslation.translate();
        print(translation);

        System.out.println();
        System.out.println("КОЛИЧЕСТВО ЧАСОВ:");
        hoursSplitter.print();

        System.out.println();
        System.out.println("ОЦЕНКИ:");
        String[] splitMarks = marksTranslation.split();
        String[] translatedMarks = marksTranslation.translate(splitMarks);
        marksTranslation.print(translatedMarks);
    }

    private static void print(ArrayList<String> list) {
        System.out.println();
        if (list.get(0).matches(".*[\\u0400-\\u04FF].*")) {
            System.out.println("Отсутствует перевод следующих элементов:");
            System.out.println();
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}

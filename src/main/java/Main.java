import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String subjects = """
                Кросс-культурная психология (изучена на английском языке)
                Теория и методология современной психологии (изучена на английском языке)
                Качественные и количественные методы исследований в психологии (изучена на английском языке)
                Кросс-культурная психология организационного поведения (изучена на английском языке)
                Межличностное взаимодействие (изучена на английском языке)
                Методология кросс-культурных исследований (изучена на английском языке)
                Социокультурные аспекты клинической и патопсихологии (изучена на английском языке)
                Бизнес-аналитика в среде R и Python
                Прикладная психология потребительского поведения (изучена на английском языке)
                Поведенческая экономика (изучена на английском языке)
                Психология труда и организационная психология (изучена на английском языке)
                Лидерство и организация (изучена на английском языке)
                Анализ организаций (изучена на английском языке)
                Научно-исследовательский семинар "Социальная и кросскультурная психология" (изучена на английском языке)
                Междисциплинарные курсовые работы
                """.trim();
        String hours = """

                """;
        String marks = """
                
                """;

        HoursSplitter hoursSplitter = new HoursSplitter(hours);
        MarksTranslation marksTranslation = new MarksTranslation(marks);
        SubjectTranslation subjectTranslation = new SubjectTranslation(subjects);

        ArrayList<String> translatedSubjects = subjectTranslation.translate();
        print(translatedSubjects);

        System.out.println();
        System.out.println("КОЛИЧЕСТВО ЧАСОВ:");
        hoursSplitter.print();

        System.out.println("ОЦЕНКИ:");
        ArrayList<String> translatedMarks = marksTranslation.translate();
        try {
            print(translatedMarks);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Не указаны оценки");
        }
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

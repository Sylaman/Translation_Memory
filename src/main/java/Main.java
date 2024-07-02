import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String subjects = """
                Дизайн химических сенсоров: от фундаментальных основ к практическим применениям
                Кристаллохимия
                Химия материалов
                Введение в физику твердого тела
                Электрохимия: основы и приложения
                Прикладные материалы и их применение
                Методы исследования материалов
                Методы исследования кристаллических структур
                Маркетинг и коммерциализация для предпринимателей
                Ключевые навыки инноватора: критическое и творческое мышление, коммуникация и сотрудничество
                Блокчейн-предпринимательство и инновации
                Английский язык для диссертации
                Научно-исследовательский семинар по выпускной квалификационной работе
                Исследовательский семинар
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

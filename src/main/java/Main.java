import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String subjects = """
                Современные проблемы химической технологии
                История и методология химической технологии
                Компьютерные технологии в науке и производстве
                Философские вопросы естествознания и технических наук
                Дополнительные главы математики
                Дополнительные главы химии
                Иностранный язык
                Педагогика и психология
                Современная нефтяная и нефтеперерабатывающая промышленность
                Спецглавы химической технологии переработки горючих ископаемых
                Теоретические основы химической технологии топлив и углеродных материалов
                Моделирование в химической промышленности и расчет реакторов
                Основы научных исследований и проектирование
                Научно-исследовательская практика
                Научно-педагогическая практика
                Научно-исследовательская работа
                """.trim();
        String hours = """

                """;
        String marks = """
                отлично отлично отлично отлично отлично отлично хорошо зачтено отлично отлично
                отлично отлично зачтено отлично отлично зачтено
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

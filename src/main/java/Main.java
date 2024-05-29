import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String subjects = """
                Иностранный язык
                Философия
                Культурология
                Отечественная история
                Правоведение
                Социология
                Политология
                Психология и педагогика
                Физическая культура
                Русский язык и культура речи
                Математика
                Информатика
                Концепции современного естествознания
                Основы менеджмента
                История менеджмента
                Экономическая теория
                Маркетинг
                Теория организации
                Мировая экономика
                Финансы и кредит
                Статистика
                Бухгалтерский учет
                Организационное поведение
                Хозяйственное право
                История экономики
                Этика и культура управления
                Экология
                Эконометрика
                Анализ финансово-хозяйственной деятельности предприятия
                Документационное обеспечение управления
                Социология управления
                Безопасность жизнедеятельности
                Экономика предприятий
                Исследование социально-экономических и политических процессов
                Стратегический менеджмент
                Исследование систем управления
                Управленческие решения
                Информационные технологии управления
                """.trim();
        String hours = " ";
        String marks = """
                Зачтено
                Хорошо
                Зачтено
                Удовлетворительно
                Зачтено
                Удовлетворительно
                Зачтено
                Хорошо
                Хорошо
                Хорошо
                Зачтено
                Удовлетворительно
                Зачтено
                Хорошо
                Зачтено
                Хорошо
                Хорошо
                Хорошо
                Зачтено
                Зачтено
                Зачтено
                Зачтено
                Зачтено
                Зачтено
                Зачтено
                Зачтено
                Хорошо
                Зачтено
                Хорошо
                Зачтено
                Хорошо
                Зачтено
                Зачтено
                Удовлетворительно
                Зачтено
                Зачтено
                Хорошо
                Отлично
                Зачтено
                Удовлетворительно
                Хорошо
                Зачтено
                Хорошо
                Зачтено
                Зачтено
                Зачтено
                Отлично
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
        print(translatedMarks);
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

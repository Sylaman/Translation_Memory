import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String subjects = """
                                Государственный и деловой протокол
                Правоведение
                История
                Математика
                Экономическая теория
                Современные информационные технологии
                Иностранный язык (Французский)
                Психология
                Социология
                Мировая экономика
                Философия
                Теория менеджмента
                Статистика
                Международные экономические отношения
                Теория организации
                Маркетинг
                Международные отношения и мировая политика
                Международное право
                Безопасность жизнедеятельности
                Физическая культура и спорт
                Финансы, денежное обращение и кредит
                Гражданское право России
                Управление человеческими ресурсами
                Международные валютно-кредитные отношения
                Международные транспортные операции и логистика
                Инновационный менеджмент
                Учет и анализ
                Цифровые информационные технологии в менеджменте
                Международные коммерческие операции
                Бренд-менеджмент
                Стратегический менеджмент
                Финансовый менеджмент
                Конъюнктура
                Управление внешнеэкономической деятельностью
                Биржевое дело
                Международный менеджмент
                Финансовая математика
                Бизнес-планирование
                Элективные дисциплины (модули) по физической культуре и спорту
                Русский язык и культура речи
                История российского предпринимательства
                Государственное и муниципальное управление
                Международные фондовые и валютные биржи
                Организационное поведение
                Реклама
                Основы банковского дела
                Управление проектами
                Интернет-маркетинг
                Кросс-культурный менеджмент
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

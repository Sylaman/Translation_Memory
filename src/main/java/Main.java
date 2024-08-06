import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String subjects = """
                Русский язык
                Литература
                Иностранный язык (английский)
                Информатика
                Математика
                История
                Обществознание
                География
                Физика
                Химия
                Биология
                Экология
                Физическая культура
                Основы безопасности жизнедеятельности
                Введение в специальность
                Основы этики (факультатив)
                Основы философий
                Основы права
                Русский язык и культура речи
                Основы экономики
                Социальная психология
                История культуры
                Математика
                Основы социологии и политологии
                Экологические основы природопользования
                Основы теории информации
                Операционные системы и среды
                Метрология, стандартизация и сертификация
                Дискретная математика
                Основы алгоритмизации и программирования
                Архитектура ЭВМ и вычислительных систем
                Технические средства информатизации
                Компьютерное моделирование
                Базы данных
                Компьютерные сети
                Делопроизводство
                Правовое обеспечение профессиональной деятельности
                Экономика отрасли
                Менеджмент
                Безопасность жизнедеятельности
                Информационные средства разработки информационных технологий
                Информационные системы
                Компьютерная графика
                Мультимедийные технологии
                Предметно-ориентированное программное обеспечение
                Разработка и эксплуатация информационных систем
                Информационная безопасность
                Технология разработки программных продуктов
                Издательские системы
                Информационные технологии в кинематографии
                Современные мультимедийные технологии
                Основы маркетинга
                Предпринимательство и малый бизнес
                Основы кинематографии (факультет)
                Антикризисное управление (факультатив)
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

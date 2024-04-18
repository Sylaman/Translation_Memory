public class Main {

    public static void main(String[] args) {

        String subjects = """
                Регенеративная медицина
                Челюстно-лицевая косметология
                Управленческая экономика
                Поликлиническая терапия
                Экономика семьи
                Экология
                Управление качеством
                """;
        String hours = "50 90 69  57 110 230 90 65  92   94 ";
        String marks = "отлично хорошо отлично   удовлетворительно отл. хорошо  зачет зачтено";

        HoursSplitter hoursSplitter = new HoursSplitter(hours);
        MarksTranslation marksTranslation = new MarksTranslation(marks);
        SubjectTranslation subjectTranslation = new SubjectTranslation(subjects);

        System.out.println();
        System.out.println("НАЗВАНИЯ ПРЕДМЕТОВ:");
        subjectTranslation.translate();

        System.out.println();
        System.out.println("КОЛИЧЕСТВО ЧАСОВ:");
        hoursSplitter.print();

        System.out.println();
        System.out.println("ОЦЕНКИ:");
        String[] splitMarks = marksTranslation.split();
        String[] translatedMarks = marksTranslation.translate(splitMarks);
        marksTranslation.print(translatedMarks);
    }
}

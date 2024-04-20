public class Main {

    public static void main(String[] args) {

        String subjects = """

                """;
        String hours = " ";
        String marks = " ";

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

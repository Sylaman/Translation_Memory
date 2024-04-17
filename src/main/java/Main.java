public class Main {

    public static void main(String[] args) {

        String subjects = " ";
        String hours = " ";
        String marks = " ";

        HoursSplitter hoursSplitter = new HoursSplitter(hours);
        MarksTranslation marksTranslation = new MarksTranslation(marks);
        SubjectTranslation subjectTranslation = new SubjectTranslation(subjects);

        System.out.println("------------Названия предметов------------");
        subjectTranslation.translate();
        System.out.println("-------------Количество часов-------------");
        hoursSplitter.print();
        System.out.println("-------------------Оценки-----------------");
        String[] splitMarks = marksTranslation.split(marks);
        String[] translatedMarks = marksTranslation.translate(splitMarks);
        marksTranslation.print(translatedMarks);
    }
}

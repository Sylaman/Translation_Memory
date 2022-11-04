public class Main {

    public static void main(String[] args) {

        String SUBJECTS = " ";
        String HOURS = "56 76 89 1 10 15 88 ";
        String MARKS = "хорошо зачтено отлично зачтено зачтено удовлетворительно отлично хорошо зачтено";

        HoursSplitter hoursSplitter = new HoursSplitter(HOURS);
        MarksTranslation marksTranslation = new MarksTranslation(MARKS);
        SubjectTranslation subjectTranslation = new SubjectTranslation(SUBJECTS);

        System.out.println("-------------Количество часов-------------");
        hoursSplitter.print();
        System.out.println("-------------------Оценки-----------------");
        marksTranslation.print();
    }
}

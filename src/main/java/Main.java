public class Main {

    public static void main(String[] args) {

        String SUBJECTS = " ";
        String HOURS = "340 408 170 110 220 600 200 80 200 120 350 120 120 170 150 86 110 280 600 100 80 110 60 60 70 100 100 150 150 150 90 90 90 150 100 100 100 150 210 170 150 150 180 100 250 250 250 100 150";
        String MARKS = "отлично зачтено отлично отлично отлично отлично отлично зачтено хорошо отлично отлично отлично отлично зачтено отлично зачтено отлично отлично отлично зачтено зачтено отлично зачтено зачтено зачтено зачтено зачтено зачтено хорошо отлично зачтено зачтено зачтено зачтено зачтено зачтено зачтено отлично отлично отлично отлично зачтено отлично зачтено отлично отлично отлично отлично зачтено";


        HoursSplitter hoursSplitter = new HoursSplitter(HOURS);
        MarksTranslation marksTranslation = new MarksTranslation(MARKS);
        SubjectTranslation subjectTranslation = new SubjectTranslation(SUBJECTS);

        System.out.println("------------Названия предметов------------");
        System.out.println("-------------Количество часов-------------");
        hoursSplitter.print();
        System.out.println("-------------------Оценки-----------------");
        marksTranslation.print();
    }
}

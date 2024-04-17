public class Main {

    public static void main(String[] args) {

        String subjects =
                " ";
        String hours =
                "340 408 53 53 53 53 100 200 600 200 117 117 86 936 524 100 120 90 90 200 68 68 68 66 84 56 76 84 52 54 74 114 142 142 60 60 84 84 84 84 60 60 84 85 85 85 85 65 85 85 75 75 75 90 90 90 140 45 55 100 50 50 120 133 197 8208 4509";
        String marks =
                "отлично зачтено отлично отлично зачтено зачтено отлично отлично отлично отлично зачтено зачтено зачтено отлично отлично отлично отлично зачтено отлично отлично зачтено зачтено зачтено зачтено отлично зачтено зачтено отлично зачтено отлично отлично отлично отлично отлично отлично зачтено отлично отлично отлично зачтено зачтено зачтено отлично зачтено отлично отлично отлично зачтено отлично отлично зачтено зачтено зачтено зачтено зачтено зачтено зачтено зачтено отлично отлично зачтено зачтено зачтено зачтено отлично";


        HoursSplitter hoursSplitter = new HoursSplitter(hours);
        MarksTranslation marksTranslation = new MarksTranslation(marks);
        SubjectTranslation subjectTranslation = new SubjectTranslation(subjects);

        System.out.println("------------Названия предметов------------");
        subjectTranslation.translate();
//        System.out.println("-------------Количество часов-------------");
//        hoursSplitter.print();
//        System.out.println("-------------------Оценки-----------------");
//        String[] splitMarks = marksTranslation.split(marks);
//        String[] translatedMarks = marksTranslation.translate(splitMarks);
//        marksTranslation.print(translatedMarks);
    }
}

public class Main {

    public static void main(String[] args) {

        String SUBJECTS = " ";
        String HOURS = "232 7 112 68 68 60 414 110 357 126 276 228 228 280 426 277 360 250 220 250 112 237 38 257 56 207 38 112 165 366 210 760 134 48 276 204 209 346 58 58 222 579 314 120 116 224 85 110 362 132 239 116 164 96 104 180 64 349 11880 7920";
        String MARKS = "отлично зачет зачет зачет зачет зачет зачет зачет зачет зачет хорошо хорошо хорошо хорошо отлично отлично хорошо хорошо зачет хорошо зачет удовлетворительно зачет хорошо зачет хорошо зачет зачет хорошо отлично отлично отлично зачет зачет отлично хорошо отлично зачет зачет зачет зачет отлично отлично хорошо зачет зачет зачет зачет хорошо хорошо отлично зачет отлично хорошо хорошо зачет зачет зачет";

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

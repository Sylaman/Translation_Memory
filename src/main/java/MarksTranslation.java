public class MarksTranslation {

    protected String original;

    public MarksTranslation(String original) {
        this.original = original;
    }

    public String[] split(String marksString) {
        return original.split("\\s+");
    }

    public String[] translate(String[] marks) {
        for (int i = 0; i < marks.length; i++) {
            switch (marks[i]) {
                case "отлично", "отл.", "отл" -> marks[i] = "excellent";
                case "хорошо" -> marks[i] = "good";
                case "удовлетворительно", "удовл", "удовл." -> marks[i] = "satisfactory";
                case "зачтено", "зачет", "зачёт" -> marks[i] = "credited";
                default -> marks[i] = "--------------ОШИБКА--------------";
            }
        }
        return marks;
    }

    public void print(String[] translatedMarks) {
        for (String s : translatedMarks) {
            System.out.println(s.trim() + " ");
        }
    }
}

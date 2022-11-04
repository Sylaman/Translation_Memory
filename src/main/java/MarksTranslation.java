public class MarksTranslation {

    String original;

    public MarksTranslation(String original) {
        this.original = original;
    }

    public String[] split(String marksString) {
        return marksString.split(" ");
    }

    public String[] translate() {
        String[] translatedMarks = split(original);
        for (int i = 0; i < translatedMarks.length; i++) {
            switch (translatedMarks[i]) {
                case "отлично" -> translatedMarks[i] = "excellent";
                case "хорошо" -> translatedMarks[i] = "good";
                case "удовлетворительно", "удовл", "удовл." -> translatedMarks[i] = "satisfactory";
                case "зачтено", "зачет" -> translatedMarks[i] = "credited";
            }
        }
        return translatedMarks;
    }

    public void print() {
        String[] result = translate();
        for (String s : result) {
            System.out.println(s.trim() + " ");
        }
    }
}

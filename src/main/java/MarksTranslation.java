public class MarksTranslation {

    String original;

    public MarksTranslation(String original) {
        this.original = original;
    }

    public String[] split(String marksString) {
        String[] originalMarks = marksString.split(" ");
        return originalMarks;
    }

    public String[] translate() {
        String[] translatedMarks = split(original);
        for (int i = 0; i < translatedMarks.length; i++) {
            switch (translatedMarks[i]) {
                case "отлично":
                    translatedMarks[i] = "excellent";
                    continue;
                case "хорошо":
                    translatedMarks[i] = "good";
                    continue;
                case "удовлетворительно":
                case "удовл":
                case "удовл.":
                    translatedMarks[i] = "satisfactory";
                    continue;
                case "зачтено":
                case "зачет":
                    translatedMarks[i] = "credited";
                    continue;
            }
        }
        return translatedMarks;
    }

    public void print() {
        String[] result = translate();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].trim() + " ");
        }
    }
}

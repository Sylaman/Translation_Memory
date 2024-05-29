import java.util.ArrayList;

public class MarksTranslation {

    private final String[] splitMarks;

    public MarksTranslation(String originalMarks) {
        this.splitMarks = originalMarks.split("\\s+");
    }

    public ArrayList<String> translate() {
        ArrayList<String> result = new ArrayList<>();
        for (String splitMark : splitMarks) {
            result.add(switch (splitMark.toLowerCase()) {
                case "отлично", "отл.", "отл" -> "excellent";
                case "хорошо" -> "good";
                case "удовлетворительно", "удовл", "удовл." -> "satisfactory";
                case "зачтено", "зачет", "зачёт" -> "credited";
                default -> "--------------ОШИБКА--------------";
            });
        }
        return result;
    }
}

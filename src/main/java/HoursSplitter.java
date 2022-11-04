public class HoursSplitter {

    String original;

    public HoursSplitter(String original) {
        this.original = original;
    }

    public void print() {
        String[] result = split(original);
        for (String s : result) {
            System.out.println(s.trim() + " ");
        }
    }

    public String[] split(String hoursText) {
        return hoursText.split(" ");
    }

}

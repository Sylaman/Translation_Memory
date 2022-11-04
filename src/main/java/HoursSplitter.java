public class HoursSplitter {

    String original;

    public HoursSplitter(String original) {
        this.original = original;
    }

    public void print() {
        String[] result = split(original);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].trim() + " ");
        }
    }

    public String[] split(String hoursText) {
        String[] hours = hoursText.split(" ");
        return hours;
    }

}

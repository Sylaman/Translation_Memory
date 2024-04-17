public class HoursSplitter {

    protected String hours;

    public HoursSplitter(String hours) {
        this.hours = hours;
    }

    public void print() {
        String[] numbers = hours.split("\\s+");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public String[] split(String hoursText) {
        return hoursText.split(" ");
    }

}

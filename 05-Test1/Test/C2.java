public class C2 {
    int hours, minutes;

    public C2(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    
    public int minutes() {
        int minutesPassed = hours * 60 + minutes;
        return minutesPassed;
    }

    @Override
    public String toString() {
        if (hours < 10 ) {
            if (minutes < 10) {
                return "0"+hours+":"+"0"+minutes;
            } else {
                return "0"+hours+":"+minutes;  
            }
            
        } else {
            if (minutes < 10) {
                return hours+":"+"0"+minutes;
            }
            else {
                return hours+":"+minutes;
            }     
        }
    }


    public static void main(String[] args) {
        C2 c = new C2(22, 19);
        System.out.println(c.minutes());
        System.out.println(c);
    }
}

public class C4 {
    int hour, minute;

    public C4(int hour, int minute) {
        if (hour >= 0 && hour <= 23) {
          this.hour = hour;  
        }

        if (minute >= 0 && minute <= 59) {
            this.minute = minute;   
        } 
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void add(){
        if (hour <= 22) {
            if (minute <= 58) {
                minute ++;
            }
            else {
                hour ++;
                minute = 0;   
            }
        }

        else {
            if (minute <= 58) {
                minute ++;
            }
            else {
                hour = 0;
                minute = 0;   
            }
        }         
        }

        public static void main(String[] args) {
            C4 c = new C4(23, 58);
            c.add();
            System.out.println(c.getHour());
            System.out.println(c.getMinute());
            c.add();
            c.add();
             System.out.println(c.getHour());
            System.out.println(c.getMinute());
        }
 
    }

    
    
    

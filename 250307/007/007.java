import java.util.Scanner;

class MeetingInfo {
    String secretCode;
    char meetingPoint;
    int time;

    public MeetingInfo(String secretCode, char meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public void printInfo() {
        System.out.println("secret code : " + secretCode);
        System.out.println("meeting point : " + meetingPoint);
        System.out.println("time : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        MeetingInfo info = new MeetingInfo(sCode, mPoint, time);

        info.printInfo();
    }
}

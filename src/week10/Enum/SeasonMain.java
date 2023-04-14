package week10.Enum;

public class SeasonMain {
    public static void printSeason(Season season){
        switch(season){
            case SPRING:
                System.out.println("It's Spring.");
                break;
            case SUMMER:
                System.out.println("It's Summer.");
                break;
            case FALL:
                System.out.println("It's Fall.");
                break;
            case WINTER:
                System.out.println("It's Winter.");
                break;
            default:
                System.out.println("Unknown season.");
        }
    }
    public static void main(String[] args) {
        Season mySeason = Season.SUMMER;
        System.out.println(mySeason);
    }
}


package RailwayTicket;

public class TrainTicket extends Ticket{
    private String Num_Train;//车次
    private int Num_Carriage;//车厢
    private String Num_set;//座位号
    private String IdCard;//身份证

    TrainTicket(){
        departure_place="湖南";
        destination="沈阳";
        date="2020年10月9号";
        time="10:30";
        ticket_price=200.5;
        Num_Train="K2286";
        Num_Carriage=12;
        Num_set="3C";
        IdCard="4331271631353133";
    }
    public String toString(){
        return "出发地："+departure_place+" 目的地："+destination+" 日期："+date+" 时间："+time+" 票件："+ticket_price+" 车次："+Num_Train+" 车厢："+Num_Carriage+" 座位："+Num_set+" 身份证："+IdCard;
    }
}

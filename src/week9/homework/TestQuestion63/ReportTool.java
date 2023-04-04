package week9.homework.TestQuestion63;

public class ReportTool extends Tool{
    public void export(){
        System.out.println("Tool::export");
    }

    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }

    public static void callExport(Exportable ex){
        ex.export();
    }
}

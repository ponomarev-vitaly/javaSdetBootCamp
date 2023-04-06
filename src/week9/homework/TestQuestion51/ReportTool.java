package week9.homework.TestQuestion51;

class ReportTool extends Tool implements Exportable{

        public void export() { // line n2
            System.out.println("RTool::export");
        }
        public static void main(String[] args) {
            Tool aTool = new ReportTool();
            Tool bTool = new Tool();
            callExport(aTool);
            callExport(bTool);
        }

// What is the result?
// A. Compilation fails only at line n2. B.
// RTool::exportTool::export C. Tool::exportTool:export public static void callExport (Exportable ex) (1 ex. export(): D. Compilation fails only at line n1. E. Compilation fails at both line n1 and line n2.

        private static void callExport(Exportable ex) {
            ex.export();
        }
}


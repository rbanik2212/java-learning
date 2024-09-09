public class EmployeeReportFormatter extends ReportFormatter{
    private Employee anEmployee;
    private FormatType formatType;

    public EmployeeReportFormatter(Employee anEmployee, FormatType formatType){
        this.anEmployee = anEmployee;
        this.formatType = formatType;
    }

    public String getFormattedEmployee(){
        return this.getFormattedValue();
    }
}

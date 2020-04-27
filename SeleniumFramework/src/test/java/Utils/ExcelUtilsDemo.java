package Utils;

public class ExcelUtilsDemo {

	static String projectPath;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		projectPath = System.getProperty("user.dir");

		// Aufruf Constructor
		ExcelUtils excel = new ExcelUtils(projectPath + "/Excel/Data.xlsx", "Tabelle1");

		excel.getRowCount();
		excel.getExcelDataString(0, 0);
		excel.getExcelDataNumber(1, 1);

	}

}
